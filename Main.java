import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagementDocument managementDocument = new ManagementDocument();
        int enterValue = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 4 để chọn Menu:");
                System.out.println("1: Nhập thông tin về các tài liệu");
                System.out.println("2: Hiển thị thông tin về các tài liệu");
                System.out.println("3: Tìm kiếm tài liệu theo loại");
                System.out.println("4: Thoát khỏi chương trình");
                Scanner sc = new Scanner(System.in);
                enterValue = sc.nextInt();
                if (enterValue < 1 || enterValue > 4) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (enterValue == 2) {
                    System.out.println("Xuat thong tin ve cac tai lieu");
                    System.out.println("1: Xuat thông tin mới cho loai sach");
                    System.out.println("2: Xuat thông tin mới cho tap chi");
                    System.out.println("3: Xuat thông tin mới cho bao");
                    int selectValue = sc.nextInt();
                    if (selectValue < 1 || selectValue > 3) {
                        System.out.println("Nhap sai gia tri");
                    } else if (selectValue == 1) {
                        System.out.println("Xuat thong tin loai sach");
                        managementDocument.ShowBookInformation();
                    } else if (selectValue == 2) {
                        System.out.println("Xuat thong tin tap chi");
                        managementDocument.ShowMagazineInformation();
                    } else if (selectValue == 3) {
                        System.out.println("Xuat thong tin bao");
                        managementDocument.ShowNewsletterInformation();
                    }
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (enterValue != 4);
    }
}