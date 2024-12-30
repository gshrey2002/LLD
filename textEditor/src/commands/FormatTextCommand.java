package commands;

//import observer.TextEditorObserver;

import Formatters.TextFormattingStrategy;
import actors.TextEditor;

public class FormatTextCommand implements TextEditorCommands {

    private TextFormattingStrategy textFormattingStrategy;

    private TextEditor textEditor;

    private String TextToFormat;

    public FormatTextCommand(TextFormattingStrategy textFormattingStrategy, TextEditor textEditor, String textToFormat) {
        this.textFormattingStrategy = textFormattingStrategy;
        this.textEditor = textEditor;
        TextToFormat = textToFormat;
    }



    @Override
    public void excecute() {
        System.out.println("Formatting text");
String FormatedText= textFormattingStrategy.format(TextToFormat);
textEditor.setCurrentText(FormatedText);
    }
}
