package Class25;

public class SmarthMachine {
    public void smart() {
        System.out.println("I am a smart machine");
    }
}
class Cmputer extends SmarthMachine {
    String bramd;
    Cmputer(String bramd) {
        this.bramd = bramd;//
    }

    public void run() {
        System.out.println(bramd + " can run");
    }

    public void transfer() {
        System.out.println(bramd + " can transfer data");
    }

    public void storage() {
        System.out.println(bramd + " can store data");
    }
}

class HP extends Cmputer {
    HP(String bramd) {//constructer
        super(bramd);
    }

    @Override
    public void run() {
        System.out.println("Can be unlocked fingerprint");
    }

    @Override
    public void storage() {
        System.out.println("Saves the data in different way");
    }

    @Override
    public void transfer() {
        super.transfer();
    }
}
class Lenovo extends Cmputer {
    Lenovo(String bramd) {
        super(bramd);
    }

    void tabletMode() {
        System.out.println(bramd + "Can also be used as tablet");
    }
}
class Apple extends Cmputer {
    Apple(String bramd) {
        super(bramd);
    }

    public void secore() {
        System.out.println(bramd + " can be secure");
    }
}

