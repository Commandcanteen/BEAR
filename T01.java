package 已完成;
import java.util.Random;
import java.util.Arrays;

/**
 * . 数组中的第K个最大元素	
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 示例 1:
 * 输入: [3,2,1,5,6,4], k = 2
 * 输出: 5
 * 示例 2:
 * 输入: [3,2,3,1,2,4,5,5,6], k = 4
 * 输出: 4
 * 提示：
 * 1 <= k <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * @author tedu
 */
public class T01 {
    public static void main(String[] args) {
        /*
        //用于输入
         */
        Random rand= new Random(); 
        int[] a=new int[]{3,2,1,5,6,4};
        int k =2;
        /*
        //排序，从小到大
         */
        Arrays.sort(a); 
        System.out.println(a[a.length-k]);
           
        }
    }

