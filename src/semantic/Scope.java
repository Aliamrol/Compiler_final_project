package semantic;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private String name;
    
    private Scope parent;
    
    private Map<String, Symbol> symbols = new HashMap<>();

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
    }
    
    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }
    
    public Symbol resolve(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol != null) {
            return symbol;
        }
        
        if (parent != null) {
            return parent.resolve(name);
        }
        
        return null;
    }

    public Scope getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }
}
