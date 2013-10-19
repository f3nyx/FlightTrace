package cl.median.trace.data.business.dao.jpa.table;

import cl.median.trace.data.business.dao.jpa.JPAGenericDAO;
import cl.median.trace.data.business.dao.table.RutaDAO;
import cl.median.trace.data.business.model.table.Ruta;
import org.springframework.stereotype.Service;

@Service(value = "rutaDAO")
public class JPARutaDAO extends JPAGenericDAO<Ruta> implements RutaDAO {

    public JPARutaDAO() {
        super(Ruta.class);
    }
}
