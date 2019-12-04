package cl.thisisalexis.bciuserapi.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cl.thisisalexis.bciuserapi")
public class BCIUserApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BCIUserApiApplication.class, args);
    }

}
