package meetup.randomgenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumberEndpoint {
    private static final UUID id = UUID.randomUUID();

    @GetMapping(value = "/random", produces = "application/json")
    public Map<String, String> random() {
        return getRandomMessage();
    }

    private Map<String, String> getRandomMessage() {
        Map<String, String> ret = new HashMap<>();
        ret.put("id", id.toString());
        return ret;
    }
}
