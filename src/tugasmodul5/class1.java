/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul5;

/**
 *
 * @author ASUS
 */
public class class1 {
    public String nama1;
    public String nama2;
    public String id1;
    public String id2;
    
    public class1 (String nama1, String nama2, String id1, String id2)
    {
        this.nama1 = nama1;
        this.nama2 = nama2;
        this.id1 = id1;
        this.id2 = id2;
    }
    
    public String namakesatu(){
        return "Nama\t: " + nama1 +" ("+id1+")";
    }
    public String namakedua(){
        return "Nama\t: " + nama2 +" ("+id2+")";
    }
}

