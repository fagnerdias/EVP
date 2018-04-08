import org.junit.Assert;
import org.junit.jupiter.api.Test;

class WorkingEmployeesTest {
	
	@Test
	void addWorkingPeriodTest_mesmoNome() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		teste.setRequiredNumber(2, 0, 1);
		String empregado = "Deba";
		teste.addWorkingPeriod(empregado, 0, 1);
		String empregado1 = "Deba";
		boolean res1 = teste.addWorkingPeriod(empregado1, 0, 1);
		Assert.assertEquals(false, res1);
	}
	@SuppressWarnings("deprecation")
	@Test
	private void workingEmployeesTest_errado() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		String[] esp = {};
		String[] res = teste.workingEmployees(3, 1);
		Assert.assertEquals(esp, res);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	private void workingEmployeesTest_certo() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		teste.setRequiredNumber(3, 0, 1);
		String[] empregados = {"deba", "fagner", "ariel"};
		for(int i = 0; i< empregados.length; i++) {
			teste.addWorkingPeriod(empregados[i], 0, 1);
		}
		String[] res = teste.workingEmployees(0, 1);
		Assert.assertEquals(empregados, res);
	}
	

}
