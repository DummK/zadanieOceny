abstract class Marks {
    abstract void getPercentage();
}

class A extends Marks {
    private int mark1;
    private int mark2;
    private int mark3;

    public A(int mark1, int mark2, int mark3) {
        if(mark1 < 0 || mark1 > 100) {
            throw new IllegalArgumentException("mark1 out of range");
        }
        else {
            this.mark1 = mark1;
        }

        if(mark2 < 0 || mark2 > 100) {
            throw new IllegalArgumentException("mark2 out of range");
        }
        else {
            this.mark2 = mark2;
        }

        if(mark3 < 0 || mark3 > 100) {
            throw new IllegalArgumentException("mark3 out of range");
        }
        else {
            this.mark3 = mark3;
        }
    }

    public void getPercentage() {
        double percentage = mark1 + mark2 + mark3;
        percentage = percentage / 300.0;
        percentage = percentage * 100;
        System.out.println(percentage + "%");
    }

}

class B extends Marks {
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;

    public B(int mark1, int mark2, int mark3, int mark4) {
        if(mark1 < 0 || mark1 > 100) {
            throw new IllegalArgumentException("mark1 out of range");
        }
        else {
            this.mark1 = mark1;
        }

        if(mark2 < 0 || mark2 > 100) {
            throw new IllegalArgumentException("mark2 out of range");
        }
        else {
            this.mark2 = mark2;
        }

        if(mark3 < 0 || mark3 > 100) {
            throw new IllegalArgumentException("mark3 out of range");
        }
        else {
            this.mark3 = mark3;
        }

        if(mark4 < 0 || mark4 > 100) {
            throw new IllegalArgumentException("mark4 out of range");
        }
        else {
            this.mark4 = mark4;
        }
    }

        public void getPercentage() {
            double percentage = mark1 + mark2 + mark3 + mark4;
            percentage = percentage / 400.0;
            percentage = percentage * 100;
            System.out.println(percentage + "%");
        }
}



public class Main {
    public static void main(String[] args) {
        A a = new A(10, 5, 5);
        a.getPercentage();

        B b = new B(100, 90, 85, 98);
        b.getPercentage();
    }
}