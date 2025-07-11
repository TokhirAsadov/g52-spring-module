package uz.pdp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("uz.pdp")
@PropertySource("classpath:application.properties")
public class MyConfig {
}
