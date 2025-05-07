package Chapter3_OOPConcepts;

class Main {

    double add(int ... a) {
        return 1;

    }

    double add(boolean ... b) {
        return 0;
    }
}

public class AmbigiousInvocation {

    public static void main(String[] args) {

      Main h1=new Main();
      h1.add(2,4);
      h1.add(true,false);
    }
}
