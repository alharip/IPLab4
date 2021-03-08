// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/8/2021 10:12:23 AM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Comanda.java


class Comanda
{

    Comanda()
    {
    }

    public int getIdComanda()
    {
        return 0;
    }

    public void setIdComanda(int i)
    {
    }

    public Spital getSursa()
    {
        return null;
    }

    public Spital getDestinatie()
    {
        return null;
    }

    public Guvern getSursaSpeciala()
    {
        return null;
    }

    public void setDestinatie(Spital spital)
    {
    }

    public void setSursa(Spital spital)
    {
    }

    public void setSursaSpeciala(Guvern guvern)
    {
    }

    public void newOperation()
    {
    }

    protected Spital sursa;
    protected Spital destinatie;
    protected Guvern sursaSpeciala;
    protected int idComanda;
    protected static Integer numarEntitati;
    protected Marfa cantitate;
}
