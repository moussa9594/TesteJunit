package mesClassesTeste;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import mesClasses.HelloWord;

class Teste {

	@Test
	void testGetMessage() { assertNotNull(HelloWord.getMessage("moussa"));
	  }
	  
	  @Test
	  void testSum() { assertNotNull(HelloWord.sum(2, 3)); }

}
