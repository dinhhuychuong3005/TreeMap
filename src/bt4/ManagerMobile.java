package bt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerMobile {
    List<Mobile> list;

    public ManagerMobile() {
        this.list = new ArrayList<>();
    }

    public void add(Mobile mobile) {
        list.add(mobile);
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public int check(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void edit(int id, Mobile mobile) {
        int index = check(id);
        if (index == -1) {
            System.out.println("không có id này");
        } else {
            list.set(index, mobile);
        }
    }

    public void delete(int id) {
        int index = check(id);
        if (index == -1) {
            System.out.println("không có id này");
        } else {
            list.remove(index);
        }
    }

    public void seach(int id){
        int index = check(id);
        if (index == -1) {
            System.out.println("không có id này");
        } else {
            System.out.println(" sản phẩm cần tìm là: " + list.get(index).toString());
        }
    }
    public void sortAscending(){
        Collections.sort(list, new Comparator<Mobile>() {
            @Override
            public int compare(Mobile o1, Mobile o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }
    public void sortDecending(){
        Collections.sort(list, new Comparator<Mobile>() {
            @Override
            public int compare(Mobile o1, Mobile o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }
}
