 * Ad Soyad: [Efecan Önal]
 * Ogrenci No: [250541093]
 * Tarih: [14.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *import java.util.Scanner;
import java.util.Scanner;

public class FizikFormul {

    // 1. Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // 2. İvme (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        return velocityChange / time;
    }

    // 3. Kuvvet (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // 4. İş (W = F * d)
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // 5. Güç (P = W / t)
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // 6. Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    // 7. Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        return mass * gravity * height;
    }

    // 8. Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double GRAVITY = 9.8;  // Yerçekimi ivmesi

        System.out.println("=== FIZIK FORMUL ASISTANI ===\n");

        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double velocityChange = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();


        // Hesaplamalar
        double velocity = calculateVelocity(distance, time);
        double acceleration = calculateAcceleration(velocityChange, time);
        double force = calculateForce(mass, acceleration);
        double work = calculateWork(force, distance);
        double power = calculatePower(work, time);
        double kineticEnergy = calculateKineticEnergy(mass, velocity);
        double potentialEnergy = calculatePotentialEnergy(mass, GRAVITY, height);
        double momentum = calculateMomentum(mass, velocity);

        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================\n");

        // HIZ ve HAREKET
        System.out.println("HIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n\n", acceleration);

        // KUVVET ve IS
        System.out.println("KUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n\n", power);

        // ENERJI
        System.out.println("ENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        System.out.printf("  Toplam Enerji             : %.2f J\n\n", (kineticEnergy + potentialEnergy));

        // MOMENTUM
        System.out.println("MOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");
    }
}

