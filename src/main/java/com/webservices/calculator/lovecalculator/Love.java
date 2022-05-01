package com.webservices.calculator.lovecalculator;

import java.util.Random;

public class Love {

     private String nameFirst;

     private String nameSecond;

     public Love(String nameFirst, String nameSecond) {
          this.nameFirst = nameFirst;
          this.nameSecond = nameSecond;
     }

     public double calculate(){
          return Math.random();
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

}
