//Write a Program to Add two and three number using Method Overloading.

import java.util.Scanner;

class Add{
  int d;
  public void add(int a, int b){
    d = a + b;
    System.out.println("Addition : "+d);
  }
  public void add(int a, int b, int c){
    d = a + b + c;
    System.out.println("Addition : "+d);
  }
}

class MethodOverloading{
  public static void main(String args[]){
    Add ad = new Add();
    Scanner s = new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter two Numbers : ");
    a = s.nextInt();
    b = s.nextInt();
    ad.add(a,b);
    System.out.println("Enter three Numbers : ");
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    ad.add(a,b,c);
  }
}