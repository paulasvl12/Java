
public class Actor {
	
	
private String name, role;
private int age;
//how many instances of this class (Actors) have been created
//make it static so it's shared among all instances
private static int counter = 0;
private Chat chat;

	public Actor (String name,String role,int age, Chat c) {
		
		this.name=name;
		this.role=role;
		this.age=age;
		counter++;
		chat = c;
		
	}
	
	public Actor () {
		name = "";
		role = "";
		age =0;
		//no longer tied to an instance
		counter++;
		chat = null;
	}
	//reuse the existing constructor
	public Actor (Actor other) {
		
		name = other.name;
		role = other.role;
		age = other.age;
		chat = null;
	}
	//make method static
	//no longer tied to an instance
	public static int getCounter() {
		return counter;
	}
	
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public void hello()
	{
		System.out.println(initial() + " : hello");
		
	}
	
	// to get the initials and adds a '.'
	//cannot be used in another class, only used for when
	//hello(String str) is called in main, so make it private
	private String initial() {
		return name.charAt(0) + ".";
	}
	
	public void hello(String str) {
		System.out.println(initial() + ": " + str);
	}
	
    //method to say goodbye, Only one way of saying goodbye
	public void bye()
	{
		System.out.println(initial() + ": Goodbye!");
	}
	

	
	public void introduce()
	{
		System.out.println("Hello, I am an actor and my name is " + name + ", my role is "
				+role + ", my age is " + age );
		
	}
	
	//two actors are equal when all properties are the same
	public boolean equals(Actor other) {
		if (age == other.age && name.equals(other.name)==true && role.equals(other.role)==true) {
			
			return true;
		}
		
	return false;
	}
	
	//another override
	//toString() allows returning a string representation of an object
	//and printing the object directly
	
	//return an object summary
	 public String toString() {
		
		return "summary: " + name + ", " + role + ", " + age;
		
	}

	
	 
	 
	public void setChat(Chat c) {
		chat = c;
	}
	 
	

	//retrieve a phrase from Chat if the actor has a role, if not 
	//return default phrase
	public void sayPhrase() {
		if (chat == null) {
			System.out.println(initial() + ": I don't feel chatty today");
		}
		else {
		System.out.println(initial() + ": " + chat.getPhrase() );
		}
	}
	
	
	
	
	
	
	 
	 
}
