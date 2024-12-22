package main;

public class lateFeeCalculator {


    public double calculateDoubleLateFees(lateFee[] items,int days){
    double totallateFees=0;
    for(lateFee item:items){
        totallateFees+=item.calculateFees(days);
    }
    return totallateFees;
    }
}
