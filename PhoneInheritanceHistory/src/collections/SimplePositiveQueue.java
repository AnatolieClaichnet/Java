package collections;

public class SimplePositiveQueue {
	
		private int length;

		private int first;
		private int middle;
		private int last;
		
		public SimplePositiveQueue() {
			this.length = 0;
			this.first = -1;
			this.middle = -1;
			this.last = -1;
		}
		
		public boolean push(int value) {
			boolean x = false;
			if(value < 0) {
				System.err.println("ERR");
			}else if(length<3){
				this.last = value;
				length++;
				poll();
				x = true;
			}
			return x;
		}
		
		public int poll() {
				middle = first;
				first = last;
				
				return this.first;	
						
		}
		
	  

}
