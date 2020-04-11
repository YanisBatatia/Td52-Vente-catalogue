package fr.ipst.vente.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-11T20:23:23")
@StaticMetamodel(Facture.class)
public class Facture_ { 

    public static volatile SingularAttribute<Facture, Date> date;
    public static volatile SingularAttribute<Facture, Double> montantHT;
    public static volatile SingularAttribute<Facture, Boolean> traiteEmise;
    public static volatile SingularAttribute<Facture, Date> dateReglement;
    public static volatile SingularAttribute<Facture, Integer> client;
    public static volatile SingularAttribute<Facture, Double> montantTTC;
    public static volatile SingularAttribute<Facture, Double> montantReglement;
    public static volatile SingularAttribute<Facture, Integer> numFacture;
    public static volatile SingularAttribute<Facture, Double> montantTVA;

}