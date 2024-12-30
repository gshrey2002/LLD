package actors;

import observer.TextEditorObserver;

public interface TextEditorSubject {

    //register observer
    void regiterObserver(TextEditorObserver observer);


    //remove observer
    void removeObserver(TextEditorObserver observer);

    //notify observer
    void notifyObserver();

}
