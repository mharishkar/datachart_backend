package springboot.controller;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class RequestController {
	@RequestMapping("/randomgenerator")
	public int home(@RequestParam("minValue") int min,@RequestParam("maxValue") int max ) {

		int randomGen = ThreadLocalRandom.current().nextInt();
		return randomGen;
	}
}
