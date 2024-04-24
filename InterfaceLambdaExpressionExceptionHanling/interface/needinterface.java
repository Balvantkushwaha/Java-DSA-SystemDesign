interface Computer {
    void compilerCode();
}

class Desktop implements Computer {
    public void compilerCode() {
        System.out.println("you get 5 error, faster");
    }
}

class Laptop implements Computer {
    public void compilerCode() {
        System.out.println("you get 5 errors ");
    }
}

class Developer {

    public void BuildApp(Computer obj) {

        System.out.println("you get ready app  ");
        obj.compilerCode();

    }
}

public class needinterface {
    public static void main(String[] args) {
        // Laptop obj = new Laptop();
        Computer obj = new Laptop();
        Developer dev = new Developer();
        dev.BuildApp(obj);

    }
}