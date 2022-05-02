package com.webservices.calculator.lovecalculator.form;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class LoveForm {

    @NotBlank
    private String nameFirst;

    @NotBlank
    private String nameSecond;

    @Min(value = 2)
    private int digits;

    @NotBlank
    @Length(min=16, max=32)
    private String apiKey;

    public LoveForm(String nameFirst, String nameSecond, int digits, String apiKey) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.digits = digits;
        this.apiKey = apiKey;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameSecond() {
        return nameSecond;
    }

    public void setNameSecond(String nameSecond) {
        this.nameSecond = nameSecond;
    }

    public int getDigits() {
        return digits;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
