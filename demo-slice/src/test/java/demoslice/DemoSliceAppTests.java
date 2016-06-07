package demoslice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demoslice.DemoSliceApp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoSliceApp.class)
@WebAppConfiguration
public class DemoSliceAppTests {

	@Test
	public void contextLoads() {
	}

}
