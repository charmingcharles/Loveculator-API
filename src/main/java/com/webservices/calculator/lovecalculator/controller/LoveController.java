package com.webservices.calculator.lovecalculator.controller;

import com.webservices.calculator.lovecalculator.Love;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoveController {

    @GetMapping("/calculate/first={first}&second={second}")
    public Map<String,Object> calculateLove(@PathVariable String first, @PathVariable String second){
        Map<String,Object> returnJSON = new HashMap<>();
        returnJSON.put("names", new Love(first, second));
        return returnJSON;
    }

}
