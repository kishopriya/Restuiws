package database;

import java.util.HashMap;
import java.util.Map;

import messagemodel.Message;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	
	
	public static Map<Long , Message> getMessages(){
		return messages;
	}
 	
	
	
}
