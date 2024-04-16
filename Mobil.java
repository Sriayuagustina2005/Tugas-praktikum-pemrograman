public class Mobil {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int harga;


    public Mobil(String nama, int stok, int hargaSatuan){
        this.nama = nama;
        this.stok = stok;  
        this.hargaSatuan = hargaSatuan;
        this.harga = stok * hargaSatuan;
    }

    //setter untuk nama, stok harga serta harga satuan
    public void setInfo(String nama, int stok, int hargaSatuan){
        this.nama = nama ;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.harga = stok * hargaSatuan;
    }

    //Getter untuk nama, stok, harga serta harga satuan 
    public String getinfo(){
        return "Nama: " + nama + "\n" +
               "Stok: " + stok + "\n" +
               "Harga Satuan: Rp. " + hargaSatuan + "\n" +
               "Harga: Rp. " + harga;
    }

    //pemanggilan setter dan getter untuk total harga 
    public void setTotalHarga(int totalHarga){
        this.harga = totalHarga;
    }
    public int getTotalHarga(){
        return this.harga;
    }

    public static void main(String[]args){
        Mobil pajero = new Mobil("pajero", 2, 600000000);
        Mobil fortuner = new Mobil("fortuner", 3, 550000000);
        Mobil civic = new Mobil("civic", 2, 700000000);
    
    System.out.println("Penjualan Mobil: ");
    System.out.println(pajero.getinfo());
    System.out.println();
    System.out.println(fortuner.getinfo());
    System.out.println();
    System.out.println(civic.getinfo());

    //menghitung total harga 
    int totalHarga = pajero.getTotalHarga() + fortuner.getTotalHarga() + civic.getTotalHarga();

    System.out.println();
    System.out.println("Total uang yang diterima penjual jika semuanya terjual: Rp." + totalHarga);
    }


} 

