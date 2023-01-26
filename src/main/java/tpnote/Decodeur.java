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
 *
 * @author samyamal
 */
public class Decodeur implements Placer {
    private String nom;

    public Decodeur(String nom){
        this.nom = nom;
    }

    @Override
    public void Placer(Ligne ligne) {
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
     * On vérifie que l'input est dans la liste des couleurs possibles
     */
    private boolean verifInput(String input){

        boolean verif = false;

        if (input.isEmpty()){
            return false;
        }

        for (int i = 0 ; i < Partie.couleurs.length ; i++){
            if (input == Partie.couleurs[i]){
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
        for (int i = 0 ; i < Partie.couleurs.length ; i++){
            System.out.println(Partie.couleurs[i]);
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public static void main(String[] args) {
        System.out.println("Hello");

        System.out.println(Partie.couleurs.length);
    }
}
