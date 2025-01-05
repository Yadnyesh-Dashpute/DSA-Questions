// https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralMatrix = new ArrayList<>();

        int startRow = 0 ;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){

            // Top

            for(int j = startCol; j <= endCol; j++){
                spiralMatrix.add(matrix[startRow][j]);
            }

            //right

            for(int i= startRow+1; i <= endRow; i++){
                spiralMatrix.add(matrix[i][endCol]);

            }

            //bottom

            for(int j=endCol-1; j>= startCol; j--){
                if(startRow == endRow){
                        break;
                                }
                
              spiralMatrix.add(matrix[endRow][j]);
            }

            //left

            for(int i=endRow-1; i>= startRow+1; i--){
               if(startCol == endCol){
                    break;
                }
                spiralMatrix.add(matrix[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        } 
        return spiralMatrix;
    }
}
