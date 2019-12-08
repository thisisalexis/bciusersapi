package cl.thisisalexis.bciuserapi.api.model;

import javafx.util.Builder;

import java.time.LocalDateTime;

/**
 * A representation of an  Phone entity
 *
 * @author Alexis Bravo
 */
public class Phone {

    private Long id;
    private String number;
    private Integer cityCode;
    private Integer countryCode;
    private LocalDateTime created;
    private LocalDateTime modified;
    private Boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public static final class PhoneBuilder implements Builder<Phone> {

        private Long id;
        private String number;
        private Integer cityCode;
        private Integer countryCode;
        private LocalDateTime created;
        private LocalDateTime modified;
        private Boolean isActive;

        public static PhoneBuilder getInstance() {
            return new PhoneBuilder();
        }

        public PhoneBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public PhoneBuilder withNumber(String number) {
            this.number = number;
            return this;
        }

        public PhoneBuilder withCityCode(Integer cityCode) {
            this.cityCode = cityCode;
            return this;
        }

        public PhoneBuilder withCountryCode(Integer countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public PhoneBuilder withCreated(LocalDateTime created) {
            this.created = created;
            return this;
        }

        public PhoneBuilder withModified(LocalDateTime modified) {
            this.modified = modified;
            return this;
        }

        public PhoneBuilder withActive(Boolean active) {
            isActive = active;
            return this;
        }

        @Override
        public Phone build() {
            Phone phone = new Phone();

            phone.setId(this.id);
            phone.setNumber(this.number);
            phone.setCountryCode(this.countryCode);
            phone.setCityCode(this.cityCode);
            phone.setCreated(this.created);
            phone.setModified(this.modified);
            phone.setActive(this.isActive);

            return phone;
        }
    }

}
