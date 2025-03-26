class Karyawan {
  private String idKaryawan;
  private String nama;
  private String jenisKelamin;
  private String alamat;
  private String noTelepon;
  private String username;
  private String password;

  public Karyawan(String idKaryawan, String nama, String jenisKelamin, String alamat, String noTelepon, String username, String password) {
      this.idKaryawan = idKaryawan;
      this.nama = nama;
      this.jenisKelamin = jenisKelamin;
      this.alamat = alamat;
      this.noTelepon = noTelepon;
      this.username = username;
      this.password = password;
  }

  // Getter dan Setter
  public String getIdKaryawan() { return idKaryawan; }
  public void setIdKaryawan(String idKaryawan) { this.idKaryawan = idKaryawan; }

  public String getNama() { return nama; }
  public void setNama(String nama) { this.nama = nama; }

  public void displayInfo() {
      System.out.println("Karyawan: " + nama + ", ID: " + idKaryawan);
  }
}
