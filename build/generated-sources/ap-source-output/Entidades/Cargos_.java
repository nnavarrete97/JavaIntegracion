package Entidades;

import Entidades.Empleados;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(Cargos.class)
public class Cargos_ { 

    public static volatile CollectionAttribute<Cargos, Empleados> empleadosCollection;
    public static volatile SingularAttribute<Cargos, BigDecimal> id;
    public static volatile SingularAttribute<Cargos, String> nombre;

}