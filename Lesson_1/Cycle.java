public class Cycle {	
    public static void main(String[] args) {
		int i, sum = 0;

    	for (i = 0; i <= 20; i++) {
    		System.out.println(i);
    	}

    	i = 6;
    	while (i >=-6 && i <= 6) {
    		System.out.println(i);
    		i -= 2;
    	}

    	i = 10;
    	do {
    		if (i % 2 != 0){
    			sum += i;
    		}
    		i++;
    	} while (i >= 10 && i <= 20);
    	System.out.println(sum);
    }
}