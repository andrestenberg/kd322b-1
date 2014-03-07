import java.util.ArrayList;


public class Human {
	
	//final i stora bokst�ver
	public static final int MIN_LENGTH = 3;
	
	private Dog dog;
	private String name;
	
	//konstruktor
	public Human(String _name){
		name = _name;
	}
	
	//ger namnet
	public String getName(){
		return name;
	}
	
	//best�mmer 
	public void buyDog(Dog _dog){
		this.dog = _dog;
	}
	
	public String getInfo(){
		if (name != null && dog != null){
				return (name + " �ger en hund som heter " + dog.getName());
			}else if (name != null && dog == null){
				return (name + " �ger inte en hund");
			}else {
				return null;
		}
	}

}

