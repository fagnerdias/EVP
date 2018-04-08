package set;

import java.util.ArrayList;

public class NewSet {
	
	private ArrayList<Integer> a;
	
	
	public ArrayList<Integer> getA() {
		return a;
	}

	public void setA(ArrayList<Integer> a) {
		this.a = a;
	}

	public NewSet() {
		a = new ArrayList<Integer>();
	}
	
	public void insert(int x) {
		for(int i=0; i< a.size(); i++) {
			if(a.get(i) == x) {
				return;
			}
			else if(a.get(i) > x) {
				a.add(i, x);
				return;
			}
			else if(i == a.size() - 1) {
				a.add(x);
				return;
			}
		}
		a.add(x);
	}
	
	public boolean member(int x) {
		return a.contains(x);
	}
	
	public void section(NewSet x) {
		a.removeAll(x.getA());
	}
	
	public boolean containsArithTriple() {
		if(a.size() > 1) {
		   for (int i = 0; i < a.size(); i++) {
		     for (int j = 1; j < a.size(); j++) {
		       if (member(2 * a.get(i) - a.get(j))) return true; // procura do X e Z
		       if(member((a.get(i) + a.get(j)) / 2)) return true; // procura do Y
		     }
		   }
		}
		else
			return false;
		return false;
	}
	 
	public int[] toArray() {
		int[] ai = new int[a.size()];
		for(int i=0; i < a.size();i++) {
			ai[i] = a.get(i);
		}
		return ai;
	}

}
