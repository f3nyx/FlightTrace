package cl.median.trace.data.model.data;

public enum EmpleadoEstado {

    DISPONIBLE("disponible"), OCUPADO("ocupado");
    private String estado;

    EmpleadoEstado(String estado) {
        this.estado = estado;
    }
}
