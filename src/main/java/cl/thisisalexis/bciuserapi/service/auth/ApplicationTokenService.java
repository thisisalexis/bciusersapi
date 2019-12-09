package cl.thisisalexis.bciuserapi.service.auth;

import cl.thisisalexis.bciuserapi.api.model.User;
import cl.thisisalexis.bciuserapi.property.AuthProperty;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * A service meant to encapsulate all JWT token operations
 *
 * @author Alexis Bravo
 */
@Service
public class ApplicationTokenService {

    private static final SignatureAlgorithm SIGNATURE_ALGORITHM = SignatureAlgorithm.HS256;

    @Autowired
    private AuthProperty authProperty;

    public String createJwtForUser(User user) throws IllegalStateException {

        if (null == user || null == user.getEmail()) {
            throw new IllegalStateException("User E-mail is empty and it is required to build a JWT.");
        }

        Map<String, Object> userClaimsAsMap = new HashMap<>();
        userClaimsAsMap.put(authProperty.getUserEmailClaimName(), user.getEmail());
        return createJwt(userClaimsAsMap);
    }

    /**
     * Creates a JWT given an ApplicationToken instance
     * @return a JWT signed using app secret key
     */
    private String createJwt(Map<String, Object> claimsMap) {
        byte[] apiKeySecretBytes = getBase64EncodedSecretKey();

        Key signingKey = new SecretKeySpec(apiKeySecretBytes, SIGNATURE_ALGORITHM.getJcaName());

        JwtBuilder builder = Jwts.builder()
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(getExpiration());

        if(null != claimsMap){
            builder.setClaims(claimsMap);
        }

        return  builder.signWith(SIGNATURE_ALGORITHM, signingKey)
                .compact();
    }

    private byte[] getBase64EncodedSecretKey() {
        return DatatypeConverter.parseBase64Binary(authProperty.getSecret());
    }

    private Date getExpiration() {
        return new Date(getExpirationTimeInMillis());
    }

    private Long getExpirationTimeInMillis() {
        return System.currentTimeMillis() + authProperty.getExpiration();
    }

}
