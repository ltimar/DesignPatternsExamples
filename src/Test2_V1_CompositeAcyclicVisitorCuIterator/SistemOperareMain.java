package Test2_V1_CompositeAcyclicVisitorCuIterator;

public class SistemOperareMain {
    public static void main(String args[]){
        Entity f1 = new Fisier("f1","fol1\\f1");
        Fisier f2 = new Fisier("f2","fol1\\f2");
        Entity f3 = new Fisier("f3","fol1\\f3");

        //Entity f4 = new Fisier("f4","fol1\\subfol");  // parte de test - f4 facea parte din subfolder subfol
        // subfol.adauga(f4);
        Fisier f4 = new Fisier("f4","fol1\\subfol\\f4");

        Folder subfol = new Folder("subfol");
        Entity simbLink = new SymbolicLink("fol1\\subfol\\symbolicLink1",f4);
        subfol.adauga(simbLink);

        Folder fol1 = new Folder("\\");
        fol1.adauga(f1,f2,f3,subfol,f4);

        System.out.println("Dimeniunea intregului folder este: "+ fol1.getSize());

        DirProgram program1 = new DirProgram("dir command");
        program1.ruleazaProgram(f4);
        program1.ruleazaProgram(fol1);

        ShowFileContentProgram programPtrFisiere = new ShowFileContentProgram("afiseaza continut fisier");
        programPtrFisiere.ruleazaProgram(f4);
        programPtrFisiere.ruleazaProgram(f2);

        System.out.println("Dir recursiv start ");
        RecursuvDirProgram dirRecursiv = new RecursuvDirProgram();
        dirRecursiv.ruleazaProgram(fol1);


    }
}
