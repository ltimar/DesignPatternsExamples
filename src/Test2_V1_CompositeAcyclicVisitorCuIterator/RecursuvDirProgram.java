package Test2_V1_CompositeAcyclicVisitorCuIterator;

public class RecursuvDirProgram implements FolderProgram{
    @Override
    public void ruleazaProgram(Folder ff) {
        // System.out.println("dir :: nume folder = "+ ff.getPath());
        LauIterator iterator = ff.getIterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity) iterator.next();
            System.out.println(entity.getPath());
            if (entity instanceof Folder) {
                ruleazaProgram((Folder) entity);
            }
        }
//        for ( Entity entity: ff.componenteFolder) {
//            System.out.println(entity.getPath());
//            if (entity instanceof Folder){
////                entity.runProgramm(this);
//                ruleazaProgram((Folder) entity);
//            }
//        }
        }
    }
