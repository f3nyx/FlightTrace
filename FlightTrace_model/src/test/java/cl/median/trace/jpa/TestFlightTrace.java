package cl.median.trace.jpa;

import cl.median.trace.data.business.dao.table.DireccionDAO;
import cl.median.trace.data.business.dao.table.EmpleadoDAO;
import cl.median.trace.data.business.model.table.Direccion;
import cl.median.trace.data.business.model.table.Empleado;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:dataSourceContext.xml", "classpath:modelContext.xml"})
@Transactional
public class TestFlightTrace {

    private static final Logger LOGGER = Logger.getLogger(TestFlightTrace.class);
    @Resource(name = "empleadoDAO")
    private EmpleadoDAO empleadoDAO;
    @Resource(name = "direccionDAO")
    private DireccionDAO direccionDAO;

    @Test
    public void empleadoTestDAO() {
        LOGGER.debug("/\n///////////////////// inicio de test");

        Empleado empleado = new Empleado();
        empleado.setEstado("ocupado");
        empleado.setFechaNacimiento(new Date(0));
        empleado.setMasculino(true);
        empleado.setNacionalidad("chileno");
        empleado.setNombre("miguel");
        empleado.setRut(16978752);

        Direccion direccion = new Direccion();
        direccion.setCalle("123");
        direccion.setComuna("123");
        direccion.setDepartamento("123");
        direccion.setNumero("123");
        direccion.setOtro("123");
        direccion.setPais("123");
        direccion.setRegion("123");

        List<Direccion> direcciones = new ArrayList<Direccion>();
        direcciones.add(direccion);

        empleado.setDirecciones(direcciones);

        direccion.setEmpleado(empleado);

        LOGGER.debug(empleado.toString());
        
        empleadoDAO.persist(empleado);
        
        List<Empleado> empleados = new ArrayList<Empleado>();
        
        empleados = empleadoDAO.findAll();
        
        Assert.assertFalse(empleados.isEmpty());
    }
}
