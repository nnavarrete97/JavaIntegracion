/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nicomscr
 */
@Entity
@Table(name = "EMPLEADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findById", query = "SELECT e FROM Empleados e WHERE e.id = :id")
    , @NamedQuery(name = "Empleados.findByNombre", query = "SELECT e FROM Empleados e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empleados.findByAppaterno", query = "SELECT e FROM Empleados e WHERE e.appaterno = :appaterno")
    , @NamedQuery(name = "Empleados.findByFechaContrato", query = "SELECT e FROM Empleados e WHERE e.fechaContrato = :fechaContrato")
    , @NamedQuery(name = "Empleados.findByProfesion", query = "SELECT e FROM Empleados e WHERE e.profesion = :profesion")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "APPATERNO")
    private String appaterno;
    @Basic(optional = false)
    @Column(name = "FECHA_CONTRATO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContrato;
    @Basic(optional = false)
    @Column(name = "PROFESION")
    private String profesion;
    @JoinColumn(name = "IDCARGO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cargos idcargo;
    @JoinColumn(name = "IDDATOS", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private DatosPersonalesEmpleados iddatos;
    @JoinColumn(name = "IDSUELDO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Sueldos idsueldo;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Usuarios idusuario;

    public Empleados() {
    }

    public Empleados(BigDecimal id) {
        this.id = id;
    }

    public Empleados(BigDecimal id, String nombre, String appaterno, Date fechaContrato, String profesion) {
        this.id = id;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.fechaContrato = fechaContrato;
        this.profesion = profesion;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Cargos getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Cargos idcargo) {
        this.idcargo = idcargo;
    }

    public DatosPersonalesEmpleados getIddatos() {
        return iddatos;
    }

    public void setIddatos(DatosPersonalesEmpleados iddatos) {
        this.iddatos = iddatos;
    }

    public Sueldos getIdsueldo() {
        return idsueldo;
    }

    public void setIdsueldo(Sueldos idsueldo) {
        this.idsueldo = idsueldo;
    }

    public Usuarios getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuarios idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Empleados[ id=" + id + " ]";
    }
    
}
