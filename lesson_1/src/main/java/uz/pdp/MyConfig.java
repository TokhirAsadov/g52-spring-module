package uz.pdp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Car car(){
        return new Car();
    }

    @Bean
    public User user(Car car){
        return new User(car);
    }

}
