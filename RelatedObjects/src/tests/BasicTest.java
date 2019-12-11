package tests;
import humanity.Person;

public class BasicTest {
	
	 public static int runCase(){

         int percentage = 0;    

         Person guy = new Person( "John" );
         // cannot add itself as a friend
         if( guy.addFriend(guy) ) {
             System.err.println("Add test failed\nREASON: Person cannot add himself as a friend!");
             return percentage;
         }
         percentage+=20;

         // cannot add null as a friend
         if( guy.addFriend(null) ) {
             System.err.println("Add test failed\nREASON: Person cannot add NULL as a friend!");
             return percentage;
         }
         percentage+=20;

         // must add normal friend
         if( !guy.addFriend(new Person( "Marry" )) ) {
             System.err.println("Add test failed\nREASON: Person did not add another Person(object) as friend!");
             return percentage;
         }
         percentage+=20;

         // can remove not null friend
         if( !guy.removeFriend() ) {
             System.err.println("Remove test failed\nREASON: Person did not remove Person(object) as friend!");
             return percentage;
         }
         percentage+=20;

         // if friend removed - must be lonely
         if( !guy.isLonely() ) {
             System.err.println("Status test failed\nREASON: Person was not lonely after removing Person(object) as friend!");
             return percentage;
         }
         percentage+=20;
         return percentage;

     }

}
