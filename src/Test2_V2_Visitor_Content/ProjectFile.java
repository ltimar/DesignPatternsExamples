package Test2_V2_Visitor_Content;

public abstract class ProjectFile {
    public abstract boolean isLeaf();
    public abstract String getName();
    public abstract Content getContent();

    public abstract void analizaCod(Analiza ann);
}
