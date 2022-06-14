package behavioralPatterns.chainOfResponsibility.inClassPractice;

public class Client {
    public static void main(String[] args){
        SEGIPCarnet segipCarnet = new SEGIPCarnet();
        segipCarnet.criteriaHandler(true, true, true);
        segipCarnet.criteriaHandler(false, false, true);
        segipCarnet.criteriaHandler(false, false, false);

    }
}
