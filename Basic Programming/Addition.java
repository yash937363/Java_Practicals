class Addition{
    public static void main(String[] args){
        int a,b,c;
        System.out.println("Enter Two Numbers");
        a = Integer.parseInt(System.console().readLine());
        b = Integer.parseInt(System.console().readLine());
        c = a+b;
        System.out.println("Addition : "+c);
    }
}