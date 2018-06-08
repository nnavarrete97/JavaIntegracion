package Entidades;

import Entidades.AuxServiciosClientes;
import Entidades.Reservas;
import Entidades.Usuarios;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T12:59:46")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile CollectionAttribute<Clientes, AuxServiciosClientes> auxServiciosClientesCollection;
    public static volatile SingularAttribute<Clientes, String> appaterno;
    public static volatile CollectionAttribute<Clientes, Reservas> reservasCollection;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile SingularAttribute<Clientes, String> fono;
    public static volatile SingularAttribute<Clientes, BigDecimal> id;
    public static volatile SingularAttribute<Clientes, Character> sexo;
    public static volatile SingularAttribute<Clientes, String> nombre;
    public static volatile SingularAttribute<Clientes, String> apmaterno;
    public static volatile SingularAttribute<Clientes, String> nacionalidad;
    public static volatile SingularAttribute<Clientes, Usuarios> idusuario;

}