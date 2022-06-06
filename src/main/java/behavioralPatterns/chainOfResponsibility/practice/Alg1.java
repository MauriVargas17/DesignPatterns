package behavioralPatterns.chainOfResponsibility.practice;

public class Alg1 implements IHandler{

    IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int[] arr) {
        if (arr.length <= 20){
            System.out.println("Sorted using Bubble Sort");
            int n = arr.length;
            int temp;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i = 0; i < n; ++i){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            next.criteriaHandler(arr);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
