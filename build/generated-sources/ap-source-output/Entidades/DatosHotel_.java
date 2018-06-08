package Entidades;

import Entidades.Comunas;
import Entidades.Hoteles;
import Entidades.Regiones;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(DatosHotel.class)
public class DatosHotel_ { 

    public static volatile SingularAttribute<DatosHotel, String> fono1;
    public static volatile SingularAttribute<DatosHotel, String> direccion;
    public static volatile SingularAttribute<DatosHotel, String> fono2;
    public static volatile SingularAttribute<DatosHotel, BigDecimal> id;
    public static volatile SingularAttribute<DatosHotel, Comunas> idcomuna;
    public static volatile SingularAttribute<DatosHotel, String> coordenadas;
    public static volatile SingularAttribute<DatosHotel, Regiones> idregion;
    public static volatile CollectionAttribute<DatosHotel, Hoteles> hotelesCollection;

}