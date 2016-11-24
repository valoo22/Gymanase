/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Valoo
 */
public class Reservation
{
    private int num;
    private String refAsso, refSalle;
    private String DateReserv;
    private Date HeureReserv;
    private static ArrayList<Reservation> lesReservation = new ArrayList();
    SimpleDateFormat sdf = new SimpleDateFormat("HH");

    public Reservation(String refSalle, String DateReserv, Date HeureReserv, String refAsso)
    {
        this.refAsso = refAsso;
        this.refSalle = refSalle;
        this.DateReserv = DateReserv;
        this.HeureReserv = HeureReserv;
    }

    public String getRefAsso()
    {
        return refAsso;
    }

    public String getRefSalle()
    {
        return refSalle;
    }

    public String getDateReserv()
    {
        return DateReserv;
    }

    public Date getHeureReserv()
    {
        return HeureReserv;
    }

    public void setRefAsso(String refAsso)
    {
        this.refAsso = refAsso;
    }

    public void setRefSalle(String refSalle)
    {
        this.refSalle = refSalle;
    }

    public void setDateReserv(String DateReserv)
    {
        this.DateReserv = DateReserv;
    }

    public void setHeureReserv(Date HeureReserv)
    {
        this.HeureReserv = HeureReserv;
    }

    public static ArrayList<Reservation> getLesReservation()
    {
        return lesReservation;
    }

    public static void setLesReservation(Reservation a)
    {
        boolean add = lesReservation.add(a);
    }
    public static int getNbrereservation()
    {
        return lesReservation.size();
    }
    public static Reservation getUneReservation(int r)
    {
        return lesReservation.get(r);
    }
    public String affich() 
    {
        return refAsso + "/" + refSalle + "/" + DateReserv + "/" + sdf.format(HeureReserv);
    }
    
}
