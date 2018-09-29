package equipment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyBagTests
{
    @Test
    public void PutItemToBagAndReturnTrue()
    {
        MyBag myBag = new MyBag();
        Item item = new Item();

        Assertions.assertTrue(myBag.putItem(item));
    }

    @Test
    public void tryToPutToManyItemsAndReturnFalse()
    {
        int sizeOfBag = 2;
        MyBag myBag = new MyBag(sizeOfBag);
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        myBag.putItem(item1);
        myBag.putItem(item2);

        Assertions.assertFalse(myBag.putItem(item3));
    }

    @Test
    public void fillAllBagThenRemoveAllItemsThenPutItemAgainAndReturnTrue()
    {
        int sizeOfBag = 2;
        MyBag myBag = new MyBag(sizeOfBag);
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        myBag.putItem(item1);
        myBag.putItem(item2);

        myBag.removeAll();

        Assertions.assertTrue(myBag.putItem(item3));
    }
}