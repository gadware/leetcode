package twopointers;

import gadware.GadwareUtil;

import java.util.HashMap;
import java.util.Map;

public class SortColors {


    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void sortColors(int[] nums)  {
        quickSort(nums, 0, nums.length-1);
    }

    public static void main (String[] args) {


        int[] temp = { 0,2,1,2,2,2,1,1,1,0,0 };

        twopointers.SortColors.sortColors(temp);

        GadwareUtil.printArrayInt(temp);

    }

}

