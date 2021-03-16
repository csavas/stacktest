//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn savas

import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
 private Stack<String> stack;

 public StackTest()
 {
  setStack("");
 }

 public StackTest(String line)
 {
   setStack(line);
 }
 
 public void setStack(String line)
 {
   stack = new Stack<String>();
   String[] list = line.split(" ");
   for(String s : list)
     stack.push(s);
 }

 public void popEmAll()
 {
   String output ="";
   while(!stack.isEmpty()){
     output += stack.pop() + " ";
   }
   out.print(output);
 }

 public String toString() {
   return stack.toString();
 }
}