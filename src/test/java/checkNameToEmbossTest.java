import org.junit.Assert;
import org.junit.Test;


public class checkNameToEmbossTest {

    @Test
    public void twoCharsNameThenFalseTest(){
        String name = "AA";
        Account account = new Account(name);
        Assert.assertEquals(false, account.checkNameToEmboss());
    }

    @Test
    public void twentyCharsNameThenFlaseTest(){
        String name = "Двадцать символоввввв";
        Account account = new Account(name);
        Assert.assertEquals(false, account.checkNameToEmboss());
    }

    @Test
    public void correctNameThenTrueTest(){
        String name = "Буковы Буковы";
        Account account = new Account(name);
        Assert.assertEquals(true, account.checkNameToEmboss());
    }

    @Test
    public void nameStartsWithSpaceThenFalseTest(){
        String name = " Буковы Буковы";
        Account account = new Account(name);
        Assert.assertEquals(false, account.checkNameToEmboss());
    }

    @Test
    public void nameEndsWithSpaceThenFalseTest(){
        String name = "Буковы Буковы ";
        Account account = new Account(name);
        Assert.assertEquals(false, account.checkNameToEmboss());
    }

    @Test
    public void nameContainsTwoSpaceThenFalseTest(){
        String name = "Буковы  Буковы";
        Account account = new Account(name);
        Assert.assertEquals(false, account.checkNameToEmboss());
    }

    @Test
    public void nameWithoutSpaceThenFlase(){
        String name = "БуковыБуковы";
        Account account = new Account(name);
        Assert.assertEquals(false, account.checkNameToEmboss());
    }

}
