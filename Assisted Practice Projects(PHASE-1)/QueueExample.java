package ebook1;
public class QueueExample 
{
public static void main(String[] args) 
{
        		QueueExample locationsQueue = new QueueExample();
locationsQueue.add("Kolkata");
        		locationsQueue.add("Patna");
        		locationsQueue.add("Delhi");
        		locationsQueue.add("Gurgaon");
        		locationsQueue.add("Noida");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}

private String size() {
	// TODO Auto-generated method stub
	return null;
}

private void remove() {
	// TODO Auto-generated method stub
	
}

private String peek() {
	// TODO Auto-generated method stub
	return null;
}

private void add(String string) {
	// TODO Auto-generated method stub
	
}
}

