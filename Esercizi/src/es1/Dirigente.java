package es1;

public class Dirigente extends Dipendente{
    public Dirigente(Dipartimento dipartimendo) {
        super(dipartimendo);
        this.stipendio=calculateSalary();

    }

    @Override
    public double calculateSalary() {

        int giorniLavorati= 22;
        return 100*giorniLavorati;
    }
}
