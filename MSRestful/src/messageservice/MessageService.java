package messageservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import database.DatabaseClass;
import messagemodel.Message;

public class MessageService {
 
	private Map<Long , Message> messages = DatabaseClass.getMessages();
	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1, "cool day" , 12 , "Kishore");
		Message m2 = new Message(2, "cool message" , 1 , "Kishore");
		Message m3 = new Message(1, "cool day" , 2 , "Kishore");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
	 	return list;
	 	

		
	}
	
	
	
	
}
