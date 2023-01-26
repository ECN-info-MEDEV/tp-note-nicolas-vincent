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
 * Joueur qui va tenter de trouver le code
 * @author samyamal
 */
public class Decodeur extends Joueur {

    public Decodeur(String nom) {
        super(nom);
    }

    /**
     * main utilisé lors du dev pour test
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("Hello");

        Decodeur decodeur = new Decodeur("Nicolas");
        decodeur.placer(new Ligne());
    }
}
