public class Main {
    public static void main(String[] args){
                int[][] A = {
                        {0, -10, 7},
                        {1000, 76, 4}
                };

                int[][] B = {
                        {7, 64},
                        {32, 10},
                        {-134, 12}
                };

                if (A[0].length != B.length) {
                    System.out.println("Ошибка: количество столбцов A должно быть равно количеству строк B.");
                    return;
                }

                int[][] C = new int[A.length][B[0].length];

                for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < B[0].length; j++) {
                        for (int k = 0; k < A[0].length; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }

                System.out.println("Результат умножения матриц:");
                for (int i = 0; i < C.length; i++) {
                    for (int j = 0; j < C[0].length; j++) {
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }