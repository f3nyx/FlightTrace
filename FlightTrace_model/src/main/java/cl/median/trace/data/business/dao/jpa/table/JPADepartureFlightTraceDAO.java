package cl.median.trace.data.business.dao.jpa.table;

import cl.median.trace.data.business.dao.jpa.JPAGenericDAO;
import cl.median.trace.data.business.dao.table.DepartureFlightTraceDAO;
import cl.median.trace.data.business.model.table.DepartureFlightTrace;
import org.springframework.stereotype.Service;

@Service(value = "departureFlightTraceDAO")
public class JPADepartureFlightTraceDAO extends JPAGenericDAO<DepartureFlightTrace> implements DepartureFlightTraceDAO {

    public JPADepartureFlightTraceDAO() {
        super(DepartureFlightTrace.class);
    }
}