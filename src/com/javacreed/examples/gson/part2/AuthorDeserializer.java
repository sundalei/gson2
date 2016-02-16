package com.javacreed.examples.gson.part2;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class AuthorDeserializer implements JsonDeserializer<Author> {

	@Override
	public Author deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		final JsonObject jsonObject = json.getAsJsonObject();
		
		final int id = jsonObject.get("id").getAsInt();
		final String name = jsonObject.get("name").getAsString();
		
		Author author = new Author();
		author.setId(id);
		author.setName(name);
		
		return author;
	}



}
