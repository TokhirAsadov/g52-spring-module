package uz.pdp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({MyConfig.class,MyConfig2.class})
@PropertySource("classpath:application.properties")
@ImportResource("classpath:ioc-settings.xml")
public class MainApplicationConfig {
}
