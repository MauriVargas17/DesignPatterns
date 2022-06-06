package behavioralPatterns.chainOfResponsibility.practice;

public class Alg3 implements IHandler{
    IHandler next;
    private int[] arr;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int[] array) {
        arr = array;
        System.out.println("Sorted using Quick Sort");
        quickSort(arr, 0, arr.length - 1);
        printArray();
    }

    private int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private void printArray() {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    @Override
    public IHandler next() {
        return next;
    }
}
