/*
 * Ad Soyad: [Efecan Önal]
 * Ogrenci No: [250541093]
 * Tarih: [14.11.2025]
 * Aciklama: Gorev 2 - geometrik hesap Asistani
 *import java.util.Scanner;

public class GeometriHesap {

    // 1. Kare alanı
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // 2. Kare çevresi
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // 3. Dikdörtgen alanı
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    // 4. Dikdörtgen çevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // 5. Daire alanı
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 6. Daire çevresi
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // 7. Üçgen alanı (taban-yükseklik)
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    // 8. Üçgen çevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // ================================
    //            MAIN
    // ================================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===\n");

        // KARE
        System.out.print("KARE:\nKenar uzunlugu (cm): ");
        double kareKenar = input.nextDouble();

        // DIKDORTGEN
        System.out.print("\nDIKDORTGEN:\nKisa kenar (cm): ");
        double kisa = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double uzun = input.nextDouble();

        // DAIRE
        System.out.print("\nDAIRE:\nYaricap (cm): ");
        double r = input.nextDouble();

        // UCGEN
        System.out.print("\nUCGEN:\nTaban (cm): ");
        double taban = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double yukseklik = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double a = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double b = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double c = input.nextDouble();

        // =======================================
        //            SONUÇLAR
        // =======================================
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================\n");

        // KARE
        System.out.printf("KARE (kenar: %.1f cm):\n", kareKenar);
        System.out.printf("  Alan      : %.2f cm²\n", calculateSquareArea(kareKenar));
        System.out.printf("  Cevre     : %.2f cm\n\n", calculateSquarePerimeter(kareKenar));

        // DIKDORTGEN
        System.out.printf("DIKDORTGEN (%.1f x %.1f cm):\n", kisa, uzun);
        System.out.printf("  Alan      : %.2f cm²\n", calculateRectangleArea(kisa, uzun));
        System.out.printf("  Cevre     : %.2f cm\n\n", calculateRectanglePerimeter(kisa, uzun));

        // DAIRE
        System.out.printf("DAIRE (yaricap: %.1f cm):\n", r);
        System.out.printf("  Alan      : %.2f cm²\n", calculateCircleArea(r));
        System.out.printf("  Cevre     : %.2f cm\n\n", calculateCircleCircumference(r));

        // UCGEN
        System.out.printf("UCGEN (taban: %.1f, yukseklik: %.1f cm):\n", taban, yukseklik);
        System.out.printf("  Alan      : %.2f cm²\n", calculateTriangleArea(taban, yukseklik));
        System.out.printf("  Cevre     : %.2f cm\n\n", calculateTrianglePerimeter(a, b, c));

        System.out.println("========================================");
    }
}
