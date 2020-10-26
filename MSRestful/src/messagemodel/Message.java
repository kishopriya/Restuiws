package messagemodel;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private long id;
	private String message;
	private int	deliverytime;
	private String author;
	
	public Message() {
		
	}
	
	public Message(long id, String message, int deliverytime, String author) {
		this.id =id;
		this.message = message;
		this.deliverytime = deliverytime;
		this.author = author;
	}
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id =id;
	}
	public String getMessage() {
		return message;
	}
	
	public void setmessage(String message) {
		this.message = message;
	}

	public int getdeliverytime() {
		return deliverytime;
	}
	
	public void setdeliverytime() {
		this.deliverytime = deliverytime;
		
	}

	public String getauthor() {
		return author;
	}
	
	public void setauthor(String author) {
		this.author = author;
	}

}

