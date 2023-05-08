
import com.sun.xml.internal.ws.wsdl.writer.document.ParamType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERTAM-PC
 */
class Test{
    public static void main(String[]args){
         //Account account1=new Account("3234214",1000.0,"saddsa fggjhgj","qwewqeewqw@hotmail.com","54345345");
         Account account1 = new Account();
         
         //account1.paraYatır(7000);
         //System.out.println(account1.getIsim());
         //account1.paraÇek(1500);
         //account1.getHesapNo();
        Account account2 = new Account("Ahmet Can","example@gmail.com","93217427");
        System.out.println(account2.getEmail());
         System.out.println(account2.getIsim());
         System.out.println(account2.getTelNo());
        
    } 
}

public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telNo;
    
    public Account() {
            //System.out.println("Constructor Oldu Mu?"); //Constructor Yapıcı Fonksiyon Çağırma İlk burası çalışır..
                //this("132345",1000.0,"Mehmet","saddas@gmail.com","5338273641");
}
    public Account (String hesapNo,double bakiye,String isim,String email,String telNo){ //Metod Overloading yapmış olduk ;)
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telNo=telNo;
    }
    public Account (String isim,String email,String telNo)
    {
        this("Bilgi Yok",0.0,isim,email,telNo);
    }

    public void paraYatır (double miktar) {
        bakiye+=miktar;
        System.out.println("Yeni Bakiye :"+miktar);
    }
    public void paraÇek (double miktar) {
        bakiye-=miktar;
        if (miktar-bakiye>0) 
        {
            System.out.println("Hesabınızda çekmek istediğiniz tutar kadar bakiyeniz bulunmamaktadır...\n Bakiyeniz: "+bakiye);
            
        }
        if (miktar>1500) 
        {
            System.out.println("En fazla 1500 tl çekebilirsiniz...");   
        }
        else {
            System.out.println("Hesabınızdan "+miktar+" TL para çekilmiştir...\n Yeni Bakiyeniz: "+bakiye+" TL");
        }
    }
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye=bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    
    
}
