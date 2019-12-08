package cl.thisisalexis.bciuserapi.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Configuration properties to Auth service
 *
 * @author Alexis Bravo
 */
@Component
@ConfigurationProperties("auth")
public class AuthProperty {

    private String secret;
    private Long expiration;
    private String headerName;
    private String jwtPrefix;
    private String userEmailClaimName;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public String getJwtPrefix() {
        return jwtPrefix;
    }

    public void setJwtPrefix(String jwtPrefix) {
        this.jwtPrefix = jwtPrefix;
    }

    public String getUserEmailClaimName() {
        return userEmailClaimName;
    }

    public void setUserEmailClaimName(String userEmailClaimName) {
        this.userEmailClaimName = userEmailClaimName;
    }
}
