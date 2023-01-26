/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

/**
 * Joueur qui va tenter de trouver le code
 * @author samyamal
 */
public class Decodeur extends Joueur {

    private int points; 
    
    public Decodeur(String nom) {
        super(nom);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    

}
