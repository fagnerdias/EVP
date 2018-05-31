package q2;

public class Isorttriple {
	int a, b, c;
	
	/*@ normal_behaviour
	@ requires a <= b
	@ ensures a <= b
	@*/
	public Isorttriple (int _a, int _b, int _c){
		this.a = _a; this.b = _b; this.c = _c;
	}
	
	/*@ normal_behaviour
	@ requires a <= b
	@ ensures a <= b & b <= c &
	@ (a = \old(a) & b = \old(b) & c = \old(c) |
	@ a = \old(a) & b = \old(c) & c = \old(b) |
	@ a = \old(b) & b = \old(a) & c = \old(c) |
	@ a = \old(b) & b = \old(c) & c = \old(a) |
	@ a = \old(c) & b = \old(a) & c = \old(b) |
	@ a = \old(c) & b = \old(b) & c = \old(a))
	@*/
	public void isorttriple( ){
		if(a <= b) {
			int aux1, aux2;
			if(c <= a) {
				aux1 = a;
				a = c;
				aux2 = b;
				b = aux1;
				c = aux2;
				return;
			}
			else if(c >= a && c<= b) {
				aux1 = b;
				b = c;
				c = aux1;
				return;
			}
			else {
				return;
			}
		}
	}

}

