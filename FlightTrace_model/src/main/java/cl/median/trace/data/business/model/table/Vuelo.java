package cl.median.trace.data.business.model.table;

import cl.median.trace.data.business.model.GeneratedIdEntity;
import cl.median.trace.data.model.data.TipoVuelo;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "vuelo")
public class Vuelo extends GeneratedIdEntity {

    @Column(name = "aeropuertoSalida")
    private String aeropuertoSalida;
    @Column(name = "aeropuertoArribo")
    private String aeropuertoArribo;
    @Column(name = "avionDisponible")
    private String avionDisponible;
    @Column(name = "flightCrew")
    private String flightCrew;
    @Column(name = "cabinCrew")
    private String cabinCrew;
    @Column(name = "rutaDisponible")
    private String rutaDisponible;
    @Column(name = "tipoVuelo")
    @Enumerated(EnumType.STRING)
    private TipoVuelo tipoVuelo;
    @Column(name = "carga")
    private int carga;
    @Column(name = "correo")
    private int correo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicio;
    @Temporal(TemporalType.TIMESTAMP)
    private Date llegada;
    @Column(name = "resumenVuelo")
    private int resumenVuelo;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdVuelo")
    @IndexColumn(name = "idx")
    private List<Ruta> rutas;

    public String getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public void setAeropuertoSalida(String aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }

    public String getAeropuertoArribo() {
        return aeropuertoArribo;
    }

    public void setAeropuertoArribo(String aeropuertoArribo) {
        this.aeropuertoArribo = aeropuertoArribo;
    }

    public String getAvionDisponible() {
        return avionDisponible;
    }

    public void setAvionDisponible(String avionDisponible) {
        this.avionDisponible = avionDisponible;
    }

    public String getFlightCrew() {
        return flightCrew;
    }

    public void setFlightCrew(String flightCrew) {
        this.flightCrew = flightCrew;
    }

    public String getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(String cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public String getRutaDisponible() {
        return rutaDisponible;
    }

    public void setRutaDisponible(String rutaDisponible) {
        this.rutaDisponible = rutaDisponible;
    }

    public TipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCorreo() {
        return correo;
    }

    public void setCorreo(int correo) {
        this.correo = correo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getLlegada() {
        return llegada;
    }

    public void setLlegada(Date llegada) {
        this.llegada = llegada;
    }

    public int getResumenVuelo() {
        return resumenVuelo;
    }

    public void setResumenVuelo(int resumenVuelo) {
        this.resumenVuelo = resumenVuelo;
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
    }
}
