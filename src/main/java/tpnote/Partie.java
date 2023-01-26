
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
    private Ligne code ;
    private int toursRestants ;
    private Plateau plateau;
    
    
    
    public Partie(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quel est le nom du décodeur ?");
        String nomDecodeur = scan.nextLine();
        System.out.println("Le nom du décodeur est : "+nomDecodeur+". Quel est le nom du codeur ?");
        String nomCodeur = scan.nextLine();
        System.out.println("Le nom du codeur est : "+nomDecodeur+".");
        
        this.decodeur = new Decodeur(nomDecodeur);
        this.codeur = new Codeur(nomCodeur);
        
        this.toursRestants = 12;
         
        System.out.println("Le codeur choisit la combinaison");
        this.codeur.placer(this.code);
    }

    public static String[] getCouleurs() {
        return couleurs;
    }

    public Decodeur getDecodeur() {
        return decodeur;
    }

    public Codeur getCodeur() {
        return codeur;
    }

    public Ligne getCode() {
        return code;
    }

    public int getToursRestants() {
        return toursRestants;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public static void setCouleurs(String[] couleurs) {
        Partie.couleurs = couleurs;
    }

    public void setDecodeur(Decodeur decodeur) {
        this.decodeur = decodeur;
    }

    public void setCodeur(Codeur codeur) {
        this.codeur = codeur;
    }

    public void setCode(Ligne code) {
        this.code = code;
    }

    public void setToursRestants(int toursRestants) {
        this.toursRestants = toursRestants;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }
    
    
    /**
     * Méthode permettant de démarrer les tours de la partie jusqu'à la victoire ou la défaite
     */
    public void jeu(){
        
        System.out.println("Premier tour");
        System.out.println("Au tour du décodeur");
        this.decodeur.placer(this.plateau.getPlateau()[12 - this.toursRestants]);
        
        System.out.println("Au tour du codeur");
        this.codeur.verifie(this.plateau.getPlateau()[12 - this.toursRestants]);
        
       
        //tant qu'il reste des tours et que le décodeur n'a pas découvert
        while (!this.plateau.getPlateau()[12-this.toursRestants].verifLigneComplete() && this.toursRestants > 0){
            this.toursRestants -= 1;
            System.out.println("Il reste "+this.getToursRestants());
            
            System.out.println("Au tour du décodeur");
            this.decodeur.placer(this.plateau.getPlateau()[12 - this.toursRestants]);
        
            System.out.println("Au tour du codeur");
            this.codeur.verifie(this.plateau.getPlateau()[12 - this.toursRestants]);
        }
        if (this.toursRestants>0){
            System.out.println("Victoire du décodeur");
        }else{
            System.out.println("Défaite du décodeur");
        }
    }
            

        
        
       
        
        
        
}
    

