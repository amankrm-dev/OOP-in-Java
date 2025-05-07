package Chapter3_OOPConcepts;

class Compare {

    int x, y;

    Compare(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display(Compare temp) {

        System.out.println("C1 x:" + this.x);
        System.out.println("C2 x:" + temp.x);
        System.out.println("C1 x:" + this.y);
        System.out.println("C2 x:" + temp.y);
        if (this.x == temp.x && this.y == temp.y) {
            System.out.println("They are Equal");
        } else {
            System.out.println("They are not Equal");
        }

    }

}

public class CompareMain {

    public static void main(String[] args) {
        Compare m = new Compare(5, 4);
        Compare n = new Compare(5, 4);
        m.display(n);
    }
}
