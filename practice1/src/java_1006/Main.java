package java_1006;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 6, 4, 8, 9, 7};
        int[] brr = LISi(arr);
        for (int i : brr) {
            System.out.print(i + " ");
        }
//        System.out.println();
//        int l = solution(arr);
//        System.out.println();
//        System.out.println(l);
    }

    public static int[] LIS(int[] arr) {
        int[] dp = new int[arr.length];
        int[] ends = new int[arr.length];
        ends[0] = arr[0];
        dp[0] = 1;
        int right = 0;
        int l = 0, r = 0, m = 0;
        for (int i = 1; i < arr.length; i++) {
            l = 0;
            r = right;
            while (l <= r) {
                m = (l + r) / 2;
                if (arr[i] > ends[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            right = Math.max(right, l);
            ends[l] = arr[i];
            dp[i] = l + 1;
        }
        int[] result = new int[Math.max(dp[dp.length - 1], dp[dp.length - 2])];
        for (int i = 0; i < result.length; i++) {
            result[i] = ends[i];
        }
        return result;
    }

    public static int[] LISi(int[] arr) {
        int n = arr.length;
        int[] end = new int[n + 1];
        int[] dp = new int[n];
        int len = 1;
        end[1] = arr[0];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            if (end[len] < arr[i]) {
                //当arr[i] > end[len] 时 arr[i]添加到 end后面
                end[++len] = arr[i];
                dp[i] = len;
            } else {
                // 当前元素小于end中的最后一个元素 利用二分法寻找第一个大于arr[i]的元素
                // end[l] 替换为当前元素 dp[]
                int l = 0;
                int r = len;
                while (l <= r) {
                    int mid = (l + r) >> 1;
                    if (end[mid] >= arr[i]) {
                        r = mid - 1;
                    } else l = mid + 1;
                }
                end[l] = arr[i];
                dp[i] = l;
            }
        }
        int[] res = new int[len];
        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == len) {
                res[--len] = arr[i];
            }
        }
        return res;
    }
}
