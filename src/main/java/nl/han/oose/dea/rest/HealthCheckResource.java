package nl.han.oose.dea.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/health")
public class HealthCheckResource {

    @GET
    public String healthy() {
        return "Up & Running";
    }
}