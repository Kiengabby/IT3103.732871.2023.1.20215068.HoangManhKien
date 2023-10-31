public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7},
                    {5, 5, 6},
                    {7, -1, -5}};
        System.out.println("First maxtrix:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Second maxtrix:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }

        int[][] maxtrixSum = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                maxtrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Added maxtrix:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(maxtrixSum[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
