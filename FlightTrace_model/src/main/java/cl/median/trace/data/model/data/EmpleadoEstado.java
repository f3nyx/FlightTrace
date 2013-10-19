package cl.median.trace.data.model.data;

public enum EmpleadoEstado {

    DISPONIBLE("disponible"), OCUPADO("ocupado"), AUSENTE("ausente");
    private String estado;

    EmpleadoEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
