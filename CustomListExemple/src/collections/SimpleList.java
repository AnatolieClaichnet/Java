package collections;

public class SimpleList {
	
	// properties
    private int length;
    private Box first;

    // private data type
    private class Box {
      int value;
      Box next;

      // constructor
      Box(int value){
    	  this.value = value;
      }
      public int getValue() {
    	  return this.value;
      }
      public Box getNext() {
    	  return this.next;
      }
    }

    // constructor
    public SimpleList() {
      length = 0;
      first = null;
    }
    
    public int getLength() {
    	return this.length;
    }
    
    public void print() {
    	System.out.println(this.first.value);
    	System.out.println(this.first.next.value);
    	System.out.println(this.first.next.next.value);
    }
    
    public int get( int index ) {
    	int x =0;
    	if(index == 0) {
    		x = this.first.value;
    		System.out.println(this.first.value);
    	}else if(index == 1){
    		x = this.first.next.value;
    		System.out.println(this.first.next.value);
    	}else if(index == 2) {
    		x = this.first.next.next.value;
    		System.out.println(this.first.next.next.value);
    	}
    	return x;
    }

    // methods
    public void add( int value ) {
      Box current = first;
      if( length == 0 ) {
         first = new Box( value );
      } else {
        for(int i = 0; i < length - 1; i++) {
          current = current.next; 
        }
        current.next = new Box( value );
      }
      length++;
    }
  

}
