# Lab 4 – Library Catalogue


Updated `LibraryService` to store multiple books using `List<Book>`.
The program can add, count, list, search, remove, loan and return books.

## How it operates
- `List<Book>` stores the books in an `ArrayList`.
- `final` prevents the list variable from being reassigned, but books can still be added or removed.
- `findBookByTitle()` returns the book if found, or `null` if missing.
- `removeBook()` returns `true` if removed, or `false` if not found.
- Loans must be between 1 and 14 days.

## Class responsibilities
- `Main`: runs the program and prints results.
- `LibraryService`: manages the collection.
- `Book`: manages its own borrowing status.

## Results
- Three books added.
- Dune successfully loaned and returned.
- Missing book search returned `false` for the loan.
- Clean Code removed.
- Final book count: **2**.
- Maven build: **BUILD SUCCESS**.
- Debugger used to inspect the list and search.