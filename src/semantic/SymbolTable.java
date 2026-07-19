package semantic;

public class SymbolTable {
    private Scope currentScope;
    private Scope globalScope;

    public SymbolTable() {
        this.globalScope = new Scope("global", null);
        this.currentScope = this.globalScope;
    }

    public void pushScope(String name) {
        Scope newScope = new Scope(name, currentScope);
        currentScope = newScope;
    }

    public void popScope() {
        if (currentScope.getParent() != null) {
            currentScope = currentScope.getParent();
        }
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public Scope getGlobalScope() {
        return globalScope;
    }
}
