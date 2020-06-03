package com.rafabene;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * MicroserviceService
 */
@RegisterRestClient(configKey = "serviceb")
@RegisterClientHeaders
public interface MicroserviceBService {

    @Path("/db/{name}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String db(@PathParam("name") String name);

    @Path("/kafka/{name}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String kafka(@PathParam("name") String name);

    @Path("/chain/{name}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String chain(@PathParam("name") String name);

}