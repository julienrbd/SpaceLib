/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.robardetjulien.miage.services;

import fr.robardetjulien.miage.metier.GestionUsagerLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author JulienRobardet
 */
@Stateless
public class ServiceUsager implements ServiceUsagerRemote {

    @EJB
    private GestionUsagerLocal gestionUsager;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
