package cl.thisisalexis.bciuserapi.converter.user;

import cl.thisisalexis.bciuserapi.api.model.Phone;
import cl.thisisalexis.bciuserapi.api.model.User;
import cl.thisisalexis.bciuserapi.entity.PhoneEntity;
import cl.thisisalexis.bciuserapi.entity.UserEntity;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

/**
 *  An implementation of Converter to convert from UserEntity to User models
 *
 * @author Alexis Bravo
 */
public class UserEntityToModelConverter implements Converter<UserEntity, User> {

    public static final UserEntityToModelConverter getInstance() {
        return new UserEntityToModelConverter();
    }

    @Override
    public User convert(UserEntity userEntity) {

        User user = User.UserBuilder.getInstance()
                .withId(userEntity.getId())
                .withEmail(userEntity.getEmail())
                .withPassword(userEntity.getPassword())
                .withPhones(getPhoneModelsFromEntities(userEntity.getPhones()))
                .withToken(userEntity.getToken())
                .withCreated(userEntity.getCreated())
                .withModified(userEntity.getModified())
                .withLastLogin(userEntity.getLastLogin())
                .withName(userEntity.getName())
                .withActive(userEntity.getActive())
                .build();

        return user;
    }

    private Set<Phone> getPhoneModelsFromEntities(Set<PhoneEntity> phoneEntities) {
        Set<Phone> phoneModels = new HashSet<>();

        for (PhoneEntity phoneEntity : phoneEntities) {
            Phone phone = PhoneEntityToModelConverter.getInstance().convert(phoneEntity);
            phoneModels.add(phone);
        }

        return phoneModels;
    }

}
