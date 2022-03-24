import java.util.*;
public class Max_Min_matrix 
{
    public static void main(String[] args) 
    {
        int rows; 
        int columns;
        Scanner scanner = new Scanner (System.in);
        // 
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt(); 
        
        System.out.println("Enter number of columns: "); 
        columns = scanner.nextInt(); 
        
        int[][] matrix = new int [rows][columns];
        
        System.out.println("Enter matrix numbers: "); 
        for (int i = 0; i < rows; i++) 
        {
            System.out.println("Enter numbers for row - " + (i+1) + " and press enter"); 
            for (int j = 0; j < columns; j++) 
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        // Displaying entered matrix
        System.out.println("Matrix as entered");
        for (int i = 0; i < matrix .length; i++) 
        {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    findMinMax(matrix);
 }
 
 // Method to find max and min
 private static void findMinMax(int[][] matrix)
 {
    //  start by assigning the first matrix element
    // to both the variables
    int maxNum = matrix[0][0];
    int minNum = matrix[0][0];
    for (int i = 0; i < matrix.length; i++) 
    {
        for (int j = 0; j < matrix[i].length; j++) 
        {
            if(maxNum < matrix[i][j])
            {
                maxNum = matrix[i][j];
            }
            else if(minNum > matrix[i][j])
            {
                minNum = matrix[i][j];
            }
        }
    }
    System.out.println("Largest number: "+ maxNum + " Smallest number: " + minNum);
 }
}