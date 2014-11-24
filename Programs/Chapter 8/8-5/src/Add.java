
public class Add {
	
	void getTotal(int n){
		
		int tot = 0;
		for (int i = 1; i <= n; i++){
			
			System.out.print(i);
			
			
			if (i >= 1 && i < n)
				System.out.print(" + ");
			
			tot = tot + i;
		}
		System.out.print(" = " + tot);
	}
}
