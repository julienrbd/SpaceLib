/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.robardetjulien.miage.facades;

import fr.robardetjulien.miage.entities.TempsTrajet;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JulienRobardet
 */
@Stateless
public class TempsTrajetFacade extends AbstractFacade<TempsTrajet> implements TempsTrajetFacadeLocal {

    @PersistenceContext(unitName = "fr.robardetjulien.miage_SpaceLib-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TempsTrajetFacade() {
        super(TempsTrajet.class);
    }
    
}
