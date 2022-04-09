package com.company.sanjae.currency.converterTerminal;

public class CAD_JMD implements convert{
    private double cadValve;
    private double Rate, result;

    public void setValues(double mValue){
        this.cadValve = mValue;
        Rate = 97.5;
    }

    @Override
    public double getConversion(){
        result = cadValve * Rate;
        return this.result;
    }

    @Override
    public String getConversionS(){
        //this.result = this.usValue * this.Rate;
        String c = String.format("%.2f",this.result);
        return c;
    }
}
