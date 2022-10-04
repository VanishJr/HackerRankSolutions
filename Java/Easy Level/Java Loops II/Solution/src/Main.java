import java.util.Scanner;

class Main{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int numBefore = a;
            for (int j = 0; j < n; j++) {
                System.out.print( ((int)Math.pow(2,j)*b + numBefore) + " ");
                numBefore += (int) Math.pow(2,j)*b;
            }
            System.out.println();
        }
        in.close();
    }
}
