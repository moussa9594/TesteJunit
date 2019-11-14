package mesClassesTeste;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mesClasses.HelloWord;

class TesteHW {

	@Test
	void testGetMessage() {
		assertNotNull(HelloWord.getMessage("moussa"));
	}

	@Test
	void testSum() {
		assertNotNull(HelloWord.sum(2, 3));
	}

	

}
