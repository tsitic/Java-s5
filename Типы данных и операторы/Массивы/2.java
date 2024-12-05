import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(array1));//[1, 3, 5, 7, 9]

        int index = Arrays.binarySearch(array1, 5);
        System.out.println(index);//2 индекс элемента 5

        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 3};
        System.out.println(Arrays.equals(array2, array3));// true т.к. равны

        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {1, 2, 3, 2, 2};
        System.out.println(Arrays.compare(array4, array5)); //1 т.к. первый массив "длинее" (иначе бы -1 в случае равенства 0)

        int[] arraySort = {5, 3, 1, 4, 2};
        Arrays.sort(arraySort);
        System.out.println(Arrays.toString(arraySort));// [1,2,3,4,5]
    }
}
