package cl.median.trace.data.business.dao.jpa.table;

import cl.median.trace.data.business.dao.jpa.JPAGenericDAO;
import cl.median.trace.data.business.dao.table.DireccionDAO;
import cl.median.trace.data.business.model.table.Direccion;
import org.springframework.stereotype.Service;

@Service(value = "direccionDAO")
public class JPADireccionDAO extends JPAGenericDAO<Direccion> implements DireccionDAO {

    public JPADireccionDAO() {
        super(Direccion.class);
    }
}
