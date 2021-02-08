package Test2_V2_Visitor_Content;

public class AnalizaStaticaFoldere implements AnalizaFolder{
    @Override
    public void analizeazaCod(Folder ff) {
        System.out.println("Analiza director "+ff.getName());
        MyIterator lauIterator = ff.getLocalIterator();

        while (lauIterator.hasNext()){
            ProjectFile crtItem = (ProjectFile) lauIterator.next();
            if (crtItem instanceof Folder){
                analizeazaCod((Folder) crtItem);
            }
        }
    }
}
