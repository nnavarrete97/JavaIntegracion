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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "HABITACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habitaciones.findAll", query = "SELECT h FROM Habitaciones h")
    , @NamedQuery(name = "Habitaciones.findById", query = "SELECT h FROM Habitaciones h WHERE h.id = :id")
    , @NamedQuery(name = "Habitaciones.findByNombre", query = "SELECT h FROM Habitaciones h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Habitaciones.findByCantCamas", query = "SELECT h FROM Habitaciones h WHERE h.cantCamas = :cantCamas")
    , @NamedQuery(name = "Habitaciones.findByCantBanos", query = "SELECT h FROM Habitaciones h WHERE h.cantBanos = :cantBanos")
    , @NamedQuery(name = "Habitaciones.findByReservada", query = "SELECT h FROM Habitaciones h WHERE h.reservada = :reservada")})
public class Habitaciones implements Serializable {

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
    @Column(name = "CANT_CAMAS")
    private BigInteger cantCamas;
    @Basic(optional = false)
    @Column(name = "CANT_BANOS")
    private BigInteger cantBanos;
    @Basic(optional = false)
    @Column(name = "RESERVADA")
    private Character reservada;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Hoteles idhotel;
    @JoinColumn(name = "IDTIPO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TipoHabitaciones idtipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhabitacion")
    private Collection<Reservas> reservasCollection;

    public Habitaciones() {
    }

    public Habitaciones(BigDecimal id) {
        this.id = id;
    }

    public Habitaciones(BigDecimal id, String nombre, BigInteger cantCamas, BigInteger cantBanos, Character reservada) {
        this.id = id;
        this.nombre = nombre;
        this.cantCamas = cantCamas;
        this.cantBanos = cantBanos;
        this.reservada = reservada;
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

    public BigInteger getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(BigInteger cantCamas) {
        this.cantCamas = cantCamas;
    }

    public BigInteger getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(BigInteger cantBanos) {
        this.cantBanos = cantBanos;
    }

    public Character getReservada() {
        return reservada;
    }

    public void setReservada(Character reservada) {
        this.reservada = reservada;
    }

    public Hoteles getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Hoteles idhotel) {
        this.idhotel = idhotel;
    }

    public TipoHabitaciones getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(TipoHabitaciones idtipo) {
        this.idtipo = idtipo;
    }

    @XmlTransient
    public Collection<Reservas> getReservasCollection() {
        return reservasCollection;
    }

    public void setReservasCollection(Collection<Reservas> reservasCollection) {
        this.reservasCollection = reservasCollection;
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
        if (!(object instanceof Habitaciones)) {
            return false;
        }
        Habitaciones other = (Habitaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Habitaciones[ id=" + id + " ]";
    }
    
}
