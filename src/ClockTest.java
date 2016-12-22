import static org.junit.Assert.*;

import org.junit.Test;

public class ClockTest {

	@Test
	public void timeSettest() {
		String expectedResult;
		Time testTime = new Time();
		expectedResult = testTime.timeSet(2, 34, 66);
		String actual = "2346";
		assertEquals(expectedResult, actual);
	}

}
