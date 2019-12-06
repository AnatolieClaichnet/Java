package world;

public class Person {
	private String fullName;
	private	String jobTitle;
	private	char gender;
	private	int age;
	  
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
	  
	  public void setJobTitle(String jobTitle) {
		    this.jobTitle = jobTitle;
		  
	   }
	  
	  public String getJobTitle() {
		  return this.jobTitle;
	  }
	  
	  public void printInfo() {
		  if(this.getJobTitle() == null) {
		  System.out.printf("%s: %s, %d years\n", this.fullName, getGender(), getAge());
		  }else {
			  System.out.printf("%s (%s): %s, %d years\n", this.fullName, getJobTitle(), getGender(), getAge());
		  }
	  }
	  

}
