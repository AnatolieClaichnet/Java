package restaurant;



public class Restaurant {
		String name;
		Table tableNearWindow;
		Table tableNearDoors;
		Table tableNearBathroom;
		
		  public Restaurant(String name) {
			    this.name = name;
			  }      
		  
		  public void setTable(Table table, int x ) {
			  if(x == 1) {
				  this.tableNearWindow = table;
			  }else if (x==2) {
				  this.tableNearDoors = table;  
			  }else if (x==3) {
				  this.tableNearBathroom = table;  
			  }
			 
		  }
		  
		  public boolean ifFree() {
			  boolean y  = false;
			  if(tableNearWindow==null && tableNearDoors==null && tableNearBathroom==null ) {
				  y = true;
			  }
			  return y;
		  }
		  
		 public Table getTable( int z ) {
			 Table x = null;
			  if(z ==1) {
				 x= tableNearWindow;
			 }else if(z==2) {
				 x= tableNearDoors; 
			 }else if(z==3) {
				 x= tableNearBathroom; 
			 }
			  return x;
		 }
		 
		 public void printInfo() {
			 System.out.println(name);
			 System.out.println("##################################");
			 tableNearWindow.printInfo();
			 System.out.println("");
			 tableNearDoors.printInfo();
			 System.out.println("");
			 tableNearBathroom.printInfo();
		 }

}
