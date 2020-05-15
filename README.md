1)build the application :<br/>
mvn package<br/>
<br/>
<br/>
2)execute the application :<br/>
java -jar ./target/waysToConfigureASpringApplication-0.0.1-SNAPSHOT.jar<br/>
//will show some java system properties and environment properties<br/>
//will also show the value of the parameter property.from.application.properties.inside.jar which is :<br/>
//  (a)set to "value.from.application.properties.inside.jar" according to the file src/main/resources/application.properties<br/>
//  (b)overwritten to "value.from.application.properties.inside.jar.overriden.by.external.configuration" according to the file application.properties located at the root of the project<br/>
<br/>
or<br/>
java -jar ./target/waysToConfigureASpringApplication-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev<br/>
//will also show the value of the parameter property.from.application.properties.inside.jar overwritten to "value.from.application.properties.inside.jar.overriden.by.external.dev.specific.configuration" one more time by application-dev.properties (due to the parameter "--spring.profiles.active=dev")<br/>
<br/>
or<br/>
java -jar ./target/waysToConfigureASpringApplication-0.0.1-SNAPSHOT.jar lalala<br/>
//will also show that "lalala" was detected as a command line parameter<br/>
