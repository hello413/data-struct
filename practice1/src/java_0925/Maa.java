package java_0925;

public class Maa {
    public static void main(String[] args) {
        Interval b = solve(3,1,"ABC","DBD");
        System.out.println(b.start+" "+b.end);
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int limit = (n-1)/2;
        for(int i=0;i<= limit; i++){
            for(int j=i;j<n-1-i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }
    static class Interval{
        int start = 0;
        int end = 0;
    }

    public static Interval solve(int n, int k, String str1, String str2){
        Interval node = new Interval();
        if (str1.equals(str2)) {
            node.start = k;
            node.end = k;
            return node;
        }

        int  min = 0, max = 0;
        for (int i = 0;i<n;i++){
            if (str1.charAt(i)!=str2.charAt(i))
                max++;
            else
                min++;
        }
        node.start = min;
        node.end = max-k;
        return node;
    }
}
