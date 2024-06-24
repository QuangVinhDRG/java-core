package statics;

public class HinhChuNhat extends HinhHoc {
    private int width;
    private int length;

    public HinhChuNhat(int width, int length) {
        HinhHoc.numOfShape++;
        if (HinhHoc.numOfShape > Configs.SO_LUONG_HINH_TOI_DA) {
            HinhHoc.numOfShape--;
            throw new IllegalStateException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double tinhChuVi() {
        return 0;
    }

    @Override
    public double tinhDienTich() {
        return 0;
    }
}
