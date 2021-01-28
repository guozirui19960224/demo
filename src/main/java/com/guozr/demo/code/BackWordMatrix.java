package com.guozr.demo.code;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author:
 * @Email:
 * @Date: 2020/9/1
 * @Time: 20:22
 * @Version: 1.0
 * @Description: Description
 */

public class BackWordMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1 || (n % 2 != 0 && (i == (n + 1) / 2 || j == (n + 1) / 2))) {
                    System.out.print(0);
                } else if (j < n + 1 - i && j > (float) (n+1) / 2) {
                    System.out.print(1);
                } else if (j > i && j < (float) (n+1) / 2) {
                    System.out.print(2);
                } else if (j < i && i < (float) (n+1) / 2) {
                    System.out.print(3);
                } else if (i < n + 1 - j && i > (float) (n+1) / 2) {
                    System.out.print(4);
                } else if (i > n + 1 - j && j < (float) (n+1) / 2) {
                    System.out.print(5);
                } else if (i > j && j > (float) (n+1) / 2) {
                    System.out.print(6);
                } else if (i < j && i > (float) (n+1) / 2) {
                    System.out.print(7);
                } else if (i > n + 1 - j && i < (float) (n+1) / 2) {
                    System.out.print(8);
                }

                if (j == n) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }

    }

}