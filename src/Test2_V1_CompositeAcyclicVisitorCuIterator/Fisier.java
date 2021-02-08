package Test2_V1_CompositeAcyclicVisitorCuIterator;

public class Fisier extends Entity{
    String content;

    public Fisier(String nn,String cale) {
        super(cale);
        this.content = nn;
    }

    @Override
    public void runProgramm(Program program) {
        if (program instanceof FisierProgram){
            ((FisierProgram)program).ruleazaProgram(this);
        }
        System.out.println("Programul "+ program +" executa fisierul " + content);
    }

    @Override
    public double getSize() {
        return content.length();
    }
}
