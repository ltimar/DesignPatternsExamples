package Test2_V2_Visitor_Content;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Folder extends ProjectFile{
    private String numeFolder;
    private List<ProjectFile> listaComponente = new ArrayList<>();

    public Folder(String nume){
        this.numeFolder = nume;
    }
    public void addToFolder(ProjectFile pr){
        listaComponente.add(pr);
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public String getName() {
        return this.numeFolder;
    }

    @Override
    public Content getContent() {
        ListContent myListContent = new ListContent(listaComponente.stream().
                map(projectFile -> projectFile.getContent()).collect(Collectors.toList()));

        return myListContent;
    }

    @Override
    public void analizaCod(Analiza ann) {
        if (ann instanceof AnalizaFolder){
            ((AnalizaFolder) ann).analizeazaCod(this);
        }
    }

    public MyIterator getLocalIterator() { return  new LocalFolderIterator(); }

    private class LocalFolderIterator implements MyIterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < listaComponente.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return listaComponente.get(index++);
            }
            return null;
        }
    }
}
