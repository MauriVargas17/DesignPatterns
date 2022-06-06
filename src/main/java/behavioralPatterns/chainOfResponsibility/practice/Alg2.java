package behavioralPatterns.chainOfResponsibility.practice;

public class Alg2 implements IHandler{

    IHandler next;
    private int[] arr;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int[] array) {
        arr = array;
        if (arr.length <= 50){
            System.out.println("Sorted using Merge Sort");
            sort(0, arr.length - 1);
            printArray();
        } else {
            next.criteriaHandler(arr);
        }
    }

    private void printArray() {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private int[] merge(int l, int m, int r){

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        return arr;
    }

    private void sort(int l, int r)
    {
        if (l < r) {

            int m = l+ (r-l)/2;

            sort(l, m);
            sort(m + 1, r);

            merge(l, m, r);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
