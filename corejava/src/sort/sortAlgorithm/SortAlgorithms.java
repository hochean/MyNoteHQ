package sort.sortAlgorithm;

/**
 * 各种排序算法汇总
 *
 * @author HaoQ
 */
public class SortAlgorithms {

    /**
     * 冒泡排序
     * 两个数比大小，较大数下沉，较小数冒起来。
     * 时间复杂度O(n^2)
     *
     * @param arr 待排序数组
     */
    private static void bubbleSort(int[] arr) {

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {//循环比较length-1轮
            for (int j = arr.length - 1; j > i; j--) {

                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；第二次遍历n-2个数，找到最小的数值与第二个元素交换；
     * 。。。
     * 第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成。
     * 时间复杂度O(n^2)
     *
     * @param arr 待排序数组
     */
    private static void selectSort(int[] arr) {

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    /**
     * 插入排序
     * 在要排序的一组数中，假定前n-1个数已经排好序，现在将第n个数插到前面的有序数列中，使得这n个数也是排好顺序的。
     * 如此反复循环，直到全部排好顺序。
     * 时间复杂度O(n^2)
     *
     * @param arr 待排序数组
     */
    private static void insertSort(int[] arr) {

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    /**
     * 希尔排序
     * 在要排序的一组数中，根据某一增量分为若干子序列，并对子序列分别进行插入排序。然后逐渐将增量减小,并重复上述过程。
     * 直至增量为1,此时数据序列基本有序,最后进行插入排序。
     * 时间复杂度O(n^1.5)
     *
     * @param arr 待排序数组
     */
    private static void shellSort(int[] arr) {

        int temp;
        final int length = arr.length;
        int incre = length;
        while (true) {
            incre = incre / 2;
            for (int k = 0; k < incre; k++) {//根据增量分为若干子序列
                for (int i = k + incre; i < length; i += incre) {
                    for (int j = i; j > k; j -= incre) {
                        if (arr[j] < arr[j - incre]) {
                            temp = arr[j];
                            arr[j] = arr[j - incre];
                            arr[j - incre] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }

            if (incre == 1) {
                break;
            }
        }
    }

    /**
     * 快速排序（分而治之）
     * 先从数列中取出一个数作为key值；
     * 将比这个数小的数全部放在它的左边，大于或等于它的数全部放在它的右边；
     * 对左右两个小数列重复第二步，直至各区间只有1个数。
     * 时间复杂度O(N*logN)
     * <p>
     * 递归
     *
     * @param arr 待排序数组
     * @param l   第一个位置
     * @param r   第二个位置
     */
    private static void quickSort(int[] arr, int l, int r) {

        if (l > r) {
            return;
        }
        int i = l, j = r, key = arr[l];
        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }

            while (i < j && arr[j] < key) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = key;
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }


    public static void main(String[] args) {

        int[] arr = new int[]{42, 20, 17, 13, 28, 14, 23, 15};
        final long timeMillis1 = System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        System.out.println((System.currentTimeMillis() - timeMillis1) + "ms");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
