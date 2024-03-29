package cl.thisisalexis.bciuserapi.api.model;

import cl.thisisalexis.common.core.api.ApiRequest;
import cl.thisisalexis.common.core.workflow.ExecutorRequest;
import cl.thisisalexis.common.core.workflow.ExecutorResponse;
import javafx.util.Builder;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * A representation of an  User entity
 *
 * @author Alexis Bravo
 */
public class User implements ExecutorResponse, ApiRequest, ExecutorRequest {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Set<Phone> phones;
    private LocalDateTime created;
    private LocalDateTime modified;
    private LocalDateTime lastLogin;
    private String token;
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

    public Set<Phone> getPhones() {
        if (null == phones) {
            phones = new HashSet<>();
        }
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
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

    public static final class UserBuilder implements Builder<User> {

        private Long id;
        private String name;
        private String email;
        private String password;
        private Set<Phone> phones;
        private LocalDateTime created;
        private LocalDateTime modified;
        private LocalDateTime lastLogin;
        private String token;
        private Boolean isActive;

        public static UserBuilder getInstance() {
            return new UserBuilder();
        }

        public UserBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder withPhones(Set<Phone> phones) {
            this.phones = phones;
            return this;
        }

        public UserBuilder withCreated(LocalDateTime created) {
            this.created = created;
            return this;
        }

        public UserBuilder withModified(LocalDateTime modified) {
            this.modified = modified;
            return this;
        }

        public UserBuilder withLastLogin(LocalDateTime lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        public UserBuilder withToken(String token) {
            this.token = token;
            return this;
        }

        public UserBuilder withActive(Boolean active) {
            isActive = active;
            return this;
        }

        @Override
        public User build() {
            User user = new User();

            user.setId(this.id);
            user.setName(this.name);
            user.setEmail(this.email);
            user.setPassword(this.password);
            user.setToken(this.token);
            user.setPhones(this.phones);
            user.setCreated(this.created);
            user.setModified(this.modified);
            user.setLastLogin(this.lastLogin);
            user.setActive(this.isActive);

            return user;
        }
    }

}
