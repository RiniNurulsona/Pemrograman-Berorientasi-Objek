public class Main {
    public static void main(String[] args) {
        // Membuat objek Pelanggan
        Pelanggan pelanggan1 = new Pelanggan(
            "123456789", "Rini Nurulsona", "Perempuan", 
            "Jakarta", "08123456789", "01-01-2000", "rini@example.com"
        );
        System.out.println("\n=== Data Pelanggan ===");
        pelanggan1.displayInfo();

        // Membuat objek Karyawan
        Karyawan karyawan1 = new Karyawan(
            "K001", "Budi Santoso", "Laki-laki", 
            "Bandung", "08123456790", "budi123", "pass123"
        );
        System.out.println("\n=== Data Karyawan ===");
        karyawan1.displayInfo();

        // Membuat objek Bus
        Bus bus1 = new Bus(
            "B001", "Sinar Jaya", "Eksekutif", 
            "B 1234 AB", "Double Decker", 50, "Nyaman", "bus1.jpg"
        );
        System.out.println("\n=== Data Bus ===");
        bus1.displayInfo();

        // Membuat objek Keberangkatan
        Keberangkatan keberangkatan1 = new Keberangkatan(
            "J001", "B001", "08:00", "2025-03-27", "Jakarta", "Surabaya"
        );
        System.out.println("\n=== Data Keberangkatan ===");
        keberangkatan1.displayInfo();

        // Membuat objek Pembayaran
        Pembayaran pembayaran1 = new Pembayaran(
            "P001", "2025-03-26", "bukti.jpg"
        );
        System.out.println("\n=== Data Pembayaran ===");
        pembayaran1.displayInfo();

        // Membuat objek Pemesanan
        Pemesanan pemesanan1 = new Pemesanan(
            "123456789", "Rini Nurulsona", "Perempuan", "Jakarta", "08123456789", 
            "01-01-2000", "rini@example.com", "P001", "B001", "K001"
        );
        System.out.println("\n=== Data Pemesanan ===");
        pemesanan1.displayInfo();
    }
}
