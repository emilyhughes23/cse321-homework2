// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
   static public int add (int a, int b)
   {
      return a + b;
   }
   
   static public int subtract (int a, int b)
   {
      return a - b;
   }
   
   static public int multiply (int a, int b)
   {
      return a * b;
   }
   
   static public float divide (float a, float b)
   {
	   System.out.println(a/b);
      return a/b;
   }
 
}
