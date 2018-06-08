package Entidades;

import Entidades.Hoteles;
import Entidades.Reservas;
import Entidades.TipoHabitaciones;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(Habitaciones.class)
public class Habitaciones_ { 

    public static volatile SingularAttribute<Habitaciones, Character> reservada;
    public static volatile CollectionAttribute<Habitaciones, Reservas> reservasCollection;
    public static volatile SingularAttribute<Habitaciones, BigInteger> cantBanos;
    public static volatile SingularAttribute<Habitaciones, Hoteles> idhotel;
    public static volatile SingularAttribute<Habitaciones, BigDecimal> id;
    public static volatile SingularAttribute<Habitaciones, BigInteger> cantCamas;
    public static volatile SingularAttribute<Habitaciones, TipoHabitaciones> idtipo;
    public static volatile SingularAttribute<Habitaciones, String> nombre;

}