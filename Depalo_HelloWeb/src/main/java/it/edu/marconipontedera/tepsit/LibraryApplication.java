package it.edu.marconipontedera.tepsit;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("api")
public class LibraryApplication extends ResourceConfig {
    public LibraryApplication() {
        packages("java.it.edu.marconipontedera.tepsit");
    }
}