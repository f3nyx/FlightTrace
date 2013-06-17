package cl.median.trace.data.business.model.table;

import cl.median.trace.data.business.model.GeneratedIdEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "arrivalFlightTrace")
public class ArrivalFlightTrace extends GeneratedIdEntity {

    @Column(name = "encargadoVuelo")
    private String encargadoVuelo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "numeroVuelo")
    private int numeroVuelo;
    @Column(name = "versionCabin")
    private int versionCabin;
    @Column(name = "versionCockpit")
    private int versionCockpit;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "tramoVuelo")
    private String tramoVuelo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeItinerarioLlegada;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeLanding;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeShutdown;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeDoorOpen;
    @Column(name = "pasengersChildren")
    private int pasengersChildren;
    @Column(name = "pasengersMen")
    private int pasengersMen;
    @Column(name = "pasengersWomen")
    private int pasengersWomen;
    @Column(name = "cargo")
    private int cargo;
    @Column(name = "codigoAtraso")
    private int codigoAtraso;
    @Column(name = "fuelRemain")
    private int fuelRemain;
    @Column(name = "captain")
    private String captain;
    @Column(name = "primerOficial")
    private String primerOficial;
    @Column(name = "jefeCabin")
    private String jefeCabin;
    @Column(name = "auxiliarVuelo")
    private String auxiliarVuelo;
    @Column(name = "auxiliarExtra")
    private String auxiliarExtra;
    @Column(name = "infoEspecial")
    private String infoEspecial;

    public String getEncargadoVuelo() {
        return encargadoVuelo;
    }

    public void setEncargadoVuelo(String encargadoVuelo) {
        this.encargadoVuelo = encargadoVuelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public int getVersionCabin() {
        return versionCabin;
    }

    public void setVersionCabin(int versionCabin) {
        this.versionCabin = versionCabin;
    }

    public int getVersionCockpit() {
        return versionCockpit;
    }

    public void setVersionCockpit(int versionCockpit) {
        this.versionCockpit = versionCockpit;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTramoVuelo() {
        return tramoVuelo;
    }

    public void setTramoVuelo(String tramoVuelo) {
        this.tramoVuelo = tramoVuelo;
    }

    public Date getTimeItinerarioLlegada() {
        return timeItinerarioLlegada;
    }

    public void setTimeItinerarioLlegada(Date timeItinerarioLlegada) {
        this.timeItinerarioLlegada = timeItinerarioLlegada;
    }

    public Date getTimeLanding() {
        return timeLanding;
    }

    public void setTimeLanding(Date timeLanding) {
        this.timeLanding = timeLanding;
    }

    public Date getTimeShutdown() {
        return timeShutdown;
    }

    public void setTimeShutdown(Date timeShutdown) {
        this.timeShutdown = timeShutdown;
    }

    public Date getTimeDoorOpen() {
        return timeDoorOpen;
    }

    public void setTimeDoorOpen(Date timeDoorOpen) {
        this.timeDoorOpen = timeDoorOpen;
    }

    public int getPasengersChildren() {
        return pasengersChildren;
    }

    public void setPasengersChildren(int pasengersChildren) {
        this.pasengersChildren = pasengersChildren;
    }

    public int getPasengersMen() {
        return pasengersMen;
    }

    public void setPasengersMen(int pasengersMen) {
        this.pasengersMen = pasengersMen;
    }

    public int getPasengersWomen() {
        return pasengersWomen;
    }

    public void setPasengersWomen(int pasengersWomen) {
        this.pasengersWomen = pasengersWomen;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getCodigoAtraso() {
        return codigoAtraso;
    }

    public void setCodigoAtraso(int codigoAtraso) {
        this.codigoAtraso = codigoAtraso;
    }

    public int getFuelRemain() {
        return fuelRemain;
    }

    public void setFuelRemain(int fuelRemain) {
        this.fuelRemain = fuelRemain;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getPrimerOficial() {
        return primerOficial;
    }

    public void setPrimerOficial(String primerOficial) {
        this.primerOficial = primerOficial;
    }

    public String getJefeCabin() {
        return jefeCabin;
    }

    public void setJefeCabin(String jefeCabin) {
        this.jefeCabin = jefeCabin;
    }

    public String getAuxiliarVuelo() {
        return auxiliarVuelo;
    }

    public void setAuxiliarVuelo(String auxiliarVuelo) {
        this.auxiliarVuelo = auxiliarVuelo;
    }

    public String getAuxiliarExtra() {
        return auxiliarExtra;
    }

    public void setAuxiliarExtra(String auxiliarExtra) {
        this.auxiliarExtra = auxiliarExtra;
    }

    public String getInfoEspecial() {
        return infoEspecial;
    }

    public void setInfoEspecial(String infoEspecial) {
        this.infoEspecial = infoEspecial;
    }
}
