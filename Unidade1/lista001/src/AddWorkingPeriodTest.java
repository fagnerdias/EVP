import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AddWorkingPeriodTest {
	
	@Test
	void addWorkingPeriodTest_correto3() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);		
		teste.setRequiredNumber(2, 0, 2);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, 0, 2);
		Assert.assertEquals(true, res);
		
	}
	
	@Test
	void addWorkingPeriodTest_correto1() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);		
		teste.setRequiredNumber(2, 0, 0);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, 0, 0);
		Assert.assertEquals(true, res);
		
	}
	@Test
	void addWorkingPeriodTest_correto2() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);		
		teste.setRequiredNumber(2, 4, 4);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, 4, 4);
		Assert.assertEquals(true, res);
		
	}
	
	@Test
	void addWorkingPeriodTest_entradasErradas1() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		teste.setRequiredNumber(2, 0, 1);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, -1, 4);
		Assert.assertEquals(false, res);	}
	@Test
	void addWorkingPeriodTest_entradasErradas2() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		teste.setRequiredNumber(2, 0, 1);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, 0, 6);
		Assert.assertEquals(false, res);	}
	@Test
	void addWorkingPeriodTest_entradasErradas3() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		teste.setRequiredNumber(2, 0, 1);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, -1, 6);
		Assert.assertEquals(false, res);	}
	@Test
	void addWorkingPeriodTest_entradasErradas4() {
		int tempo_cronograma = 7;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		teste.setRequiredNumber(2, 0, 1);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, 6, 5);
		Assert.assertEquals(false, res);	}
	
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
	
	@Test
	void addWorkingPeriodTest_Lotado() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, 0, 1);
		Assert.assertEquals(false, res);
	}	

}
