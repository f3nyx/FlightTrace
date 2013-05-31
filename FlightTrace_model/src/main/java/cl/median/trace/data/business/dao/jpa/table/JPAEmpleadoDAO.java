package cl.median.trace.data.business.dao.jpa.table;

import cl.median.trace.data.business.dao.jpa.JPAGenericDAO;
import cl.median.trace.data.business.dao.table.EmpleadoDAO;
import cl.median.trace.data.business.model.table.Empleado;
import org.springframework.stereotype.Service;

@Service(value = "empleadoDAO")
public class JPAEmpleadoDAO extends JPAGenericDAO<Empleado> implements EmpleadoDAO {

    public JPAEmpleadoDAO() {
        super(Empleado.class);
    }
}
