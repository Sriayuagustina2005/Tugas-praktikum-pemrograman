public class Pakaian {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int harga;


    public Pakaian(String nama, int stok, int hargaSatuan){
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
        Pakaian baju = new Pakaian("baju", 15, 75000);
        Pakaian celana = new Pakaian("celana", 10, 100000);
        Pakaian jilbab = new Pakaian("jilbab", 20, 30000);
    
    System.out.println("Penjualan Alat Tulis: ");
    System.out.println(baju.getinfo());
    System.out.println();
    System.out.println(celana.getinfo());
    System.out.println();
    System.out.println(jilbab.getinfo());

    //menghitung total harga 
    int totalHarga = baju.getTotalHarga() + celana.getTotalHarga() + jilbab.getTotalHarga();

    System.out.println();
    System.out.println("Total uang yang diterima penjual jika semuanya terjual: Rp." + totalHarga);
    }


} 

