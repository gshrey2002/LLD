package Formatters;

public class UpperCaseStrategy implements TextFormattingStrategy{
    @Override
    public String format(String text) {
        System.out.println("formatting text to uppercase");
        return text.toUpperCase();
    }
}
