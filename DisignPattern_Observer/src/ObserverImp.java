public class ObserverImp implements  Observer {
	
	private String nom ;
	private Observable channel;
	
	public ObserverImp(String nom) {
		
		this.nom = nom;
	}

	@Override
	public void updat(String title) {
		System.out.println("Hi "+nom+" "+"video uploaded "+title);
	}
	
	@Override
		public void subscribeInchannel(String title) {
			channel = new ObservableImp(title);
	}
}
