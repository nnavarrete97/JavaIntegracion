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
@Table(name = "AUX_SERVICIOS_CLIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuxServiciosClientes.findAll", query = "SELECT a FROM AuxServiciosClientes a")
    , @NamedQuery(name = "AuxServiciosClientes.findById", query = "SELECT a FROM AuxServiciosClientes a WHERE a.id = :id")
    , @NamedQuery(name = "AuxServiciosClientes.findByFecha", query = "SELECT a FROM AuxServiciosClientes a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "AuxServiciosClientes.findByHora", query = "SELECT a FROM AuxServiciosClientes a WHERE a.hora = :hora")})
public class AuxServiciosClientes implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    @JoinColumn(name = "IDCLIENTE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Clientes idcliente;
    @JoinColumn(name = "IDSERVICIO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Servicios idservicio;

    public AuxServiciosClientes() {
    }

    public AuxServiciosClientes(BigDecimal id) {
        this.id = id;
    }

    public AuxServiciosClientes(BigDecimal id, Date fecha, Date hora) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Clientes getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
    }

    public Servicios getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(Servicios idservicio) {
        this.idservicio = idservicio;
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
        if (!(object instanceof AuxServiciosClientes)) {
            return false;
        }
        AuxServiciosClientes other = (AuxServiciosClientes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.AuxServiciosClientes[ id=" + id + " ]";
    }
    
}
