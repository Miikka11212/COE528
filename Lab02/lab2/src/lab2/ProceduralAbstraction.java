/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Oscar Wang
 */




public class ProceduralAbstraction {

    public static int reverseFactorial(int x){
        if (x <= 0){
            return 1;
        }
        
        int n = 1;
        double fac = 1;
        
        while (fac < x) {
            n++;
            fac *= n;
        }
        
        return n;
    }
    
    
    public static boolean isMatrixNice(int[][] arr){
        int n = arr.length;
        boolean isSquare = true;

        // check every row and see if the row length equals to array length
        for (int[] row : arr) {
            if (row.length != n) {
                System.out.println("The matrix is not square.");
                return false;
            }
        }

        int rowSum = 0;

        // finding the sum of only first row, as compare with every other row
        for (int j = 0; j < arr[0].length; j++) {
            rowSum += arr[0][j];
        }

        boolean isNice = true;

        // check every other row with rowSum
        for (int i = 1; i < n; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                currentRowSum += arr[i][j];
            }
            // if they dont equal break loop
            if (currentRowSum != rowSum) {
                isNice = false;
                break;
            }
        }

        // output and return not nice
        if (!isNice) {
            System.out.println("The matrix is not Nice.");
            return false;
        }

        // check column sums
        for (int j = 0; j < n; j++) { // Each column
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += arr[i][j];
            }
            if (colSum != rowSum) {
                isNice = false;
                break;
            }
        }

        // Check main diagonal
        int mainDiagSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagSum += arr[i][i];
        }
        if (mainDiagSum != rowSum) {
            isNice = false;
        }

        // Check secondary diagonal
        int secondaryDiagSum = 0;
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            secondaryDiagSum += arr[i][j];
        }
        if (secondaryDiagSum != rowSum) {
            isNice = false;
        }

        // Output the sum and return result
        if (isNice) {
            System.out.println("The matrix is Nice with a common sum of: " + rowSum);
            return true;
        } else {
            System.out.println("The matrix is not Nice.");
            return false;
        }
    
    }
    
    
    public static void main(String[] args){
        int x = reverseFactorial(5000);
        System.out.println(x);
        
        int[][] nice = {{2, 7, 6},
                        {9, 5, 1},
                        {4, 3, 8}};
        
        isMatrixNice(nice);
        
        int[][] notnice = {{1, 2, 3},
                            {1, 2, 3},
                            {12, 12, 12}};
        
        isMatrixNice(notnice);
        }
    
}



