package bt4;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerMobile managerMobile = new ManagerMobile();
        while (true) {
            System.out.println("1: Thêm sản phẩm");
            System.out.println("2: Hiển thị danh sách sản phẩm");
            System.out.println("3. sửa sản phẩm");
            System.out.println("4: Xóa sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6:  Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7:  Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("8:  Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Nhập id sản phẩm:");
                    int id = sc.nextInt();
                    System.out.println("Nhập tên sản phẩm:");
                    String name = sc.next();
                    System.out.println("Nhập giá sản phẩm");
                    Double price = sc.nextDouble();
                    managerMobile.add(new Mobile(id,name,price));
                    break;
                }
                case 2:
                    managerMobile.display();
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm cần sửa");
                    int id = sc.nextInt();
                    System.out.println("Nhập tên sản phẩm:");
                    String name = sc.next();
                    System.out.println("Nhập giá sản phẩm");
                    Double price = sc.nextDouble();
                    managerMobile.edit(id,new Mobile(id,name,price));
                    System.out.println("Danh sách sản phẩm sau khi sửa là:");
                    managerMobile.display();
                    break;
                case 4:
                    System.out.println("Nhập id sản phẩm cần xóa");
                    int id1 = sc.nextInt();
                    managerMobile.delete(id1);
                    System.out.println("sau khi xóa");
                    managerMobile.display();
                    break;
                case 5:
                    System.out.println("Nhập id sản phẩm cần tìm");
                    int id2 = sc.nextInt();
                    managerMobile.seach(id2);
                    break;
                case 6:
                    System.out.println("Tăng dần theo giá");
                    managerMobile.sortAscending();
                    managerMobile.display();
                    break;
                case 7:
                    System.out.println("Giam dần theo giá:");
                    managerMobile.sortDecending();
                    managerMobile.display();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    return ;
            }
        }
    }
}
