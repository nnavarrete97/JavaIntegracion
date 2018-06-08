package Entidades;

import Entidades.DatosHotel;
import Entidades.Habitaciones;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(Hoteles.class)
public class Hoteles_ { 

    public static volatile SingularAttribute<Hoteles, DatosHotel> iddatos;
    public static volatile CollectionAttribute<Hoteles, Habitaciones> habitacionesCollection;
    public static volatile SingularAttribute<Hoteles, BigDecimal> id;
    public static volatile SingularAttribute<Hoteles, String> nombre;

}