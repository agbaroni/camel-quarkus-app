package io.github.agbaroni.tests;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.infinispan.client.hotrod.RemoteCache;

import io.quarkus.infinispan.client.Remote;

@ApplicationScoped
@Path("/caches")
public class MyCaches {

    @Inject
    @Remote("foo")
    RemoteCache<String, String> rc;

    @GET
    public String getValue() {
	return rc.get("hello");
    }
}
