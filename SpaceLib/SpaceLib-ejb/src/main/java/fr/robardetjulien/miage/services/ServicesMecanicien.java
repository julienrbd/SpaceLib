/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.robardetjulien.miage.services;

import fr.robardetjulien.miage.metier.GestionMecanicienLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author JulienRobardet
 */
@Stateless
public class ServicesMecanicien implements ServicesMecanicienLocal {

    @EJB
    private GestionMecanicienLocal gestionMecanicien;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
