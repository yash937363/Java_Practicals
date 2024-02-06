import java.util.Scanner;

class AdditionUsingScanner{
    public static void main(String[] args){
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("Addition : "+c);
    }
}