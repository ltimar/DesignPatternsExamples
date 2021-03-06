package Test2_V1_CompositeAcyclicVisitorCuIterator;

public abstract class  Entity {
    String path;

    public Entity(String cale) {
        this.path = cale;
    }

    public abstract double getSize();
    public abstract void runProgramm(Program prog);

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path ;
    }
}
