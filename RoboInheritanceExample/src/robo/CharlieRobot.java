package robo;

public class CharlieRobot extends BetaRobot {

	protected CharlieRobot(String name, String model) {
		super(name, model);
		// TODO Auto-generated constructor stub
	}
	
	public boolean moveDownRight() {
		boolean z = false;
		if(super.getX()==100 || super.getY()==100) {
			System.err.println("I can't move");
		}else {
			super.moveDown();
			super.moveRight();
			z = true;
		}
		return z;
		}

	
	public boolean moveDownLeft() {
		boolean z = false;
		if(super.getX()==0 || super.getY()==100) {
			System.err.println("I can't move");
		}else {
			super.moveDown();
			super.moveLeft();
			z = true;
		}
		return z;
		}

	
	public boolean moveUpRight() {
		boolean z = false;
		if(super.getX()==100 || super.getY()==0) {
			System.err.println("I can't move");
		}else {
			super.moveUp();
			super.moveRight();
			z = true;
		}
		return z;
	}

	
	public boolean moveUpLeft() {
		boolean z = false;
		if(super.getX()==0 || super.getY()==0) {
			System.err.println("I can't move");
		}else {
			super.moveUp();
			super.moveLeft();
			z = true;
		}
		return z;
	}

/*	@Override
	public boolean moveRight() {
		// TODO Auto-generated method stub
		return super.moveRight();
	}

	@Override
	public boolean moveLeft() {
		// TODO Auto-generated method stub
		return super.moveLeft();
	}

	@Override
	public boolean moveDown() {
		// TODO Auto-generated method stub
		return super.moveDown();
	}

	@Override
	public boolean moveUp() {
		// TODO Auto-generated method stub
		return super.moveUp();
	}
	*/
	

}
