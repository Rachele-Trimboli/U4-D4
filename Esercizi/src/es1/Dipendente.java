package es1;

import java.util.Random;


public abstract class Dipendente implements Entrata {
    private int matricola;
    protected double stipendio;
    private Dipartimento dipartimento;

    public  Dipendente( Dipartimento dipartimendo){

        this.matricola=getMatricola();
        this.dipartimento=dipartimendo;
        this.stipendio=stipendio;


    }

    public double getStipendio() {
        return stipendio;
    }

    public int getMatricola() {
        return generateMatricola();
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public int generateMatricola(){
        Random random = new Random();
        return random.nextInt(0, 20000);
    }



    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }

    @Override
    public void checkIn(String orario) {
        System.out.println("Sono un dipendente e ho attaccato alle " + orario);
    }
}
