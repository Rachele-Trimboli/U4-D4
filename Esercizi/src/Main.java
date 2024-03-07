import es1.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Dipendente d1 = new Dipendente(2000, Dipartimento.PRODUZIONE);
//        Dipendente d2 = new Dipendente(1500, Dipartimento.AMMINISTRAZIONE);
//        Dipendente d3 = new Dipendente(1200, Dipartimento.VENDITE);
//
//        Dipendente[] arrayDipendenti = {d1, d2, d3};
//        for (int i =0; i< arrayDipendenti.length; i++){
//            System.out.println(arrayDipendenti[i].getMatricola());
//        }

        DipendenteFullTime dft = new DipendenteFullTime(Dipartimento.VENDITE);
        DipendentePartTime dpt = new DipendentePartTime(Dipartimento.AMMINISTRAZIONE);
        Dirigente capo = new Dirigente(Dipartimento.PRODUZIONE);

        CV curriculum = new CV("laureato", "venditore ambulante");
        Volontario volontario = new Volontario("Alberto", "Angela", curriculum );

        System.out.println(dft);
        System.out.println(dpt);
        System.out.println(capo);

//        dft.checkIn("10:30");
//        dpt.checkIn("9:00");
//        capo.checkIn("11:00");

        Entrata[] tutti= {dft, dpt, capo, volontario};
        for(int i = 0; i< tutti.length; i++){
            tutti[i].checkIn("10");
        }


}}