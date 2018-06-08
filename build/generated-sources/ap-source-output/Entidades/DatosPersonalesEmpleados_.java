package Entidades;

import Entidades.Empleados;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(DatosPersonalesEmpleados.class)
public class DatosPersonalesEmpleados_ { 

    public static volatile SingularAttribute<DatosPersonalesEmpleados, Date> fechaNac;
    public static volatile CollectionAttribute<DatosPersonalesEmpleados, Empleados> empleadosCollection;
    public static volatile SingularAttribute<DatosPersonalesEmpleados, String> direccion;
    public static volatile SingularAttribute<DatosPersonalesEmpleados, BigDecimal> id;
    public static volatile SingularAttribute<DatosPersonalesEmpleados, BigInteger> cargasFamiliares;
    public static volatile SingularAttribute<DatosPersonalesEmpleados, String> fonofijo;
    public static volatile SingularAttribute<DatosPersonalesEmpleados, String> prevision;
    public static volatile SingularAttribute<DatosPersonalesEmpleados, String> fonomovil;
    public static volatile SingularAttribute<DatosPersonalesEmpleados, String> nacionalidad;

}