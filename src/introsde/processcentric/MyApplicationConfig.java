package introsde.processcentric;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("fitApp")
public class MyApplicationConfig extends ResourceConfig {

    public MyApplicationConfig() {
        packages("introsde.processcentric"); // Jersey will load all the resources under this package
    }
}
