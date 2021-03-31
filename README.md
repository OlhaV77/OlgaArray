Next we will refactor existing letter summary problem to use our own
main.java.OlgaArray object.
The purpose of the main.java.OlgaArray is to make it easier to manage data in the array.
main.java.OlgaArray will have several method:

- add(main.java.LetterSummary letterSummary) -- it will add main.java.LetterSummary to the
collection
- get(int index) -- returns main.java.LetterSummary at the index position of the
collection
- getAll() -- returns Array of main.java.LetterSummary
- remove(int index) -- removes main.java.LetterSummary at the index position
from the collection
- findByLetter(String letter) -- it will return matching main.java.LetterSummary
or null if not found

Starting point:
```
class main.java.OlgaArray {
 main.java.LetterSummary[] collection;

 public void add(main.java.LetterSummary letterSummary) {
 // implement me
 }

 public main.java.LetterSummary get(int index) {
 // implement me
   return null;
 }

 public main.java.LetterSummary[] getAll() {
 // implement me
   return null;
 }

 public void remove(int index) {
 // implement me
 }

 public main.java.LetterSummary findByLetter(String letter) {
 // implement me
   return null;
 }

}
```