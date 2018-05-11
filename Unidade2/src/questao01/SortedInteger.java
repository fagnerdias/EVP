package questao01;

public class SortedInteger {
	/*@ public invariant (\forall int i; 
	 * 						0 < i && i < size;
	 * 						arr[i - 1] <= arr[i]);
	 * 
	 *  */
	//@ public invariant 0 <= size && size <= arr.length
	  
	
	private /*@ spec_public @*/ int arr[];
	private /*@ spec_public @*/ int capacity, size = 0;
	
	public SortedInteger(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	
	/*@ public normal_behavior
	 *  requires size < capacity;
	 *  
	 *  ensures size <= capacity;
	 *  ensures size == \old(size) + 1;
	 *  ensures contains(elem);
	 *  ensures (\forall int e;
	 *  			e != elem;
	 *  			contains(e) <==> \old(contains(e)));
	 *  
	 * */
	public void add(int elem) {
	// ...
	}
	
	/*@ public normal_behavior
	 *  requires size > 0;
	 *  requires capacity > 0;
	 *  
	 *  ensures size <= capacity;
	 *  ensures size == \old(size) - 1;
	 *  ensures !contains(elem);
	 *  ensures (\forall int e;
	 *  			e != elem;
	 *  			contains(e) <==> \old(contains(e)));
	 *  ensure \old(contains(elem)) 
	 *  		==> size == \old(size) - 1;
	 *  ensure !\old(contains(elem)) 
	 *  		==> size == \old(size);
	 *  
	 * */
	public void remove(int elem) {
	// ...
	}
	
	/*@ public normal_behavior
	 * 		
	 * 	ensures \result == (\exist int i;
	 * 							0 < i && i > size;
	 * 							arr[i] == elem);
	 * 
	 * */
	public /*@ pure */ boolean contains(int elem) {
	// ...
		return false;
	}
	
	/*@ public normal_behavior
	 * 	
	 * 	requires size != 0
	 * 
	 *  ensures \result == arr[size]
	 * 
	 * */
	public /*@ pure */ int max() {
	// ...
		return 0;
	}
	
	/*@ public normal_behavior
    @ ensures \result == size;
    @*/
	public /*@ pure */ int getSize() {
		return this.size;
	}
	
	/*@ public normal_behavior
    @ ensures \result == capacity;
    @*/
	public /*@ pure */ int getCapacity() {
		return this.capacity;
	}
	
	public String toString() {
	// ...
		return null;
	}

}
