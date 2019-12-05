package geometry;


public class Line {
	
	  public int startX;
	  public int endX;
	  public int startY;
	  public int endY;
	  
	  public Line(int startX,int startY,int endX,int endY) {
		  
		  if(startX != endX || startY != endY) {
		    this.startY = startY;
		    this.startX = startX;
		    this.endX   = endX;
		    this.endY   = endY;
		    }
		  }  
	  
	  public void printCoords() {
		  System.out.printf("[%d:%d]----->[%d:%d]\n", startX, startY, endX, endY);
	  }
	  
	 public int length() {
		 return (int) Math.sqrt(Math.pow((startX - endX), 2) + Math.pow((startY - endY), 2));
	  }
	  

}
