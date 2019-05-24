package io.prep.othertopics;

/**
 * Sparse matrix : most of the elements are zero and only few non-zero items.
 * 
 * Two ways to implement to Array, which is represented below in 2D array as,
 * compactArray[0][counter] = rowIndex
 * companyArray[1][counter] = columnIndex
 * compactArray[2][counter] = value
 * 
 * Other approach is linked list, such that
 * each cell is represented as Node with,
 * class Node {
 *   int rowIndex
 *   int columnIndex
 *   int value
 *   Node nextReference
 * }
 */
public class SparseMatrixRepresentation {

    public static void main(String[] args) {
        int[][] sparseArray = {{0, 0, 1, 2, 0},
                               {1, 4, 0, 23,0},
                               {0, 0, 0, 0, 6},
                               {0, 0, 0, 0, 3},
                               {9, 0, 0, 0, 0}};
        
        int nonZeroSize = findNonZeroValues(sparseArray);
        
        int[][] compactArray = new int [3][nonZeroSize];
        
        fillSparseArrayToCompactArray(sparseArray, compactArray);
        
        printCompactArray(compactArray);
        
    }

    private static void printCompactArray(int[][] compactArray) {
            
        for(int j = 0; j < compactArray[0].length; j++) {
            System.out.println(compactArray[0][j] + " " + compactArray[1][j] + " " + compactArray[2][j]);
        }
        
        
    }

    private static void fillSparseArrayToCompactArray(int[][] sparseArray, int[][] compactArray) {
        
        int counter= 0;
        for(int i = 0; i< sparseArray.length; i++) {
            for(int j = 0; j<sparseArray[0].length; j++) {
                if(sparseArray[i][j] != 0) {
                    compactArray[0][counter] = i;
                    compactArray[1][counter] = j;
                    compactArray[2][counter] = sparseArray[i][j];
                    counter++;
                }
            }
        }
        
    }

    private static int findNonZeroValues(int[][] sparseArray) {
        int size = 0;
        for(int i =0; i< sparseArray.length; i++) {
            for(int j =0; j < sparseArray[0].length; j++) {
                if(sparseArray[i][j] != 0) size++;
            }
        }
        return size;
    }

}
