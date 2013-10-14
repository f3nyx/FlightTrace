package cl.median.trace.web.trace;

import cl.median.trace.data.business.dao.table.DepartureFlightTraceDAO;
import javax.annotation.Resource;
import org.apache.log4j.Logger;

public class DepartureFlightTraceMockBean {
    
    private static final Logger LOGGER = Logger.getLogger(DepartureFlightTraceMockBean.class);
    
    @Resource(name = "departureFlightTraceDAO")
    private DepartureFlightTraceDAO departureFlightTraceDAO;
    
    
}
