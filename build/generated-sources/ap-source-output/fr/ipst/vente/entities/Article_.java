package fr.ipst.vente.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-08T14:27:00")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, String> reference;
    public static volatile SingularAttribute<Article, String> categorie;
    public static volatile SingularAttribute<Article, Short> seuilCritique;
    public static volatile SingularAttribute<Article, Double> prix;
    public static volatile SingularAttribute<Article, Integer> fournisseur;
    public static volatile SingularAttribute<Article, Short> stock;
    public static volatile SingularAttribute<Article, String> nom;
    public static volatile SingularAttribute<Article, Double> tva;

}