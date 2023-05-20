package kcare.Object;

public interface StudentSubject {
	void registerObserver (Observer observer);
	void removeObserver (Observer observer);
	void notifyObservers();

}
