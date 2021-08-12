package net;

public class Link<T>
{
    private int value = 0;

    private Node<T> destination;

    public Link(Node<T> destination)
    {
        this.destination = destination;
    }

    public void increaseValue()
    {
        value++;
    }

    public void decreaseValue()
    {
        value--;
    }

    public int getValue()
    {
        return value;
    }

    public Node getDestination()
    {
        return destination;
    }

    @Override
    public boolean equals(Object o)
    {
        return ((Link<T>) o).getDestination().equals(getDestination());
    }

    @Override
    public String toString()
    {
        return "-> " + destination.getData();
    }
}
