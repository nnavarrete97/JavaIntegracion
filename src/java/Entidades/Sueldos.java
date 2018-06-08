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
@Table(name = "SUELDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sueldos.findAll", query = "SELECT s FROM Sueldos s")
    , @NamedQuery(name = "Sueldos.findById", query = "SELECT s FROM Sueldos s WHERE s.id = :id")
    , @NamedQuery(name = "Sueldos.findByMonto", query = "SELECT s FROM Sueldos s WHERE s.monto = :monto")})
public class Sueldos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "MONTO")
    private BigInteger monto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsueldo")
    private Collection<Empleados> empleadosCollection;

    public Sueldos() {
    }

    public Sueldos(BigDecimal id) {
        this.id = id;
    }

    public Sueldos(BigDecimal id, BigInteger monto) {
        this.id = id;
        this.monto = monto;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getMonto() {
        return monto;
    }

    public void setMonto(BigInteger monto) {
        this.monto = monto;
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
        if (!(object instanceof Sueldos)) {
            return false;
        }
        Sueldos other = (Sueldos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Sueldos[ id=" + id + " ]";
    }
    
}
