
public class OlgaArray {
    static LetterSummary[] colection;

    public void add(LetterSummary letterSummary) {
        colection = new LetterSummary[]{letterSummary};
        for (int i = 0; i < colection.length; i++) {
            colection[i] = letterSummary;
           // System.out.println(colection[i]);
        }
    }

    public LetterSummary get(int index) {
        LetterSummary[] letter = new LetterSummary[index];
        for (int i = 0; i < index; i++) {
            letter[i] = colection[i];
            colection = letter;
          //  System.out.println(letter[i]);
        }
        return colection[index];
    }


    public LetterSummary[] getAll() {

        return null;
    }

    public void remove(int index) {


    }

    public LetterSummary findByLetter(String letter) {

        return null;
    }

    public static void main(String[] args) {
        OlgaArray o = new OlgaArray();
        LetterSummary letterSummary = new LetterSummary();
        o.add(letterSummary);
        o.get(3);
    }


}
