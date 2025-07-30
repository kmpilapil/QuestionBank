# Java SQL Question Bank System

## 📚 Overview

This is a **Java-based Question Bank Management System** that utilizes **MySQL** for backend data storage. It supports both **Admin** and **User** roles, allowing admins to manage questions and users to take randomized quizzes across multiple subjects.

Developed as a **final project** for academic purposes using **NetBeans**, **Java Swing**, and **JDBC**, this project demonstrates core Object-Oriented Programming (OOP) principles, GUI design, and database connectivity.

---

## 🧠 Features

### 👤 User Functionality
- Login and Sign Up (via `JOptionPane`)
- Choose a subject (Physics 2, Calculus 2, etc.)
- Answer randomized multiple-choice questions
- Receive instant feedback after submission
- No repetition guarantee **(To be improved)**

### 🛠️ Admin Functionality
- Admin login
- View all questions in a dynamic `JTable`
- Delete selected questions
- **Edit** functionality (Partially implemented)
- Navigate between dashboard and question manager

---

## 🧩 Technologies Used

| Technology     | Description                            |
|----------------|----------------------------------------|
| Java           | Primary programming language           |
| Swing          | GUI Framework                          |
| MySQL          | Relational Database                    |
| JDBC           | Java Database Connectivity             |
| NetBeans       | IDE used for development               |

---

## 🗄️ Database Schema

### Table: `users`
| Column        | Type     | Notes                   |
|---------------|----------|--------------------------|
| id            | INT      | Primary Key, AutoIncrement |
| username      | VARCHAR  | Unique                   |
| password      | VARCHAR  | Plaintext for simplicity (*not recommended*) |
| role          | VARCHAR  | 'admin' or 'user'        |

### Table: `questions`
| Column         | Type     | Description                      |
|----------------|----------|----------------------------------|
| id             | INT      | Primary Key                      |
| subject        | VARCHAR  | Subject name                     |
| question_text  | TEXT     | The question itself              |
| option_a       | VARCHAR  | Option A                         |
| option_b       | VARCHAR  | Option B                         |
| option_c       | VARCHAR  | Option C                         |
| option_d       | VARCHAR  | Option D                         |
| correct_option | VARCHAR  | 'A', 'B', 'C', or 'D'             |

---

## 📝 How to Run

1. Clone the repository.
2. Import it into **NetBeans IDE**.
3. Set up a MySQL server with the database schema (included in `/sql/schema.sql`).
4. Modify the `DB_Connection` class to match your local MySQL credentials.
5. Run the project.

---

## 🚧 Known Limitations

- The **Edit** feature is not yet fully implemented.
- Questions are selected randomly using `ORDER BY RAND()` — this can cause repetition.
- Sign-Up is handled via `JOptionPane`; should be replaced with a proper form in future updates.
- Passwords are stored as plaintext — security improvements are required for production use.

---

## 📌 Future Improvements

- Add quiz scoring and progress tracking
- Implement paginated question loading
- Secure password hashing and user validation
- Improve UI/UX with cleaner layouts and confirmations
- Unit test coverage and error logging

---

## 💡 Author

Developed by King Mike B. Pilapil  
Electronics Engineering Student, Final Project – Java Programming  
Date: July 2025

---

## 🔗 License

This project is open source and available under the [MIT License](LICENSE).
