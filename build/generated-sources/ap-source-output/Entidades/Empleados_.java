package Entidades;

import Entidades.Cargos;
import Entidades.DatosPersonalesEmpleados;
import Entidades.Sueldos;
import Entidades.Usuarios;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T12:59:46")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, String> appaterno;
    public static volatile SingularAttribute<Empleados, DatosPersonalesEmpleados> iddatos;
    public static volatile SingularAttribute<Empleados, Cargos> idcargo;
    public static volatile SingularAttribute<Empleados, Date> fechaContrato;
    public static volatile SingularAttribute<Empleados, Sueldos> idsueldo;
    public static volatile SingularAttribute<Empleados, BigDecimal> id;
    public static volatile SingularAttribute<Empleados, String> profesion;
    public static volatile SingularAttribute<Empleados, String> nombre;
    public static volatile SingularAttribute<Empleados, Usuarios> idusuario;

}