
public class LetterCountWithMap {
    static LetterSummary[] countLetters(String letter) {
        LetterSummary[] result = new LetterSummary[letter.length()];          //object array
        if (letter.length() == 0) {                                         // then string empty return result
            return result;
        }

        int length = letter.length();               // length

        for (int i = 0; i < length; i++) {
            String singleLetter = letter.substring(0, 1);             // single letter chooses letter(position(0,1)

            // singleLetter should be checked against existing results
            // if found then increase count
            // if not found then create new letterSummary

            LetterSummary matchingLetter = findMatchingLetter(result, singleLetter);

            if (matchingLetter != null) {
                matchingLetter.count++;
            } else {
                LetterSummary letterSummary = new LetterSummary();           //create object
                letterSummary.letter = singleLetter;                        //object letter = letter
                letterSummary.count = 1;
                result[i] = letterSummary;                                  // make  array  with objects
            }

            if (letter.length() == 1) {
                return trim(result);
            }

            letter = letter.substring(1);         //next letter = substring wish index(1) следуюшчая буква
        }
        return trim(result);
    }

    private static LetterSummary findMatchingLetter(LetterSummary[] result, String singleLetter) {
        for (int j = 0; j < result.length; j++) {
            if (result[j] != null && singleLetter.equals(result[j].letter)) {
                return result[j];
            }
        }

        return null;
    }

    private static LetterSummary[] trim(LetterSummary[] summaries) {
        int count = 0;

        for (int i = 0; i < summaries.length; i++) {
            if (summaries[i] != null) {                    // empty position == null
                count++;
            }
        }
        LetterSummary[] letterSummaries = new LetterSummary[count];

        for (int j = 0; j < letterSummaries.length; j++) {
            letterSummaries[j] = summaries[j];                        //new array
        }

        return letterSummaries;
    }


}


