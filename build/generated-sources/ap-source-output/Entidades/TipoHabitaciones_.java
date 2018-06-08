package Entidades;

import Entidades.Habitaciones;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T12:59:46")
@StaticMetamodel(TipoHabitaciones.class)
public class TipoHabitaciones_ { 

    public static volatile SingularAttribute<TipoHabitaciones, String> descripcion;
    public static volatile CollectionAttribute<TipoHabitaciones, Habitaciones> habitacionesCollection;
    public static volatile SingularAttribute<TipoHabitaciones, BigInteger> precio;
    public static volatile SingularAttribute<TipoHabitaciones, BigDecimal> id;
    public static volatile SingularAttribute<TipoHabitaciones, BigInteger> cantMinHoras;

}