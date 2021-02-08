package Test2_V1_CompositeCyclicVisitor;

public class DirProgram implements IProgram {
    String numeProgram;
    public DirProgram(String numePr) {
        this.numeProgram = numePr;
    }

    @Override
    public void ruleazaProgram(Folder ff) {
        System.out.println("dir :: nume folder = "+ ff.getPath());
        System.out.println("continut  = ");
         ff.componenteFolder.forEach(entity -> System.out.println(entity.getPath()));
    }

    @Override
    public void ruleazaProgram(Fisier ff) {
        System.out.println("dir :: nume fisier = "+ ff.getPath());
    }

}
