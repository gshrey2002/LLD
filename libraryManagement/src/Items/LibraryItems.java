package Items;

import main.lateFee;

//single responsibility principle
public interface LibraryItems extends lateFee {

    String getTiitle();
    String getId();

    double  getValue();


}
