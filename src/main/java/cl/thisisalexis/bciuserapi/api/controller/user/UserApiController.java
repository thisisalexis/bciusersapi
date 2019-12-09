package cl.thisisalexis.bciuserapi.api.controller.user;

import cl.thisisalexis.bciuserapi.api.model.User;
import cl.thisisalexis.bciuserapi.service.user.UserService;
import cl.thisisalexis.common.core.api.AbstractApiController;
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
public class UserApiController extends AbstractApiController implements UserDocumentedApi {

    @Override
    @PostMapping(value = "/sign-up")
    public ResponseEntity<ExecutorResponse> createUser(@RequestBody User user) {
        apiWorkflowExecutor.setExecutorRequest(user);
        apiWorkflowExecutor.setExecutor(UserService.class);
        return apiWorkflowExecutor.execute();
    }

}
