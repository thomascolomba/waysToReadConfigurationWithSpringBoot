package waysToConfigureASpringApplication.configuration;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class MyConfigurationBean {
	@Value("${property.from.application.properties.inside.jar}")
    private String someConfigurationProperty;
	
    public String getSomeConfigurationProperty() {
		return someConfigurationProperty;
	}
}