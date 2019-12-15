package robo;


public class RobotFactory {
	public static AbstractRobot getRobot(String model, String name) {
		if(model == null) {
			return null;
		}
		if(model.equalsIgnoreCase("alpha")) {
			return new AlphaRobot(name, model);
		
		}else if(model.equalsIgnoreCase("beta")) {
		return new BetaRobot(name, model);
		
		}else if(model.equalsIgnoreCase("charlie")) {
		return new CharlieRobot(name, model);
		}
		return null;
	}
}
