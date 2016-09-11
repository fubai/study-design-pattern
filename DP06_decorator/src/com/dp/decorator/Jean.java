package com.dp.decorator;

/**
 * еёвп©Ц
 * @author zhang
 *
 */
public class Jean extends Clothes {

	public Jean(Person person) {
		super(person);
	}

	@Override
	public void decorate() {
		System.out.println("╢╘иоеёвп©Ц");
		super.decorate();
	}
	
	

}
