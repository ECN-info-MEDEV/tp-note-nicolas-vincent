
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;


import java.util.HashSet;
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
        this.code = new Ligne();
        this.codeur.placer(this.code);
        this.plateau = new Plateau();
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
     * Méthode permettant d'effectuer les manches successives d'une partie
     * Après une paire de manche, on vérifie les points des joueurs
     */
    public void jeu(){
        int nbManches = 1;
        while(this.codeur.getPoints()==this.decodeur.getPoints()){
            for(int i=0;i<2;i++){
                System.out.println("Début de la Manche "+nbManches+" \n");
                this.manche();
                //Changement de rôle
                Decodeur decodeur_temp = new Decodeur(this.codeur.getNom(),this.codeur.getPoints());
                this.codeur.setNom(this.decodeur.getNom());
                this.codeur.setPoints(this.decodeur.getPoints());
                this.decodeur = decodeur_temp;
                nbManches += 1;
                System.out.println("Le codeur choisit la combinaison");
                this.code = new Ligne();
                this.codeur.placer(this.code);
                this.plateau = new Plateau();
            }
            
        }
        System.out.println("Résultats \n");
        System.out.println(this.codeur.getNom()+" a "+this.codeur.getPoints()+" \n");
        System.out.println(this.decodeur.getNom()+" a "+this.decodeur.getPoints()+" \n");
        
        
    }
    
    /**
     * Méthode permettant de démarrer une manche
     */
    public void manche(){
        
        System.out.println("Premier tour");
        System.out.println("Au tour du décodeur");
        this.setToursRestants(12);
        
        this.decodeur.placer(this.plateau.getPlateau().get(12 - this.toursRestants));
        
        System.out.println("Au tour du codeur");
        this.codeur.verifie(this.plateau.getPlateau().get(12 - this.toursRestants));
        
       
        //tant qu'il reste des tours et que le décodeur n'a pas découvert
        while (!this.plateau.getPlateau().get(12-this.toursRestants).verifLigneComplete() && this.toursRestants > 0){
            this.toursRestants -= 1;
            System.out.println("Il reste "+this.getToursRestants()+" tours.");
            
            System.out.println("Au tour du décodeur");
            this.decodeur.placer(this.plateau.getPlateau().get(12 - this.toursRestants));
        
            System.out.println("Au tour du codeur");
            this.codeur.verifie(this.plateau.getPlateau().get(12 - this.toursRestants));
        }
        this.toursRestants -= 1;
        if (this.toursRestants>0){
            System.out.println("Victoire du décodeur");
            this.codeur.setPoints(this.codeur.getPoints() + 12 - this.toursRestants);
        }else{
            System.out.println("Défaite du décodeur");
            this.codeur.setPoints(this.codeur.getPoints() + 12);
        }
        System.out.println("Fin de la manche : \n"+ this.codeur.getNom()+" a "+this.codeur.getPoints()+"points. \n"+this.decodeur.getNom()+" a "+this.decodeur.getPoints()+"points. \n");
    }
            

        
        
       
        
        
        
}
    

