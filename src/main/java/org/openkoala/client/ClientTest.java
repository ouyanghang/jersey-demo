package org.openkoala.client;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Test;

public class ClientTest {

	@Test
	public void testCreateUser() throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost("http://localhost:8080/jersey/api/user");
		StringEntity entity = new StringEntity("{\"id\":10010,\"name\":\"client\",\"age\":20}");
		entity.setContentType("application/json");
		post.setEntity(entity);
		HttpResponse response = client.execute(post);
		InputStream in = response.getEntity().getContent();
		int len = 0;
		byte[] buffer = new byte[1024];
		StringBuilder content = new StringBuilder();
		while ((len = in.read(buffer)) != -1) {
			content.append(new String(buffer, 0, len));
		}
		System.out.println(content);
		client.getConnectionManager().shutdown();
	}
	
	@Test
	public void testCreateUser01() throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost("http://localhost:8080/api/user");
		StringEntity entity = new StringEntity("{\"userAccount\":\"rtrr\",\"username\":\"yy\", \"password\":\"111111\", \"email\":\"zz@126.com\", \"tel\":\"12345678\", \"userDesc\":\"zzzzzzz\"}");
		entity.setContentType("application/json");
		post.setEntity(entity);
		HttpResponse response = client.execute(post);
		InputStream in = response.getEntity().getContent();
		int len = 0;
		byte[] buffer = new byte[1024];
		StringBuilder content = new StringBuilder();
		while ((len = in.read(buffer)) != -1) {
			content.append(new String(buffer, 0, len));
		}
		System.out.println(content);
		client.getConnectionManager().shutdown();
	}
	
	@Test
	public void testGetUser() throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet("http://localhost:8080/api/user/users/2");
		HttpResponse response = client.execute(get);
		InputStream in = response.getEntity().getContent();
		int len = 0;
		byte[] buffer = new byte[1024];
		StringBuilder content = new StringBuilder();
		while ((len = in.read(buffer)) != -1) {
			content.append(new String(buffer, 0, len));
		}
		System.out.println(content);
		client.getConnectionManager().shutdown();
	}
	
	@Test
	public void testEnabled() throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpPut put = new HttpPut("http://localhost:8080/api/user/enabled/2");
		HttpResponse response = client.execute(put);
		InputStream in = response.getEntity().getContent();
		int len = 0;
		byte[] buffer = new byte[1024];
		StringBuilder content = new StringBuilder();
		while ((len = in.read(buffer)) != -1) {
			content.append(new String(buffer, 0, len));
		}
		System.out.println(content);
		client.getConnectionManager().shutdown();
	}
	
	@Test
	public void testDisabled() throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpPut put = new HttpPut("http://localhost:8080/api/user/disabled/2");
		HttpResponse response = client.execute(put);
		InputStream in = response.getEntity().getContent();
		int len = 0;
		byte[] buffer = new byte[1024];
		StringBuilder content = new StringBuilder();
		while ((len = in.read(buffer)) != -1) {
			content.append(new String(buffer, 0, len));
		}
		System.out.println(content);
		client.getConnectionManager().shutdown();
	}
	
	@Test
	public void testUpdateUser() throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpPut put = new HttpPut("http://localhost:8080/api/user/2");
		StringEntity entity = new StringEntity("{\"username\":\"zzzzzzzzzz\", \"userDesc\":\"aaaaaaaa\"}");
		entity.setContentType("application/json");
		put.setEntity(entity);
		HttpResponse response = client.execute(put);
		InputStream in = response.getEntity().getContent();
		int len = 0;
		byte[] buffer = new byte[1024];
		StringBuilder content = new StringBuilder();
		while ((len = in.read(buffer)) != -1) {
			content.append(new String(buffer, 0, len));
		}
		System.out.println(content);
		client.getConnectionManager().shutdown();
	}
	
	@Test
	public void testModifyPassword() throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpPut put = new HttpPut("http://localhost:8080/api/user/password/2");
		StringEntity entity = new StringEntity("{\"password\":\"888888888888\", \"oldPassword\":\"111111\"}");
		entity.setContentType("application/json");
		put.setEntity(entity);
		HttpResponse response = client.execute(put);
		InputStream in = response.getEntity().getContent();
		int len = 0;
		byte[] buffer = new byte[1024];
		StringBuilder content = new StringBuilder();
		while ((len = in.read(buffer)) != -1) {
			content.append(new String(buffer, 0, len));
		}
		System.out.println(content);
		client.getConnectionManager().shutdown();
	}
	
}
