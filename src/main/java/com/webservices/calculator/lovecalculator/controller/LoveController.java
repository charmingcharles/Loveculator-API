package com.webservices.calculator.lovecalculator.controller;

import com.webservices.calculator.lovecalculator.Love;
import com.webservices.calculator.lovecalculator.form.LoveForm;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping("/calculate")
    public Map<String,Object> calculateDetailedLove(@Valid @RequestBody LoveForm loveForm){
        Map<String,Object> returnJSON = new HashMap<>();
        Love love = new Love(loveForm.getNameFirst(), loveForm.getNameSecond());
        returnJSON.put("names", love);
        StringBuilder sb = new StringBuilder();
        sb.append("#.");
        int digitCount = loveForm.getDigits();
        sb.append("#".repeat(Math.max(0, digitCount)));
        String match = new DecimalFormat(sb.toString()).format(love.calculate());
        returnJSON.put("match", match);
        return returnJSON;
    }

}
