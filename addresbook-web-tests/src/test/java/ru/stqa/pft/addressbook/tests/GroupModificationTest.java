package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

/**
 * Created by Dmitry on 14.05.2016.
 */
public class GroupModificationTest extends TestBase {

    @Test
       public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
//        int before = app.getGroupHelper().getGroupCount();
        List<GroupData> before = app.getGroupHelper().getGroupList();


        app.getGroupHelper().selectGroup(before.size() -1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();

//        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after.size(), before.size());

    }
}
