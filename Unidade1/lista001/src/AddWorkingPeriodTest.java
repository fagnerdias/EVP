import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AddWorkingPeriodTest {
	
	@Test
	void addWorkingPeriodTest_correto() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);		
		teste.setRequiredNumber(2, 0, 1);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, 0, 1);
		Assert.assertEquals(true, res);
	}
	
	@Test
	void addWorkingPeriodTest_entradasErradas() {
		int tempo_cronograma = 5;
		WorkSchedule teste = new WorkSchedule(tempo_cronograma);
		teste.setRequiredNumber(2, 0, 1);
		String empregado = "Deba";
		boolean res = teste.addWorkingPeriod(empregado, -1, 6);
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
