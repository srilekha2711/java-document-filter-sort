# Java Object Filtering and Custom Sorting

This repository contains Java programs that demonstrate core Object-Oriented Programming (OOP) principles, array manipulation, and custom sorting logic. These solutions are designed to handle real-world object management scenarios using strict platform constraints (standard arrays instead of Collections).

---

## 📑 Table of Contents
1. [Problem 1: Document Filter & Sort](#-problem-1-document-filter--sort)
2. [Problem 2: Book Sorting by Price](#-problem-2-book-sorting-by-price)
3. [Key Java Concepts Demonstrated](#-key-java-concepts-demonstrated)
4. [How to Run the Code](#️-how-to-run-the-code)

---

## 📌 Problem 1: Document Filter & Sort
**File:** `Solution.java`

### Problem Statement
This program manages a collection of `Document` objects. It reads document details (ID, title, folder name, and page count), filters out only the documents with an **odd number of pages**, and outputs the results sorted in **ascending order by their ID**. *(Configured for 4 objects by default)*.

### 📥 Example Input & Output

**Sample Input:**
```text
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

```

**Sample Output:**

```text
2 report work 
4 notes school 

```

---

## 📌 Problem 2: Book Sorting by Price

**File:** `Main1.java`

### Problem Statement

This program manages a collection of `Books` objects. It reads book details (ID, title, author, and price) and outputs the entire list of books sorted in **ascending order based on their price**. *(Configured for 4 objects by default)*.

### 📥 Example Input & Output

**Sample Input:**

```text
101
JavaBasics
James
50.50
102
PythonPro
Guido
30.00
103
LearnC++
Bjarne
40.25
104
RubyTips
Yukihiro
20.00

```

**Sample Output:**

```text
Sorted
104 RubyTips Yukihiro 20.0
102 PythonPro Guido 30.0
103 LearnC++ Bjarne 40.25
101 JavaBasics James 50.5

```

---

## 🚀 Key Java Concepts Demonstrated

* **Object-Oriented Programming:** Custom `Document` and `Books` classes utilizing encapsulation (private variables, public getters/setters) and parameterized constructors.
* **Array Manipulation:** Efficient use of standard Java Arrays for strict platform constraints, utilizing a two-pass algorithm to count target objects and populate new arrays dynamically.
* **Custom Sorting logic:** Implementation of `Arrays.sort()` alongside a custom `Comparator`, using `Integer.compare()` and `Double.compare()` to sort objects by specific attributes.
* **Streamlined Iteration:** Use of Java's enhanced `for` loop (`for-each`) to elegantly traverse object arrays and extract data without manual index tracking.

---

## ⚙️ How to Run the Code

To run these programs locally, ensure you have the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) installed.

1. **Clone the repository:**
```bash
git clone [https://github.com/yourusername/java-document-filter-sort.git](https://github.com/yourusername/java-document-filter-sort.git)
cd java-document-filter-sort

```


2. **Compile the Java files:**
```bash
javac Solution.java
javac Main1.java

```


3. **Run the programs:**
```bash
java Solution

```


*or*
```bash
java Main1

```


4. **Enter the input:** Paste the sample inputs provided above into the terminal and press `Enter`.

```

```
