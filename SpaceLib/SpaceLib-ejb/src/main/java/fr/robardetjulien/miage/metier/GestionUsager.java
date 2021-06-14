/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.robardetjulien.miage.metier;

import fr.robardetjulien.miage.entities.Usager;
import fr.robardetjulien.miage.facades.UsagerFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author JulienRobardet
 */
@Stateless
public class GestionUsager implements GestionUsagerLocal {
    
    @EJB
    private UsagerFacadeLocal usager;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public Long authentifier(String login, String password){
        Usager u = usager.authentifier(login, password);
        return u.getId();
    }
    public Long creerCompte(String nom, String prenom, String login, String password){
        Usager u = new Usager(nom, prenom, login, password);
        usager.create(u);
        return u.getId();
    }
}
