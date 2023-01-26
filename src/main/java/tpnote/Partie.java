/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;


import java.util.List;
import java.util.Scanner;

/**
 *
 * @author samyamal
 */
public class Partie {
    
    public static String[] couleurs = new  String[] {"jaune", "bleu", "rouge", "vert", "blanc", "noir"};
    
    private Decodeur decodeur;
    private Codeur codeur;
    private String[] code = new String[4];
    private int toursRestants ;
    
    
    /**
     * Méthode permettant de démarrer une partie 
     */
    public void jeu(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quel est le nom du décodeur ?");
        String nomDecodeur = scan.nextLine();
        System.out.println("Quel est le nom du décodeur ?");
       
        
        
        
    }
    
}
