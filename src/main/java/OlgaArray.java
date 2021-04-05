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
        LetterSummary[] letterSummary = new LetterSummary[collection.length - 1];     // new  array of object

        for (int i = 0; i < index; i++) {                                            //copy array before remove index
            letterSummary[i] = collection[i];
        }

        for (int i = index + 1; i < collection.length; i++) {                        //copy array after remove index(jump remove index)
            letterSummary[i - 1] = collection[i];                                   //copy array (i - 1 -- because letterSummary length -1)
        }

        collection = letterSummary;
    }

    public LetterSummary findByLetter(String letter) {
        for (int i = 0; i < collection.length; i++) {                // check object array
            if (letter.equals(collection[i].letter)) {              // if a letter equals  a object
                return collection[i];                                // return object
            }
        }

        return null;
    }
}