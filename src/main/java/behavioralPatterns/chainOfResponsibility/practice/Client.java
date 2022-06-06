package behavioralPatterns.chainOfResponsibility.practice;

public class Client {
    public static void main(String[] args){
        ComplexityManager cm = new ComplexityManager();
        int[] arr = {2,4,34,5,6,6,34,3,2,3,45,4,4,5,4,24,53,46,456,456,45,6,56,4,7,8,78,70};
        cm.criteriaHandler(arr);
    }
}
