/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ipst.vente.vues;

import fr.ipst.vente.entities.Article;
import fr.ipst.vente.entities.LignePanier;
import fr.ipst.vente.entities.Panier;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author yanis.batatia
 */
public class VuePanier {

    public void afficher(PrintWriter out, Panier panier) {
        out.println(panier);

        // SI panier est null dire que le panier est vide
        out.println("<html>");

        out.println("<head>");
        out.println("<Title>Vente Directe");
        out.println("</Title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<div id='baniere'>");
        out.println("<h1>Panier</h1>");
        out.println("</div>");

        out.println("<div id='Menu'>");
        out.println("<a href='/Td52-Vente-catalogue'>Retour</a>");
        out.println("</h1>");
        out.println("</div>");

        out.println("<table border=1>");
        for (LignePanier lignePanier : panier) {
            out.println("<tr>");
            // supprimer action=6 ref
            // changer quantite action=5 nouvelleQuantite ref

            out.println("<td>" + lignePanier.getArticle().getNom() + "</td>");
            out.println("<td>" + lignePanier.getArticle().getCategorie() + "</td>");
            out.println("<td><a href='controleur?action=5&ref=" + lignePanier.getArticle().getReference() + "&qty=" + lignePanier.getQuantite() + "'>Changer Quantite</a></td>");
            out.println("<td><a href='controleur?action=6&ref=" + lignePanier.getArticle().getReference() + "'>Supprimer</a></td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
