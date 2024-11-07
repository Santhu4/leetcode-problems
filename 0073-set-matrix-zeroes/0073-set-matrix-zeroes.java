class Solution {
    public void _z(int l,int r,int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            matrix[i][r] = 0;
       }
       for(int j = 0;j<matrix[0].length;j++){
        matrix[l][j] = 0;
       }
    }
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();
         ArrayList<Integer> cols = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
       for(int i = 0;i<matrix.length;i++){
        for(int j = 0;j<matrix[0].length;j++){
            if(matrix[i][j] == 0){
                rows.add(i);
                cols.add(j);
            }
        }
       }
      // System.out.println(rows+" "+cols);
        for(int i = 0;i<rows.size();i++){
            _z(rows.get(i),cols.get(i),matrix);
        }
  
    }
}