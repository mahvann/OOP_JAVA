package IsA_HasA;

public class DiaChi {
    private String tenDuong;

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }
    @Override
    public String toString(){
        return tenDuong;
    }
}
