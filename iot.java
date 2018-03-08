import java.util.*;
import java.lang.System;
import java.io.*;
public class iot{
public static void main(String[] args) throws Exception
{

  Scanner input = new Scanner(System.in); //scanner inputi jaoks

//Nimi

  System.out.print("Sisesta oma nimi: ");
  String name = input.nextLine();
  while(!name.matches("[a-zA-Z, ]+")) //error handle
  {
    System.out.print("Sisesta nimi uuesti: ");
    name = input.nextLine();
    System.out.println();
  }
  PrintWriter out = new PrintWriter("OP_proov.txt"); //teen outputfaili ja lisan outputi
  out.print("Nimi on: "+name);

//number

  int  min_num = 6;
  Scanner input_1 = new Scanner(System.in);
  System.out.print("Sisesta oma number: ");
  String number = input_1.nextLine();
  // Added format
  while((!number.matches("[0-9]+")) || !(number.length() >= min_num) || !(number.length() <=  8 )) //error handle
  {
    if (number.matches("^[0-9]+")|| !(number.length() <= 8)) {
      System.out.println("\nNumber peab olema võrdne või pikem"+min_num);
      System.out.println("Praegune number oli"+number.length()+" kohta.");
    } else {
      System.out.println("Number peab koosnema numbridest.");
    }
    System.out.println("Kirjuta number uuesti: ");
    number = input_1.nextLine();
    }
    out.print("\nNumber on: "+number);

    out.close(); //sulgen writeri
}
}
