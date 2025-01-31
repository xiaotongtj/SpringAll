package com.example.config;

import com.example.pojo.User;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class UserDeserializer extends JsonDeserializer<User> {

    //jackson反序列化
	@Override
	public User deserialize(JsonParser parser, DeserializationContext context)
			throws IOException, JsonProcessingException {
		JsonNode node = parser.getCodec().readTree(parser);
		String userName = node.get("user-name").asText();
		User user = new User();
		user.setUserName(userName);
		return user;
	}
}
