package Test2_V2_Visitor_Content;

public class ConfigurationFile extends ProjectFile{
    @Override
    public void analizaCod(Analiza ann) {

    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Content getContent() {
        return null;
    }
}
