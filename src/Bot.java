import net.NetFactory;
import net.Node;

import java.util.ArrayList;

public class Bot<T>
{
    public void run(ArrayList<T> data)
    {
        NetFactory<T> factory = new NetFactory<T>();

        ArrayList<Node<T>> nodes = factory.produceSequences(data);

        print(nodes);
    }

    public void print(ArrayList<Node<T>> nodes)
    {
        for(Node<T> node : nodes)
        {
            System.out.println(node);
        }
    }

    public ArrayList<T> toArrayList(T[] array)
    {
        ArrayList<T> list = new ArrayList<T>();

        for(T object : array)
        {
            list.add(object);
        }

        return list;
    }
}
