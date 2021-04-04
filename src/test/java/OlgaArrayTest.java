import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OlgaArrayTest {

    @Test
    public void add_whenSimpleLetterSummary_works() {
        OlgaArray subject = new OlgaArray();

        subject.add(new LetterSummary());
    }

    @Test
    public void getAll_whenOneRecordExists_returnsOneRecord() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("a", 1));

        LetterSummary[] actual = subject.getAll();

        assertThat(actual).hasSize(1);
        assertThat(actual[0].letter).isEqualTo("a");
        assertThat(actual[0].count).isEqualTo(1);
    }

    @Test
    public void getAll_whenTwoRecordExists_returnsOneRecord() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("a", 1));
        subject.add(buildLetterSummary("b", 2));

        LetterSummary[] actual = subject.getAll();

        assertThat(actual).hasSize(2);

        assertThat(actual[0].letter).isEqualTo("a");
        assertThat(actual[0].count).isEqualTo(1);

        assertThat(actual[1].letter).isEqualTo("b");
        assertThat(actual[1].count).isEqualTo(2);
    }

    @Test
    public void get_whenRecordExists_returnsTheRecord() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("a", 1));

        LetterSummary actual = subject.get(0);

        assertThat(actual.letter).isEqualTo("a");
        assertThat(actual.count).isEqualTo(1);
    }

    @Test
    public void get_whenTwoRecordExists_returnsTheRecord() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("a", 1));
        subject.add(buildLetterSummary("b", 2));

        LetterSummary actual = subject.get(1);

        assertThat(actual.letter).isEqualTo("b");
        assertThat(actual.count).isEqualTo(2);
    }

    @Test
    public void findByLetter_whenRecordExists_returnsTheRecord() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("a", 1));

        LetterSummary actual = subject.findByLetter("a");

        assertThat(actual.letter).isEqualTo("a");
        assertThat(actual.count).isEqualTo(1);
    }

    @Test
    public void findByLetter_when3RecordExists_returnsTheRecord() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("b", 10));
        subject.add(buildLetterSummary("a", 1));
        subject.add(buildLetterSummary("z", 2));

        LetterSummary actual = subject.findByLetter("a");

        assertThat(actual.letter).isEqualTo("a");
        assertThat(actual.count).isEqualTo(1);
    }

    @Test
    public void findByLetter_whenRecordDoesNotExists_returnsNull() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("b", 10));
        subject.add(buildLetterSummary("a", 1));
        subject.add(buildLetterSummary("z", 2));

        LetterSummary actual = subject.findByLetter("q");

        assertThat(actual).isNull();
    }



    @Test
    public void findByLetter_when3RecordExistsAndMultipleCalls_returnsTheRecord() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("b", 10));
        subject.add(buildLetterSummary("a", 1));
        subject.add(buildLetterSummary("z", 2));

        subject.findByLetter("q");

        assertThat(subject.findByLetter("a").letter).isEqualTo("a");
        assertThat(subject.findByLetter("b").letter).isEqualTo("b");
        assertThat(subject.findByLetter("z").letter).isEqualTo("z");
    }

    @Test
    public void remove_whenOneRecordExists_containsZeroRecords() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("b", 10));

        subject.remove(0);

        LetterSummary[] actual = subject.getAll();

        assertThat(actual).hasSize(0);
    }

    @Test
    public void remove_whenTwoRecordExists_contains1Records() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("b", 10));
        subject.add(buildLetterSummary("d", 10));

        subject.remove(0);

        LetterSummary[] actual = subject.getAll();

        assertThat(actual).hasSize(1);
        assertThat(actual[0].letter).isEqualTo("d");
    }

    @Test
    public void remove_when3RecordExistsAndRemoveFirstRecord_containsOnlyRemainingRecords() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("b", 10));
        subject.add(buildLetterSummary("a", 1));
        subject.add(buildLetterSummary("z", 2));

        subject.remove(0);

        LetterSummary[] actual = subject.getAll();

        assertThat(actual).hasSize(2);

        assertThat(actual[0].letter).isEqualTo("a");
        assertThat(actual[1].letter).isEqualTo("z");
    }

    @Test
    public void remove_when3RecordExistsAndRemoveSecondRecord_containsOnlyRemainingRecords() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("b", 10));
        subject.add(buildLetterSummary("a", 1));
        subject.add(buildLetterSummary("z", 2));

        subject.remove(1);

        LetterSummary[] actual = subject.getAll();

        assertThat(actual).hasSize(2);

        assertThat(actual[0].letter).isEqualTo("b");
        assertThat(actual[1].letter).isEqualTo("z");
    }

    @Test
    public void remove_when3RecordExistsAndRemoveThirdRecord_containsOnlyRemainingRecords() {
        OlgaArray subject = new OlgaArray();

        subject.add(buildLetterSummary("b", 10));
        subject.add(buildLetterSummary("a", 1));
        subject.add(buildLetterSummary("z", 2));

        subject.remove(2);

        LetterSummary[] actual = subject.getAll();

        assertThat(actual).hasSize(2);

        assertThat(actual[0].letter).isEqualTo("b");
        assertThat(actual[1].letter).isEqualTo("a");
    }



    private LetterSummary buildLetterSummary(String letter, int count) {
        LetterSummary letterSummary = new LetterSummary();
        letterSummary.letter = letter;
        letterSummary.count = count;
        return letterSummary;
    }
}