package robo;

public class BetaRobot extends AlphaRobot implements HasBatteryInterface {
	private  byte charge;
	private double battery = 100d;
	protected BetaRobot(String name, String model) {
		super(name, model);
		this.charge = 0;
	}

	public int getCharge() {
		return charge;
	}

	
	public void setCharge(int charge) {
		if(charge>=0 && charge<=100) {
		this.charge = (byte)charge;
		}
	}

	@Override
	public boolean moveRight() {
		boolean z = false;
			if (charge>5 && super.moveRight()) {
				z = true;
				 battery-=0.5;
				 if(battery == Math.round(battery)) {
					 charge -= 1;
				 }
			}
	return z;
		}

	@Override
	public boolean moveLeft() {
		boolean z = false;
		if (charge>5 && super.moveLeft()) {
			z = true;
			battery-=0.5;
			 if(battery == Math.round(battery)) {
				 charge -= 1;
			 }
		}
		return z;
	}

	@Override
	public boolean moveDown() {
		boolean z = false;
		if (charge>5 && super.moveDown()) {
			z = true;
			battery-=0.5;
			 if(battery == Math.round(battery)) {
				 charge -= 1;
			 }
		}
		return z;
		}

	@Override
	public boolean moveUp() {
		boolean z = false;
		if (charge>5 && super.moveUp()) {
			z = true;
			battery-=0.5;
			 if(battery == Math.round(battery)) {
				 charge -= 1;
			 }
		}
		return z;
		}
/*
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return super.getY();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return super.getModel();
	}

	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		super.setX(x);
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		super.setY(y);
	}
	*/
	
		
	
}
