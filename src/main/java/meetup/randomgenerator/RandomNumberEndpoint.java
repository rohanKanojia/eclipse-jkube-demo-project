package meetup.randomgenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roland
 * @since 12.10.17
 */
@RestController
public class RandomNumberEndpoint {

    private static final UUID id = UUID.randomUUID();

    private Random random = new Random();

    @RequestMapping(value = "/random", produces = "application/json")
    public Map<String, String> random() {
        Map<String, String> ret = new HashMap<>();
        ret.put("id", id.toString());
        return ret;
    }
}
