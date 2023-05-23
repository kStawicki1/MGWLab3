
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,1,2137,9,6};
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
