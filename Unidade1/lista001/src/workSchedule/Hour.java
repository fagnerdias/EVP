package workSchedule;

public class Hour {
	
	static int timeNow;
	int requiredNumber;
	String[] workingEmployees;
	
	public static int getTimeNow() {
		return timeNow;
	}
	public static void setTimeNow(int timeNow) {
		Hour.timeNow = timeNow;
	}
	public int getRequiredNumber() {
		return requiredNumber;
	}
	public void setRequiredNumber(int requiredNumber) {
		this.requiredNumber = requiredNumber;
	}
	public String[] getWorkingEmployees() {
		return workingEmployees;
	}
	public void setWorkingEmployees(String[] workingEmployees) {
		this.workingEmployees = workingEmployees;
	}
	
	

}
