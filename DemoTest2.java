public class DemoTest2 {

 public static void main(String[] args) {
  Demo obj1 = new Demo(); // object 1 declared

  obj1.setValues(5, 7);
  System.out.println("\nObject #1");
  System.out.println(obj1.getValue1() + " " + obj1.getValue2());
  obj1.decrDemo(obj1);
  System.out.println("\nObject #1 after decrDemo()");
  System.out.println(obj1.getValue1() + " " + obj1.getValue2());

 }

}