package concert;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {
	@Autowired
	private Performance p;

	@Test
	public void pShouldNotBeNull() {
		assertNotNull(p);
	}
	
	@Test
	public void pShouldBeforCallEsilenceCellPhones() {
		assertNotNull(p);
	}
}


