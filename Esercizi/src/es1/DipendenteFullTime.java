package es1;

public class DipendenteFullTime extends Dipendente{



    public DipendenteFullTime(Dipartimento dipartimendo) {
        super( dipartimendo);
        this.stipendio=calculateSalary();

    }



    @Override
    public double calculateSalary() {
        int giorniLavorati = 22;
        return 60*giorniLavorati;
    }



}
