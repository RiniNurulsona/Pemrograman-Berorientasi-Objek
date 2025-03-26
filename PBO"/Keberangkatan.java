class Keberangkatan {
  private String kodeJadwal;
  private String kodeBus;
  private String jam;
  private String tanggal;
  private String kotaAsal;
  private String kotaTujuan;

  public Keberangkatan(String kodeJadwal, String kodeBus, String jam, String tanggal, String kotaAsal, String kotaTujuan) {
      this.kodeJadwal = kodeJadwal;
      this.kodeBus = kodeBus;
      this.jam = jam;
      this.tanggal = tanggal;
      this.kotaAsal = kotaAsal;
      this.kotaTujuan = kotaTujuan;
  }

  // Getter dan Setter
  public String getKodeJadwal() { return kodeJadwal; }
  public void setKodeJadwal(String kodeJadwal) { this.kodeJadwal = kodeJadwal; }

  public void displayInfo() {
      System.out.println("Keberangkatan dari " + kotaAsal + " ke " + kotaTujuan);
  }
}
