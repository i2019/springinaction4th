package ty.tech.study.sia4.chapter1.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ty.tech.study.sia4.chapter1.knights.BraveKnight;
import ty.tech.study.sia4.chapter1.knights.Knight;
import ty.tech.study.sia4.chapter1.knights.Quest;
import ty.tech.study.sia4.chapter1.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
	  System.out.println("KnightConfig knight()");
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
	  System.out.println("KnightConfig quest()");
    return new SlayDragonQuest(System.out);
  }

}
