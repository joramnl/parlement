package nl.saxion.cos.joramsjamaar.model;

import java.util.HashMap;

/**
 * Represents a Scope which can contain a parent scope. Contains symbols
 *
 *
 * A scope creates a structure that contains Symbols and possible a parent scope.
 * The child scope can ask the parent recursively if the Symbol exists.
 * Scope states should be managed by another class
 */
public class Scope
{

    /**
     * Stores the symbols in the current scope
     */
    private final HashMap<String, Symbol> symbols = new HashMap<>();

    /**
     * The parent of this scope (if any)
     */
    private Scope parentScope;

    /**
     * Adds a symbol to the scope
     *
     * @param identifier    Name of the symbol
     * @param symbol        Symbol object
     */
    public void add(String identifier, Symbol symbol)
    {
        this.symbols.put(identifier, symbol);
    }

    /**
     * Recursive: Gets a symbol from the current scope or all the parent scopes.
     *
     * @param identifier    Name of symbol
     * @return              Symbol if found or null if not found
     */
    public Symbol get(String identifier)
    {
        if (symbols.get(identifier) == null && this.parentScope != null)
        {
            return parentScope.get(identifier); // Recursive
        }

        return symbols.get(identifier);
    }

    /**
     * Creates a new Scope with current symbols in the parent scope
     *
     * @return      Scope object
     */
    public Scope newScope()
    {
        Scope s = new Scope();
        s.setParentScope(this);
        return s;
    }

    /**
     * @return      Scope object of the parent scope if exists. If no parent scope exists then null is returned
     */
    public Scope getParentScope()
    {
        return parentScope;
    }

    /**
     * Sets the current parent Scope
     *
     * @param parentScope   Scope object
     */
    public void setParentScope(Scope parentScope)
    {
        this.parentScope = parentScope;
    }
}
