
public class Chat {

  private String[] phrases;	

	
	public Chat() {
		phrases = new String[] {""};
				
		}
	
	
	public void setPhrases(String[] p) {
		phrases = p;
	}
	

	
	public String getPhrase() {
		int index = (int)(Math.random()*phrases.length);
		return phrases[index];
	}
	

}


	

	

