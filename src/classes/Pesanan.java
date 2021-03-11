package classes;

/**
 *
 * @author alfanumeric
 */
public class Pesanan {
    private Menu menu;
    private int jumlah;
    private String keterangan;

    public Pesanan (Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }
    
    public Menu getMenu () {
        return this.menu;
    }
    
    public int getJumlah () {
        return this.jumlah;
    }
  
    public void setKeterangan (String keterangan) {}
    
    public String getKeterangan () {
        return this.keterangan;
    }
}
