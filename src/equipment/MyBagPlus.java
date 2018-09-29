package equipment;

public class MyBagPlus extends MyBag
{
    private double maxWeight_;

    public MyBagPlus(int size, double maxWeight)
    {
        super(size);
        maxWeight_ = maxWeight;
    }

    @Override
    public boolean putItem(Item item)
    {
        double currentWeight = calculateCurrentWeight();

        if (items.length == counter_ || maxWeight_ < currentWeight + item.getWeight())
        {
            return false;
        }

        items[counter_] = item;
        counter_++;
        return true;
    }

    private double calculateCurrentWeight()
    {
        double currentWeight = 0;
        for (int i = 0; i < counter_; i++) {
            currentWeight = currentWeight + items[i].getWeight();
        }
        return currentWeight;
    }
}
