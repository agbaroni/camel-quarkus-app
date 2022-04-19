package io.github.agbaroni.tests;

import org.apache.camel.builder.RouteBuilder;

public class Routes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
	from("timer:foo?period=10000")
	    .log("Ciao mondo!");
    }
}
