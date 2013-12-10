package org.openkoala.jersey;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
	
	private Map<Integer, User> users = new ConcurrentHashMap<Integer, User>();
	
	public UserServiceImpl() {
		users.put(1001, new User(1001, "zyb", 20));
		users.put(1002, new User(1002, "Ken", 20));
	}

	public Response createUser(User user) {
		users.put(user.getId(), user);
		return Response.ok("success").build();
	}

	public User getUser(int id) {
		return users.get(id);
	}

}
