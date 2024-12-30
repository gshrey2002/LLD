package actors;

import observer.TextConsoleObserver;
import observer.TextEditorObserver;

import java.util.ArrayList;
import java.util.List;

public class TextEditor implements TextEditorSubject{

    private List<TextEditorObserver> observerList=new ArrayList<>();
    private  String currentText="";
    @Override
    public void regiterObserver(TextEditorObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(TextEditorObserver observer) {
observerList.remove(observer);
    }

    @Override
    public void notifyObserver()
    {
for(TextEditorObserver observer:observerList){
    observer.update(this.currentText);
}
    }

    public void setCurrentText(String currentText) {
        this.currentText = currentText;
    }
}
