/*
 * Ad Soyad: [Efecan Önal]
 * Ogrenci No: [250541093]
 * Tarih: [14.11.2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

    // 1. Satır toplamı
    public static double calculateLineTotal(double price, int quantity) {
        return price * quantity;
    }

    // 2. Ara toplam
    public static double calculateSubtotal(double line1, double line2, double line3) {
        return line1 + line2 + line3;
    }

    // 3. İndirim tutarı
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        return subtotal * (discountPercentage / 100);
    }

    // 4. İndirimli toplam
    public static double applyDiscount(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // 5. KDV
    public static double calculateVAT(double discountedTotal, double vatRate) {
        return discountedTotal * vatRate;
    }

    // 6. Genel toplam
    public static double calculateGrandTotal(double discountedTotal, double vatAmount,
                                             double shippingFee) {
        return discountedTotal + vatAmount + shippingFee;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double VAT_RATE = 0.18;
        final double SHIPPING_FEE = 29.99;

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===\n");
        System.out.println("Lutfen 3 urunun bilgilerini girin:\n");

        System.out.println("URUN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty1 = input.nextInt();

        System.out.println("\nURUN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty2 = input.nextInt();

        System.out.println("\nURUN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty3 = input.nextInt();

        System.out.print("\nIndirim Kuponu Yuzdesi (%): ");
        double discountPercentage = input.nextDouble();


        // Hesaplamalar
        double line1 = calculateLineTotal(price1, qty1);
        double line2 = calculateLineTotal(price2, qty2);
        double line3 = calculateLineTotal(price3, qty3);
        double subtotal = calculateSubtotal(line1, line2, line3);
        double discountAmount = calculateDiscountAmount(subtotal, discountPercentage);
        double discountedTotal = applyDiscount(subtotal, discountAmount);
        double vatAmount = calculateVAT(discountedTotal, VAT_RATE);
        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount, SHIPPING_FEE);


        // === ÇIKTI ===
        System.out.println("\n========================================");
        System.out.println("           SIPARIS OZETI");
        System.out.println("========================================\n");

        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, qty1, line1);
        System.out.printf("Urun 2 Toplam (%.2f TL x %d): %.2f TL\n", price2, qty2, line2);
        System.out.printf("Urun 3 Toplam (%.2f TL x %d): %.2f TL\n", price3, qty3, line3);

        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n\n", subtotal);

        System.out.printf("Indirim Tutari (%%%s)         : -%.2f TL\n",
                String.valueOf(discountPercentage), discountAmount);
        System.out.printf("Indirimli Toplam             : %.2f TL\n\n", discountedTotal);

        System.out.printf("KDV Tutari (%%18)             : +%.2f TL\n", vatAmount);
        System.out.printf("Kargo Ucreti                 : +%.2f TL\n", SHIPPING_FEE);

        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", grandTotal);
        System.out.println("========================================");
    }
}

