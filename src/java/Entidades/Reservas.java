/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "RESERVAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservas.findAll", query = "SELECT r FROM Reservas r")
    , @NamedQuery(name = "Reservas.findById", query = "SELECT r FROM Reservas r WHERE r.id = :id")
    , @NamedQuery(name = "Reservas.findByCantPersonas", query = "SELECT r FROM Reservas r WHERE r.cantPersonas = :cantPersonas")
    , @NamedQuery(name = "Reservas.findByFechaInicio", query = "SELECT r FROM Reservas r WHERE r.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Reservas.findByFechaFinal", query = "SELECT r FROM Reservas r WHERE r.fechaFinal = :fechaFinal")})
public class Reservas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "CANT_PERSONAS")
    private BigInteger cantPersonas;
    @Basic(optional = false)
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @JoinColumn(name = "IDCLIENTE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Clientes idcliente;
    @JoinColumn(name = "IDHABITACION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Habitaciones idhabitacion;

    public Reservas() {
    }

    public Reservas(BigDecimal id) {
        this.id = id;
    }

    public Reservas(BigDecimal id, BigInteger cantPersonas, Date fechaInicio, Date fechaFinal) {
        this.id = id;
        this.cantPersonas = cantPersonas;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(BigInteger cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Clientes getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
    }

    public Habitaciones getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(Habitaciones idhabitacion) {
        this.idhabitacion = idhabitacion;
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
        if (!(object instanceof Reservas)) {
            return false;
        }
        Reservas other = (Reservas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Reservas[ id=" + id + " ]";
    }
    
}
