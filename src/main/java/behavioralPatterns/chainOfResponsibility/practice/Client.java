package behavioralPatterns.chainOfResponsibility.practice;

public class Client {
    public static void main(String[] args){
        ComplexityManager cm = new ComplexityManager();
        Persona[] arrPersonas = new Persona[20];
        int[] ages = new int[arrPersonas.length];
        for (int i = 0; i < arrPersonas.length; i++){
           arrPersonas[i] = new Persona(arrPersonas.length - i);
        }

        for (int i = 0; i < arrPersonas.length; i++){
          ages[i] = arrPersonas[i].getAge();
        }

        cm.criteriaHandler(ages);
        int[] arr = {2,4,34,5,6,6,34,3,2,3,45,4,4,5,4,24,53,46,456,456,45,6,56,4,7,8,78,70};
        cm.criteriaHandler(arr);
        int[] arr1 = {2,4,34,5,6,6,34,3,2,3,45,4,4,5,4,24,53,3,4,5,645,625,62,6245,16,467,568,567845,746,8374,673,34,645,467,458,457,845,67,34,6735,6,3645,72,47,4,46,456,456,45,6,56,4,7,8,78,70};
        cm.criteriaHandler(arr1);
        int[] arr2 = {1,4,6,3,5,7,0};
        cm.criteriaHandler(arr2);
    }
}
