package hackerrank;

public class FizzBuzz {

    public static void main(String[] args) {
        new FizzBuzz().play();
    }

    private void play() {
        for (int i = 1; i <= 100; i ++) {
            if (i % 15 == 0) {
                System.out.println("hackerrank.FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
