/**
 * Created by manish on 2/5/2017.
 */
import java.rmi.*;

public interface ChatClientInt extends Remote{
    public void tell (String name)throws RemoteException ;
    public String getName()throws RemoteException ;
}