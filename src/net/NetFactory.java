package net;

import java.util.ArrayList;
import java.util.Collections;

// This class constructs patterns and possible data sequences to build a network out of Nodes and Links.
public class NetFactory<T>
{
    public NetFactory()
    {

    }

    // Creates a dictionary out of Nodes from the given set of data.
    // No duplicates are contained!
    private ArrayList<Node<T>> createDictionary(ArrayList<T> data)
    {
        ArrayList<Node<T>> dictionary = new ArrayList<Node<T>>();

        for(T raw : data)
        {
            Node<T> node = new Node<T>(raw);

            if(!dictionary.contains(node))
            {
                dictionary.add(node);
            }
        }

        return dictionary;
    }

    // Converts the raw data to Nodes (in the same order, with duplicates).
    private ArrayList<Node<T>> convert(ArrayList<T> data)
    {
        ArrayList<Node<T>> nodes = new ArrayList<Node<T>>();

        for(T object : data)
        {
            Node<T> current = new Node<T>(object);

            nodes.add(current);
        }

        return nodes;
    }

    // Links all nodes with their next neighbour.
    private void link(ArrayList<Node<T>> nodes)
    {
        Node<T> last = null;

        for(Node<T> current : nodes)
        {
            if(last != null)
            {
                Link<T> neighbour = new Link<T>(current);

                last.add(neighbour);
            }

            last = current;
        }
    }

    // The 'data' is being converted to Nodes and after that connected with each other.
    public ArrayList<Node<T>> produceSequences(ArrayList<T> data)
    {
        ArrayList<Node<T>> nodes = convert(data);

        link(nodes);

        return nodes;
    }
}
