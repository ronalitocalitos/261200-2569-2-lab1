# AI Usage Log

---
## [2026-11-22 15:00] - Lab 1: Integer Sorting Program
- **Model:** Gemini (Web/Chat — Neon)
- **Usage Mode:** Chat consultation only (No IDE agent / No auto-editing. All code was written manually by the student.)
- **Prompt History (Summary of Interactions):**
  1. Asked how to set up the IntelliJ project directory (`src`) and break down the lab requirements.
  2. Asked whether a separate class file is required and reviewed how `Scanner` works in Java.
  3. Asked about Java 25 compact `void main()` syntax, `IO.println()`, and how `static` vs. non-`static` methods are called across files.
  4. Requested a conceptual explanation of sorting algorithms (Insertion Sort / Selection Sort) without full code solutions in order to implement the algorithm independently.
  5. Submitted self-written `main.java` and `Sorter.java` code for review and bug checking.
- **Files Modified (Manually by Student):**
  - `src/main.java` (Created) — Implemented input reading with `Scanner`, called `Sorter.sort()`, and printed the sorted array.
  - `src/Sorter.java` (Created) — Implemented `public static void sort(int[] arr)` using Insertion Sort.
- **Summary of AI-Assisted Changes / Debugging:**
  - AI did not directly edit any files or generate the final sorting implementation.
  - During code review, AI identified an off-by-one error in `Sorter.sort()` where the outer loop condition was `i < arr.length - 1`, causing the last element to be skipped.
  - Student fixed the loop condition to `i < arr.length`.
- **Verification:**
  - Verified logic for ascending order, negative integers, duplicate values, and edge cases (`n = 0`, `n = 1`).