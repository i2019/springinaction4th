package ty.tech.study.sia4.chapter1.knights;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class BraveKnightTest {
	  @Test
	  public void knightShouldEmbarkOnQuest() {
	    Quest mockQuest = mock(Quest.class);
	    BraveKnight knight = new BraveKnight(mockQuest);
	    knight.embarkOnQuest();
	    knight.embarkOnQuest();
	    verify(mockQuest, times(2)).embark();
	  }
}
