package meetup.randomgenerator;

import java.util.UUID;

import meetup.randomgenerator.model.RandomNumberEndpointResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumberEndpoint {
    private static final UUID id = UUID.randomUUID();

    @GetMapping(value = "/random", produces = "application/json")
    public RandomNumberEndpointResponse random() {
        return getRandomMessage();
    }

    protected static RandomNumberEndpointResponse getRandomMessage() {
        return new RandomNumberEndpointResponse(id.toString());
    }
}
