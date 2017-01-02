public class EasySingleton{
	
	 // this is the first method; it causes problem when there are multithreads running. multiple instance will be created.
   /*  private static EasySingleton Instance;
     
     private EasySingleton(){
    	 
     }
     
     public static EasySingleton getInstance(){
    	 if(Instance == null){
    		 Instance = new EasySingleton();
    	 }
    	 return Instance; */
	
	
	
	
	//this is second option to avoid multiple creation on instance in multithreading environment
	
	/*private static EasySingleton Instance = new EasySingleton();
	
	private EasySingleton(){
		
     }
	
	public static EasySingleton getInstance(){
		return Instance;
	}*/
	
	//second method brings in problems with respect to exception; it doesnt throw exceptin when multithread tries to instantiate again
	//also it doesnt use lazy initialization: delaying the creation of object until it is needed
	
	//third method: adds exception by using static blocks inside
	
/*private static EasySingleton Instance;

static{
	try{
		Instance = new EasySingleton();
	}catch(Exception e){
		throw new RuntimeException(e);
	}
	
}
	
	private EasySingleton() throws Exception{
		
     }
	
	public static EasySingleton getInstance(){
		return Instance;
	}
	//here exception is added but the lazy initialization is not preserved yet.
	*/
	
	
	//fourth method
	
	//method which holds lazy intilization and exception; uses nested class
	
	//java 1.4 or earlier this s the method to stick with
	
	/*
	private EasySingleton() throws Exception
	{}
	
	public static class singletonHolder{
	
	private static EasySingleton Instance;
	
	static{
		
		try{
			Instance = new EasySingleton();
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public static EasySingleton getInstance(){
		return Instance;
	}
	
	}*/
	
	//method 5; which is used for later java
	//uses volatile and syncronize to double check
	
	private static volatile EasySingleton Instance;
	
	private EasySingleton(){
		
	}
	
	public static EasySingleton getInstance()
	{
		if(Instance == null){
			synchronized(EasySingleton.class){
			if(Instance == null)
				Instance = new EasySingleton();
		}
		}
		return Instance;
	}
	
	
	//there is the latest method one liner
	//use this
	// public enum EasySingleton{
//		Instance;
	//	}
	//access it using EasySingleton.Instance
	
} 
