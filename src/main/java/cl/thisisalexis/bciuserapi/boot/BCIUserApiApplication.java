package cl.thisisalexis.bciuserapi.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "cl.thisisalexis.bciuserapi")
@EnableJpaRepositories(basePackages = "cl.thisisalexis.bciuserapi.repository")
@EntityScan(basePackages = "cl.thisisalexis.bciuserapi.dao")
public class BCIUserApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BCIUserApiApplication.class, args);
    }

}
