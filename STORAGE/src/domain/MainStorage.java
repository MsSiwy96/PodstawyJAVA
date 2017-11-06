package domain;

public class MainStorage {

	/**
	 * @param args
	 */
	static final int x=4 ,y=4 ,z=4;
	Package[][][] cube = new Package[x][y][z];
	
	private void addPackages(){
		for(int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				for(int k=0; k<z/2; k++){
					cube[i][j][k] = new Package();
				}
			}
		}
	}
	
	private int drawPriority() {
		
		
		return 0;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
