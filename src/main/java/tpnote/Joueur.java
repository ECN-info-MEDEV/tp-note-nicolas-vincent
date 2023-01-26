/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * classe abstraite représentant les joueurs
 * @author samyamal
 */
public abstract class Joueur {

    /**
     * nom du joueur
     */
    private String nom;

    /**
     * constructeur de joueur
     * @param nom 
     */
    protected Joueur(String nom){
        this.nom = nom;
    }

    /**
     * permet à un joueur de placier 4 pions de couleurs
     * (utilisé pour setup le jeu par le codeur au début)
     * @param ligne 
     */
    public void placer(Ligne ligne) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(nom + ", place les pions sur le plateau un par un");

            String input;
            List<String> listePion = new ArrayList<>();
            boolean inputValide;

            for (int i = 0 ; i < 4 ; i++){

                    inputValide = false;

                    while(!inputValide){

                            System.out.print(" " + i + " : ");
                            input = scanner.next();

                            if (verifInput(input)){
                                    inputValide = true;
                                    listePion.add(input);
                            } else {
                                    afficheCouleursDispo();
                            }
                    }
            }
            ligne.placePion(listePion);
    }

    /**
     * On vérifie que l'input de l'utilisateur est dans la liste des couleurs possibles
     */
    private boolean verifInput(String input){

            boolean verif = false;

            if (input.isEmpty()){
            return false;
            }

        for (String couleur : Partie.couleurs) {
            if (input.equals(couleur)) {
                verif = true;
            }
        }

            return verif;
            }

    /**
     * Affiche les couleurs qu'il est possible de jouer
     */
    private void afficheCouleursDispo(){
        System.out.println("Cette couleur n'existe pas, choisissez dans :");
        for (String couleur : Partie.couleurs) {
            System.out.println(couleur);
        }
    }

    public String getNom() {
        return nom;
        }

    public void setNom(String nom) {
        this.nom = nom;
        }
}
