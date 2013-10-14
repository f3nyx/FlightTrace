package cl.median.trace.data.business.dao.jpa.table;

import cl.median.trace.data.business.dao.jpa.JPAGenericDAO;
import cl.median.trace.data.business.dao.table.VueloDAO;
import cl.median.trace.data.business.model.table.Vuelo;
import org.springframework.stereotype.Service;

@Service(value = "vueloDAO")
public class JPAVueloDAO extends JPAGenericDAO<Vuelo> implements VueloDAO {

    public JPAVueloDAO() {
        super(Vuelo.class);
    }
}
