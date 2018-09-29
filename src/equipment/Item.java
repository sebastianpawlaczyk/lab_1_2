package equipment;

public class Item
{

    protected String name_;
    protected double weight_;

    public Item()
    {
        name_ = "noname";
        weight_ = 1.0;
    }

    public Item(String name, double weight)
    {
        name_ = name;
        if (weight > 0.0 && weight <= 10.0)
        {
            weight_ = weight;
        }

        else
        {
            weight_ = 1.0;
        }
    }

    public double getWeight()
    {
        return weight_;
    }

    public String toStringI()
    {
        return name_ + " " + String.valueOf(weight_);
    }
}
