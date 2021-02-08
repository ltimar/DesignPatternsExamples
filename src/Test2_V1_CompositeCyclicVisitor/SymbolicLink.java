package Test2_V1_CompositeCyclicVisitor;

public class SymbolicLink extends Entity{
    Entity link;

    public SymbolicLink(String caleSymbolicLink, Entity entityVizat){
        super(caleSymbolicLink);
        link = entityVizat;
    }

    @Override
    public double getSize() {
        return link.getSize();
    }

    @Override
    public void runProgramm(IProgram prog) {
        System.out.println("Symbolic lionk "+ this.getPath() +" indica spre "+ link);
    }
}
