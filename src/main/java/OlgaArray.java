public class OlgaArray {
    private LetterSummary[] collection;

    OlgaArray() {
        this.collection = new LetterSummary[0];
    }

    public void add(LetterSummary letterSummary) {
        // check if shelf has empty space

        // if shelf is full then we need a new and bigger shelf
        // move all existing books to the new shelf
        // put book into shelf

        int countOfEmptySpace = 0;

        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == null) {
                countOfEmptySpace++;
            }
        }

        if (countOfEmptySpace < 1) {              // no empty space
            LetterSummary[] letterSummaries = new LetterSummary[collection.length + 1];

            for (int j = 0; j < collection.length; j++) {    // go along the length collections array
                letterSummaries[j] = collection[j];           // copy array, by collection array with index   and send in letterSummary array with same index
            }

            letterSummaries[letterSummaries.length - 1] = letterSummary;            // array with  next index = new variable
            collection = letterSummaries;
        }

    }

    public LetterSummary[] getAll() {
        return collection;
    }

    public LetterSummary get(int index) {
        return collection[index];
    }

    public void remove(int index) {


    }

    public LetterSummary findByLetter(String letter) {
        int index = 0;
        for (int i = 0; i < collection.length; i++) {               // check object array
            if (letter.equals(collection[i].letter)) {              // if a letter equals  a object
                return collection[i];                               // return object
            }
            index = i;                                            //  compare index with i (i = what is the count object)
        }
        collection = new LetterSummary[letter.length()];          // new object

        if (letter.equals(collection[index].letter)) {             // if a letter equals new object
            return collection[index];                              //return object
        }

        return collection[index];

    }
}
