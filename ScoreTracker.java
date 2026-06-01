import java.util.Scanner;

public class ScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir datos básicos
        System.out.print("🎮 Nombre del juego: ");
        String juego = scanner.nextLine();

        System.out.print("🏆 Número de Victorias: ");
        int victorias = scanner.nextInt();

        System.out.print("❌ Número de Derrotas: ");
        int derrotas = scanner.nextInt();

        // 2. Mostrar el resultado limpio
        System.out.println("\n========================");
        System.out.println("   RÉCORD DE JUGADOR    ");
        System.out.println("========================");
        System.out.println(" JUEGO: " + juego);
        System.out.println("------------------------");
        System.out.println(" Victorias: " + victorias);
        System.out.println(" Derrotas:  " + derrotas);
        System.out.println(" Total:     " + (victorias + derrotas) + " partidas");
        System.out.println("========================");

        scanner.close();
    }
}
