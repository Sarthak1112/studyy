import java.util.*;

// Spiral pattern
// public class hwarrays{
//     public static void main(String[] args){
//         // int[][] numbers = new int[3][5];
//         Scanner sc =  new Scanner(System.in);
//         int rows =  sc.nextInt();
//         int columns= sc.nextInt();
//         int [][] matrix = new int[rows][columns];

//         for(int i =0; i<rows; i++){
//             for(int j = 0; j<columns; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }


//         for(int i=0; i<rows; i++){
//             if(i%2==0){
//                 for(int j = 0; j<columns; j++){
//                     System.out.print(matrix[i][j]+" ");
//                 }
//             }
//             else{
//                 for(int j=columns-1; j>=0; j--){
//                     System.out.print(matrix[i][j]+" ");
//                 }
//             }
            
//         }
        

//     }    
// }

// Print transpose of a matrix
public class hwarrays{
    public static void main(String[] args){
        // int[][] numbers = new int[3][5];
        Scanner sc =  new Scanner(System.in);
        int rows =  sc.nextInt();
        int columns= sc.nextInt();
        int [][] matrix = new int[rows][columns];

        for(int i =0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }


       for(int i =0; i<columns;i++){
            for(int j=0; j<rows;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
       }

    }    
}