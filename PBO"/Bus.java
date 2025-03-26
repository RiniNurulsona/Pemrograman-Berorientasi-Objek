class Bus {
  private String kodeBus;
  private String nama;
  private String kelas;
  private String noPolisi;
  private String jenisBus;
  private int kapasitasPenumpang;
  private String keterangan;
  private String gambar;

  public Bus(String kodeBus, String nama, String kelas, String noPolisi, String jenisBus, int kapasitasPenumpang, String keterangan, String gambar) {
      this.kodeBus = kodeBus;
      this.nama = nama;
      this.kelas = kelas;
      this.noPolisi = noPolisi;
      this.jenisBus = jenisBus;
      this.kapasitasPenumpang = kapasitasPenumpang;
      this.keterangan = keterangan;
      this.gambar = gambar;
  }

  // Getter dan Setter
  public String getKodeBus() { return kodeBus; }
  public void setKodeBus(String kodeBus) { this.kodeBus = kodeBus; }

  public String getNama() { return nama; }
  public void setNama(String nama) { this.nama = nama; }

  public void displayInfo() {
      System.out.println("Bus: " + nama + ", Kelas: " + kelas);
  }
}
