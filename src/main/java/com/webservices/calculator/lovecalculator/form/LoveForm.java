package com.webservices.calculator.lovecalculator.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class LoveForm {

    @NotBlank
    String nameFirst;

    @NotBlank
    String nameSecond;

    @Min(value = 2)
    int digits;

    public LoveForm(String nameFirst, String nameSecond, int digits) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.digits = digits;
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
}
