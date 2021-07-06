package oreilybooks.disagnpatterns.weather;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}


