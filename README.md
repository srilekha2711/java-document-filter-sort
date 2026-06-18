# java-document-filter-sort

## 📌 Problem Statement
This program manages a collection of `Document` objects. It reads document details (ID, title, folder name, and page count), filters out only the documents with an **odd number of pages**, and outputs the results sorted in **ascending order by their ID**.
(Considered for 4 objects , one can go accordingly)
## 🚀 Key Java Concepts Demonstrated
* **Object-Oriented Programming:** Built a custom `Document` class with encapsulation (private variables, public getters/setters) and parameterized constructors.
* **Array Manipulation:** Used standard Java Arrays (instead of `ArrayList`) to meet strict platform constraints, utilizing a two-pass algorithm to first count the target objects and then populate the new array.
* **Custom Sorting:** Implemented `Arrays.sort()` alongside a custom `Comparator` and `Integer.compare()` to sort objects by specific numerical attributes.
* **Streamlined Iteration:** Utilized Java's enhanced `for` loop (`for-each`) to elegantly traverse object arrays, extracting and inspecting `Document` objects one by one without the need for manual index tracking.

## 📥 Example Input & Output

**Sample Input:**
1
resume
personal
50
2
report
work
11
4
notes
school
5
3
draft
personal
10

**Sample Output**
2 report work 
4 notes school
