package com.simplilearn.mavenproject;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile extends DefindElement{
	
	public JSONObject ReadJS() throws IOException, ParseException {
		// read the json file
		FileReader reader = new FileReader("D:\\Accounts.json");

		JSONParser Parser = new JSONParser();
		JSONObject Object = (JSONObject) Parser.parse(reader);

//		System.out.println(Object);

		JSONObject getAccount = (JSONObject) Object.get("Acount");
		System.out.print(getAccount);
		return getAccount;
	}
}
