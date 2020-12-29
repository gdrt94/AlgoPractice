package com.gdrt.arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        RotateImage rot = new RotateImage();
        int[][] M = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rot.print(M);
        System.out.println("------------");
        rot.rotate(M);
        rot.print(M);
    }

    private void print (int[][] M) {
        for (int[] r : M) {
            for (int c : r)
                System.out.print(c + " ");
            System.out.println();
        }
        System.out.println();
    }
}
