package Test2_V2_Visitor_Content;

public class Main {
    public static void main(String arghs[]){
        ProjectFile f1 = new Fisier("client.java");
        ProjectFile f2 = new Fisier("produs.java");

        Folder folder = new Folder("javaApp");
        folder.addToFolder(f1);
        folder.addToFolder(f2);

        doSomething(folder);
        doSomething(f1);
    }

    public static void doSomething(ProjectFile  pp){
        System.out.println(pp.getContent().printContent());

//        if (pp instanceof Fisier)
//            //System.out.println(((String) pp.getContent()).toUpperCase());
//            System.out.println(pp.getContent().toUpperCase());
//        else
//            if (pp instanceof Folder){
//
//            }
    }
}
