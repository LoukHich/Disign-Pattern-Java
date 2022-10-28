import java.util.ArrayList;
import java.util.List;

public class ObservableImp implements Observable{
  private String nom ;
  private List<Observer> subs ;
  
  public ObservableImp(String title) {
	this.nom =title;
	this.subs= new ArrayList<Observer>();
}
@Override
public void subscribe(Observer sb) {
	  subs.add(sb);
  }
  
@Override
public void unsubscribe(Observer sb) {
	  subs.remove(sb);
  }
 
@Override
public void notifySub(String videoTitle) {
	  for(Observer sub : subs) {
		 sub.updat(videoTitle);
	  }
  }

}
