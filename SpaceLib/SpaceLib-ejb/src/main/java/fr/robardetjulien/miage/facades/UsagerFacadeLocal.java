/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.robardetjulien.miage.facades;

import fr.robardetjulien.miage.entities.Usager;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author JulienRobardet
 */
@Local
public interface UsagerFacadeLocal {

    void create(Usager usager);

    void edit(Usager usager);

    void remove(Usager usager);

    Usager find(Object id);

    List<Usager> findAll();

    List<Usager> findRange(int[] range);

    int count();
    
    Usager authentifier(String login, String password);
    
}
