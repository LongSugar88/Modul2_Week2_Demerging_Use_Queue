import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class mySortTest {

    @Test
    void test1() throws Exception {
        MyStaff staff1 = new MyStaff("Long", 1);
        MyStaff staff2 = new MyStaff("Oanh", 0);
        MyStaff staff3 = new MyStaff("Mỹ", 0);
        MyStaff staff4 = new MyStaff("An", 1);
        ArrayList<MyStaff> mylist = new ArrayList<>();
        mylist.add(staff1);
        mylist.add(staff2);
        mylist.add(staff3);
        mylist.add(staff4);
        MyQueue<MyStaff> myStaff = MySort.sort(mylist);

        String expect = "Oanh";
        String result = myStaff.peek(0).getName();
        assertEquals(expect, result);
    }

    @Test
    void test2() throws Exception {
        MyStaff staff1 = new MyStaff("Long", 1);
        MyStaff staff2 = new MyStaff("Nam", 1);
        MyStaff staff3 = new MyStaff("Mỹ", 0);
        MyStaff staff4 = new MyStaff("An", 1);
        ArrayList<MyStaff> mylist = new ArrayList<>();
        mylist.add(staff1);
        mylist.add(staff2);
        mylist.add(staff3);
        mylist.add(staff4);
        MyQueue<MyStaff> myStaff = MySort.sort(mylist);

        String expect = "Mỹ";
        String result = myStaff.peek(0).getName();
        assertEquals(expect, result);
    }

    @Test
    void test3() throws Exception {
        MyStaff staff1 = new MyStaff("Long", 1);
        MyStaff staff2 = new MyStaff("Tiến", 2);
        MyStaff staff3 = new MyStaff("Mỹ", 0);
        MyStaff staff4 = new MyStaff("An", 0);
        ArrayList<MyStaff> mylist = new ArrayList<>();
        mylist.add(staff1);
        mylist.add(staff2);
        mylist.add(staff3);
        mylist.add(staff4);
        MyQueue<MyStaff> myStaff = MySort.sort(mylist);

        String expect = "Mỹ";
        String result = myStaff.peek(0).getName();
        assertEquals(expect, result);
    }

    @Test
    void test4() throws Exception {
        MyStaff staff1 = new MyStaff("Long", 1);
        MyStaff staff2 = new MyStaff("Oanh", 0);
        MyStaff staff3 = new MyStaff("Mỹ", 0);
        MyStaff staff4 = new MyStaff("An", 0);
        ArrayList<MyStaff> mylist = new ArrayList<>();
        mylist.add(staff1);
        mylist.add(staff2);
        mylist.add(staff3);
        mylist.add(staff4);
        MyQueue<MyStaff> myStaff = MySort.sort(mylist);

        String expect = "Long";
        String result = myStaff.peek(3).getName();
        assertEquals(expect, result);
    }
}