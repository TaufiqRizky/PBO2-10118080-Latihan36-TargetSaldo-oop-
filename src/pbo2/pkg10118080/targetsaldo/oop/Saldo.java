/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.targetsaldo.oop;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Trizky
 */
public class Saldo {
    private double saldo,target,bunga;

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(int bunga) {
        this.bunga = bunga/100;
    }
    
    public void HitungSaldo(){
        DecimalFormat df = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("");
        dfs.setMonetaryDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        int i=1;
        do {   
            saldo=saldo+(saldo*0.08);
            String hsl = df.format(getSaldo());
            System.out.println("Saldo di bulan ke-"+i+" "+hsl);
            i++;
        } while (getSaldo() < getTarget());
    }
    
}
