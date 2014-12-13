package example.angularjavaee.resource;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("webresources")
public class WebResourceConfig extends ResourceConfig {
    public WebResourceConfig() {
        packages(this.getClass().getPackage().getName());
    }
}