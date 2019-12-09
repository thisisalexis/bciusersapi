package cl.thisisalexis.bciuserapi.configuration;

import cl.thisisalexis.common.core.workflow.ApiWorkflowExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Configuration bean to set all needed beans and configurations related to commons library
 *
 * @author Alexis Bravo
 *
 */
@Configuration
public class CommonLibraryConfiguration {

    @Bean
    @Scope("prototype")
    public ApiWorkflowExecutor apiWorkflowExecutor() {
        return new ApiWorkflowExecutor();
    }

}
