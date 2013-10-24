package cl.median.trace.web.prototype.vuelo;

import cl.median.trace.data.business.dao.table.RutaDAO;
import cl.median.trace.data.business.model.table.Ruta;
import cl.median.trace.data.business.model.table.Vuelo;
import cl.median.trace.data.model.data.TipoVuelo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.apache.log4j.Logger;

public class AddRutaBean {

    private static final Logger LOGGER = Logger.getLogger(AddRutaBean.class);
    @Resource(name = "rutaDAO")
    private RutaDAO rutaDAO;
    private Ruta ruta;
    private Vuelo vuelo;

    public AddRutaBean() {
        ruta = new Ruta();
        vuelo = new Vuelo();
        
        Calendar i, l;
        i = l = new GregorianCalendar();
        i.set(1989, 12, 13, 15, 30, 40);
        l.set(1989, 12, 13, 15, 30, 40);  
        
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
        
        ruta.setVuelo(vuelo);
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public String doSubmit(ActionEvent actionEvent) {
        String result = null;
        try {
            List<Ruta> rutas;
            try {
                rutas = rutaDAO.findAll();
            } catch (NullPointerException npe) {
                LOGGER.debug(npe);
                rutas = new ArrayList<Ruta>();
            }
            Integer id = new Integer(rutas.size() + 1);
            getRuta().setId(id.longValue());
            getVuelo().setRutas(rutas);
            LOGGER.debug("estoy vivo: " + id.longValue());
            rutaDAO.persist(ruta);
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    getRuta().getTramo() + " is new on DB",
                    "INFO"));
            return null;
        } catch (Exception e) {
            LOGGER.error(e);
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    e.getMessage(),
                    "ERROR: " + e));
            e.printStackTrace();
            return null;
        }

    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
