package Subject;

import Observer.Observer;

    public interface Subject {
        void attach(Observer observer);
        void deAttach(Observer observer);

        void notifyInvestor();
}
