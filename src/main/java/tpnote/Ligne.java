/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

/**
 *
 * @author samyamal
 */
public class Ligne {
    
        private String[] ligne = new String[4];
    private int ficheN ;
    private int ficheB ;

    public Ligne(String[] ligne, int ficheN, int ficheB) {
        this.ligne = ligne;
        this.ficheN = ficheN;
        this.ficheB = ficheB;
    }
    
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
