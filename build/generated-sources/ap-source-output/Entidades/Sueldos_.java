package Entidades;

import Entidades.Empleados;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(Sueldos.class)
public class Sueldos_ { 

    public static volatile SingularAttribute<Sueldos, BigInteger> monto;
    public static volatile CollectionAttribute<Sueldos, Empleados> empleadosCollection;
    public static volatile SingularAttribute<Sueldos, BigDecimal> id;

}