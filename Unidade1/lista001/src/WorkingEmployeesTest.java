import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class WorkingEmployeesTest {
	
	@Test
	void workingEmployeesTest_certo() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		teste.setRequiredNumber(3, 0, 1);
		String[] empregados = {"deba", "fagner", "ariel"};
		for(int i = 0; i< empregados.length; i++) {
			teste.addWorkingPeriod(empregados[i], 0, 1);
		}
		String[] res = teste.workingEmployees(0, 1);

		Assert.assertEquals(true, Arrays.equals(empregados, res));
	}
	
	@Test
	void workingEmployeesTest_s_igual_e() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		String[] esp = {};
		String[] res = teste.workingEmployees(3, 3);
		Assert.assertEquals(true, Arrays.equals(esp, res));
	}
	
	@Test
	void workingEmployeesTest_s_maior_e() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		String[] esp = {};
		String[] res = teste.workingEmployees(3, 1);
		Assert.assertEquals(true, Arrays.equals(esp, res));
	}
	
	
	@Test
	void workingEmployeesTest_s_maior_tamanho() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		String[] esp = {};
		String[] res = teste.workingEmployees(6, 1);
		Assert.assertEquals(false, Arrays.equals(esp, res));
	}
	
	@Test
	void workingEmployeesTest_tamanho_menor_0() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		String[] esp = {};
		String[] res = teste.workingEmployees(1, -1);
		Assert.assertEquals(false, Arrays.equals(esp, res));
	}
}
