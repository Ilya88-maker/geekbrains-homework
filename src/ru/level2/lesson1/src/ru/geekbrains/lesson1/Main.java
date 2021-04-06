package ru.geekbrains.lesson1;

public class Main {

	public static void main(String[] args) {
		Animate human = new Human("Вася");
		Animate cat = new Cat("Барсик");
		Animate robot = new Robot("Bender");
		Object[] objects = {human, cat, robot};


		for (Object o : objects) {
			if (o instanceof Animate) {
				((Animate) o).sayYouName();
				if (o instanceof Human) {
					((Human) o).sayYouName();
					if (o instanceof Cat) {
						((Cat) o).sayYouName();
					} else if (o instanceof Robot) {
						((Robot) o).sayYouName();
					}


				}
			}
		}

	}
}