public class student {

    int a;
    int b;  

    student() {
        a = 0;
        b = 0;
        System.out.println("Default constructor called. a=" + a + ", b=" + b);
    }
    student(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parameterized constructor called. a=" + a + ", b=" + b);
    }

    student(int a) {
        this.a = a;
        this.b = 0;
        System.out.println("Parameterized constructor called. a=" + a + ", b=" + b);
    }
          int add(int x, int y) {
        return x + y;
    }
          int add(int x, int y, int z) {
        return x + y + z;
    }
        double add(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        System.out.println("--- Constructors ---");

        student c1 = new student();         
        student c2 = new student(5, 10);     
        student c3 = new student(7);          

        System.out.println("\n--- Method Overloading ---");

        student c = new student(3, 4);

        System.out.println("add(3, 4) = " + c.add(3, 4));
        System.out.println("add(3, 4, 5) = " + c.add(3, 4, 5));
        System.out.println("add(2.5, 3.5) = " + c.add(2.5, 3.5));
    }
}





     
         
    

