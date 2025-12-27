public class Loops {
        public static void main(String[] args) {

            // For loop: print numbers 1 to 5
            System.out.println("For loop:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("i = " + i);
            }

            // While loop: print numbers 1 to 5
            System.out.println("\nWhile loop:");
            int j = 1;
            while (j <= 5) {
                System.out.println("j = " + j);
                j++;
            }

            // Do-While loop: print numbers 1 to 5
            System.out.println("\nDo-While loop:");
            int k = 1;
            do {
                System.out.println("k = " + k);
                k++;
            } while (k <= 5);
        }
    }

