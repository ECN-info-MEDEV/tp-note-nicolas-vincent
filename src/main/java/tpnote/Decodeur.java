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

        //ligne.placePion(listePion);

    }

    private boolean verifInput(String input){

        if (input.isEmpty()){
            return false;
        }

        String couleur = Partie.couleurs[0];

        // TODO : écrire la vérif

        return true;
    }

    private void afficheCouleursDispo(){
        System.out.println("Cette couleur n'existe pas, choisissez dans :");

        // TODO : affiche les couleurs possibles
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
