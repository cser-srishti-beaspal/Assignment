/**
 * 
 */
package edu.ju.wap.mod1.pack;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Input input = new Input();
        String number = input.getInput();

        AutobiographicalNumber checker = new AutobiographicalNumber();

        if (checker.isAutobiographical(number)) {
            System.out.println("It is an Autobiographical Number.");
        } else {
            System.out.println("It is NOT an Autobiographical Number.");
        }
	}

}
