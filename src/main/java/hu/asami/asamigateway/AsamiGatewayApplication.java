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

    /*@Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p -> p
                        .path("/accounting**").uri("http://localhost:8082"))
                .route(p -> p
                        .path("/logistics**").uri("http://localhost:8083"))
                .route(p -> p
                        .path("/support**").uri("http://localhost:8090"))
                .route(p -> p
                        .path("/", "").uri("http://localhost:8081"))
                .route(p -> p
                        .path("/restaurant**").uri("http://localhost:8081"))
                .build();
    }*/

}
