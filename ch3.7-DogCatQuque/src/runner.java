
public class runner {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DogCatQuque myquque = new DogCatQuque();
		
		myquque.enquque(new Cat("AA"));
		myquque.enquque(new Cat("BB"));
		myquque.enquque(new Dog("11"));
		System.out.println(myquque.deququeAny().getName());
		System.out.println(myquque.deququeDog().getName());
		myquque.enquque(new Cat("CC"));
		myquque.enquque(new Cat("DD"));
		System.out.println(myquque.deququeAny().getName());
		System.out.println(myquque.deququeCat().getName());
		myquque.enquque(new Dog("22"));
		myquque.enquque(new Dog("33"));
		System.out.println(myquque.deququeDog().getName());
		System.out.println(myquque.deququeAny().getName());
		myquque.enquque(new Dog("44"));
		myquque.enquque(new Cat("EE"));
		
		

		
		
		
	}

}
