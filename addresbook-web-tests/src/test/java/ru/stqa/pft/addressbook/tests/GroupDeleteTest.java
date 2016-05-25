package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupDeleteTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().GroupPage();
    }


    @Test
    public void testGroupDelete() {

        Groups before = app.group().all();
        GroupData deletedGroup = before.iterator().next();
        app.group().delete(deletedGroup);
        assertThat(app.group().count(), equalTo(before.size() -1 ));

        Groups after = app.group().all();
       before.remove(deletedGroup);

        assertThat(after, equalTo(before.without(deletedGroup)));
//            Assert.assertEquals(before, after);

    }



}
    
