package cl.median.trace.data.model.data;

public enum TipoVuelo {

    PASAJEROS("pasajeros"), CARGA("carga"), FERRY("ferry");
    private String tipoVuelo;

    TipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }
}
