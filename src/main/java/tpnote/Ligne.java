/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

import java.util.List;

/**
 * Représente une ligne du jeu avec la proposition de 4 pions du décodeur et les fiches associés au décodage de cette proposition
 * @author samyamal
 */
public class Ligne {
    
    /**
     * Code proposé par le décodeur, tableau de string avec les noms des couleurs
     */
    private List<String> listPion;
    
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
     * @param listPion Code proposé par le décodeur
     * @param ficheN nombre de fiche noires pour la ligne
     * @param ficheB nombre de fiches blanches pour la ligne
     */
    public Ligne(List<String> listPion, int ficheN, int ficheB) {
        this.listPion = listPion;
        this.ficheN = ficheN;
        this.ficheB = ficheB;
    }
    
    /**
     * constructeur d'une ligne sans indiquer les flags (fiches)
     * ceux-ci seront initialisés à zero
     * @param listPion Code proposé par le décodeur
     */
    public Ligne(List<String> listPion) {
        this.listPion = listPion;
    }

    public void placePion(List<String> listPion){
        this.listPion = listPion;
    }

    public List<String> getLigne() {
        return listPion;
    }

    public int getFicheN() {
        return ficheN;
    }

    public int getFicheB() {
        return ficheB;
    }

    public void setLigne(List<String> listPion) {
        this.listPion = listPion;
    }

    public void setFicheN(int ficheN) {
        this.ficheN = ficheN;
    }

    public void setFicheB(int ficheB) {
        this.ficheB = ficheB;
    }
    
    //méthodes
    
    /**
     * vérifie si la ligne contient 4 fiches noires (=code trouvé)
     * @return true si le bon code a été trouvé
     */
    public boolean verifLigneComplete(){
        return ficheN == 4;
    }
    
    /**
     * place les fiches dans la ligne
     * @param n nombre de fiche noires données par l'utilisateur
     * @param b  nombre de fiches blanches
     */
    public void placeFiche(int n, int b) {
        this.ficheN = n;
        this.ficheB = b;
    }
}
