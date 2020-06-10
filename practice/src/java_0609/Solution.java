package java_0609;

public class Solution {
    public static boolean Find(int target, int [][] array) {
        int i=0,j=0;
        while (0<=i&&0<=j&&i<array.length&&j<array[0].length){
            if (target>array[i][j]){
                if(j==array[0].length-1){
                    i++;
                    continue;
                }
                j++;
            }else if (target<array[i][j]){
                if(i==array.length-1){
                    j++;
                    continue;
                }
                j--;
                i++;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean i =Find(7,arr);
        System.out.println(i);
    }
}
