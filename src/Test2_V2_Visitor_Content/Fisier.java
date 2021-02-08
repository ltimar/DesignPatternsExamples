package Test2_V2_Visitor_Content;

public class Fisier extends ProjectFile{
    // fisier de cod sursa (.java)
    String numeFisier;
    public Fisier(String nume){
        this.numeFisier = nume;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public String getName() {
        return numeFisier;
    }

    @Override
    public Content getContent() {
        String continut = "continut fisier: " + numeFisier;
        return new StringContent(continut);
    }

    @Override
    public void analizaCod(Analiza ann) {
        if (ann instanceof AnalizaStaticaFisiere){
            ((AnalizaStaticaFisiere) ann).analizeazaCod(this);
        }
    }


}
