package Formatters;

public class LowerClassStrategy implements TextFormattingStrategy{
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
