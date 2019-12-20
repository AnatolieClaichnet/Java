package robo;

public class ChargingStation{
	private  int chargeBattery;
	private int x;
	private int y;

	public ChargingStation(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setCharge(int charge) {
		if(charge>=0 && charge<=100) {
			this.chargeBattery = charge;
			}
	}

	
	public int getCharge() {
		return chargeBattery;
	}
	
	public boolean charge(HasBatteryInterface chargeable) {
		if(chargeBattery<5)
			 return false;
		 if(this.x == chargeable.getX() && this.y == chargeable.getY() && chargeable.getCharge()<100) {
			 int difCharge = chargeable.getCharge();
			 int difChargeBattery = 0;
			 while(difCharge < 100) {
				 if(chargeBattery<5)
					 return false;
				 difCharge++;
				 difChargeBattery ++;
			 }
			 chargeable.setCharge(difCharge);
			 setCharge( getCharge() - (int)(difChargeBattery*0.1));
			 return true;
		 }
		 return false;
	 }
	

}
