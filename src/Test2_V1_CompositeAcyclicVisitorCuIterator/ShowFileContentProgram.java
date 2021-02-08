package Test2_V1_CompositeAcyclicVisitorCuIterator;

public class ShowFileContentProgram implements FisierProgram{
    String numeProgram;
    public ShowFileContentProgram(String nume){
        this.numeProgram = nume;
    }
    @Override
    public void ruleazaProgram(Fisier ff) {
        System.out.println("Se afiseaza continut fisier "+ff.content);
    }
}
