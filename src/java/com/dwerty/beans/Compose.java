/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwerty.beans;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;







/**
 *
 * @author kh
 */

@Entity
@Table(name="compose")
public class Compose{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idcompose;
    private int id_log_logement;
    private int id_chambre_chambre;

    public Compose(int id_log_logement, int id_chambre_chambre) {
        
        this.id_log_logement = id_log_logement;
        this.id_chambre_chambre = id_chambre_chambre;
    }

    public int getIdcompose() {
        return idcompose;
    }

    public void setIdcompose(int idcompose) {
        this.idcompose = idcompose;
    }
    
    

   
    
    

    public int getId_log_logement() {
        return id_log_logement;
    }

    public void setId_log_logement(int id_log_logement) {
        this.id_log_logement = id_log_logement;
    }

    public int getId_chambre_chambre() {
        return id_chambre_chambre;
    }

    public void setId_chambre_chambre(int id_chambre_chambre) {
        this.id_chambre_chambre = id_chambre_chambre;
    }
    
}
