package com.webservices.calculator.lovecalculator.controller;

import com.webservices.calculator.lovecalculator.Love;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoveController {

    @GetMapping("/calculate/first={first}&second={second}")
    public Map<String,Object> calculateLove(@PathVariable String first, @PathVariable String second){
        Map<String,Object> returnJSON = new HashMap<>();
        Love love = new Love(first, second);
        returnJSON.put("names", love);
        String match = new DecimalFormat("#.####").format(love.calculate());
        returnJSON.put("match", match);
        return returnJSON;
    }

}
