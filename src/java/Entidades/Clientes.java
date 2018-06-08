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
@Table(name = "CLIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")
    , @NamedQuery(name = "Clientes.findById", query = "SELECT c FROM Clientes c WHERE c.id = :id")
    , @NamedQuery(name = "Clientes.findByNombre", query = "SELECT c FROM Clientes c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Clientes.findByAppaterno", query = "SELECT c FROM Clientes c WHERE c.appaterno = :appaterno")
    , @NamedQuery(name = "Clientes.findByApmaterno", query = "SELECT c FROM Clientes c WHERE c.apmaterno = :apmaterno")
    , @NamedQuery(name = "Clientes.findBySexo", query = "SELECT c FROM Clientes c WHERE c.sexo = :sexo")
    , @NamedQuery(name = "Clientes.findByNacionalidad", query = "SELECT c FROM Clientes c WHERE c.nacionalidad = :nacionalidad")
    , @NamedQuery(name = "Clientes.findByFono", query = "SELECT c FROM Clientes c WHERE c.fono = :fono")
    , @NamedQuery(name = "Clientes.findByDireccion", query = "SELECT c FROM Clientes c WHERE c.direccion = :direccion")})
public class Clientes implements Serializable {

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
    @Column(name = "APPATERNO")
    private String appaterno;
    @Basic(optional = false)
    @Column(name = "APMATERNO")
    private String apmaterno;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private Character sexo;
    @Basic(optional = false)
    @Column(name = "NACIONALIDAD")
    private String nacionalidad;
    @Basic(optional = false)
    @Column(name = "FONO")
    private String fono;
    @Basic(optional = false)
    @Column(name = "DIRECCION")
    private String direccion;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Usuarios idusuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcliente")
    private Collection<AuxServiciosClientes> auxServiciosClientesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcliente")
    private Collection<Reservas> reservasCollection;

    public Clientes() {
    }

    public Clientes(BigDecimal id) {
        this.id = id;
    }

    public Clientes(BigDecimal id, String nombre, String appaterno, String apmaterno, Character sexo, String nacionalidad, String fono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.fono = fono;
        this.direccion = direccion;
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

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuarios getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuarios idusuario) {
        this.idusuario = idusuario;
    }

    @XmlTransient
    public Collection<AuxServiciosClientes> getAuxServiciosClientesCollection() {
        return auxServiciosClientesCollection;
    }

    public void setAuxServiciosClientesCollection(Collection<AuxServiciosClientes> auxServiciosClientesCollection) {
        this.auxServiciosClientesCollection = auxServiciosClientesCollection;
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
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Clientes[ id=" + id + " ]";
    }
    
}
