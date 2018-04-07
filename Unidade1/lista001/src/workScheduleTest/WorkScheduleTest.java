package workScheduleTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
class WorkScheduleTest {
	public int inicializacão;
	
	public WorkScheduleTest(int init) {
		this.inicializacão = init;
	}
	
	/*
	 * parametros de entrada para a chamada do construtor no teste workScheduleTest
	 * para testar os casos limites de uma vez só.
	 */
	@Parameters
	public static Collection<int[]> workScheduleTestParameters(){
		return Arrays.asList(new int[][] {{1},{2},{11},{12},{13},{17},{18},{19},{23}});
	}

	
	@Test
	void workScheduleTest() {
		int param = inicializacão;
		WorkSchedule teste = new WorkSchedule(param);
		Assert.assertNotNull(teste);
	}
	
	@Test
	void readScheduleTest() {
		int param = inicializacão;
		WorkSchedule teste = new WorkSchedule(param);
		teste.readSchedule(param);
		
		
	}

}
