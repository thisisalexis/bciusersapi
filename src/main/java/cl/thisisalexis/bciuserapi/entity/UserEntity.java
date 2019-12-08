package cl.thisisalexis.bciuserapi.entity;

import javafx.util.Builder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column
    @NotNull
    private String name;

    @NotNull
    @Column(unique = true)
    @Email
    private String email;

    @Column
    @NotNull
    private String password;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "user")
    private Set<PhoneEntity> phones = new HashSet<>();

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime modified;

    @Column
    private LocalDateTime lastLogin;

    @Column
    @NotNull
    private String token;

    @Column
    private Boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<PhoneEntity> getPhones() {
        if(null == phones) {
            phones = new HashSet<>();
        }
        return phones;
    }

    public void setPhones(Set<PhoneEntity> phones) {
        this.phones = phones;
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

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public static final class UserEntityBuilder implements Builder<UserEntity> {

        private Long id;
        private String name;
        private String email;
        private String password;
        private Set<PhoneEntity> phones;
        private LocalDateTime created;
        private LocalDateTime modified;
        private LocalDateTime lastLogin;
        private String token;
        private Boolean isActive;

        public UserEntityBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public UserEntityBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserEntityBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserEntityBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserEntityBuilder withPhones(Set<PhoneEntity> phones) {
            this.phones = phones;
            return this;
        }

        public UserEntityBuilder withCreated(LocalDateTime created) {
            this.created = created;
            return this;
        }

        public UserEntityBuilder withModified(LocalDateTime modified) {
            this.modified = modified;
            return this;
        }

        public UserEntityBuilder withLastLogin(LocalDateTime lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        public UserEntityBuilder withToken(String token) {
            this.token = token;
            return this;
        }

        public UserEntityBuilder withActive(Boolean active) {
            isActive = active;
            return this;
        }

        public static UserEntityBuilder getInstance() {
            return new UserEntityBuilder();
        }

        @Override
        public UserEntity build() {
            UserEntity userEntity = new UserEntity();

            userEntity.setId(this.id);
            userEntity.setName(this.name);
            userEntity.setEmail(this.email);
            userEntity.setPassword(this.password);
            userEntity.setPhones(this.phones);
            userEntity.setCreated(this.created);
            userEntity.setModified(this.modified);
            userEntity.setLastLogin(this.lastLogin);
            userEntity.setToken(this.token);
            userEntity.setActive(this.isActive);

            return userEntity;
        }
    }

}
