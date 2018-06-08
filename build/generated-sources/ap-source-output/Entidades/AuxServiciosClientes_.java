package Entidades;

import Entidades.Clientes;
import Entidades.Servicios;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(AuxServiciosClientes.class)
public class AuxServiciosClientes_ { 

    public static volatile SingularAttribute<AuxServiciosClientes, Date> fecha;
    public static volatile SingularAttribute<AuxServiciosClientes, Date> hora;
    public static volatile SingularAttribute<AuxServiciosClientes, BigDecimal> id;
    public static volatile SingularAttribute<AuxServiciosClientes, Clientes> idcliente;
    public static volatile SingularAttribute<AuxServiciosClientes, Servicios> idservicio;

}