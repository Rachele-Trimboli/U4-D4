package es1;

public class DipendentePartTime extends Dipendente{

    public DipendentePartTime(Dipartimento dipartimendo) {
        super(dipartimendo);
        this.stipendio=calculateSalary();
    }

    @Override
    public double calculateSalary() {
        int oreLavorate = 27;
        return 10*oreLavorate;
    }
}
