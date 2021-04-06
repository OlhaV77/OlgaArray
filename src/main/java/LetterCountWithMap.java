
public class LetterCountWithMap {

    static LetterSummary[] countLetters(String letter) {
        // TODO: replace with OlgaArray
        OlgaArray collection = new OlgaArray();

        if (letter.length() == 0) {                                         // then string empty return result
            return collection.getAll();
        }

        int length = letter.length();               // length
        for (int i = 0; i < length; i++) {
            String singleLetter = letter.substring(0, 1);             // single letter chooses letter(position(0,1)

            // singleLetter should be checked against existing results
            // if found then increase count
            // if not found then create new letterSummary

            LetterSummary matchingLetter = collection.findByLetter(singleLetter);

            if (matchingLetter != null) {
                matchingLetter.count++;
            } else {
                LetterSummary letterSummary = new LetterSummary();           //create object
                letterSummary.letter = singleLetter;                        //object letter = letter
                letterSummary.count = 1;
                collection.add(letterSummary);
            }

            letter = letter.substring(1);         //next letter = substring wish index(1) следуюшчая буква
        }
        return collection.getAll();
    }

}


