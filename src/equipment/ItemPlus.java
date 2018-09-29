package equipment;

import fruits.FruitName;

public class ItemPlus extends Item
{
    private FruitName fruitName_;

    public ItemPlus(String name, String fruitName, double weight)
    {
        super(name, weight);
        fruitName_ = FruitName.getFruitName(fruitName);
    }

    public ItemPlus(String name, FruitName fruitName, double weight)
    {
        super(name, weight);
        fruitName_ = fruitName;
    }

    public ItemPlus(String s)
    {
        if (s.contains(" "))
        {
            int index = s.indexOf(" ");
            name_ = s.substring(0, index);
            int oldIndex = index + 1;
            index = s.indexOf(" ", index + 1);
            fruitName_ = FruitName.getFruitName(s.substring(oldIndex,index));
            weight_ = Double.parseDouble(s.substring(index, s.length()));
        }
    }

    @Override
    public String toStringI()
    {
        return name_ + " " + FruitName.getString(fruitName_) + " " + String.valueOf(weight_);
    }
}
