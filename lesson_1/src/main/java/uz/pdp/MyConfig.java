package uz.pdp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
    @Scope("prototype")
    public User2 user2(){
        return new User2("Ali Valiyev 2",14);
    }

}
