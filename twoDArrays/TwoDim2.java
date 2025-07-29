package twoDArrays;

public class TwoDim2 {
	public static void main(String[] args) {
		String[] namesV1 = {"Smith","King","Raju","Scott","Turner"};
		String[] namesV2 = {"Smith","Raju","Scott","Turner"};
		String[] namesV3 = {"Raju","Scott","Turner"};
		
		String [][] ans = {namesV1,namesV2,namesV3};
		
		for (int i = 0; i < ans[0].length; i++) {
			System.out.print(ans[0][i]+", ");
		}
	}
}
