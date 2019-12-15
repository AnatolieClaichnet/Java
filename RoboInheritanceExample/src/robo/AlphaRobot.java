package robo;

public class AlphaRobot extends AbstractRobot {
	
	private String name;
	private String model;
	private int x;
	private int y;
	
	public AlphaRobot() {
		
	}
	
	public AlphaRobot(String name, String model) {
		this.name = name;
		this.model = model;
		this.x = 0;
		this.y = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null) {
			this.name = name;	
		}else {
		System.err.println("Name can't be null");
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(model != null) {
			this.model = model;	
		}else {
		System.err.println("Model can't be null");
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x>=0 && x<=100) {
			this.x = x;
		}else {
		System.err.println("X must be between 0 - 100");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y>=0 && y<=100) {
			this.y = y;
		}else {
		System.err.println("Y must be between 0 - 100");
		}
	}
	
	public boolean moveRight() {
		boolean retV = false;
		if(x>=0 && x<100) {
			x++;
			retV = true;
		}
		return retV;
	}
    public boolean moveLeft() {
    	boolean retV = false;
		if(x>0 && x<=100) {
			x--;
			retV = true;
		}
		return retV;
    }
    public boolean moveDown() {
    	boolean retV = false;
		if(y>=0 && y<100) {
			y++;
			retV = true;
		}
		return retV;
    }
    public boolean moveUp() {
    	boolean retV = false;
		if(y>0 && y<=100) {
			y--;
			retV = true;
		}
		return retV;
    }
	
	
	

}
