package parking;

public class Car {
	private String model;
	private String id;
	
	public Car(String model, String id){
		if(model.equals("BMW") || model.equals("Mercedes") || model.equals("Fiat") ){
		this.model = model;
		this.id = id;
		}else {
			System.out.println("We park: BMW, Mercedes, Fiat");
		}
	}
	
	public void setModel(String model) {
		if(model.equals("BMV") || model.equals("Mercedes") || model.equals("Fiat") ){
			this.model = model;
		}else {
				System.out.println("We park: BMW, Mercedes, Fiat");
			}
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void printCarModel() {
	System.out.printf(" %-8s", getModel());
		
	}
	public void printCarId() {
		System.out.printf(" %s", getId());
		}
}
