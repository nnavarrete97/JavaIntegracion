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
@Table(name = "REGIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regiones.findAll", query = "SELECT r FROM Regiones r")
    , @NamedQuery(name = "Regiones.findById", query = "SELECT r FROM Regiones r WHERE r.id = :id")
    , @NamedQuery(name = "Regiones.findByNombre", query = "SELECT r FROM Regiones r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Regiones.findBySigla", query = "SELECT r FROM Regiones r WHERE r.sigla = :sigla")})
public class Regiones implements Serializable {

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
    @Column(name = "SIGLA")
    private String sigla;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idregion")
    private Collection<DatosHotel> datosHotelCollection;

    public Regiones() {
    }

    public Regiones(BigDecimal id) {
        this.id = id;
    }

    public Regiones(BigDecimal id, String nombre, String sigla) {
        this.id = id;
        this.nombre = nombre;
        this.sigla = sigla;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @XmlTransient
    public Collection<DatosHotel> getDatosHotelCollection() {
        return datosHotelCollection;
    }

    public void setDatosHotelCollection(Collection<DatosHotel> datosHotelCollection) {
        this.datosHotelCollection = datosHotelCollection;
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
        if (!(object instanceof Regiones)) {
            return false;
        }
        Regiones other = (Regiones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Regiones[ id=" + id + " ]";
    }
    
}
