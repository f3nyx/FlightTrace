package cl.median.trace.data.business.model.table;

import cl.median.trace.data.business.model.GeneratedIdEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ruta")
public class Ruta extends GeneratedIdEntity {

    @Column(name = "tramo")
    private String tramo;
    @Column(name = "aeropuertoSalida")
    private String aeropuertoSalida;
    @Column(name = "aeropuertoSalidaLlegada")
    private String aeropuertoLlegada;
    @ManyToOne
    @JoinColumn(name = "IdVuelo")
    private Vuelo vuelo;

    public String getTramo() {
        return tramo;
    }

    public void setTramo(String tramo) {
        this.tramo = tramo;
    }

    public String getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public void setAeropuertoSalida(String aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }

    public String getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    public void setAeropuertoLlegada(String aeropuertoLlegada) {
        this.aeropuertoLlegada = aeropuertoLlegada;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
