/**
 * 
 */
package com.gamingroom.gameauth;

/**
 * @author Marc Aradillas
 *
 */
	
	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.MediaType;
	import com.gamingroom.gameauth.GameAuthResource;
	
	@Path("hello")
	public class GameAuthResource {
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public String getGreeting() {
		return "Game";
		}
}