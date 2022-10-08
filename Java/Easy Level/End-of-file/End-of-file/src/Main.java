import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        int lineNum = 1;
        while (sc.hasNext()) {
            line = sc.nextLine();
            System.out.print(lineNum++ + " ");
            System.out.println(line);
        }
    }
}