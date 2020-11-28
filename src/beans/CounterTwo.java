package beans;

//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
//@ApplicationScoped
//@requestScoped
@SessionScoped

public class CounterTwo {
	private int value;

	
	public CounterTwo() {
		value=0;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}

	public void increment(){
		this.value++;
		
	}
	
}
