/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nicomscr
 */
@Entity
@Table(name = "DATOS_PERSONALES_EMPLEADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosPersonalesEmpleados.findAll", query = "SELECT d FROM DatosPersonalesEmpleados d")
    , @NamedQuery(name = "DatosPersonalesEmpleados.findById", query = "SELECT d FROM DatosPersonalesEmpleados d WHERE d.id = :id")
    , @NamedQuery(name = "DatosPersonalesEmpleados.findByFechaNac", query = "SELECT d FROM DatosPersonalesEmpleados d WHERE d.fechaNac = :fechaNac")
    , @NamedQuery(name = "DatosPersonalesEmpleados.findByDireccion", query = "SELECT d FROM DatosPersonalesEmpleados d WHERE d.direccion = :direccion")
    , @NamedQuery(name = "DatosPersonalesEmpleados.findByCargasFamiliares", query = "SELECT d FROM DatosPersonalesEmpleados d WHERE d.cargasFamiliares = :cargasFamiliares")
    , @NamedQuery(name = "DatosPersonalesEmpleados.findByFonomovil", query = "SELECT d FROM DatosPersonalesEmpleados d WHERE d.fonomovil = :fonomovil")
    , @NamedQuery(name = "DatosPersonalesEmpleados.findByFonofijo", query = "SELECT d FROM DatosPersonalesEmpleados d WHERE d.fonofijo = :fonofijo")
    , @NamedQuery(name = "DatosPersonalesEmpleados.findByPrevision", query = "SELECT d FROM DatosPersonalesEmpleados d WHERE d.prevision = :prevision")
    , @NamedQuery(name = "DatosPersonalesEmpleados.findByNacionalidad", query = "SELECT d FROM DatosPersonalesEmpleados d WHERE d.nacionalidad = :nacionalidad")})
public class DatosPersonalesEmpleados implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "FECHA_NAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNac;
    @Basic(optional = false)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "CARGAS_FAMILIARES")
    private BigInteger cargasFamiliares;
    @Basic(optional = false)
    @Column(name = "FONOMOVIL")
    private String fonomovil;
    @Basic(optional = false)
    @Column(name = "FONOFIJO")
    private String fonofijo;
    @Basic(optional = false)
    @Column(name = "PREVISION")
    private String prevision;
    @Basic(optional = false)
    @Column(name = "NACIONALIDAD")
    private String nacionalidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddatos")
    private Collection<Empleados> empleadosCollection;

    public DatosPersonalesEmpleados() {
    }

    public DatosPersonalesEmpleados(BigDecimal id) {
        this.id = id;
    }

    public DatosPersonalesEmpleados(BigDecimal id, Date fechaNac, String direccion, BigInteger cargasFamiliares, String fonomovil, String fonofijo, String prevision, String nacionalidad) {
        this.id = id;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.cargasFamiliares = cargasFamiliares;
        this.fonomovil = fonomovil;
        this.fonofijo = fonofijo;
        this.prevision = prevision;
        this.nacionalidad = nacionalidad;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getCargasFamiliares() {
        return cargasFamiliares;
    }

    public void setCargasFamiliares(BigInteger cargasFamiliares) {
        this.cargasFamiliares = cargasFamiliares;
    }

    public String getFonomovil() {
        return fonomovil;
    }

    public void setFonomovil(String fonomovil) {
        this.fonomovil = fonomovil;
    }

    public String getFonofijo() {
        return fonofijo;
    }

    public void setFonofijo(String fonofijo) {
        this.fonofijo = fonofijo;
    }

    public String getPrevision() {
        return prevision;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @XmlTransient
    public Collection<Empleados> getEmpleadosCollection() {
        return empleadosCollection;
    }

    public void setEmpleadosCollection(Collection<Empleados> empleadosCollection) {
        this.empleadosCollection = empleadosCollection;
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
        if (!(object instanceof DatosPersonalesEmpleados)) {
            return false;
        }
        DatosPersonalesEmpleados other = (DatosPersonalesEmpleados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DatosPersonalesEmpleados[ id=" + id + " ]";
    }
    
}
