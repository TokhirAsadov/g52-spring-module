package uz.pdp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyConfig.class,MyConfig2.class})
public class MainApplicationConfig {
}
