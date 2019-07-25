package com.pramati.datachart.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

	@RequestMapping("/get-random-number")
	@ResponseBody
	public int firstPage(@RequestParam(name = "minValue") int minValue,@RequestParam(name = "maxValue") int maxValue) {
		
		Random r = new Random();
		int randomGen = r.nextInt(maxValue-minValue) + minValue;
		System.out.println("<< randomGen >>"+randomGen);
		
		return randomGen;
	}
}
