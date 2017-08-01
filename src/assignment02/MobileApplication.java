package assignment02;

class Mobile{
	
	private WhatsApp whatsapp;
	
	public void setWhatsApp(WhatsApp watsapp) {
		this.whatsapp = watsapp;
	}
	
	public WhatsApp getWhatsApp() {
		
		return whatsapp;
	}
	
}

class WhatsApp{
	
	private Chat chat; 
	
	public void setChat(Chat chat) {
		this.chat = chat;
	}
	
	public Chat getChat() {
		return chat;
	}
	
}

class Chat{
	
	private String str;
	
	public void setStr(String str) {
		this.str = str;
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
	public String getStr() {
		return str;
	}
	
}

public class MobileApplication {

	public static void main(String[] args) {
		
		Chat chat = new Chat();
		chat.setStr("I am chatting.");
	
		WhatsApp whatsapp = new WhatsApp();
		Mobile mobile = new Mobile();
		
		mobile.setWhatsApp(whatsapp);
		whatsapp.setChat(chat);

		System.out.println(mobile.getWhatsApp().getChat().getStr());
	}

}
