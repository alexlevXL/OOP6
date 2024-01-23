package sort;

import java.util.Comparator;

import data.User;

public class UserComparator <T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLasttName().compareTo(o2.getLasttName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
    
}
