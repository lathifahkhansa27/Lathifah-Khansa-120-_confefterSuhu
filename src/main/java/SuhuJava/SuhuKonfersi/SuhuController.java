/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuhuJava.SuhuKonfersi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Dell Inspiron
 */
public class SuhuController {
    
    @RequestMapping("/suhu")
    @ResponseBody
    public String getSuhu(){
        String konversi = " ";
        
        
        double celcius = 55.4;
        double fahrenheit = 150.7;
        double celvin = 200;
        
        double suhu;
        
        String pilih = "f"; // pilihan untuk di konversi
        
        if(pilih=="c"){ // fahreinheit to celcius
            suhu = fahrenheit-32* 5/9;
            konversi = "Suhu Celcius : " +  suhu;
            
        }
        else if(pilih=="f"){ // celcius to fahreinheit
            suhu = 9/5* celcius + 32;
            konversi = "Suhu Fahreinheit : " + suhu + "<br>" + "Suhu Awal : " + celcius;
        }
        else{
            konversi = "tidak di temukan";
        }
        return konversi;
    }
}
