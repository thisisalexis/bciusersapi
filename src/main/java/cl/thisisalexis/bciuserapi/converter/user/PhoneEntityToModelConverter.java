package cl.thisisalexis.bciuserapi.converter.user;

import cl.thisisalexis.bciuserapi.api.model.Phone;
import cl.thisisalexis.bciuserapi.entity.PhoneEntity;
import org.springframework.core.convert.converter.Converter;

/**
 *  An implementation of Converter to convert from PhoneEntity to User models
 *
 * @author Alexis Bravo
 */
public class PhoneEntityToModelConverter implements Converter<PhoneEntity, Phone> {

    public static final PhoneEntityToModelConverter getInstance() {
        return new PhoneEntityToModelConverter();
    }

    @Override
    public Phone convert(PhoneEntity phoneEntity) {

        Phone phone = Phone.PhoneBuilder.getInstance()
        .withId(phoneEntity.getId())
        .withCityCode(phoneEntity.getCityCode())
        .withCountryCode(phoneEntity.getCountryCode())
        .withActive(phoneEntity.getActive())
        .withCreated(phoneEntity.getCreated())
        .withModified(phoneEntity.getModified())
        .withNumber(phoneEntity.getNumber())
        .build();

        return phone;
    }
}
