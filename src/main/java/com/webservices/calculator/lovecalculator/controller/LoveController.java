package com.webservices.calculator.lovecalculator.controller;

import com.webservices.calculator.lovecalculator.APIKeyGenerator;
import com.webservices.calculator.lovecalculator.Love;
import com.webservices.calculator.lovecalculator.exception.ResourceNotFoundException;
import com.webservices.calculator.lovecalculator.form.LoveForm;
import com.webservices.calculator.lovecalculator.model.Key;
import com.webservices.calculator.lovecalculator.repository.KeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class LoveController {

    @Autowired
    KeyRepository keyRepository;

    @GetMapping("/calculate/first={first}&second={second}")
    public Map<String,Object> calculateLove(@PathVariable String first, @PathVariable String second){
        Map<String,Object> returnJSON = new HashMap<>();
        Love love = new Love(first, second);
        returnJSON.put("names", love);
        String match = new DecimalFormat("#.####").format(love.calculate());
        returnJSON.put("match", match);
        return returnJSON;
    }

    @GetMapping("/generateKey")
    public String generateKey() throws NoSuchAlgorithmException{
        Key key = new Key(APIKeyGenerator.generate(128));
        keyRepository.save(key);
        return key.getKey();
    }

    @PostMapping("/calculate")
    public Map<String,Object> calculateDetailedLove(@Valid @RequestBody LoveForm loveForm) {
        Optional.ofNullable(keyRepository.getByKey(loveForm.getApiKey()))
                .orElseThrow(() -> new ResourceNotFoundException("API key not found!"));
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
