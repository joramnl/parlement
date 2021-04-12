package nl.saxion.cos.joramsjamaar.model;

import nl.saxion.cos.joramsjamaar.DataType;

public class Symbol
{
    private final String name;

    private final DataType type;

    private final int localSlot;

    private static int nextSlot = 1;

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

    @Override
    public String toString()
    {
        return "Symbol{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", localSlot=" + localSlot +
                '}';
    }
}
