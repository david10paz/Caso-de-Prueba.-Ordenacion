package Ordenación;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ordenar3javaTest {

	@Test
	void test() {
		//Introduce 1, 5, 3
				ordenar3java Ordenacion1 = new ordenar3java();
				System.out.println(Ordenacion1.ordenacion());
		//Introduce 1, 3, 5
				ordenar3java Ordenacion2 = new ordenar3java();
				System.out.println(Ordenacion2.ordenacion());
		//Introduce 8, 3, 5
				ordenar3java Ordenacion3 = new ordenar3java();
				System.out.println(Ordenacion3.ordenacion());
		//Introduce 5, 3, 8
				ordenar3java Ordenacion4 = new ordenar3java();
				System.out.println(Ordenacion4.ordenacion());
		//Introduce 5, 8, 2
				ordenar3java Ordenacion5 = new ordenar3java();
				System.out.println(Ordenacion5.ordenacion());
		//Introduce 8, 5, 2
				ordenar3java Ordenacion6 = new ordenar3java();
				System.out.println(Ordenacion6.ordenacion());
		
	}

}
