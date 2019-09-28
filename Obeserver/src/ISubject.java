
public interface ISubject {

	void notifyOberservers(Employee employee, String msg);

	void registerOberserver(IOobserver oobserver);

	void removeOberserver(IOobserver oobserver);

}