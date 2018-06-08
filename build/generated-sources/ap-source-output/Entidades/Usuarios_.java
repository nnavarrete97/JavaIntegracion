package Entidades;

import Entidades.Clientes;
import Entidades.Empleados;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> password;
    public static volatile CollectionAttribute<Usuarios, Empleados> empleadosCollection;
    public static volatile CollectionAttribute<Usuarios, Clientes> clientesCollection;
    public static volatile SingularAttribute<Usuarios, BigDecimal> id;
    public static volatile SingularAttribute<Usuarios, Integer> idtipoUsuario;
    public static volatile SingularAttribute<Usuarios, String> username;

}