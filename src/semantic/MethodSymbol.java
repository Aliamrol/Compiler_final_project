package semantic;

import java.util.ArrayList;
import java.util.List;

public class MethodSymbol extends Symbol {
    private List<Type> parameterTypes;

    public MethodSymbol(String name, Type returnType) {
        super(name, returnType);
        this.parameterTypes = new ArrayList<>();
    }

    public void addParameterType(Type paramType) {
        parameterTypes.add(paramType);
    }

    public List<Type> getParameterTypes() {
        return parameterTypes;
    }
}
