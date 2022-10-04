import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (n % 2 == 1){
            System.out.println("Weird");
        }
// If  is even and in the inclusive range of 2 to 5, print Not Weird
        if ( n % 2 == 0 && (n >= 2 && n <=5)){
            System.out.println("Not Weird");
        }
// If  is even and in the inclusive range of 6 to 20, print Weird
        if ( n % 2 == 0 &&  (n >= 6 && n <= 20 )){
            System.out.println("Weird");
        }
// If  is even and greater than 20, print Not Weird
        if ( n % 2 == 0 &&  n > 20 ){
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}