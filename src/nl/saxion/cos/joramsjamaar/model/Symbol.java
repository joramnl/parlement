package nl.saxion.cos.joramsjamaar.model;

/**
 * Represents a variable
 *
 * A Symbol registers a name/identifier for a variable, the DataType and the local slot it is stored to
 */
public class Symbol
{

    /**
     * Name/identifier of the variable
     */
    private final String name;

    /**
     * DataType of the variable
     */
    private final DataType type;

    /**
     * Slot the variable can be stored to and retrieved from
     */
    private final int localSlot;

    /**
     * Stores the next available slot to be used
     */
    private static int nextSlot = 1;

    /**
     * Indicates if a value is assigned after declaration
     */
    private boolean used = false;

    public Symbol(String name, DataType type)
    {
        this.name = name;
        this.type = type;
        this.localSlot = nextSlot++;
    }

    public DataType getType()
    {
        return type;
    }

    public int getLocalSlot()
    {
        return localSlot;
    }

    public String getName()
    {
        return name;
    }

    public boolean isUsed()
    {
        return used;
    }

    public void setUsed(boolean used)
    {
        this.used = used;
    }
}
