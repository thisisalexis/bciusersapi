package cl.thisisalexis.bciuserapi.dao;

import javafx.util.Builder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "phones")
public class PhoneEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column
    private Integer cityCode;

    @Column
    private Integer countryCode;

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime modified;

    @Column
    private Boolean isActive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public static final class PhoneEntityBuilder implements Builder<PhoneEntity> {

        private Long id;
        private String number;
        private Integer cityCode;
        private Integer countryCode;
        private LocalDateTime created;
        private LocalDateTime modified;
        private Boolean isActive;
        private UserEntity user;

        public PhoneEntityBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public PhoneEntityBuilder withNumber(String number) {
            this.number = number;
            return this;
        }

        public PhoneEntityBuilder withCityCode(Integer cityCode) {
            this.cityCode = cityCode;
            return this;
        }

        public PhoneEntityBuilder withCountryCode(Integer countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public PhoneEntityBuilder withCreated(LocalDateTime created) {
            this.created = created;
            return this;
        }

        public PhoneEntityBuilder withModified(LocalDateTime modified) {
            this.modified = modified;
            return this;
        }

        public PhoneEntityBuilder withActive(Boolean active) {
            isActive = active;
            return this;
        }

        public PhoneEntityBuilder withUser(UserEntity user) {
            this.user = user;
            return this;
        }

        public static final PhoneEntityBuilder getInstance() {
            return new PhoneEntityBuilder();
        }

        @Override
        public PhoneEntity build() {
            PhoneEntity phoneEntity = new PhoneEntity();

            phoneEntity.setId(this.id);
            phoneEntity.setNumber(this.number);
            phoneEntity.setCityCode(this.cityCode);
            phoneEntity.setCountryCode(this.countryCode);
            phoneEntity.setCreated(this.created);
            phoneEntity.setModified(this.modified);
            phoneEntity.setActive(this.isActive);
            phoneEntity.setUser(this.user);

            return phoneEntity;
        }

    }

}
