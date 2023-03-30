
// import java.time.LocalDate;
import java.util.Currency;
// import java.util.Locale;
public class Formatting {
    // Locale locale = new Locale("en","US");
    // Currency currency = Currency.getInstance(locale);
    MessageReader messageReader = new MessageReader();

public String getSymbols(){
    Currency currency = Currency.getInstance(messageReader.getLocale());
    return currency.getSymbol();
}
}

