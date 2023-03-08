package homeWork01;

public class task02 {
    public static void main(String[] args) {
        int count = 0;
        int k = 0;
        for(int i = 4; i<=1000; i++) {
            count = 0;
            for (int j = 2; j <= i-1; j++) {
                if (i % j == 0) {
                    count++;
                    if (count == 1) break;
                }
            }
            if (count == 0) {
                System.out.printf("   %d",i); 
                k++;
                if (k==14) {
                    System.out.println();
                    k = 0;
                }
            }
        }
    }
}
