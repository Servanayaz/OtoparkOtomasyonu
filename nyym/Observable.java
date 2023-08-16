
package nyym;

import java.util.ArrayList;
import java.util.List;


public abstract class Observable {
    
    private List<Observer> observerList;
    
    public Observable(){
        observerList = new ArrayList<>();
    }
    
    public void ekle(Observer observer){
        observerList.add(observer);
       }
    public void cikar(Observer observer){
        observerList.remove(observer);
       }
    public void haberver(){
        for(Observer observer : observerList){
            observer.update(this);
        
        }
    
    }
    
}
