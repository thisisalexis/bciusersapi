package cl.thisisalexis.bciuserapi.api.controller.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserApiController {

    @PostMapping(value = "/sign-up")
    public ResponseEntity<Object> test() {
        return ResponseEntity.ok(new Object());
    }

}
