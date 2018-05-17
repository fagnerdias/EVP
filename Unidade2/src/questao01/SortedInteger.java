package questao01;

public class SortedInteger {
	/*@ public invariant (\forall int i; 
	 @ 						0 < i && i < size;
	 @ 						arr[i - 1] <= arr[i]);
	 @ 
	 @  */
	//@ public invariant 0 <= size && size <= arr.length;
	  
	
	private /*@ spec_public @*/ int arr[];
	private /*@ spec_public @*/ int capacity, size = 0;
	
	public SortedInteger(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	
	/*@ public normal_behavior
	 @  requires size < capacity;
	 @  
	 @  ensures size <= capacity;
	 @  ensures size == \old(size) + 1;
	 @  ensures contains(elem);
	 @  ensures (\forall int e;
	 @  			e != elem;
	 @  			contains(e) <==> \old(contains(e)));
	 @  
	 @ */
	public void add(int elem) {
		if(size < capacity) {
			if(arr[size] < elem) {
				size++;
				arr[size] = elem;
			}else if(arr[0] > elem) {
				//TODO
			}else {
				for(int i=0; i< size;i++) {
					if(arr[i] < elem && elem > arr[i+1] ) {
						//TODO
					}
				}
			}
		}
	}
	
	/*@ public normal_behavior
	 @  requires size > 0;
	 @  requires capacity > 0;
	 @  
	 @  ensures size < capacity;
	 @  ensures !contains(elem);
	 @  ensures (\forall int e;	e != elem; contains(e) <==> \old(contains(e)));
	 @  ensures \old(contains(elem)) ==> size == \old(size) - 1;
	 @  ensures !\old(contains(elem)) ==> size == \old(size);
	 @ */
	public void remove(int elem) {
		int begin = 0;
		int end = size;
		while(begin != end) {
			if(arr[(begin + size)/2] == elem) {
				
			}else if(arr[(begin + size)/2] < elem) {
				end = (begin + size)/2;
			}else {
				begin = (begin + size)/2;
			}
		}
	}
	
	/*@ public normal_behavior	
	 @ 	ensures \result == (\exists int i; 0 < i && i > size; arr[i] == elem);
	 @ */
	public /*@ pure */ boolean contains(int elem) {
		int begin = 0;
		int end = size;
		if(size == 0) {
			return false;
		}
		else {
			while(begin != end) {
				if(arr[(begin + size)/2] == elem) {
					return true;
				}else if(arr[(begin + size)/2] < elem) {
					end = (begin + size)/2;
				}else {
					begin = (begin + size)/2;
				}
			}
			if(arr[begin] == elem) {
				return true;
			}
			return false;
		}
		
	}
	
	/*@ public normal_behavior
	 @ 	
	 @ 	requires size != 0;
	 @ 
	 @  ensures \result == arr[size];
	 @ 
	 @ */
	public /*@ pure */ int max() {
		return this.arr[size];
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
