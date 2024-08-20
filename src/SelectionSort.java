public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[] {5,6,4,5,6,7};
        SelectionSort.sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length;i++) {
            int min = i;

            for (int j = i + 1; j < array.length;j++) {
                if (array[i] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;


        }
    }
}
