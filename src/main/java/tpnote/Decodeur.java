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

    /**
     * constructeur avec nom
     * @param nom
     */
    public Decodeur(String nom) {
        super(nom);
    }    
    
    /**
     * contructeur avec nom et nombre de points
     * @param nom
     * @param points 
     */
    public Decodeur(String nom,int points) {
        super(nom,points);
        
    }    

}
