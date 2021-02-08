package Test2_V1_CompositeAcyclicVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Folder extends Entity{
    protected List<Entity> componenteFolder;

    public Folder(String caleFolder){
        super(caleFolder);
        componenteFolder = new ArrayList<>();
    }

    @Override
    public double getSize() {
        return componenteFolder.stream().mapToDouble(Entity::getSize).sum();
    }

    @Override
    public void runProgramm(Program prog) {
        if (prog instanceof FolderProgram) {
            ((FolderProgram) prog).ruleazaProgram(this);
        }
        System.out.println("Programul "+ prog +" ruleaza pe directorul "+ this.getPath());
    }

    public void adauga(Entity ... entities)
    {
        componenteFolder.addAll(Arrays.asList(entities));
    }
}
