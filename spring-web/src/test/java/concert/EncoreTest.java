package concert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EncoreConfig.class)
public class EncoreTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	@Autowired
	private Performance p;

	@Test
	public void pShouldNotBeNull() {
		assertNotNull(p);
	}

	@Test
	public void pShouldIntroduce() {
		((Encoreable) p).performEncore();
		assertEquals("performEncore\r\n", log.getLog());
	}

}
