package Test2_V2_Visitor_Content;

public class AnalizaStaticaFisiere implements AnalizaFisier{

    @Override
    public void analizeazaCod(Fisier ff) {
        System.out.println("Se analizeaza fisierul "+ff.getName());
    }
}
