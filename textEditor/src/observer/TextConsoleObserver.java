package observer;

public class TextConsoleObserver implements TextEditorObserver{
    @Override
    public void update(String text) {
        System.out.println("Text Updated: "+ text);
    }
}
