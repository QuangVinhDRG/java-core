package statics;

public class HinhTron extends HinhHoc {
    private double radius;

    public HinhTron(double radius) {
        HinhHoc.numOfShape++;
        if (HinhHoc.numOfShape > Configs.SO_LUONG_HINH_TOI_DA) {
            HinhHoc.numOfShape--;
            throw new IllegalStateException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
        this.radius = radius;
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
