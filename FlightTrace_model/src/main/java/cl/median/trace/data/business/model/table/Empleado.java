package cl.median.trace.data.business.model.table;

import cl.median.trace.data.business.model.GeneratedIdEntity;
import cl.median.trace.data.model.data.EmpleadoEstado;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "empleado")
public class Empleado extends GeneratedIdEntity {

    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private EmpleadoEstado estado;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "masculino")
    private boolean masculino;
    @Column(name = "rut")
    private int rut;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdEmpleado")
    @IndexColumn(name = "idx")
    private List<Direccion> direcciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMasculino() {
        return masculino;
    }

    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public EmpleadoEstado getEstado() {
        return estado;
    }

    public void setEstado(EmpleadoEstado estado) {
        this.estado = estado;
    }

}
