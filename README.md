## Lab 3: Encapsulation and Class Design

- JDK: 21
- Package: `ie.atu.oop.week1`

The constructor checks whether a title or author is null before calling `isBlank()`. The `||` operator stops when the value is null, so Java does not call `isBlank()` on null.

The title, author and page count are `final` because they do not change after a Book is created. The status is not final because borrowing and returning can change it.

A Book validates its details and controls its own status. `LibraryService` checks for a missing Book and makes sure loan requests are from 1 to 14 days. There is no status setter because borrowing and returning must go through methods that check whether the change is allowed.

Checks:
1. A valid loan changed the status from AVAILABLE to ON_LOAN; returning the book changed it back to AVAILABLE. 
2. A rejected 15-day loan printed “Loan days must be from 1 to 14” and left the status AVAILABLE. 
3. A rejected second return printed “Book is already available” and left the status AVAILABLE. 
4. Maven package build: BUILD SUCCESS; JAR created in `target`.

Debugger: The seven-day request passed the duration check and reached `Book.borrowBook()`. The first book was AVAILABLE before the fifteen-day request because it had been returned. The fifteen-day request was rejected before `Book.borrowBook()`, so the status stayed AVAILABLE.