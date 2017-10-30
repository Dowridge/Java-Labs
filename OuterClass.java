class OuterClass 
{
 public void outerMethod() 
 {
  System.out.println("outer class");
  NestedClass obj = new NestedClass();
  obj.innerMethod1(); // call the method innerMethod1
 }

 static class NestedClass 
 {

   public void innerMethod1() 
   {
      System.out.println("nested class 1");
   }
  
   public void innerMethod2() 
   {
      System.out.println("nested class 2");
      OuterClass obj = new OuterClass();
      obj.outerMethod(); // call the method outerMethod
   }
 }
}