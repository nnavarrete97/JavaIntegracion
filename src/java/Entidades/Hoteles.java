/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "HOTELES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoteles.findAll", query = "SELECT h FROM Hoteles h")
    , @NamedQuery(name = "Hoteles.findById", query = "SELECT h FROM Hoteles h WHERE h.id = :id")
    , @NamedQuery(name = "Hoteles.findByNombre", query = "SELECT h FROM Hoteles h WHERE h.nombre = :nombre")})
public class Hoteles implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "IDDATOS", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private DatosHotel iddatos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhotel")
    private Collection<Habitaciones> habitacionesCollection;

    public Hoteles() {
    }

    public Hoteles(BigDecimal id) {
        this.id = id;
    }

    public Hoteles(BigDecimal id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public DatosHotel getIddatos() {
        return iddatos;
    }

    public void setIddatos(DatosHotel iddatos) {
        this.iddatos = iddatos;
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
        if (!(object instanceof Hoteles)) {
            return false;
        }
        Hoteles other = (Hoteles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Hoteles[ id=" + id + " ]";
    }
    
}
