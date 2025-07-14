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
    public User2 user2(){
        return new User2("Ali Valiyev 2",14);
    }

}
