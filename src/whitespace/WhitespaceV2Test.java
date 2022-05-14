package whitespace;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class WhitespaceV2Test {

	private WhitespaceV2 whitespace;
	
	@BeforeEach
	void setUp() throws Exception {
		this.whitespace = new WhitespaceV2();
	}

	@Test
	void test1() {
		assertEquals("", this.whitespace.collapseWhitespace(""));
	}
	
	@Test
	void test2() {
		assertEquals(" ", this.whitespace.collapseWhitespace(""));
	}

	@Test
	void test3() {
		assertEquals("", this.whitespace.collapseWhitespace("         "));
	}
	
	@Test
	void test4() {
		assertEquals(" ", this.whitespace.collapseWhitespace("         "));
	}
	
	@Test
	void test5() {
		assertEquals("The Islamic University of Gaza", this.whitespace.collapseWhitespace("The Islamic University of Gaza"));
	}
	
	@Test
	void test6() {
		assertEquals("The Islamic University of Gaza", this.whitespace.collapseWhitespace("The Islamic   University of Gaza"));
	}
	
	@Test
	void test7() {
		assertEquals(" The Islamic University of Gaza", this.whitespace.collapseWhitespace("  The Islamic University of Gaza"));
	}
	
	@Test
	void test8() {
		assertEquals("The Islamic University of Gaza ", this.whitespace.collapseWhitespace("The Islamic University of Gaza  "));
	}
	
	@Test
	void test9() {
		assertEquals(" The Islamic University of Gaza ", this.whitespace.collapseWhitespace("  The Islamic University of   Gaza  "));
	}
	
	@Test
	void test10() {
		assertEquals("The Islamic University of Gaza", this.whitespace.collapseWhitespace("The   Islamic University of   Gaza"));
	}
	
}
