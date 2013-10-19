package cl.median.trace.web.prototype.util.converter;

import cl.median.trace.data.model.data.TipoVuelo;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.apache.log4j.Logger;

@FacesConverter("tipoVuelo")
public class TipoVueloConverter implements Converter {

    private static final Logger LOGGER = Logger.getLogger(TipoVueloConverter.class);

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string.equals("Pasajeros")) {
            return TipoVuelo.PASAJEROS;
        } else if (string.equals("Carga")) {
            return TipoVuelo.CARGA;
        } else if (string.equals("Ferry")) {
            return TipoVuelo.FERRY;
        }
        return "error";
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return o.toString();
    }
}
