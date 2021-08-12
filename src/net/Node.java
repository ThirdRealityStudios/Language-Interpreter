package net;

import java.util.ArrayList;

public class Node<T>
{
    private T data;

    private ArrayList<Link> links;

    public Node(T data)
    {
        this.data = data;

        links = new ArrayList<Link>();
    }

    public T getData()
    {
        return data;
    }

    private void merge(Link<T> unmerged, Link<T> existing)
    {
        Node<T> unmergedNode = unmerged.getDestination();

        Node<T> existingNode = existing.getDestination();

        for(Link<T> subLink : unmergedNode.links)
        {
            if(!existingNode.links.contains(subLink))
            {
                existingNode.links.add(subLink);
            }
        }
    }

    public void add(Link<T> link)
    {
        int index = links.indexOf(link);

        if(index < 0)
        {
            links.add(link);
        }
        else // Make sure all sub links of the Link<T> are merged.
        {
            Link<T> existing = links.get(index);

            merge(link, existing);
        }
    }

    @Override
    public String toString()
    {
        String info = data.toString();

        for(Link l : links)
        {
            info += " " + l.toString();
        }

        return info;
    }
}
