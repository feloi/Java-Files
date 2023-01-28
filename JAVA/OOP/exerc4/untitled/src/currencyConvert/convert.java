package currencyConvert;

public class convert {
    public static double dolar;
    public static double amount;

    public double sum = dolar * amount;

    public static double convertDolar(){
        return dolar * amount + (dolar * amount) * 6 /100;
    }

}
