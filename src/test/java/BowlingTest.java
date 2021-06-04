import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BowlingTest {

  @Test
  void testScore(){
    Bowling bowling = new Bowling();

    int score = bowling.score();

    assertThat(score).isEqualTo(-1);
  }

}
