package Entidades;

import Entidades.DatosHotel;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(Comunas.class)
public class Comunas_ { 

    public static volatile CollectionAttribute<Comunas, DatosHotel> datosHotelCollection;
    public static volatile SingularAttribute<Comunas, BigDecimal> id;
    public static volatile SingularAttribute<Comunas, String> nombre;

}