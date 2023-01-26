/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samyamal
 */
public class Plateau {
    
    private List<Ligne> lignes;

    public Plateau() {
        this.lignes = new ArrayList<>(12);
    }

    public List<Ligne> getPlateau() {
        return lignes;
    }

    public void setPlateau(List<Ligne> plateau) {
        this.lignes = plateau;
    }
    
    public void afficher(){
        int ligne = 0;
        while(!this.lignes.get(ligne).getLigne().isEmpty()){
            this.lignes.get(ligne).afficher();
            System.out.println("Nombre de fiches Noires "+this.lignes.get(ligne).getFicheN()+"Nombre de fiches Blanches "+this.lignes.get(ligne).getFicheB());
        }
    }
}
