package equipment.bags;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import equipment.Item;

class SmallBagTests
{
    @Test
    public void tryToPutFiveItemsAndReturnFalse()
    {
        SmallBag smallBag = new SmallBag();
        Item item1 = new Item("1", 0.5);
        Item item2 = new Item("2", 0.5);
        Item item3 = new Item("3", 0.5);
        Item item4 = new Item("4", 0.5);
        Item item5 = new Item("5", 0.5);

        Assertions.assertTrue(smallBag.putItem(item1));
        Assertions.assertTrue(smallBag.putItem(item2));
        Assertions.assertTrue(smallBag.putItem(item3));
        Assertions.assertTrue(smallBag.putItem(item4));
        Assertions.assertFalse(smallBag.putItem(item5));
    }

    @Test
    public void tryToPut3kgOfItemsAndReturnFalse()
    {
        SmallBag smallBag = new SmallBag();
        Item item1 = new Item("1", 6);

        Assertions.assertFalse(smallBag.putItem(item1));
    }
}