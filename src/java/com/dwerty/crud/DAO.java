
/*

   This class for all operations possible between 
   the database and our system
   
   By : DGI | Dwery Group Inc.
*/

package com.dwerty.crud;

import com.dwerty.beans.Chambre;
import com.dwerty.beans.ImageLogement;
import com.dwerty.beans.Logement;
import com.dwerty.beans.Compose;
import com.dwerty.beans.Evaluer;
import com.dwerty.beans.Notes;
import com.dwerty.beans.Proprietaire;
import com.dwerty.beans.User;
import com.dwerty.beans.UserSession;
import java.util.ArrayList;
import java.util.List;


public interface DAO {
    
    /*
        Gestion des users
    */
    
        void addUser(User user);
        
        void addProprietaire(Proprietaire proprietaire);

        void deleteUser(User user);

        void updateUser();

        List testSessionUser(UserSession usersession);
        
    
    /*
        Gestion des offres
    */
        
        int addLogement(Logement logement);
        
        int []addChambre(ArrayList<Chambre> chambre,int logement);
        
        int addCompose(int logid,int [] chambre);
        
        int addImage(ImageLogement [] imagelogement);
        
        List[] getOffre();
        
        List[] getDetaisOffre(String titreOffre);
        
    /*
        Gestion les offres d'un propritaires   
     */
        
        List[] getOffrePro(String cin_pro);
        int updateOffre(Logement logement,String titreoffre);
        List[] getOffreSearch(String ville,double maxprix,double minprix,int nbrlit);
        
        
    /*
     *  Gestion les demandes de logement
     */
        
        
        
    /**
     *  Save commentaire and evaluation
     */
        int saveCommentaire(Evaluer ev);
        int getEvaluation();
        List[] getNotesOffre(String titre);
        
        String[] getUser(String cin);
}
