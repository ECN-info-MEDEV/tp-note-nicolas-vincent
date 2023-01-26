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
public class Plateau {
    
    private Ligne[] lignes = new Ligne[12];

    public Plateau() {
    }

    public Ligne[] getPlateau() {
        return lignes;
    }

    public void setPlateau(Ligne[] plateau) {
        this.lignes = plateau;
    }
}
