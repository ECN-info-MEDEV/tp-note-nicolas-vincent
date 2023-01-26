/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

/**
 * Représente une ligne du jeu avec la proposition de 4 pions du décodeur et les fiches associés au décodage de cette proposition
 * @author samyamal
 */
public class Ligne {
    
    /**
     * Code proposé par le décodeur, tableau de string avec les noms des couleurs
     */
    private String[] ligne = new String[4];
    
    /**
     * nombre de fiche noires pour la ligne
     */
    private int ficheN ;
    
    /**
     * nombre de fiches blanches pour la ligne
     */
    private int ficheB ;

    /**
     * constructeur complet pour une ligne
     * @param ligne Code proposé par le décodeur
     * @param ficheN nombre de fiche noires pour la ligne
     * @param ficheB nombre de fiches blanches pour la ligne
     */
    public Ligne(String[] ligne, int ficheN, int ficheB) {
        this.ligne = ligne;
        this.ficheN = ficheN;
        this.ficheB = ficheB;
    }
    
    /**
     * constructeur d'une ligne sans indiquer les flags (fiches)
     * ceux-ci seront initialisés à zero
     * @param ligne Code proposé par le décodeur
     */
    public Ligne(String[] ligne) {
        this.ligne = ligne;
    }

    public String[] getLigne() {
        return ligne;
    }

    public int getFicheN() {
        return ficheN;
    }

    public int getFicheB() {
        return ficheB;
    }

    public void setLigne(String[] ligne) {
        this.ligne = ligne;
    }

    public void setFicheN(int ficheN) {
        this.ficheN = ficheN;
    }

    public void setFicheB(int ficheB) {
        this.ficheB = ficheB;
    }
    
    
}
