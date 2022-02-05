package selenium;

public class RemoteCalculator implements Calculator {

	public int add(int...arr)
	{
		int sum=0;
		for(int a:arr) {
			sum=sum+a;
		}
		return sum;
	}
    public int sub(int...arr)
    {
    	int subt=0;
    	for(int a:arr) {
    		subt=subt-a;
    	}
    	return subt;
    }
    public int mul(int...arr)
    {
    	int mult=0;
    	for(int a:arr) {
    		mult=mult*a;
    	}
    	return mult;
     
    }
    }


