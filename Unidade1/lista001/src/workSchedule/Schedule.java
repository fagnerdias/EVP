package workSchedule;

import java.util.HashMap;

public class Schedule {
	
	int sizetime;
	HashMap<Hour, Employee> schedule;
	
	public Schedule(int sizetime) {
		this.sizetime = sizetime;
		this.schedule = new HashMap<Hour, Employee>(sizetime);
	}

	public int getSizetime() {
		return sizetime;
	}

	public void setSizetime(int sizetime) {
		this.sizetime = sizetime;
	}

	public HashMap<Hour, Employee> getSchedule() {
		return schedule;
	}

	public void setSchedule(HashMap<Hour, Employee> schedule) {
		this.schedule = schedule;
	}
	
	

}
