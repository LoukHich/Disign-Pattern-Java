
public interface Observable  {

	void subscribe(Observer sb);

	void unsubscribe(Observer sb);

	void notifySub(String videoTitle);

}