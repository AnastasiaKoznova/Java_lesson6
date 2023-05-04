package Homework.lesson_6;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        notebook HuaweiMateBook = new notebook("Huawei", "MateBook", "Black", 15.6, "LCD", 8, 256, "SSD");
        notebook SamsungS101 = new notebook("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "SSD");
        notebook VaioNE15V2IN069P = new notebook("Vaio", "NE15V2IN069P", "Blue", 15.6, "IPS", 8, 512, "SSD");
        notebook AsusTUF504 = new notebook("ASUS", "TUF-504", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0");
        notebook AsusTUF555 = new notebook("ASUS", "TUF-555", "White", 15.6, "TFT", 16, 1024, "SSD");

        List<notebook> notebookList = List.of(HuaweiMateBook, SamsungS101, VaioNE15V2IN069P, AsusTUF504, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2){
            for (notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();
    }
}
