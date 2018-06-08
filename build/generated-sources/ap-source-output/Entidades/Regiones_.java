package Entidades;

import Entidades.DatosHotel;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(Regiones.class)
public class Regiones_ { 

    public static volatile CollectionAttribute<Regiones, DatosHotel> datosHotelCollection;
    public static volatile SingularAttribute<Regiones, String> sigla;
    public static volatile SingularAttribute<Regiones, BigDecimal> id;
    public static volatile SingularAttribute<Regiones, String> nombre;

}