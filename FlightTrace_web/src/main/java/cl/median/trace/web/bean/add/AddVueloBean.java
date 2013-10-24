package cl.median.trace.web.bean.add;

import cl.median.trace.data.business.dao.table.VueloDAO;
import cl.median.trace.data.business.model.table.Ruta;
import cl.median.trace.data.business.model.table.Vuelo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;

public class AddVueloBean {

    //error con @service, hay que camiarlo a etiqueta y sacar anotación
    
    private static final Logger LOGGER = Logger.getLogger(AddVueloBean.class);
//    @Resource(name = "vueloDAO")
    private VueloDAO vueloDAO;
    private List<Ruta> rutas = new ArrayList<Ruta>();
    private Vuelo vuelo = new Vuelo();
    private Ruta ruta = new Ruta();

    public AddVueloBean() {
        this.vuelo = new Vuelo();
        this.ruta = new Ruta();
        this.rutas = new ArrayList<Ruta>();
        LOGGER.debug("data vueloDAO: " + vueloDAO);
    }

    public String doSubmit() {
        try {
            if (!getRutas().isEmpty()) {
                getVuelo().setRutas(getRutas());
                getVueloDAO().persist(getVuelo());
                FacesContext.getCurrentInstance().addMessage(
                        null,
                        new FacesMessage(
                        FacesMessage.SEVERITY_INFO,
                        getRuta().getTramo() + " Guardado en la BD",
                        "INFO"));
            } else {
                FacesContext.getCurrentInstance().addMessage(
                        null,
                        new FacesMessage(
                        FacesMessage.SEVERITY_WARN,
                        " La lista de Rutas esta vacia",
                        "INFO"));
            }
        } catch (Exception e) {
            LOGGER.error(e);
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    e.getMessage(),
                    "ERROR: " + e));
        }
        return null;
    }

    public String addRuta() {
        try {
            getRutas().add(getRuta());
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    getRuta().getTramo() + " esta ahderida en la tabla",
                    "INFO"));
        } catch (Exception e) {
            LOGGER.error(e);
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    e.getMessage(),
                    "ERROR: " + e));
        }
        return null;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
    }

    public VueloDAO getVueloDAO() {
        return vueloDAO;
    }

    public void setVueloDAO(VueloDAO vueloDAO) {
        this.vueloDAO = vueloDAO;
    }
}
