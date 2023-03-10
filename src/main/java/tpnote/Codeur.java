/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

import java.util.Scanner;

/**
 * Le codeur est le joueur qui choisi 4 couleurs pour que l'autre joueur les devine
 *
 * @author samyamal
 */
public class Codeur extends Joueur {

    private Scanner scan = new Scanner(System.in);

    public Codeur(String nom) {
        super(nom);
    }


    /**
     * Permet de demander au joueur de review l'input du décodeur et de mettre des fiches en conséquence
     * @param ligne
     */
    public void verifie(Ligne ligne){
        System.out.println("Le décodeur a placé les pions suivants :");
        ligne.afficher();
        System.out.println("Le codeur doit placer les fiches.");
        ligne.setFicheN(this.nombreFiches("noires"));
        ligne.setFicheB(this.nombreFiches("blanches"));
    }

    /**
     * Permet au joueur de sélectionner le nombre de fiches qu'il veut mettre sur la ligne du Décodeur
     * @param couleur
     * @return
     */
    public int nombreFiches(String couleur) {

        System.out.println("Entrez le nombre de fiches "+couleur+" : ");
        Integer nombreFiches;
        try {
            nombreFiches = Integer.parseInt(this.scan.nextLine());
            if (!(nombreFiches < 5 && nombreFiches >= 0)) {
                System.out.println("Impossible");
            }else{
                return nombreFiches;
            }
        } catch (NumberFormatException e) {
            System.out.println("Je ne comprends pas.");
        }
        return nombreFiches(couleur);
    }
}
