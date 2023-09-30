import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO xuất ra số tiền phải trả theo công thức : 50 -> 100 (giảm 8%) / 100+ -> (giảm 12% tính từ 100)
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên mặt hàng: ");
        String tenMatHang = sc.nextLine();
        System.out.print("Số lượng mua: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Đơn giá: ");
        float donGia = Float.parseFloat(sc.nextLine());
        if(soLuong > 0 && donGia > 0){
            float ketQua = HamTinhTien.tinhTien(soLuong, donGia);
            System.out.print("Số tiền cần phải trả: " + ketQua);
        }else {
            System.out.print("số lượng hoặc đơn giá không hợp lệ");
        }
    }
}