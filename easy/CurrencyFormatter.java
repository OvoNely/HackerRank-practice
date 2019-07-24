import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfCh = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        NumberFormat nfIn = NumberFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("Rs.");
        dfs.setGroupingSeparator(',');
        dfs.setMonetaryDecimalSeparator('.');
        ((DecimalFormat) nfIn).setDecimalFormatSymbols(dfs);

        String us = nfUS.format(payment);
        String india = nfIn.format(payment);
        String china = nfCh.format(payment);
        String france = nfFr.format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
