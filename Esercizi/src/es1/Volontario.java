package es1;

public class Volontario implements Entrata {
    private String nome;
    private String cognome;
    private CV curriculum;

    public Volontario(String nome, String cognome, CV curriculum){
        this.nome = nome;
        this.cognome=cognome;
        this.curriculum=curriculum;

    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public CV getCurriculum() {
        return curriculum;
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", curriculum=" + curriculum +
                '}';
    }



    @Override
    public void checkIn(String orario) {
        System.out.println("sono un volontario e attacco alle ore " + orario);
    }


}
