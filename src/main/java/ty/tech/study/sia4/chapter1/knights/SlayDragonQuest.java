package ty.tech.study.sia4.chapter1.knights;

import java.io.PrintStream;
/*
 * 屠龙任务
 */
public class SlayDragonQuest implements Quest {

	  private PrintStream stream;

	  public SlayDragonQuest(PrintStream stream) {
	    this.stream = stream;
	  }

	  public void embark() {
	    stream.println("Embarking on quest to slay the dragon!");
	  }

}

