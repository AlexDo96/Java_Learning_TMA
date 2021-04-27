package Day03;

public class Demo1 {
    //Ham tra ve kieu du lieu
    public static void main(String[] args) {
        int r1 = add(1, 2);
        System.out.println("r1: " + r1);
        int r2 = add(10, -5);
        System.out.println("r2: " + r2);

        double cd = 5, cr = 4;
        double s_hcn = S_HCN(cd,cr);
        double cv_hcn = CV_HCN(cd,cr);
        double c_degree = 37;
        double f_degree = CalculateTemp(c_degree);
        double toan = 7, ly = 5, hoa = 6;
        double average = AverageScore(toan,ly,hoa);

        System.out.println("Dien tich HCN: " + s_hcn);
        System.out.println("Chu vi HCN: " + cv_hcn);
        System.out.println("Do F: " + f_degree);
        System.out.println("Diem TB: " + average);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
        //Nhung code line nam sau return se ko bao gio duoc thuc thi
    }

    /*
    1. Xay dung ham tinh S hcn
    2. Xay dung ham tinh CV hcn
    3. Xay dung ham doi nhiet do tu do C sang do F
    4. Xay dung ham tinh diem Tb dua tren 3 diem Toan, Ly, Hoa
     */

    public static double S_HCN(double cd, double cr) {
        double area_hcn = (cd + cr) * 2;
        return area_hcn;
    }

    public static double CV_HCN(double cd, double cr) {
        double perimeter_hcn = cd * cr;
        return perimeter_hcn;
    }


    public static double AverageScore(double toan, double ly, double hoa) {
        double average = (toan * 3 + ly * 2 + hoa) / 6;
        return average;
    }

    public static double CalculateTemp(double cdegree) {
        double fdegree = cdegree * 18 + 32;
        return fdegree;
    }
}
