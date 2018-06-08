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
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nicomscr
 */
@Entity
@Table(name = "TIPO_HABITACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoHabitaciones.findAll", query = "SELECT t FROM TipoHabitaciones t")
    , @NamedQuery(name = "TipoHabitaciones.findById", query = "SELECT t FROM TipoHabitaciones t WHERE t.id = :id")
    , @NamedQuery(name = "TipoHabitaciones.findByDescripcion", query = "SELECT t FROM TipoHabitaciones t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoHabitaciones.findByPrecio", query = "SELECT t FROM TipoHabitaciones t WHERE t.precio = :precio")
    , @NamedQuery(name = "TipoHabitaciones.findByCantMinHoras", query = "SELECT t FROM TipoHabitaciones t WHERE t.cantMinHoras = :cantMinHoras")})
public class TipoHabitaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "PRECIO")
    private BigInteger precio;
    @Basic(optional = false)
    @Column(name = "CANT_MIN_HORAS")
    private BigInteger cantMinHoras;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipo")
    private Collection<Habitaciones> habitacionesCollection;

    public TipoHabitaciones() {
    }

    public TipoHabitaciones(BigDecimal id) {
        this.id = id;
    }

    public TipoHabitaciones(BigDecimal id, String descripcion, BigInteger precio, BigInteger cantMinHoras) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantMinHoras = cantMinHoras;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public BigInteger getCantMinHoras() {
        return cantMinHoras;
    }

    public void setCantMinHoras(BigInteger cantMinHoras) {
        this.cantMinHoras = cantMinHoras;
    }

    @XmlTransient
    public Collection<Habitaciones> getHabitacionesCollection() {
        return habitacionesCollection;
    }

    public void setHabitacionesCollection(Collection<Habitaciones> habitacionesCollection) {
        this.habitacionesCollection = habitacionesCollection;
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
        if (!(object instanceof TipoHabitaciones)) {
            return false;
        }
        TipoHabitaciones other = (TipoHabitaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TipoHabitaciones[ id=" + id + " ]";
    }
    
}
