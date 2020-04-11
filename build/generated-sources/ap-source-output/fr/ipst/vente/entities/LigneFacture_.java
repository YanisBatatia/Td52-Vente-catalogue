package fr.ipst.vente.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-08T14:27:00")
@StaticMetamodel(LigneFacture.class)
public class LigneFacture_ { 

    public static volatile SingularAttribute<LigneFacture, Integer> numLigne;
    public static volatile SingularAttribute<LigneFacture, String> refArticle;
    public static volatile SingularAttribute<LigneFacture, Integer> numFacture;
    public static volatile SingularAttribute<LigneFacture, Short> quantite;

}