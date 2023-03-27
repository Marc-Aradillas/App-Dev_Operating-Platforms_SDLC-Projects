/**
 * 
 */
package com.dropwizard.helloworld001;

import com.dropwizard.helloworld001.HelloWorldResource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author marcaradillas_snhu
 *
 */
/* 
 * The @Path annotation provides the URL path for this API end-point.
 * 
 * for example, if you are running this on your local machine with
 * at the TCP/IP port 8080, The @Path ("Hello") annotation would
 * make this end-point available at https://localhost:8080/hello
 * 
 * This annotation must appear immediately before the definition
 * of your class.
 */

@Path("hello")
public class HelloWorldResource {
	/*
	 * This @GET annotation indicates that the end-point is 
	 * accessed via a HTTP GET Operation. WHile the @Produces 
	 * annotation indicates that the data returned to the user
	 * will be in plain text.
	 * 
	 * These annotations should immediately proceed the method
	 * definition
	 * 
	 * The getGreeting method will execute when the "hello"
	 * end-point is accessed.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getGreeting() {
		return "Hello World!";
		}
}