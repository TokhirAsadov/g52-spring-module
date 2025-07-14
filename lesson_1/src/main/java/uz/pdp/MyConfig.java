package uz.pdp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope("singleton")
    @Lazy
    public User user(){
        return new User();
    }

}
