package net.venos.omilos.lib.noscan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Configuration
@PropertySource("classpath:git.properties")
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GitPropertySourceLocator {

}
