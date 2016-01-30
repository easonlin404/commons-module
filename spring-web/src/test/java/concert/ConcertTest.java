package concert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {
	
	@Rule
	public final SystemOutRule  log = new SystemOutRule().enableLog();
	
	@Qualifier("performanceImpl")
	@Autowired
	private Performance p;
	
	@Qualifier("myPerformance")
	@Autowired
	private Performance p2;
	
	@Test
	public void pShouldNotBeNull() {
		assertNotNull(p);
		assertNotNull(p2);
	}
	
	@Test
	public void pShouldAroundAudience() {
			p.perform();
			assertEquals("Silencing cell phones\r\n"
					+ "Taking seats\r\n"
					+ "PerformanceImpl.perform()\r\n"
					+ "CLAP CLAP CLAP!!!\r\n", log.getLog());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void p2ShouldThrowAroundAudience() {
		try {
			p2.perform();
		} catch (Exception e) {
			assertEquals("Silencing cell phones\r\n" +
						"Taking seats\r\n" +
					"Demanding a refund\r\n", log.getLog());
			throw e;
		}
	}
}


