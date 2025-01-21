package green.odsay.config;

import green.odsay.config.constant.OdsayApiConst;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;



@Configuration
@RequiredArgsConstructor
public class WebClientConfiguration {
    private final OdsayApiConst odsayApiConst;

    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder.baseUrl(odsayApiConst.getBaseUrl())
                .defaultHeaders(header -> {

                })
                .build();
    }
}
