package com.company.sanjae.currency.converterTerminal;

public class US_JMD extends conversionMenu implements convert{
    private double usValue;
    private double result;
    private float Rate;

    public void setValues(double mValue){
        usValue = mValue;
        Rate = 129.02f;
    }
    @Override
    public double getConversion(){
       this.result = this.usValue * this.Rate;
       return this.result;
    }

    @Override
    public String getConversionS(){
        //this.result = this.usValue * this.Rate;
        String c = String.format("%.2f",this.result);
        return c;
    }

}
