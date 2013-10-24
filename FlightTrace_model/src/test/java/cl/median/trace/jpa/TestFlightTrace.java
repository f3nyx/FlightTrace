package cl.median.trace.jpa;

import cl.median.trace.data.business.dao.table.ArrivalFlightTraceDAO;
import cl.median.trace.data.business.dao.table.DepartureFlightTraceDAO;
import cl.median.trace.data.business.dao.table.DireccionDAO;
import cl.median.trace.data.business.dao.table.EmpleadoDAO;
import cl.median.trace.data.business.dao.table.RutaDAO;
import cl.median.trace.data.business.dao.table.VueloDAO;
import cl.median.trace.data.business.model.table.ArrivalFlightTrace;
import cl.median.trace.data.business.model.table.DepartureFlightTrace;
import cl.median.trace.data.business.model.table.Direccion;
import cl.median.trace.data.business.model.table.Empleado;
import cl.median.trace.data.business.model.table.Ruta;
import cl.median.trace.data.business.model.table.Vuelo;
import cl.median.trace.data.model.data.EmpleadoEstado;
import cl.median.trace.data.model.data.Sexo;
import cl.median.trace.data.model.data.TipoVuelo;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:dataSourceContext.xml", "classpath:modelContext.xml"})
@Transactional
public class TestFlightTrace {
    
    private static final Logger LOGGER = Logger.getLogger(TestFlightTrace.class);
    @Resource(name = "empleadoDAO")
    private EmpleadoDAO empleadoDAO;
    @Resource(name = "direccionDAO")
    private DireccionDAO direccionDAO;
    @Resource(name = "departureFlightTraceDAO")
    private DepartureFlightTraceDAO departureFlightTraceDAO;
    @Resource(name = "arrivalFlightTraceDAO")
    private ArrivalFlightTraceDAO arrivalFlightTraceDAO;
    @Resource(name = "vueloDAO")
    private VueloDAO vueloDAO;
    @Resource(name = "rutaDAO")
    private RutaDAO rutaDAO;
    
    @Test
    public void empleadoTestDAO() {
        LOGGER.debug("/\n///////////////////// inicio de test");
        
        
        Calendar c = new GregorianCalendar();
        c.set(1989, 6, 17, 13, 12, 40);
        
        Empleado empleado = new Empleado();
        empleado.setEstado(EmpleadoEstado.AUSENTE);
        empleado.setFechaNacimiento(c.getTime());
        empleado.setSexo(Sexo.MASCULINO);
        empleado.setNacionalidad("chileno");
        empleado.setNombre("miguel");
        empleado.setRut(16978752);
        
        Direccion direccion = new Direccion();
        direccion.setCalle("123");
        direccion.setComuna("123");
        direccion.setDepartamento("123");
        direccion.setNumero("123");
        direccion.setOtro("123");
        direccion.setPais("123");
        direccion.setRegion("123");
        
        List<Direccion> direcciones = new ArrayList<Direccion>();
        direcciones.add(direccion);
        
        empleado.setDirecciones(direcciones);
        
        direccion.setEmpleado(empleado);
        
        LOGGER.debug("DDDDDDDDDDDDDDDDD " + empleado.toString());
        
        empleadoDAO.persist(empleado);
        
        List<Empleado> empleados = new ArrayList<Empleado>();
        
        empleados = empleadoDAO.findAll();
        
        Assert.assertFalse(empleados.isEmpty());
    }
    
    @Test
    public void departureFlightTraceTest() {
        LOGGER.debug("/\n///////////////////// inicio de test //departureFlightTrace//departureFlightTrace //departureFlightTrace//departureFlightTrace//\n");
        
        DepartureFlightTrace departureFlightTrace = new DepartureFlightTrace();
        
        
        Calendar a, c, cierre, h1, h2, p, f;
        a = c = cierre = h1 = p = h2 = f = new GregorianCalendar();
        a.set(2013, 6, 17, 13, 12, 40);
        c.set(2013, 6, 17, 20, 15, 2);
        cierre.set(2013, 6, 17, 20, 15, 22);
        h1.set(2013, 6, 17, 19, 15, 22);
        h2.set(2013, 6, 17, 22, 15, 22);
        p.set(2013, 6, 17, 22, 15, 22);
        f.set(2013, 6, 17, 22, 15, 22);
        
        departureFlightTrace.setAeropuertoArrival("scel");
        departureFlightTrace.setAeropuertoDeparture("scar");
        departureFlightTrace.setAuxiliarVuelo("Juan Peres");
        departureFlightTrace.setCantidadEquipajeDestino(20);
        departureFlightTrace.setCantidadPaxDestino(20);
        departureFlightTrace.setCapitan("Rodrigo Peres");
        departureFlightTrace.setCodigoAtraso(0);
        departureFlightTrace.setEovSignature("juanitoedoe");
        departureFlightTrace.setEstimadaArrivo(c.getTime());
        departureFlightTrace.setExtraCabinCrew("Roza Peres");
        departureFlightTrace.setExtraCockpitCrew("Daniela Peres");
        departureFlightTrace.setExtraInfo("En este vuelo hay mucho viento");
        departureFlightTrace.setFechaDeparture(a.getTime());
        departureFlightTrace.setFinalFuel(1234);
        departureFlightTrace.setFlightPlanFuel(1000);
        departureFlightTrace.setHoraCierrePuerta(cierre.getTime());
        departureFlightTrace.setHoraItinerarioLlegada(h1.getTime());
        departureFlightTrace.setHoraItinerarioSalida(h2.getTime());
        departureFlightTrace.setHoraPushback(p.getTime());
        departureFlightTrace.setHoraTakeoff(f.getTime());
        departureFlightTrace.setJefeCabina("Jefe Peres");
        departureFlightTrace.setLoadedFuel(1000);
        departureFlightTrace.setMatricula("asdf");
        departureFlightTrace.setNumeroVuelo(1234);
        departureFlightTrace.setPesoEquipajeDestino(5670);
        departureFlightTrace.setPrimerOficial("Comandante Peres");
        departureFlightTrace.setTakeoffWeight(100000);
        departureFlightTrace.setTotalCargoWeight(1000);
        departureFlightTrace.setTotalEquipaje(100);
        departureFlightTrace.setTotalPax(20);
        departureFlightTrace.setTripFuel(1000);
        departureFlightTrace.setVersionCabina(3);
        departureFlightTrace.setVersionCockpit(2);
        
        LOGGER.debug("#############Departure :" + departureFlightTrace.toString());
        
        departureFlightTraceDAO.persist(departureFlightTrace);
        
        List<DepartureFlightTrace> departureFlightTraces = new ArrayList<DepartureFlightTrace>();
        
        departureFlightTraces = departureFlightTraceDAO.findAll();
        
        Assert.assertFalse(departureFlightTraces.isEmpty());
        
    }
    
    @Test
    public void ArrivalFlightTraceTest() {
        
        LOGGER.debug("/\n///////////////////// inicio de test ArrivalFlightTrace //\n");
        
        ArrivalFlightTrace arrivalFlightTrace = new ArrivalFlightTrace();
        
        
        Calendar a, c, cierre, h1, h2;
        a = c = cierre = h1 = h2 = new GregorianCalendar();
        a.set(2013, 6, 17, 13, 12, 40);
        c.set(2013, 6, 17, 20, 15, 2);
        cierre.set(2013, 6, 17, 20, 15, 22);
        h1.set(2013, 6, 17, 19, 15, 22);
        h2.set(2013, 6, 17, 22, 15, 22);
        
        arrivalFlightTrace.setAuxiliarExtra("Carlos Mesa");
        arrivalFlightTrace.setAuxiliarVuelo("Auxiliar Mesa");
        arrivalFlightTrace.setCaptain("Capitan Mesa");
        arrivalFlightTrace.setCargo(1000);
        arrivalFlightTrace.setCodigoAtraso(0);
        arrivalFlightTrace.setEncargadoVuelo("Encargado Mesa");
        arrivalFlightTrace.setFecha(c.getTime());
        arrivalFlightTrace.setFuelRemain(1000);
        arrivalFlightTrace.setInfoEspecial("Este avion se cayo y naide sobrevivio, jajaja");
        arrivalFlightTrace.setJefeCabin("Jefe Mesa");
        arrivalFlightTrace.setNumeroVuelo(666);
        arrivalFlightTrace.setPasengersChildren(2);
        arrivalFlightTrace.setPasengersMen(5);
        arrivalFlightTrace.setPasengersWomen(4);
        arrivalFlightTrace.setPrimerOficial("Oficial Mesa");
        arrivalFlightTrace.setTimeDoorOpen(c.getTime());
        arrivalFlightTrace.setTimeItinerarioLlegada(cierre.getTime());
        arrivalFlightTrace.setTimeLanding(h1.getTime());
        arrivalFlightTrace.setTimeShutdown(h2.getTime());
        arrivalFlightTrace.setTramoVuelo("esgr");
        arrivalFlightTrace.setVersionCabin(123);
        arrivalFlightTrace.setVersionCockpit(123);
        
        
        LOGGER.debug("#############Arrival :" + arrivalFlightTrace.toString());
        
        
        arrivalFlightTraceDAO.persist(arrivalFlightTrace);
        
        List<ArrivalFlightTrace> arrivalFlightTraces = new ArrayList<ArrivalFlightTrace>();
        
        arrivalFlightTraces = arrivalFlightTraceDAO.findAll();
        
        Assert.assertFalse(arrivalFlightTraces.isEmpty());
    }
    
    @Test
    public void VueloTest() {
        
        LOGGER.debug("/\n///////////////////// inicio de test ArrivalFlightTrace //\n");
        
        Vuelo vuelo = new Vuelo();
        
        Calendar i, l;
        i = l = new GregorianCalendar();
        i.set(1989, 12, 13, 15, 30, 40);
        l.set(1989, 12, 13, 15, 30, 40);        
        
        List<Ruta> rutas = new ArrayList<Ruta>();
        Ruta ruta = new Ruta();
        ruta.setAeropuertoSalida("salida");
        ruta.setAeropuertoLlegada("llegada");
        
        vuelo.setAeropuertoArribo("aeropuerto1");
        vuelo.setAeropuertoSalida("aeropuerto2");
        vuelo.setAvionDisponible("avion1");
        vuelo.setCabinCrew("trabajadores1");
        vuelo.setCarga(1);
        vuelo.setCorreo(1);
        vuelo.setFlightCrew("trabajadores2");
        vuelo.setInicio(i.getTime());
        vuelo.setLlegada(l.getTime());
        vuelo.setRutaDisponible("ruta1");
        vuelo.setTipoVuelo(TipoVuelo.CARGA);
        vuelo.setResumenVuelo(1);
        vuelo.setRutas(null);
        
        
        ruta.setVuelo(vuelo);
        rutas.add(ruta);
        
        vuelo.setRutas(rutas);
        
        LOGGER.debug("#############Vuelo :" + vuelo.toString());
        
        vueloDAO.persist(vuelo);
        
        List<Vuelo> vuelos = new ArrayList<Vuelo>();
        
        vuelos = vueloDAO.findAll();
        
        Assert.assertFalse(vuelos.isEmpty());
        
    }
    
    @Test
    public void rutaTest() {
        
        LOGGER.debug("/\n///////////////////// inicio de test ruta //\n");
        
        Ruta ruta = new Ruta();
        
        ruta.setAeropuertoLlegada("al1");
        ruta.setAeropuertoSalida("as2");
        ruta.setTramo("t1");
        
        
        LOGGER.debug("#############Ruta :" + ruta.toString());
        
        rutaDAO.persist(ruta);
        
        List<Ruta> rutas = new ArrayList<Ruta>();
        
        rutas = rutaDAO.findAll();
        
        Assert.assertFalse(rutas.isEmpty());
    }
}
