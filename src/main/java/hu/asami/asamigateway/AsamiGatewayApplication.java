package hu.asami.asamigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AsamiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsamiGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r -> r
                        .path("/accounting**").filters(f -> f.stripPrefix(2)).uri("http://localhost:8082"))
                .route(r -> r
                        .path("/logistics**").filters(f -> f.stripPrefix(2)).uri("http://localhost:8083"))
                .route(r -> r
                        .path("/support**").filters(f -> f.stripPrefix(2)).uri("http://localhost:8090"))
                .route(r -> r
                        .path("/restaurant**").filters(f -> f.stripPrefix(2)).uri("http://localhost:8081"))
                .route(r -> r
                        .path("/**").uri("http://localhost:8081"))
                .build();
    }

}
