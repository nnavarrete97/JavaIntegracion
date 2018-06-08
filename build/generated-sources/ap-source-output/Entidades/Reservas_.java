package Entidades;

import Entidades.Clientes;
import Entidades.Habitaciones;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T12:59:46")
@StaticMetamodel(Reservas.class)
public class Reservas_ { 

    public static volatile SingularAttribute<Reservas, Habitaciones> idhabitacion;
    public static volatile SingularAttribute<Reservas, Date> fechaInicio;
    public static volatile SingularAttribute<Reservas, Date> fechaFinal;
    public static volatile SingularAttribute<Reservas, BigDecimal> id;
    public static volatile SingularAttribute<Reservas, BigInteger> cantPersonas;
    public static volatile SingularAttribute<Reservas, Clientes> idcliente;

}