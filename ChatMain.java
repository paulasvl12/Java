
public class ChatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//two instance of chat are created for two actors
		Chat seller = new Chat();
		Chat buyer = new Chat();
	
		
		
		
		//Three actors and their roles are created
		// One of them doesn't have a role
		Actor a = new Actor("Tony", "action", 26, seller);
		Actor b = new Actor("Paula", "drama", 18, buyer);
		Actor c = new Actor("Jess", "comedy", 30, null);

		
		String[] phrasesSeller = new String[] {"I sell fruits.", "I have great prices.", "Do you want to try one?", "This is a good deal",
				"These are the best fruits in town", "2 for the price of 1"};
		String[] phrasesBuyer = new String[] {"I'm not interested.", "You are too pushy.", "No, thank you", "I don't want that",
	        	"I am only looking around", "Maybe another day"};
		
		//setter method stores the phrases of each actor according to their role
		seller.setPhrases(phrasesSeller);
        buyer.setPhrases(phrasesBuyer);
		

        
        
        
    	//giving the chat option only to Actor 'seller' and Actor 'buyer'
		a.setChat(seller);
		b.setChat(buyer);
		
		
		
		//conversation begins
		a.introduce();
		b.introduce();
		c.introduce();
		
        //testing which Actor has more phrases
		int max  = 0;
		int counter = 0;
		int counterTwo = 0;
		for (int i = 0; i < phrasesSeller.length; i++) {
			counter++;
		}
		for (int i = 0; i < phrasesBuyer.length; i++) {
			counterTwo++;
		}
		
		if (counter > counterTwo) {
			max = counter;
		}
		else {
			max = counterTwo;
		}
		
		
		//the loop continues for the maximum amount of phrases any of the two actors
		//could possibly have (they don't necessarily have the same amount)
		for (int i = 0; i < max; i++) {
			a.sayPhrase();
			b.sayPhrase();
			c.sayPhrase();
		}
		
		
		//saying goodbye
		a.bye();
		b.bye();
		c.bye();
		
		
		
   }
	

  
  

}
