package cl.median.trace.data.business.model.table;

import cl.median.trace.data.business.model.GeneratedIdEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "departureFlightTrace")
public class DepartureFlightTrace extends GeneratedIdEntity {

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeparture;
    @Column(name = "numeroVuelo")
    private int numeroVuelo;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "versionCockpit")
    private int versionCockpit;
    @Column(name = "versionCabina")
    private int versionCabina;
    @Column(name = "aeropuertoDeparture")
    private String aeropuertoDeparture;
    @Column(name = "aeropuertoArrival")
    private String aeropuertoArrival;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaItinerarioSalida;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaItinerarioLlegada;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaCierrePuerta;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaPushback;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaTakeoff;
    @Column(name = "codigoAtraso")
    private int codigoAtraso;
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimadaArrivo;
    @Column(name = "cantidadPaxDestino")
    private int cantidadPaxDestino;
    @Column(name = "pesoPaxDestino")
    private int pesoPaxDestino;
    @Column(name = "totalPax")
    private int totalPax;
    @Column(name = "cantidadEquipajeDestino")
    private int cantidadEquipajeDestino;
    @Column(name = "pesoEquipajeDestino")
    private int pesoEquipajeDestino;
    @Column(name = "totalEquipaje")
    private int totalEquipaje;
    @Column(name = "totalCargoWeight")
    private int totalCargoWeight;
    @Column(name = "takeoffWeight")
    private int takeoffWeight;
    @Column(name = "tripFuel")
    private int tripFuel;
    @Column(name = "flightPlanFuel")
    private int flightPlanFuel;
    @Column(name = "finalFuel")
    private int finalFuel;
    @Column(name = "loadedFuel")
    private int loadedFuel;
    @Column(name = "capitan")
    private String capitan;
    @Column(name = "primerOficial")
    private String primerOficial;
    @Column(name = "jefeCabina")
    private String jefeCabina;
    @Column(name = "auxiliarVuelo")
    private String auxiliarVuelo;
    @Column(name = "extraCockpitCrew")
    private String extraCockpitCrew;
    @Column(name = "extraCabinCrew")
    private String extraCabinCrew;
    @Column(name = "extraInfo")
    private String extraInfo;
    @Column(name = "eovSignature")
    private String eovSignature;

    public Date getFechaDeparture() {
        return fechaDeparture;
    }

    public void setFechaDeparture(Date fechaDeparture) {
        this.fechaDeparture = fechaDeparture;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVersionCockpit() {
        return versionCockpit;
    }

    public void setVersionCockpit(int versionCockpit) {
        this.versionCockpit = versionCockpit;
    }

    public int getVersionCabina() {
        return versionCabina;
    }

    public void setVersionCabina(int versionCabina) {
        this.versionCabina = versionCabina;
    }

    public String getAeropuertoDeparture() {
        return aeropuertoDeparture;
    }

    public void setAeropuertoDeparture(String aeropuertoDeparture) {
        this.aeropuertoDeparture = aeropuertoDeparture;
    }

    public String getAeropuertoArrival() {
        return aeropuertoArrival;
    }

    public void setAeropuertoArrival(String aeropuertoArrival) {
        this.aeropuertoArrival = aeropuertoArrival;
    }

    public Date getHoraItinerarioSalida() {
        return horaItinerarioSalida;
    }

    public void setHoraItinerarioSalida(Date horaItinerarioSalida) {
        this.horaItinerarioSalida = horaItinerarioSalida;
    }

    public Date getHoraItinerarioLlegada() {
        return horaItinerarioLlegada;
    }

    public void setHoraItinerarioLlegada(Date horaItinerarioLlegada) {
        this.horaItinerarioLlegada = horaItinerarioLlegada;
    }

    public Date getHoraCierrePuerta() {
        return horaCierrePuerta;
    }

    public void setHoraCierrePuerta(Date horaCierrePuerta) {
        this.horaCierrePuerta = horaCierrePuerta;
    }

    public Date getHoraPushback() {
        return horaPushback;
    }

    public void setHoraPushback(Date horaPushback) {
        this.horaPushback = horaPushback;
    }

    public Date getHoraTakeoff() {
        return horaTakeoff;
    }

    public void setHoraTakeoff(Date horaTakeoff) {
        this.horaTakeoff = horaTakeoff;
    }

    public int getCodigoAtraso() {
        return codigoAtraso;
    }

    public void setCodigoAtraso(int codigoAtraso) {
        this.codigoAtraso = codigoAtraso;
    }

    public Date getEstimadaArrivo() {
        return estimadaArrivo;
    }

    public void setEstimadaArrivo(Date estimadaArrivo) {
        this.estimadaArrivo = estimadaArrivo;
    }

    public int getCantidadPaxDestino() {
        return cantidadPaxDestino;
    }

    public void setCantidadPaxDestino(int cantidadPaxDestino) {
        this.cantidadPaxDestino = cantidadPaxDestino;
    }

    public int getPesoPaxDestino() {
        return pesoPaxDestino;
    }

    public void setPesoPaxDestino(int pesoPaxDestino) {
        this.pesoPaxDestino = pesoPaxDestino;
    }

    public int getTotalPax() {
        return totalPax;
    }

    public void setTotalPax(int totalPax) {
        this.totalPax = totalPax;
    }

    public int getCantidadEquipajeDestino() {
        return cantidadEquipajeDestino;
    }

    public void setCantidadEquipajeDestino(int cantidadEquipajeDestino) {
        this.cantidadEquipajeDestino = cantidadEquipajeDestino;
    }

    public int getPesoEquipajeDestino() {
        return pesoEquipajeDestino;
    }

    public void setPesoEquipajeDestino(int pesoEquipajeDestino) {
        this.pesoEquipajeDestino = pesoEquipajeDestino;
    }

    public int getTotalEquipaje() {
        return totalEquipaje;
    }

    public void setTotalEquipaje(int totalEquipaje) {
        this.totalEquipaje = totalEquipaje;
    }

    public int getTotalCargoWeight() {
        return totalCargoWeight;
    }

    public void setTotalCargoWeight(int totalCargoWeight) {
        this.totalCargoWeight = totalCargoWeight;
    }

    public int getTakeoffWeight() {
        return takeoffWeight;
    }

    public void setTakeoffWeight(int takeoffWeight) {
        this.takeoffWeight = takeoffWeight;
    }

    public int getTripFuel() {
        return tripFuel;
    }

    public void setTripFuel(int tripFuel) {
        this.tripFuel = tripFuel;
    }

    public int getFlightPlanFuel() {
        return flightPlanFuel;
    }

    public void setFlightPlanFuel(int flightPlanFuel) {
        this.flightPlanFuel = flightPlanFuel;
    }

    public int getFinalFuel() {
        return finalFuel;
    }

    public void setFinalFuel(int finalFuel) {
        this.finalFuel = finalFuel;
    }

    public int getLoadedFuel() {
        return loadedFuel;
    }

    public void setLoadedFuel(int loadedFuel) {
        this.loadedFuel = loadedFuel;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    public String getPrimerOficial() {
        return primerOficial;
    }

    public void setPrimerOficial(String primerOficial) {
        this.primerOficial = primerOficial;
    }

    public String getJefeCabina() {
        return jefeCabina;
    }

    public void setJefeCabina(String jefeCabina) {
        this.jefeCabina = jefeCabina;
    }

    public String getAuxiliarVuelo() {
        return auxiliarVuelo;
    }

    public void setAuxiliarVuelo(String auxiliarVuelo) {
        this.auxiliarVuelo = auxiliarVuelo;
    }

    public String getExtraCockpitCrew() {
        return extraCockpitCrew;
    }

    public void setExtraCockpitCrew(String extraCockpitCrew) {
        this.extraCockpitCrew = extraCockpitCrew;
    }

    public String getExtraCabinCrew() {
        return extraCabinCrew;
    }

    public void setExtraCabinCrew(String extraCabinCrew) {
        this.extraCabinCrew = extraCabinCrew;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getEovSignature() {
        return eovSignature;
    }

    public void setEovSignature(String eovSignature) {
        this.eovSignature = eovSignature;
    }
}
