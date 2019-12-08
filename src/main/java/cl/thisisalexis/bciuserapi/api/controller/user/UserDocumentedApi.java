package cl.thisisalexis.bciuserapi.api.controller.user;

import cl.thisisalexis.bciuserapi.api.model.User;
import cl.thisisalexis.common.core.api.DocumentedApi;
import cl.thisisalexis.common.core.workflow.ExecutorResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Api(value = "User API")
public interface UserDocumentedApi extends DocumentedApi {

    @ApiOperation(value = "Create and persists new users in the application", response = User.class)
    ResponseEntity<ExecutorResponse> createUser(
            @RequestBody @ApiParam(value = "An user object with information about the user to save") User user);

}
