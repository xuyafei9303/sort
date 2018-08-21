package com.ixyf.sort;

/**
 * 插入排序
 *
 * 直接插入排序基本思想是每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
 *
 * 插入排序还分为直接插入排序、二分插入排序、链表插入排序、希尔排序等等，这里我们只是以直接插入排序讲解，后面讲高级排序的时候会将其他的。
 */
public class InsertSort {

    public static int[] sort(int[] array) {
        int j;
        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            j = i;

            while (j > 0 && temp < array[j-1]) {// 从已经排序的序列最右边的开始比较，找到比其小的数
                array[j] = array[j-1];// 向后挪动
                j--;
            }
            array[j] = temp;// 存在比其小的数，插入
        }
        return array;
    }

    // 遍历显示数组
    public static void displsy(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {4,2,8,9,5,7,6,1,3};

        // 未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        displsy(array);
        System.out.println("----------------------");
        array = sort(array);
        System.out.println("----------------------");
        System.out.println("经过插入排序后的数组顺序为：");
        displsy(array);
    }

}
