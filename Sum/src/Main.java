import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước cột : ");
        int sizeColumm = scanner.nextInt();
        System.out.print("Nhập kích thước hàng : ");
        int sizeRow = scanner.nextInt();
        double[][] array = createArray(sizeRow, sizeColumm);
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumm; j++) {
                System.out.print("Nhập giá trị tại " + i + " " + j + " : ");
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Mảng : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Chú ý chỉ số của cột bắt đầu từ 0");
        System.out.println("Nhập vào côt muốn tính tổng");
        int indexColumm = scanner.nextInt();
        System.out.println("Tổng cột " + indexColumm + " = " + sumColumm(indexColumm, array));
    }

    public static double[][] createArray(int sizeColumm, int sizeRow) {
        double[][] array = new double[sizeColumm][sizeRow];
        return array;
    }

    public static double sumColumm(int indexColumm, double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
                sum += array[i][indexColumm];
        }
        return sum;
    }

}
