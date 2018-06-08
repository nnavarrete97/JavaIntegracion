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
@Table(name = "SERVICIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicios.findAll", query = "SELECT s FROM Servicios s")
    , @NamedQuery(name = "Servicios.findById", query = "SELECT s FROM Servicios s WHERE s.id = :id")
    , @NamedQuery(name = "Servicios.findByNombre", query = "SELECT s FROM Servicios s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Servicios.findByHoraInicioDisponible", query = "SELECT s FROM Servicios s WHERE s.horaInicioDisponible = :horaInicioDisponible")
    , @NamedQuery(name = "Servicios.findByHoraFinalDisponible", query = "SELECT s FROM Servicios s WHERE s.horaFinalDisponible = :horaFinalDisponible")
    , @NamedQuery(name = "Servicios.findByPrecio", query = "SELECT s FROM Servicios s WHERE s.precio = :precio")
    , @NamedQuery(name = "Servicios.findByDescripcion", query = "SELECT s FROM Servicios s WHERE s.descripcion = :descripcion")})
public class Servicios implements Serializable {

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
    @Column(name = "HORA_INICIO_DISPONIBLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicioDisponible;
    @Basic(optional = false)
    @Column(name = "HORA_FINAL_DISPONIBLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFinalDisponible;
    @Basic(optional = false)
    @Column(name = "PRECIO")
    private BigInteger precio;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idservicio")
    private Collection<AuxServiciosClientes> auxServiciosClientesCollection;

    public Servicios() {
    }

    public Servicios(BigDecimal id) {
        this.id = id;
    }

    public Servicios(BigDecimal id, String nombre, Date horaInicioDisponible, Date horaFinalDisponible, BigInteger precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.horaInicioDisponible = horaInicioDisponible;
        this.horaFinalDisponible = horaFinalDisponible;
        this.precio = precio;
        this.descripcion = descripcion;
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

    public Date getHoraInicioDisponible() {
        return horaInicioDisponible;
    }

    public void setHoraInicioDisponible(Date horaInicioDisponible) {
        this.horaInicioDisponible = horaInicioDisponible;
    }

    public Date getHoraFinalDisponible() {
        return horaFinalDisponible;
    }

    public void setHoraFinalDisponible(Date horaFinalDisponible) {
        this.horaFinalDisponible = horaFinalDisponible;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<AuxServiciosClientes> getAuxServiciosClientesCollection() {
        return auxServiciosClientesCollection;
    }

    public void setAuxServiciosClientesCollection(Collection<AuxServiciosClientes> auxServiciosClientesCollection) {
        this.auxServiciosClientesCollection = auxServiciosClientesCollection;
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
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Servicios[ id=" + id + " ]";
    }
    
}
