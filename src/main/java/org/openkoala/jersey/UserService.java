package org.openkoala.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public interface UserService {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	Response createUser(User user);
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	User getUser(@PathParam("id") int id);
	
}
