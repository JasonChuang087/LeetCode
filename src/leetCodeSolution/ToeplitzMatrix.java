package leetCodeSolution;

public class ToeplitzMatrix {

        public static void main(String[] args) {
                int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,8,2}};
                isToeplitzMatrix(matrix);
        }
        
        public static boolean isToeplitzMatrix(int[][] matrix) {
                for(int i=0;i<matrix.length;i++) {
                        for(int j=0;j<matrix[0].length;j++) {
                                System.out.println(matrix[i][j]);
                                if(i+1<matrix.length &&j+1<matrix[0].length&&matrix[i+1][j+1]!=matrix[i][j]) {
                                        System.out.println("side "+matrix[i+1][j+1]);
                                        return false;
                                }
                        }
                }
                return true;
        }

}
