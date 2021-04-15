package clıst;
class Dugum {
   int not ;
   Dugum ileri,geri;
   Dugum(int not){
       this.not=not;
ileri=null;
geri=null;
   
   }
}
public class Clıst {
Dugum bas,son,tmp;
 double toplam =0;   
 int esayısı;
 double ort=0;
 
Clıst(){
    bas=null;
    son=null;
}
    void ekle_bas(Dugum yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }
        else{ 
            yeni.ileri=bas;
           bas.geri=yeni;
            bas=yeni;
                }
  toplam+=yeni.not;
     esayısı++;  
 ort=toplam/esayısı;
    }
  void son_ekle(Dugum yeni){
      if(bas==null){
          bas=yeni;
          son=yeni;
          
      }
      else{
          son.ileri=yeni;
          yeni.geri=son;
          son=yeni;
             }
  toplam+=yeni.not;
    esayısı++;
  ort=toplam/esayısı;
  }  
  void  bas_sil(){
      
      
      bas=bas.ileri;
      if(bas==null){
          son=null;
          bas=null;
      }
    else{
bas.geri=null;
      }
  esayısı--;
  
  }
 void sondan_sil(){     son=son.geri;
     if (son==null){
         son=null;bas=null;
     }
     else{ son.ileri=null;
     }
esayısı--;
 
 }
  void aranan(int t){
      tmp=bas;
      while(tmp!=null){
          if(tmp.not==t){
              System.out.println("Aranan Eleman vardır:::::::***********-->>>"+tmp.not);
          break;}
      tmp=tmp.ileri;
      }
      }
  void araya_ekle(int t,Dugum yeni){
    tmp=bas;
    while(tmp.not!=t && tmp!=null)
                tmp=tmp.ileri;
    if(tmp==null){   
        System.out.println("eleman bulunamadı");

    }
    else{
        yeni.geri=tmp;
        yeni.ileri=tmp.ileri;
    tmp.ileri.geri=yeni;
    tmp.ileri=yeni;
    }
        }
  /*void aradan_sil(int t){
    tmp=bas;
    Dugum once =null;
    while(tmp.not!=t && tmp!=null)
        once =tmp;
    tmp=tmp.ileri;
    
if(tmp==null){
    System.out.println("eleman now");
}
else{
    tmp.ileri.geri=tmp.geri;
    tmp.geri.ileri=tmp.ileri;
}
  }*/
  void goster(){
      tmp=bas;
      while(tmp!=null){
          System.out.print(tmp.not+",");
         
   tmp=tmp.ileri;   }
   System.out.println(" ");}
    public static void main(String[] args) {
      Clıst c=new Clıst();
        System.out.print("Listedeki Elemanlar:");
      c.ekle_bas(new Dugum(4));
      c.ekle_bas(new Dugum(6));
     c.ekle_bas(new Dugum(7));
      c.son_ekle(new Dugum(0));
      c.ekle_bas(new Dugum(8));
    c.son_ekle(new Dugum(9));
  
    
    c.goster();
     // c.aranan(4);
   System.out.println("listedeki elemanlar toplamı="+c.toplam);
   System.out.println("listedeki eleman sayısı="+c.esayısı);
   System.out.println("listedeki elemanların aritmetik ortalaması="+c.ort);
   System.out.println("araya ekleme");
        //c.araya_ekle(6, new Dugum(11));
     c.goster();
     /*System.out.print("silme işlemi yapdıktan sonra Listedeki elemanlar=");
    c.bas_sil();
    c.sondan_sil();
    c.goster(); */
    }
    
}
