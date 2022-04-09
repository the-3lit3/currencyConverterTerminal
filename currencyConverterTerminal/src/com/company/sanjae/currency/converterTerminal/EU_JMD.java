package com.company.sanjae.currency.converterTerminal;

public class EU_JMD extends conversionMenu implements convert{
    private double euValue, Rate, result;

    public void setValues(double mValue){
        euValue = mValue;
        Rate = 164.33;
    }

    @Override
    public double getConversion(){
        result = this.euValue * this.Rate;

        return result;
    }

    @Override
    public String getConversionS(){
        //this.result = this.usValue * this.Rate;
        String c = String.format("%.2f",this.result);
        return c;
    }
}
