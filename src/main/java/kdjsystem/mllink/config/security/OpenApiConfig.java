package kdjsystem.mllink.config.security;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "lolien-discord-bot API 명세서",
                description = "API 명세서",
                version = "v1",
                contact = @Contact(name = "webgori", email = "webgori@gmail.com"),
                license = @License(name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html")
        )
)
@Configuration
public class OpenApiConfig {
    /**
     * customGameOpenApi.
     * @return GroupedOpenApi
     */
    @Bean
    public GroupedOpenApi customGameOpenApi() {
        String[] paths = {"/custom-game/**"};
        return GroupedOpenApi.builder().setGroup("내전 관련 API").pathsToMatch(paths)
                .build();
    }

    /**
     * leagueOpenApi.
     * @return GroupedOpenApi
     */
    @Bean
    public GroupedOpenApi leagueOpenApi() {
        String[] paths = {"/league/**"};
        return GroupedOpenApi.builder().setGroup("리그 관련 API").pathsToMatch(paths)
                .build();
    }
}
