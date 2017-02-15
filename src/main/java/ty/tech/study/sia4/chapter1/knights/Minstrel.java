package ty.tech.study.sia4.chapter1.knights;

import java.io.PrintStream;
/**
 * 吟游诗人
 * @author 江涛
 *
 */
public class Minstrel {

	  private PrintStream stream;
	  
	  public Minstrel(PrintStream stream) {
	    this.stream = stream;
	  }

	  public void singBeforeQuest() {
	    stream.println("Fa la la, the knight is so brave!");
	  }

	  public void singAfterQuest() {
	    stream.println("Tee hee hee, the brave knight " +
	    		"did embark on a quest!");
	  }
}
