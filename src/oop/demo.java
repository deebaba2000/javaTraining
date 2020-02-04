package oop;

class person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking" );
	}
	void eat(){
		System.out.println(name + " is eating ");
	
		
	}
	void sleep(){
		System.out.println(name + "is sleeping");
		
	}
}

public class demo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  person person1 = new person();
  person1.name = "damilare";
  person1.email = "ogunyewo@gmail.com";
  person1.phone = "08059532208";
  
 person1.walk();
 person1.eat();
 person1.sleep();
 
 
  
  
 
	}

}
