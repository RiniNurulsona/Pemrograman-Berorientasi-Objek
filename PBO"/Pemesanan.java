class Pemesanan extends Pelanggan {
  private String kodePemesanan;
  private String kodeBus;
  private String idKaryawan;

  public Pemesanan(String noKTP, String nama, String jenisKelamin, String alamat, String noTelepon, String tanggalLahir, String email, 
                   String kodePemesanan, String kodeBus, String idKaryawan) {
      super(noKTP, nama, jenisKelamin, alamat, noTelepon, tanggalLahir, email);
      this.kodePemesanan = kodePemesanan;
      this.kodeBus = kodeBus;
      this.idKaryawan = idKaryawan;
  }

  // Getter dan Setter
  public String getKodePemesanan() { return kodePemesanan; }
  public void setKodePemesanan(String kodePemesanan) { this.kodePemesanan = kodePemesanan; }

  @Override
  public void displayInfo() {
      super.displayInfo();
      System.out.println("Kode Pemesanan: " + kodePemesanan + ", Bus: " + kodeBus);
  }
}
