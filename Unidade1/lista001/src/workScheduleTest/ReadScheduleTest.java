package workScheduleTest;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class ReadScheduleTest {
	public int time;

	public ReadScheduleTest(int time) {
		this.time = time;
	}
	
	@Parameters
	public static Collection<int[]> workScheduleTestParameters(){
		return Arrays.asList(new int[][] {{1},{2},{11},{12},{13},{17},{18},{19},{23}});
	}
	
	
	@Test
	private void readScheduleTest() {
		int t = time;
		WorkSchedule teste = new WorkSchedule(25);
		Assert.assertNotNull(teste.readSchedule(t));
		
	}
	

}
