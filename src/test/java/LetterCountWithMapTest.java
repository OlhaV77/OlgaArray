import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LetterCountWithMapTest {

    @Test
    public void countLetters_whenEmptyString_returnEmptyArray() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("");

        assertThat(actual).hasSize(0);
    }

    @Test
    public void countLetters_whenOneLetter_returnOneLetterSummary() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("a");

        assertThat(actual).hasSize(1);

        LetterSummary actualLetterSummary = actual[0];
        assertThat(actualLetterSummary.count).isEqualTo(1);
        assertThat(actualLetterSummary.letter).isEqualTo("a");
    }

    @Test
    public void twoLetter() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("ab");

        assertThat(actual).hasSize(2);

        LetterSummary actualFirstLetterSummary = actual[0];
        assertThat(actualFirstLetterSummary.count).isEqualTo(1);
        assertThat(actualFirstLetterSummary.letter).isEqualTo("a");

        LetterSummary actualSecondLetterSummary = actual[1];
        assertThat(actualSecondLetterSummary.count).isEqualTo(1);
        assertThat(actualSecondLetterSummary.letter).isEqualTo("b");
    }

    @Test
    public void threeLetter() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("abc");

        assertThat(actual).hasSize(3);

        LetterSummary actualFirstLetterSummary = actual[0];
        assertThat(actualFirstLetterSummary.count).isEqualTo(1);
        assertThat(actualFirstLetterSummary.letter).isEqualTo("a");

        LetterSummary actualSecondLetterSummary = actual[1];
        assertThat(actualSecondLetterSummary.count).isEqualTo(1);
        assertThat(actualSecondLetterSummary.letter).isEqualTo("b");

        LetterSummary actualThirdLetterSummary = actual[2];
        assertThat(actualThirdLetterSummary.count).isEqualTo(1);
        assertThat(actualThirdLetterSummary.letter).isEqualTo("c");
    }

    @Test
    public void sixLetter() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("abcdef");

        assertThat(actual).hasSize(6);
    }

    @Test
    public void twoLetters_whenOneRepeatingLetter_returns1LetterSummaryWithACount2() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("aa");

        assertThat(actual).hasSize(1);

        LetterSummary actualFirstLetterSummary = actual[0];
        assertThat(actualFirstLetterSummary.count).isEqualTo(2);
        assertThat(actualFirstLetterSummary.letter).isEqualTo("a");
    }


    @Test
    public void fourLetter_whenOneRepeatingLetter_returns3LetterSummaryWithACount2() {
        LetterSummary[] actual = LetterCountWithMap.countLetters("abca");

        assertThat(actual).hasSize(3);

        LetterSummary actualFirstLetterSummary = actual[0];
        assertThat(actualFirstLetterSummary.count).isEqualTo(2);
        assertThat(actualFirstLetterSummary.letter).isEqualTo("a");

        LetterSummary actualSecondLetterSummary = actual[1];
        assertThat(actualSecondLetterSummary.count).isEqualTo(1);
        assertThat(actualSecondLetterSummary.letter).isEqualTo("b");

        LetterSummary actualThirdLetterSummary = actual[2];
        assertThat(actualThirdLetterSummary.count).isEqualTo(1);
        assertThat(actualThirdLetterSummary.letter).isEqualTo("c");
    }


}