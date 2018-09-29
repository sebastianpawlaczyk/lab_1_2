package equipment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyBagPlusTests
{
    @Test
    public void tryToPutTooHeavyItemAndReturnFalse()
    {
        MyBagPlus myBagPlus = new MyBagPlus(5, 12);
        Item itemOne = new Item("abc", 10);
        Item itemTwo = new Item("xyz", 5);

        Assertions.assertTrue(myBagPlus.putItem(itemOne));
        Assertions.assertFalse(myBagPlus.putItem(itemTwo));
    }
}