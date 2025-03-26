class Pelanggan {
  private String noKTP;
  private String nama;
  private String jenisKelamin;
  private String alamat;
  private String noTelepon;
  private String tanggalLahir;
  private String email;

  public Pelanggan(String noKTP, String nama, String jenisKelamin, String alamat, String noTelepon, String tanggalLahir, String email) {
      this.noKTP = noKTP;
      this.nama = nama;
      this.jenisKelamin = jenisKelamin;
      this.alamat = alamat;
      this.noTelepon = noTelepon;
      this.tanggalLahir = tanggalLahir;
      this.email = email;
  }

  // Getter dan Setter
  public String getNoKTP() { return noKTP; }
  public void setNoKTP(String noKTP) { this.noKTP = noKTP; }

  public String getNama() { return nama; }
  public void setNama(String nama) { this.nama = nama; }

  public void displayInfo() {
      System.out.println("Pelanggan: " + nama + ", No KTP: " + noKTP);
  }
}
