package cl.thisisalexis.bciuserapi.service.user;

import cl.thisisalexis.bciuserapi.api.model.User;
import cl.thisisalexis.bciuserapi.converter.user.UserModelToEntityConverter;
import cl.thisisalexis.bciuserapi.dao.UserEntity;
import cl.thisisalexis.bciuserapi.repository.UserRepository;
import cl.thisisalexis.bciuserapi.service.auth.ApplicationTokenService;
import cl.thisisalexis.common.core.exception.AbstractAppException;
import cl.thisisalexis.common.core.service.AbstractExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This service is used to add Users and its details
 *
 * @author Alexis Bravo
 *
 */
@Service
public class UserService extends AbstractExecutorService<User, User> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ApplicationTokenService applicationTokenService;

    @Override
    public User execute(User userParam) throws AbstractAppException {

        final String userJwt = getJwt(userParam);
        userParam.setToken(userJwt);

        UserEntity newUser = UserModelToEntityConverter.getInstance().convert(userParam);
        UserEntity addedUser = userRepository.save(newUser);

        // Ahora un converter pero invertido TODO

        userParam.setCreated(addedUser.getCreated());

        return userParam;
    }

    private String getJwt(User user) {
        return applicationTokenService.createJwtForUser(user);
    }

}
