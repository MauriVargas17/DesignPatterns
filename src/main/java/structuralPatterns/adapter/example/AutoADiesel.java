package structuralPatterns.adapter.example;

public class AutoADiesel implements IAutomovil{

    private int combustible;

    public AutoADiesel(){
        combustible=2;
    }

    @Override
    public void prender() {
        System.out.println("Diesel> combustible actual: "+combustible);
    }

    @Override
    public void marcha(int tiempoMarcha) throws InterruptedException {

        for (int i = 0; i < tiempoMarcha ; i=i+5) {
            combustible=combustible-5;
            Thread.sleep(5000);
            if(combustible<=0){
                System.out.println("DIESEL> se quedo sin combustible: estado actual: 0%");
                combustible=0;
                break;
            }
        }


    }

    @Override
    public void cargando(int tiempo) {
        for (int i = 0; i < tiempo; i++) {
            combustible=combustible+2;
            System.out.println("DIESEL: cargando combustible ...");
            if(combustible>=100){
                System.out.println("DIESEL> estado actual: 100%");
                combustible=100;
                break;
            }
        }
        System.out.println("DIESEL: combustible cargado : "+combustible+"%");
    }
}