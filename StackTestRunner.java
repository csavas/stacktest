//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn sAvas

import static java.lang.System.*;

public class StackTestRunner
{
 public static void main ( String[] args )
 {
  //add test cases  
   StackTest s = new StackTest();
   s.setStack("a b c d e f g h i");
   out.println(s);
   out.println("popping all items from the stack");
   s.popEmAll();
   out.println("\n");
   /*****************************/
   s.setStack("1 2 3 4 5 6 7 8 9 10");
   out.println(s);
   out.println("popping all items from the stack");
   s.popEmAll();
   out.println("\n");
   /*******************************/
    s.setStack("# $ % ^ * ( ) ) _");
   out.println(s);
   out.println("popping all items from the stack");
   s.popEmAll();
   out.println("\n");
 }
 }
