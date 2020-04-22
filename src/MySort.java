import java.util.ArrayList;

public class MySort {
    final static int GENDER_MALE = 1;
    final static int GENDER_FEMALE = 0;

    public static MyQueue<MyStaff> sort(ArrayList<MyStaff> arr) throws Exception {
        MyQueue<MyStaff> myStaffList = new MyQueue<>();
        MyQueue<MyStaff> myListMale = new MyQueue<>();
        MyQueue<MyStaff> myListFemale = new MyQueue<>();
        MyQueue<MyStaff> myListOther = new MyQueue<>();
        for (MyStaff element: arr
             ) {
            if(element.getGender() == GENDER_MALE){
                myListMale.enqueue(element);
            }
            else if(element.getGender() == GENDER_FEMALE){
               myListFemale.enqueue(element);
            }
            else {
                myListOther.enqueue(element);
            }
        }
        while (!myListFemale.isEmpty()){
            myStaffList.enqueue(myListFemale.dequeue());
        }
        while (!myListMale.isEmpty()){
            myStaffList.enqueue(myListMale.dequeue());
        }
        while (!myListOther.isEmpty()){
            myStaffList.enqueue(myListOther.dequeue());
        }
        return myStaffList;
    }

}
