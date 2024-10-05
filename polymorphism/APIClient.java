package day5.polymorphism;

public class APIClient {
	
    
    public void sendRequest(String endpoint)
    {
    	System.out.println("Endpoint:" +endpoint);
    }
    
    public void sendRequest(String endpoint, String requestBody,boolean requestStatus)
    {
    	System.out.println("Endpoint:" +endpoint);
    	System.out.println("requestBody:" +requestBody);
    	System.out.println("requestStatus:" +requestStatus);
    	
    }
    
    public static void main(String[] args) {
		
    	APIClient client = new APIClient();
    	client.sendRequest("last");
    	client.sendRequest("last", "final", false);
	}
}
