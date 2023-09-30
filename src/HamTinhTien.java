public class HamTinhTien implements HamTinhTienInterface {



    public static float tinhTien(int soLuong, float donGia) {
        if (soLuong < 50){
            float soTienCanTra = soLuong * donGia;
            return soTienCanTra;

        } else if (soLuong >= 50 && soLuong <=100) {
            int soLuongDacBiet = soLuong - 49;
            float soTienCanTra = (float) ((49 * donGia) + (soLuongDacBiet * donGia * 0.92));
            return soTienCanTra;

        }else {
            int soLuongDacBiet = soLuong - 100;
            float soTienCanTra = (float) ((49 * donGia) + (51 * donGia * 0.92) + (soLuongDacBiet * 0.88));
            return soTienCanTra;

        }
    }
}
