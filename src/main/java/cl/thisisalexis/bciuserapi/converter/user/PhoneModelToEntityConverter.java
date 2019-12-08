package cl.thisisalexis.bciuserapi.converter.user;

import cl.thisisalexis.bciuserapi.api.model.Phone;
import cl.thisisalexis.bciuserapi.dao.PhoneEntity;
import org.springframework.core.convert.converter.Converter;

/**
 * This is an implementation of Converter interface to Convert Phone objects to its equivalent PhoneEntityObject
 *
 * @author Alexis Bravo
 */
public class PhoneModelToEntityConverter implements Converter<Phone, PhoneEntity> {

    public static PhoneModelToEntityConverter getInstance() {
        return new PhoneModelToEntityConverter();
    }

    @Override
    public PhoneEntity convert(Phone source) {
        PhoneEntity phoneEntity = PhoneEntity.PhoneEntityBuilder.getInstance()
                .withNumber(source.getNumber())
                .withCityCode(source.getCityCode())
                .withCountryCode(source.getCountryCode())
                .withActive(source.getActive())
                .withCreated(source.getCreated())
                .withModified(source.getModified())
                .withId(source.getId())
                .build();


        return phoneEntity;
    }
}
