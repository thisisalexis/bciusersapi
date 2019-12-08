package cl.thisisalexis.bciuserapi.converter.user;

import cl.thisisalexis.bciuserapi.api.model.Phone;
import cl.thisisalexis.bciuserapi.api.model.User;
import cl.thisisalexis.bciuserapi.dao.PhoneEntity;
import cl.thisisalexis.bciuserapi.dao.UserEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * This is an implementation of Converter interface to Convert User objects to its equivalent UserEntityObject
 *
 * @author Alexis Bravo
 */
public class UserModelToEntityConverter implements Converter<User, UserEntity> {

    public static final UserModelToEntityConverter getInstance() {
        return new UserModelToEntityConverter();
    }

    @Override
    public UserEntity convert(@NotNull User userSource) {

        if (null == userSource) {
            return null;
        }

        Set<PhoneEntity> phoneEntities = convertPhonesToEntities(userSource.getPhones());

        UserEntity userEntity = UserEntity.UserEntityBuilder.getInstance()
                .withId(userSource.getId())
                .withName(userSource.getName())
                .withEmail(userSource.getEmail())
                .withPassword(userSource.getPassword())
                .withPhones(phoneEntities)
                .withToken(userSource.getToken())
                .withCreated(userSource.getCreated())
                .withModified(userSource.getModified())
                .withLastLogin(userSource.getLastLogin())
                .withActive(userSource.getActive())
                .build();

        return userEntity;
    }

    @Nullable
    private Set<PhoneEntity> convertPhonesToEntities(Set<Phone> phones) {
        Set<PhoneEntity> phoneEntities = new HashSet<>();
        for (Phone phone : phones) {
            PhoneEntity phoneEntity = PhoneModelToEntityConverter.getInstance().convert(phone);
            phoneEntities.add(phoneEntity);
        }
        return phoneEntities;
    }

}
