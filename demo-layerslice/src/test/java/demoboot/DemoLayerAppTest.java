package demoboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demolayerslice.DemoLayerSliceApp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoLayerSliceApp.class)
@WebAppConfiguration
public class DemoLayerAppTest {

	@Test
	public void contextLoads() {
	}

}
