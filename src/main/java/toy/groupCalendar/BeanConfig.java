package toy.groupCalendar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

import java.time.Duration;

@Configuration
@Slf4j
public class BeanConfig {

    private static final int CONNECTION_TIMEOUT_SECONDS = 5;
    private static final int READ_TIMEOUT_SECONDS = 5;
    private static final String baseUrl = "http://192.168.175.131:10002";

    @Bean
    public RestClient restClient() {
        var requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(Duration.ofSeconds(CONNECTION_TIMEOUT_SECONDS));
        requestFactory.setReadTimeout(Duration.ofSeconds(READ_TIMEOUT_SECONDS));

        return RestClient.builder()
                .baseUrl(baseUrl)
                .requestFactory(requestFactory)
                .build();
    }

//    @Bean
//    public RestClient restClient(RestClient.Builder restClientBuilder) {
//        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
//        requestFactory.setConnectTimeout(Duration.ofSeconds(CONNECTION_TIMEOUT_SECONDS));
//        requestFactory.setReadTimeout(Duration.ofSeconds(READ_TIMEOUT_SECONDS));
//
//        return restClientBuilder
//                .requestFactory(requestFactory)
//                .baseUrl(baseUrl)
//                .defaultStatusHandler(
//                        statusCode -> statusCode.is4xxClientError() || statusCode.is5xxServerError(),
//                        (request, response) -> {
//                            log.error("HTTP request failed.");
//                            log.error("Request: {} {}", request.getMethod(), request.getURI());
//                            log.error("Response: {} {}", response.getStatusCode(), response.getStatusText());
//
//                            if (response.getStatusCode().is4xxClientError()) {
//                                throw new RuntimeException("Client exception");
//                            }
//                            if (response.getStatusCode().is5xxServerError()) {
//                                throw new RuntimeException("Server exception");
//                            }
//                            throw new RuntimeException("Unexpected response status: " + response.getStatusCode());
//                        }
//                )
//                .build();
//    }
}
