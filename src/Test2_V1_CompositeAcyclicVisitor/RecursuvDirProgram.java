package Test2_V1_CompositeAcyclicVisitor;

public class RecursuvDirProgram implements FolderProgram{
    @Override
    public void ruleazaProgram(Folder ff) {
         System.out.println("dir :: nume folder = "+ ff.getPath());
        for ( Entity entity: ff.componenteFolder) {
            System.out.println(entity.getPath());
            if (entity instanceof Folder){
//                entity.runProgramm(this);
                ruleazaProgram((Folder) entity);
            }
        }
        }
    }
