package waysToConfigureASpringApplication.configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyConfigurationDisplayer implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	MyConfigurationBean myConf;
	
	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("========== configuration for command line argument ");
		for(String arg : event.getArgs()) {
			System.out.println(arg);
		}
		
		System.out.println("========== configuration for Java System Properties");
		Properties properties = System.getProperties();
		for(Object key : properties.keySet()) {
			System.out.println(key.toString() + " -> "+properties.getProperty(key.toString()));
		}
		
		System.out.println("========== configuration for OS environment variable");
		for(Object key : System.getenv().keySet()) {
			System.out.println(key.toString() + " -> "+System.getenv().get(key));
		}
		
		System.out.println("========== configuration from application.properties inside packaged jar, or overriden from application.properties outside packaged jar");
		System.out.println(myConf.getSomeConfigurationProperty());
	}
}
