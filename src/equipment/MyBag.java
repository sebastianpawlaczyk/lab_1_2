package equipment;

public class MyBag
{
    protected int MAXSIZE = 15;
    protected int MINSIZE = 0;

    protected Item items[];
    protected int size_;
    protected int counter_;

    public MyBag()
    {
        size_ = 10;
        counter_ = 0;
        items = new Item[size_];
    }

    public MyBag(int size)
    {
        counter_ = 0;
        if (size > MINSIZE && size <= MAXSIZE)
        {
            size_ = size;
            items = new Item[size_];
        }

        else
        {
            size_ = 10;
            items = new Item[size_];
        }
    }

    public String toStringI()
    {
        String result = "";
        for (int i = 0; i < items.length; i++)
        {
            result = result + " " + items[0].toStringI();
        }
        return result;
    }

    public boolean putItem(Item item)
    {
        if (items.length == counter_)
        {
            return false;
        }

        items[counter_] = item;
        counter_++;
        return true;
    }

    public void removeAll()
    {
        items = null;
        items = new Item[size_];
        counter_ = 0;
    }
}
