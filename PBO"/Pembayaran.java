class Pembayaran {
  private String kodePemesanan;
  private String tanggalPembayaran;
  private String gambar;

  public Pembayaran(String kodePemesanan, String tanggalPembayaran) {
      this.kodePemesanan = kodePemesanan;
      this.tanggalPembayaran = tanggalPembayaran;
  }

  public Pembayaran(String kodePemesanan, String tanggalPembayaran, String gambar) {
      this.kodePemesanan = kodePemesanan;
      this.tanggalPembayaran = tanggalPembayaran;
      this.gambar = gambar;
  }

  // Getter dan Setter
  public String getKodePemesanan() { return kodePemesanan; }
  public void setKodePemesanan(String kodePemesanan) { this.kodePemesanan = kodePemesanan; }

  public void displayInfo() {
      System.out.println("Pembayaran untuk kode: " + kodePemesanan + ", tanggal: " + tanggalPembayaran);
  }
}
