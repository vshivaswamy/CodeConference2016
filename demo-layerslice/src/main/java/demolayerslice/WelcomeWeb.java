package demolayerslice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinay
 *
 */
@RestController
public class WelcomeWeb {
	@RequestMapping("/welcome")
    public String index() {
        return "Greetings..!";
    }
}
