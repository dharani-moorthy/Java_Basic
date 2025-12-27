public class Array3D {
    public static void main(String[] args) {
        int num[][][] = new int[2][3][4]; // 2 blocks, 3 rows, 4 columns

        // Example: fill with values
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                for (int k = 0; k < num[i][j].length; k++) {
                    num[i][j][k] = i + j + k; // just a sample formula
                }
            }
        }
        // Print values
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                for (int k = 0; k < num[i][j].length; k++) {
                    System.out.print(num[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("----");
        }
    }
}
/*
        int num[][][] = {
                { {1, 2, 3}, {4, 5, 6} },      // block 0
                { {7, 8, 9}, {10, 11, 12} } ;

 */