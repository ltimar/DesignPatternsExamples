package Test2_V2_Visitor_Content;

import java.util.List;

public class ListContent implements Content{
    List<Content> listaContents;

    public ListContent(List<Content> lista){
        listaContents = lista;
    }

    @Override
    public String printContent() {
        String multeSiruri = "";
        // concatenez sirurile
        for (int i = 0; i < listaContents.size(); i++) {
            multeSiruri += listaContents.get(i).printContent();
        }
        //listaContents.forEach(el -> multeSiruri+= el.printContent());
        return multeSiruri;
    }
}
