package structuralPatterns.adapter.example;

public class VehiculoElectrico implements IAutomovil {

    private EAuto automovil;

    public VehiculoElectrico(EAuto automovil){
        this.automovil=automovil;
    }

    @Override
    public void prender() {
        automovil.encender();
    }

    @Override
    public void marcha(int tiempoMarcha) throws InterruptedException {
        automovil.funcionando(tiempoMarcha);
    }

    @Override
    public void cargando(int tiempo) {
        automovil.cargando(tiempo);
    }
}
