package semantic;

public class ClassSymbol extends Symbol {
    private Scope classScope;
    private ClassSymbol superClass;

    public ClassSymbol(String name, Scope parentScope) {
        super(name, Type.CLASS);
        this.classScope = new Scope(name + "_scope", parentScope);
    }

    public Scope getClassScope() {
        return classScope;
    }

    public void setSuperClass(ClassSymbol superClass) {
        this.superClass = superClass;
    }

    public ClassSymbol getSuperClass() {
        return superClass;
    }
}
