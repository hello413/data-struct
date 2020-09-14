package java_0911;

import java.util.Arrays;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int shu[] = new int[4];
        for (int i = 0; i < 4; i++) {
            shu[i] = scn.nextInt();
        }
        // int shu[] = { 5, 9, 9, 4 };
        char op[] = {'+', '-', '*', '/'};
        A:
        for (int i = 0; i < 4; i++) {
            for (int n1 = 0; n1 < op.length; n1++) {
                for (int j = 0; j < 4; j++) {
                    for (int n2 = 0; n2 < op.length; n2++) {
                        for (int k = 0; k < 4; k++) {
                            for (int n3 = 0; n3 < op.length; n3++) {
                                for (int m = 0; m < 4; m++) {
                                    // 选的这4个数不能重复
                                    if (isAllTheOrgiNum(shu[i], shu[j], shu[k], shu[m], shu)) {
                                        double temp = 0;
                                        switch (op[n1]) {
                                            case '+':
                                                temp = shu[i] + shu[j];
                                                break;
                                            case '-':
                                                temp = shu[i] - shu[j];
                                                break;
                                            case '*':
                                                temp = shu[i] * shu[j];
                                                break;
                                            case '/':
                                                temp = (double) shu[i] / shu[j];
                                                break;
                                        }
                                        switch (op[n2]) {
                                            case '+':
                                                temp = temp + shu[k];
                                                break;
                                            case '-':
                                                temp = temp - shu[k];
                                                break;
                                            case '*':
                                                temp = temp * shu[k];
                                                break;
                                            case '/':
                                                temp = (double) temp / shu[k];
                                                break;
                                        }
                                        switch (op[n3]) {
                                            case '+':
                                                temp = temp + shu[m];
                                                break;
                                            case '-':
                                                temp = temp - shu[m];
                                                break;
                                            case '*':
                                                temp = temp * shu[m];
                                                break;
                                            case '/':
                                                temp = (double) temp / shu[m];
                                                break;
                                        }

                                        if (temp == 24) {
                                            System.out.println("(" + "(" + shu[i] + " " + op[n1] + " " + shu[j] + ")"
                                                    + " " + op[n2] + " " + shu[k] + ")" + " " + op[n3] + " " + shu[m]);
                                            break A;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean isAllTheOrgiNum(int i, int j, int k, int l, int[] shu) {
        int[] a = {i, j, k, l};
        Arrays.sort(a);
        Arrays.sort(shu);
        if (a[0] == shu[0] && a[1] == shu[1] && a[2] == shu[2] && a[3] == shu[3]) {
            return true;
        }
        return false;
    }
}
