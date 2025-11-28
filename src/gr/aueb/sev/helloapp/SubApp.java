package gr.aueb.sev.helloapp;

public class SubApp {

    public static void main(String[] args) {
        int result = 0;
        result = sub(12,4);

        System.out.println(sub(10,5));
        System.out.printf("Sub: %d", result);
    }

    public static int sub (int a, int b) {
        return a - b;
    }
}
