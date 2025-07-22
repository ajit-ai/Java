package basic;

public class exp {

    public static void main(String[] args) {

        String captcha = generateCaptch(8);
        System.out.println("generateCaptch(9)--> " + captcha);
    }

    private static String generateCaptch(int n) {

        //to generate random integers in the range [0-61]
		//Random rand = new Random(62); 
		
		// Characters to be included
		String chrs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
		// Generate n characters from above set and
		// add these characters to captcha.
		String captcha = "";
		while (n-->0){
            int indexes = (int) (Math.random()*62);
            System.out.println("indexes--> " + indexes);
			int index = (int)(Math.random()*62);
            System.out.println("index---" + index);
			captcha+=chrs.charAt(index);
            System.out.println("Captch --> " + captcha);
		}
		
		return captcha;
	}
}