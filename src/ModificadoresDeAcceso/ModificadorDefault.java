package ModificadoresDeAcceso;

class ModificadorDefault {
    private String nombre = "Jenny";
    public String nombrePublico = "JR";

    public String regresaNombre() {
        return this.nombrePublico;
    }
}
