package world;

public class Person {
public	String fullName;
	  char gender;
	  int age;
	  
	  public Person(String fullName,char gender,int age) {
		  if(gender == 'f' || gender == 'm' && age >12 && age < 250) {
			  this.fullName = fullName;
			    this.gender = gender;
			    this.age   = age;
		  }else {
			  System.err.println("ERROR");
		  }		    
		}   
	  
	  public void setGender(char gender) {
		  if(gender == 'f' || gender == 'm') {
		   this.gender = gender;
		  }
	   }
	  
	  public char getGender() {
		  return this.gender;
	  }
	  
	  public void setAge(int age) {
		  if(age >12 && age < 250) {
		   this.age = age;
		  }
	   }
	  
	  public int getAge() {
		  return this.age;
	  }
	  
	  public void printInfo() {
		  System.out.printf("%s: %s, %d years\n", fullName, gender, age);
	  }
	  

}
