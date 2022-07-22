package single;

public class singlethread {

	public static void main(String[] args) {
		
		singlethread s = new singlethread();
		s.run();
		for (int j=1;j<=50;j++) {
			System.out.println("j: "+j+"\t");
		}

	}
	
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println("i: "+ i + "\t");
		}
	}

}
