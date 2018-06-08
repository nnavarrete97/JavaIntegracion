package Entidades;

import Entidades.AuxServiciosClientes;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile SingularAttribute<Servicios, String> descripcion;
    public static volatile CollectionAttribute<Servicios, AuxServiciosClientes> auxServiciosClientesCollection;
    public static volatile SingularAttribute<Servicios, BigInteger> precio;
    public static volatile SingularAttribute<Servicios, Date> horaInicioDisponible;
    public static volatile SingularAttribute<Servicios, BigDecimal> id;
    public static volatile SingularAttribute<Servicios, Date> horaFinalDisponible;
    public static volatile SingularAttribute<Servicios, String> nombre;

}