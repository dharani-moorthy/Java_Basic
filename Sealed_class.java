package Dharani;

// Sealed class g can only be extended by i and n
sealed class g permits i, n {
    public void display() {
        System.out.println("This is class g");
    }
}

// Subclass i must declare itself as final, sealed, or non-sealed
final class i extends g {
    @Override
    public void display() {
        System.out.println("This is class i");
    }
}

// Subclass n must also declare itself as final, sealed, or non-sealed
non-sealed class n extends g {
    @Override
    public void display() {
        System.out.println("This is class n");
    }
}

// Class o is independent and cannot extend g
class o {
    public void show() {
        System.out.println("This is class o");
    }
}

public class Sealed_class {
    public static void main(String[] args) {
        g obj1 = new i();   // Allowed
        g obj2 = new n();   // Allowed
        o obj3 = new o();   // Independent

        obj1.display();
        obj2.display();
        obj3.show();
    }
}