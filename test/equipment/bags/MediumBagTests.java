package equipment.bags;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import equipment.Item;

class MediumBagTests
{
    @Test
    public void tryToPutEightItemsAndReturnFalse()
    {
        MediumBag mediumBag = new MediumBag();
        Item item1 = new Item("1", 0.5);
        Item item2 = new Item("2", 0.5);
        Item item3 = new Item("3", 0.5);
        Item item4 = new Item("4", 0.5);
        Item item5 = new Item("5", 0.5);
        Item item6 = new Item("6", 0.5);
        Item item7 = new Item("7", 0.5);
        Item item8 = new Item("8", 0.5);

        Assertions.assertTrue(mediumBag.putItem(item1));
        Assertions.assertTrue(mediumBag.putItem(item2));
        Assertions.assertTrue(mediumBag.putItem(item3));
        Assertions.assertTrue(mediumBag.putItem(item4));
        Assertions.assertTrue(mediumBag.putItem(item5));
        Assertions.assertTrue(mediumBag.putItem(item6));
        Assertions.assertTrue(mediumBag.putItem(item7));
        Assertions.assertFalse(mediumBag.putItem(item7));
    }

    @Test
    public void tryToPut6kgOfItemsAndReturnFalse()
    {
        MediumBag mediumBag = new MediumBag();
        Item item1 = new Item("1", 5);
        Item item2 = new Item("2", 1);

        Assertions.assertTrue(mediumBag.putItem(item1));
        Assertions.assertFalse(mediumBag.putItem(item2));
    }
}