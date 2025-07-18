package uz.pdp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"uz.pdp","uz.pdp.product","uz.pdp.project"})
@EnableAspectJAutoProxy
public class MyConfig {

}
