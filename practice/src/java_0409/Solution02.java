package java_0409;

public class Solution02 {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length == 0){
            return 0;
        }
        //visited有两个作用：1.判断是否访问过，2.存储当前格子的最长递增长度
        int[][] visited = new int[matrix.length][matrix[0].length];
        int max = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(visited[i][j] == 0){
                    //这里先做一次比较找出max，可以避免最后再去遍历一个visited数组
                    max = Math.max(max, dfs(i, j, matrix, visited));
                }
                max = Math.max(max, visited[i][j]);
            }
        }
        return max;
    }
    public int dfs(int i, int j, int[][] matrix, int[][] visited){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length){
            return 0;
        }
        if(visited[i][j] > 0){
            return visited[i][j];
        }
        int max = 0;
        //这里分别去判断4周是否比当前数小，然后去递归遍历
        if(i - 1 >= 0 && matrix[i-1][j] < matrix[i][j]){
            max = Math.max(max, dfs(i-1, j, matrix, visited));
        }
        if(i + 1 < matrix.length && matrix[i+1][j] < matrix[i][j]){
            max = Math.max(max, dfs(i+1, j, matrix, visited));
        }
        if(j - 1 >= 0 && matrix[i][j-1] < matrix[i][j]){
            max = Math.max(max, dfs(i, j-1, matrix, visited));
        }
        if(j + 1 < matrix[0].length && matrix[i][j+1] < matrix[i][j]){
            max = Math.max(max, dfs(i, j+1, matrix, visited));
        }

        visited[i][j] = max+1;
        return max+1;

    }
}
