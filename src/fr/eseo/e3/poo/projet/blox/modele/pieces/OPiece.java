package fr.eseo.e3.poo.projet.blox.modele.pieces;

import fr.eseo.e3.poo.projet.blox.modele.BloxException;
import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;

public class OPiece extends Piece {
    public OPiece(Coordonnees coordonnees, Couleur couleur) {
        super(coordonnees, couleur);
       
    }

    @Override
    public void tourner(boolean sensHoraire) throws BloxException{
        // Ne fait rien
    }

    @Override
    protected void setElements(Coordonnees coordonnees, Couleur couleur) {
        this.getElements().clear();
        this.getElements().add(new Element(coordonnees, couleur));
        this.getElements().add(new Element(coordonnees.getAbscisse() + 1, coordonnees.getOrdonnee(), couleur));
        this.getElements().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee() - 1, couleur));
        this.getElements().add(new Element(coordonnees.getAbscisse() + 1, coordonnees.getOrdonnee() - 1, couleur));
    }

    @Override
    public String toString() {
        String str = "OPiece :\n";
        for (Element element : this.getElements())
            str += "\t" + element.toString() + "\n";
        return str;
    }
}
