package cl.median.trace.web.prototype.vuelo;

import cl.median.trace.data.business.dao.table.VueloDAO;
import cl.median.trace.data.business.model.table.Ruta;
import cl.median.trace.data.business.model.table.Vuelo;
import javax.annotation.Resource;
import javax.faces.event.ActionEvent;
import org.apache.log4j.Logger;

public class AddVueloBean {

    private static final Logger LOGGER = Logger.getLogger(AddVueloBean.class);
    @Resource(name = "vueloDAO")
    private VueloDAO vueloDAO;
    private Vuelo vuelo;
    private Ruta ruta;

    public AddVueloBean() {
        this.vuelo = new Vuelo();
//        LOGGER.debug("######### creación de bean " + TipoVuelo.getAllTipoVuelo().get(0).getTipoVuelo());
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String doSubmit(ActionEvent actionEvent) {
        String result = null;
        LOGGER.debug("######### submit echo");
        LOGGER.debug("######### resumen: " + getVuelo().getResumenVuelo());

        return result;

    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}
