package spittr.data;

public interface SpitterRepository {

	public Spitter save(Spitter spitter);
	
	public Spitter findByUsername(String userName);
}
