package equipment.bags;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import equipment.Item;

class BigBagTests
{
    @Test
    public void tryToPut16kgOfItemsAndReturnFalse()
    {
        BigBag bigBag = new BigBag();
        Item item1 = new Item("1", 10);
        Item item2 = new Item("2", 6);

        Assertions.assertTrue(bigBag.putItem(item1));
        Assertions.assertFalse(bigBag.putItem(item2));
    }
}