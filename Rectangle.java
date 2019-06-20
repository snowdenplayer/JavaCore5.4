public class Rectangle {
    private int a,b,c;


    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    Rectangle(int a, int b, int c){
        this(a, b);
        this.c = c;
    }

    public void show(){
        System.out.println("a " + a);
        System.out.println("b "+b);
        System.out.println("c "+c);
    }
}
