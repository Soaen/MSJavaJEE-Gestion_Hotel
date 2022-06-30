package fr.exemple.services;

import fr.exemple.beans.Hotel;

import java.util.Scanner;

public class ServiceExecutor {
    Scanner sc = new Scanner(System.in);
    Hotel ho = new Hotel();
    public int[][] tpAll(){
        int[][] tp = new int[4][6] ;
        tp[0][0] = 100; tp[0][1]=120 ; tp[0][2] = 130; tp[0][3]=150; tp[0][4] = 0;  tp[0][5]=0;
        tp[1][0] = 130; tp[1][1]=160 ; tp[1][2] = 170; tp[1][3]=190; tp[1][4] = 0;  tp[1][5]=0;
        tp[2][0] = 170; tp[2][1]=200 ; tp[2][2] = 210; tp[2][3]=230; tp[2][4] = 270;  tp[2][5]=350;
        tp[3][0] = 200; tp[3][1]=230 ; tp[3][2] = 240; tp[3][3]=260; tp[3][4] = 300;  tp[3][5]=400;
        return tp;
    }
    public String[] tdAll(){
        return new String[]{"Lavabo","WC, television","Cabine douche, television","WC, cabine douche, Television","WC, Salle de bain + douche, Television","2 pièces, WC, Salle de bain + douche, Television" };
    }
    //      Recherche de chambre par numéro
    public void searchNumber(){
        System.out.println("Quel est le numéro de la chambre que vous cherchez ?");
        int tempNbChambr = sc.nextInt();
        ho.searchCh(tempNbChambr, tpAll());
    }

//
//      Recherche de chambre par Description
//

    public void searchDesc(){
        for (int i = 0; i < tdAll().length; i++) {
            System.out.println( i+1 + " : "+ tdAll()[i]);
        }
        System.out.println("Quel sont les options que vous souhaitez ?");
        int tempDesc = sc.nextInt();
        ho.searchDesc(tempDesc, tpAll());
    }


    //      Recherche de Chambre par nombre de personnes

    public void searchNbPers(){
        Hotel h = new Hotel();

        System.out.println("Vous cherchez une chambre de combien de personne ? Max: 4");
        int tempNbPers = sc.nextInt();
        while(tempNbPers < 0 ||tempNbPers > 4){
            System.out.println("Il n'y a que des chambres comprises entre 1 et 4 personnes !");
            System.out.println("Vous cherchez une chambre de combien de personne ? Max: 4");
            tempNbPers = sc.nextInt();
        }
        h.affichCh(tempNbPers,tpAll(),tdAll());
    }
}