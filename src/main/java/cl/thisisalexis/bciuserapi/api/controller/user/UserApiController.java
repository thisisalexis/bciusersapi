package cl.thisisalexis.bciuserapi.api.controller.user;

import cl.thisisalexis.bciuserapi.api.model.User;
import cl.thisisalexis.common.core.api.ApiController;
import cl.thisisalexis.common.core.workflow.ExecutorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * A class that encapsulates or contains all User related API methods
 *
 * @autor Alexis Bravo
 */
@RestController
@RequestMapping(value = "/user")
public class UserApiController extends ApiController implements UserDocumentedApi {

    @Override
    @PostMapping(value = "/sign-up")
    public ResponseEntity<ExecutorResponse> createUser(@RequestHeader("Authorization") String authorization,
                                                       @RequestBody  User user) {
        return ResponseEntity.ok(new User());
    }

}
