//Malique S. Dowridge
//Dr. Ndjatou
//10/5/17
//CS 4051: Exercise O2

import java.util.Scanner;

class Demo {
 private double val1; // the first data member
 private double val2; // the second data member

 public void setValues(double num1, double num2) {
  val1 = num1;
  val2 = num2;
 }

 public double getValue1() {
  return (val1); // returns val1
 }

 public double getValue2() {
  return (val2); // returns val2
 }

 public double getAverage() {
  return ((val1 + val2) / 2);
 }

 void decrDemo(Demo obj) {
  obj.setValues(obj.getValue1() - 1, obj.getValue2() - 1);
 }

}