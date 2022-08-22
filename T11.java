package 已完成;

import java.util.Scanner;


/**
x 的平方根 
给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
示例 1：
输入：x = 4
输出：2
示例 2：
输入：x = 8
输出：2
解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 * @author tedu
 */
public class T11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        /**
          方法一
          int a= (int)Math.sqrt(x);
        System.out.println("该数的平方根为："+a);
         */
        /**
        方法二：穷举法
         int b=0;
         for(int i=0;i!=-1;){
         if(b*b>=x){
         i=-1;
         }else {
         b++;
         }
         }
         */
/**
 * 方法三:二分法
 */
        int low=0;
        int high=x;
        int b=0;
        while (b==0){
            int mid=(low+high)/2;
            if (mid*mid>x){
                high = mid-1;
            }else if(mid*mid<x){
                low=mid+1;
            }else {
                b=mid;
            }
        }            
        System.out.println("该数的平方根为："+b);

    }
}
