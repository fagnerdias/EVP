package workSchedule;

public class WorkSchedule {
	Schedule schedule;
	
	/*
	 * cria um cronograma que contém as horas 0,1,2, ..., tamanho - 1, onde, para cada hora, o número de
		funcionários necessários é definido como zero e não há empregados atribuídos a ele
	 */
	public WorkSchedule(int size) {
		this.schedule = new Schedule(size - 1);
	}
	/*
	 * Retorna um objeto da classe Hour, que tem dois campos:
		requiredNumber do tipo int é o número necessário de funcionários que trabalham na hora da hora.
		workingEmployees do tipo String [] é o nome dos funcionários que até agora foram designados para
		trabalhar na hora da hora.
	 */
	public Hour readSchedule(int time) {
		return null;
	}
	/*
	 * define o número de empregados trabalhando necessários para o funcionário durante todas as horas na
		hora de início do intervalo até o fim do tempo.
	 */
	public void setRequiredNumber(int nemployee, int starttime, int endtime) {
		
	}
	/*
	 * agenda o funcionário para trabalhar durante as horas desde o início até o fim do tempo.
	 */
	public boolean addWorkPeriod(String employee, int starttime, int endtime) {
		return false;
	}
	/*
	 * retorna uma lista de todos os funcionários que trabalham em algum ponto durante o intervalo de início ao
		fim do tempo.
	 */
	public String[] workingEmployees(int starttime, int endtime) {
		return null;
	}
	
	/*
	 * retorna o tempo mais próximo a partir do horário atual para o qual a quantidade necessária de
		funcionários ainda não foi agendada.
	 */
	public int nextIncomplete(int currenttime) {
		return 0;
	}
}
