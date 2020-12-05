package meetup.randomgenerator;

import meetup.randomgenerator.model.RandomNumberEndpointResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class RandomGeneratorApplicationTests {

	@Test
	void contextLoads() {
		// Given

		// When
		RandomNumberEndpointResponse result = RandomNumberEndpoint.getRandomMessage();

		// Then
		assertNotNull(result);
	}

}
