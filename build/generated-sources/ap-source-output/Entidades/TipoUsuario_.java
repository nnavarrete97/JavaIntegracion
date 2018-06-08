package Entidades;

import Entidades.Usuarios;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-08T01:52:17")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile CollectionAttribute<TipoUsuario, Usuarios> usuariosCollection;
    public static volatile SingularAttribute<TipoUsuario, BigDecimal> id;
    public static volatile SingularAttribute<TipoUsuario, String> nombrePerfil;

}