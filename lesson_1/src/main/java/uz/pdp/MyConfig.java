package uz.pdp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(name = "myBean", initMethod = "init", destroyMethod = "destroy")
    public MyBean myBean(){
        return new MyBean();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Conditional(DbInitCondition.class)
    public DbInit dbInit(){
        return new DbInit();
    }
}
