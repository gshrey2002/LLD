import Formatters.TextFormattingStrategy;
import Formatters.UpperCaseStrategy;
import actors.TextEditor;
import commands.FormatTextCommand;
import commands.TextEditorCommands;
import observer.TextConsoleObserver;
import observer.TextEditorObserver;

public class TextEditorAPP {
    public static void main(String[] args) {
        //create text editor
        TextEditor textEditor=new TextEditor();
        //text editor observer ie. Console
        TextEditorObserver observer=new TextConsoleObserver();
        //register all observer with text editor
        textEditor.regiterObserver(observer);
        //formatters
        textEditor.setCurrentText("Hello world");

        TextFormattingStrategy stategy=new UpperCaseStrategy();

        TextEditorCommands command=new FormatTextCommand(stategy,textEditor,"Hello worlds");

        command.excecute();

        textEditor.notifyObserver();
    }
}
