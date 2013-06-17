package cl.median.trace.data.business.dao.jpa.table;

import cl.median.trace.data.business.dao.jpa.JPAGenericDAO;
import cl.median.trace.data.business.dao.table.ArrivalFlightTraceDAO;
import cl.median.trace.data.business.model.table.ArrivalFlightTrace;
import org.springframework.stereotype.Service;

@Service(value = "arrivalFlightTraceDAO")
public class JPAArrivalFlightTraceDAO extends JPAGenericDAO<ArrivalFlightTrace> implements ArrivalFlightTraceDAO {

    public JPAArrivalFlightTraceDAO() {
        super(ArrivalFlightTrace.class);
    }
}
