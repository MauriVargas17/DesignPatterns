package structuralPatterns.bridge.practice;

public class EmpresaSA implements IEmpresa{
    private String nombre;
    private IMetodo tipoDeEnvio;

    public EmpresaSA(String nombre, IMetodo tipoDeEnvio) {
        System.out.println("Creando una sociedad anonima");
        System.out.println("Bienvenido a "+nombre);
        this.nombre = nombre;
        this.tipoDeEnvio = tipoDeEnvio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IMetodo getTipoDeEnvio() {
        return tipoDeEnvio;
    }

    public void setTipoDeEnvio(IMetodo tipoDeEnvio) {
        this.tipoDeEnvio = tipoDeEnvio;
    }

    @Override
    public void enviar(Paquete paquete) {
        double precioAjustado = tipoDeEnvio.ajustePrecios(paquete.getPrecio());
        System.out.println("Se envio el paquete con el precio ajustado de "+paquete.getPrecio()+" a "+precioAjustado+" por ser el envio "+tipoDeEnvio.getTipo());
    }
}
