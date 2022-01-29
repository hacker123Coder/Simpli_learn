package assisted_Project;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Iterator;
public class FindingString{
   public static void main(String[] args){
	   System.out.println("enter a string :");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
      ArrayList <String> list = new ArrayList<String>();
      //Instantiating an ArrayList object
      list.add("JavaFX");
      list.add("Java");
      list.add("WebGL");
      list.add("OpenCV");
      list.add("OpenNLP");
      list.add("JOGL");
      list.add("Hadoop");
      list.add("HBase");
      list.add("Java Script");
      list.add("Flume");
      list.add("Mahout");
      list.add("Impala");
      System.out.println("Contents of the array list: ");
      for (String element : list){
         if (element.contains(st)){
               System.out.println(element);
         }
      }
   scan.close();
   }
  
}






