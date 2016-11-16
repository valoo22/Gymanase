/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author Valoo
 */
public class Association
{
    private final String RefAsso, Ville, Adresse, NomRepsonsable;
    //Je déclare l'entité Association
    public Association(String RefAsso, String Ville, String Adresse, String NomRepsonsable)
    {
        this.RefAsso = RefAsso;
        this.Ville = Ville;
        this.Adresse = Adresse;
        this.NomRepsonsable = NomRepsonsable;
    }

    public String getRefAsso()
    {
        return RefAsso;
    }

    public String getVille()
    {
        return Ville;
    }

    public String getAdresse()
    {
        return Adresse;
    }

    public String getNomRepsonsable()
    {
        return NomRepsonsable;
    }

    @Override
    public String toString()
    {
        return "l'Association avec la référence : " + RefAsso + " situé a : " + Adresse + " a " + Ville + " et dirigée par : " + NomRepsonsable;
    }
    
}
