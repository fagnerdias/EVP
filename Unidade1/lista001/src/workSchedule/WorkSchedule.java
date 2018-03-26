package workSchedule;

public class WorkSchedule {
	Schedule schedule;
	
	/*
	 * cria um cronograma que cont�m as horas 0,1,2, ..., tamanho - 1, onde, para cada hora, o n�mero de
		funcion�rios necess�rios � definido como zero e n�o h� empregados atribu�dos a ele
	 */
	public WorkSchedule(int size) {
		this.schedule = new Schedule(size - 1);
	}
	/*
	 * Retorna um objeto da classe Hour, que tem dois campos:
		requiredNumber do tipo int � o n�mero necess�rio de funcion�rios que trabalham na hora da hora.
		workingEmployees do tipo String [] � o nome dos funcion�rios que at� agora foram designados para
		trabalhar na hora da hora.
	 */
	public Hour readSchedule(int time) {
		return null;
	}
	/*
	 * define o n�mero de empregados trabalhando necess�rios para o funcion�rio durante todas as horas na
		hora de in�cio do intervalo at� o fim do tempo.
	 */
	public void setRequiredNumber(int nemployee, int starttime, int endtime) {
		
	}
	/*
	 * agenda o funcion�rio para trabalhar durante as horas desde o in�cio at� o fim do tempo.
	 */
	public boolean addWorkPeriod(String employee, int starttime, int endtime) {
		return false;
	}
	/*
	 * retorna uma lista de todos os funcion�rios que trabalham em algum ponto durante o intervalo de in�cio ao
		fim do tempo.
	 */
	public String[] workingEmployees(int starttime, int endtime) {
		return null;
	}
	
	/*
	 * retorna o tempo mais pr�ximo a partir do hor�rio atual para o qual a quantidade necess�ria de
		funcion�rios ainda n�o foi agendada.
	 */
	public int nextIncomplete(int currenttime) {
		return 0;
	}
}
