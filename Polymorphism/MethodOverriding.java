class demo {
    public void show() {
        System.out.println("this is base class method");
    }
}

class demo2 extends demo {
    public void show() {
        System.out.println("this is the derived class method");
    }
}

class superdemo1 {
    public static void main(String args[]) {
        demo2 d = new demo2();
        d.show();
    }
}