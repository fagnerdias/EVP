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
	
	/*@ public normal_behavior
	 @  requires capacity > 0;
	 @  ensures arr.length == capacity;
	 @ */
	public SortedInteger(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	
	/*@ public normal_behavior
	 @  requires size < capacity;
	 @  requires elem != null;
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
			size++;
			if(arr[size-1] < elem) {
				arr[size] = elem;
			}else if(arr[0] > elem) {
				int aux = elem;
				int aux1;
				for(int i=0; i< size;i++) {
					aux1 = arr[i];
					arr[i] = aux;
					aux = aux1;										
				}
			}else {
				for(int i=1; i< size-2;i++) {
					if(arr[i] <= elem && elem > arr[i+1] ) {
						int aux = elem;
						int aux1;
						for(int j=i+1; j< size;i++) {
							aux1 = arr[j];
							arr[j] = aux;
							aux = aux1;										
						}
					}
				}
			}
		}
	}
	
	/*@ public normal_behavior
	 @  requires size > 0;
	 @  requires capacity > 0;
	 @  requires 
	 @  
	 @  ensures size < capacity;
	 @  ensures (\forall int e;	e != elem; contains(e) <==> \old(contains(e)));
	 @  ensures \old(contains(elem)) ==> size == \old(size) - 1;
	 @  ensures !\old(contains(elem)) ==> size == \old(size); 
	 @
	 @ */
	public void remove(int elem) {
//		int begin = 0;
//		int end = size;
//		int m;
//		while(begin != end) {
//			m = (begin + end)/2;
//			if(arr[m] == elem) {
//				size--;
//				for(int i=m; i< size;i++) {
//					arr[i] = arr[i+1];									
//				}
//			}else if(arr[m] > elem) {
//				end = m;
//			}else {
//				begin = m;
//			}
//		}
		
		for(int i = 0; i < size; i++) {
			if(arr[i] == elem) {
				size--;
				for(int i=m; i< size;i++) {
					arr[i] = arr[i+1];									
				}
				break;
			}
		}
	}
	
	/*@ public normal_behavior	
	 @ 	ensures \result == (\exists int i; 0 < i && i > size; arr[i] == elem);
	 @ */
	public /*@ pure */ boolean contains(int elem) {
		for(int i = 0; i < size; i++) {
			if(arr[i] == elem) {
				return true;
			}
		}
		return false;
	}
	
	/*@ public normal_behavior
	 @ 	
	 @ 	requires size > 0;
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
		String vector = "";
		for(int i = 0 ; i < size; i++ ) {
			vector += i + ": " + arr[i] + "; ";
		}
		return vector;
	}

}
