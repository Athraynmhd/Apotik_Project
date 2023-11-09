public class DataKasir extends Kasir
{
     public void setIdKasir(String IdKasir) {
        
        if ("K001".equals(IdKasir)) {
            this.NamaKasir = "Aria Grande";
            this.IdKasir = "K001";
        } else if ("K002".equals(IdKasir)) {
            this.NamaKasir = "Nagaragana";
            this.IdKasir = "K002";
        }  else {
            System.out.println("ID Kasir tidak valid.");
        }
     }
   
}
