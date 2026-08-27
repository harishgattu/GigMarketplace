# Gig Marketplace

A console-based Java application for managing, searching, and applying to freelance job postings.

---

## 📌 Project Overview

**GigMarketplace** provides a command-line interface (CLI) that enables clients to list job opportunities and candidates to view listings, search by title, and submit their names to apply.

---

## 🚀 Features

- **Add Gig:** Register a new gig with an ID, title, description, and location.
- **View All Gigs:** Display all currently active listings.
- **Search Gigs:** Case-insensitive search across gig titles.
- **Apply for Gig:** Apply to a listing using its unique Gig ID.
- **Exit:** Terminate the application gracefully.

---

## 📁 Code Architecture & Explanation

The application belongs to the `com.gigmarketplace` package and consists of two primary classes:

### 1. `Gig.java` (Data Model)
Represents the individual gig entity and its application state.

- **Attributes:**
  - `id` (`int`): Unique identifier for the gig.
  - `title` (`String`): Title/headline of the job.
  - `description` (`String`): Detailed task requirements.
  - `location` (`String`): Job location (e.g., Remote, On-site).
  - `applicantName` (`String`): Name of the candidate who applied.
  - `applied` (`boolean`): Tracks application status (defaults to `false`).
- **Methods:**
  - `displayGig()`: Formats and outputs the gig details to the console.
  - `displayAppliedGig()`: Displays the gig details along with the applicant's name and status.
  - `getId()`, `getTitle()`: Getter methods for ID lookup and title searching.

### 2. `GigMarketplace.java` (Driver & Business Logic)
Handles user interaction, CLI menu routing, and in-memory list operations.

- **State Management:** Uses `ArrayList<Gig>` to store listings in memory during runtime.
- **CLI Loop:** Runs a `while (true)` loop with a `Scanner` handling numerical input:
  - `Case 1`: Instantiates a `Gig` object and appends it to the list.
  - `Case 2`: Checks if the list is empty; iterates and calls `displayGig()` on all listings.
  - `Case 3`: Matches user input against `g.getTitle().equalsIgnoreCase(searchTitle)`.
  - `Case 4`: Locates the gig by ID and updates `applicantName` and `applied = true`.
  - `Case 5`: Closes the scanner and calls `System.exit(0)`.

---

## 🛠️ Setup & Execution

### Prerequisites
- Java Development Kit (JDK 8 or higher)

### 1. File Name Verification
Ensure the source files do not contain duplicate file extensions:
```bash
Gig.java
GigMarketplace.java

javac com/gigmarketplace/*.java

java com.gigmarketplace.GigMarketplace

--- GIG MARKETPLACE ---
1. Add Gig
2. View All Gigs
3. Search Gig by Title
4. Apply for Gig
5. Exit
Enter your choice:
