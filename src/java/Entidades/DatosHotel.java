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
@Table(name = "DATOS_HOTEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosHotel.findAll", query = "SELECT d FROM DatosHotel d")
    , @NamedQuery(name = "DatosHotel.findById", query = "SELECT d FROM DatosHotel d WHERE d.id = :id")
    , @NamedQuery(name = "DatosHotel.findByDireccion", query = "SELECT d FROM DatosHotel d WHERE d.direccion = :direccion")
    , @NamedQuery(name = "DatosHotel.findByFono1", query = "SELECT d FROM DatosHotel d WHERE d.fono1 = :fono1")
    , @NamedQuery(name = "DatosHotel.findByFono2", query = "SELECT d FROM DatosHotel d WHERE d.fono2 = :fono2")
    , @NamedQuery(name = "DatosHotel.findByCoordenadas", query = "SELECT d FROM DatosHotel d WHERE d.coordenadas = :coordenadas")})
public class DatosHotel implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "FONO1")
    private String fono1;
    @Basic(optional = false)
    @Column(name = "FONO2")
    private String fono2;
    @Basic(optional = false)
    @Column(name = "COORDENADAS")
    private String coordenadas;
    @JoinColumn(name = "IDCOMUNA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Comunas idcomuna;
    @JoinColumn(name = "IDREGION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Regiones idregion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddatos")
    private Collection<Hoteles> hotelesCollection;

    public DatosHotel() {
    }

    public DatosHotel(BigDecimal id) {
        this.id = id;
    }

    public DatosHotel(BigDecimal id, String direccion, String fono1, String fono2, String coordenadas) {
        this.id = id;
        this.direccion = direccion;
        this.fono1 = fono1;
        this.fono2 = fono2;
        this.coordenadas = coordenadas;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFono1() {
        return fono1;
    }

    public void setFono1(String fono1) {
        this.fono1 = fono1;
    }

    public String getFono2() {
        return fono2;
    }

    public void setFono2(String fono2) {
        this.fono2 = fono2;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Comunas getIdcomuna() {
        return idcomuna;
    }

    public void setIdcomuna(Comunas idcomuna) {
        this.idcomuna = idcomuna;
    }

    public Regiones getIdregion() {
        return idregion;
    }

    public void setIdregion(Regiones idregion) {
        this.idregion = idregion;
    }

    @XmlTransient
    public Collection<Hoteles> getHotelesCollection() {
        return hotelesCollection;
    }

    public void setHotelesCollection(Collection<Hoteles> hotelesCollection) {
        this.hotelesCollection = hotelesCollection;
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
        if (!(object instanceof DatosHotel)) {
            return false;
        }
        DatosHotel other = (DatosHotel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DatosHotel[ id=" + id + " ]";
    }
    
}
