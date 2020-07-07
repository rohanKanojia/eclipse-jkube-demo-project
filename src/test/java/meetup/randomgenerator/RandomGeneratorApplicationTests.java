package meetup.randomgenerator;

import meetup.randomgenerator.model.RandomNumberEndpointResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomGeneratorApplicationTests {

	@Test
	public void contextLoads() {
		// Given

		// When
		RandomNumberEndpointResponse result = RandomNumberEndpoint.getRandomMessage();

		// Then
		assertNotNull(result);
	}

}
