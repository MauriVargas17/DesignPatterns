package structuralPatterns.adapter.example;

public class Client {
    public static void main(String []args) throws InterruptedException {

        IAutomovil autoG= new AutoAGasolina();
        IAutomovil autoGE= new AutoAGasolinaEspecial();
        IAutomovil autoD= new AutoADiesel();
        IAutomovil autoA= new VehiculoElectrico(new EAuto());


        autoG.prender();
        autoG.marcha(15);
        autoG.cargando(5);

        autoA.prender();
        autoA.marcha(15);
        autoA.cargando(5);

    }
}
