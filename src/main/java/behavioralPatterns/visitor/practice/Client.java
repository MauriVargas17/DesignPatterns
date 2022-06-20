package behavioralPatterns.visitor.practice;

public class Client {
    public static void main(String[] args){

        LibreCambista libreCambista = new LibreCambista();
        Bolivia bolivia = new Bolivia();
        Brasil brasil = new Brasil();
        Argentina argentina = new Argentina();
        Italia italia = new Italia();

        bolivia.receiveViajero(libreCambista, 50, "USD");
        brasil.receiveViajero(libreCambista, 100, "");
        argentina.receiveViajero(libreCambista, 10, "USD");
        italia.receiveViajero(libreCambista, 45, "");
    }
}
