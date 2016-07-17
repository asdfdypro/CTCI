package asdf.ctci.c1.t6;


import java.util.Arrays;

/**
 * 字符矩阵旋转
 * Created by Asdf on 2016/7/15.
 */
public class Main {

    private void rotate(char[][] matrix, int n) {
        for (int i = 0; i < n / 2 + n % 2; i++)
            rotate(matrix, i, n);
    }


    private void rotate(char[][] matrix, int i, int n) {
        char t;
        n--;
        for (int k = i; k < n - i; k++) {
            t = matrix[i][k];
            matrix[i][k] = matrix[n - k][i];
            matrix[n - k][i] = matrix[n - i][n - k];
            matrix[n - i][n - k] = matrix[k][n - i];
            matrix[k][n - i] = t;
        }

    }

    public static void main(String[] args) {
        Main main = new Main();

//        String input="qwer\tasdf\tzxcv\ttyui\t";
        String input = "qwer1\tasdf2\tzxcv3\ttyui4\tghjk5\t";
        String[] inputs = input.split("\t");
        int n = inputs[0].length();
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = inputs[i].toCharArray();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        main.rotate(matrix, n);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
