import java.util.ArrayList;

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = {{5, 5, 0},{4, 4, 6},{4, 8, 0}};

        System.out.println(sumOfEvenNumbers(matrix));
        System.out.println(rowsWithZero(matrix));
    }

    public static int sumOfEvenNumbers(int[][] matrix){
        int result = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]%2==0){
                    result+=matrix[i][j];
                }
            }
        }
        return result;
    }

    public static ArrayList<Integer> rowsWithZero(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==0){
                    if(result.contains(i)!=true){
                        result.add(i);
                    }
                }
            }
        }
        return result;
    }
}
