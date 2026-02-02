## 📱 Karenderia App

### App Description

**Karenderia App** is a simple Android application developed using **Kotlin** that helps manage the daily operations of a small local eatery (karenderia). This project is designed as a **Git collaboration activity**, allowing multiple developers to work together using GitHub features such as branching, pull requests, code reviews, testing, and merging.

The app focuses on basic but essential karenderia operations including **menu management, order processing, sales tracking, and daily summaries**. It also serves as a hands-on exercise in collaborative software development and modern Android app architecture.

---

### 🛠️ Technical Overview

- **Programming Language:** Kotlin  
- **Architecture:** Single Activity Architecture
- **UI Framework:** Jetpack Compose
- **Main Folder:** `Karenderia-App`  
- **Navigation:** Android Jetpack Navigation Component  
  - `navigation` folder  
  - `NavGraph`  
  - `NavRoutes`  

Navigation between screens is handled using the **Navigation Component**, making the app modular, readable, and easy to maintain.

---

### 📂 Application Screens

The Karenderia App consists of the following main screens:

- **MenuScreen**  
  Displays the list of available food items along with their prices.

- **OrderingScreen**  
  Allows users to select food items, create orders, and view the total price.

- **StatisticsScreen**  
  Displays daily sales statistics such as total sales and number of orders.

- **SummaryScreen**  
  Provides a summary of daily transactions and overall performance.

- **MainActivity**  
  The main entry point of the application that hosts and manages navigation between all screens.

---

### ⚙️ Features

- View menu items with prices
- Add items to orders
- View order summary with total items
- Track total daily sales and total orders
- Navigate easily between screens

---

## 👥 Team Roles

| Role | Responsibility | Members |
|------|---------------|---------|
| **Team Leader** | - Creates the GitHub repository<br>- Prepares screen templates and base structure<br>- Reviews pull requests<br>- Tests completed features<br>- Merges approved pull requests into `main` | Rosales |
| **Menu Management** | - Implements menu list display<br>- Adds sample food items and prices | Monte, Estrella, Gonzales |
| **Order Management** | - Implements order creation<br>- Displays selected items and total price | Sumayao, Baje, Fulgencio |
| **Daily Sales Summary** | - Displays total sales for the day<br>- Shows number of orders | Dado, Fernandez |
| **UI & Documentation** | - Improves UI layout or styling<br>- Updates `README.md` with usage instructions | Sexiona, Cantalejo |

---

## 🔁 Git Workflow

This project uses a **single-branch Git workflow** with only the `master` branch.

### Branch Strategy
- The `master` branch is the **only branch** in the repository.
- All development, updates, and features are committed directly to the `master` branch.

### Development Process
1. The **Team Leader** creates the GitHub repository with the `master` branch.
2. Team members clone the repository to their local machines.
3. Each member works on their assigned feature locally.
4. Changes are committed to the `master` branch with clear and descriptive commit messages.
5. The Team Leader reviews and tests changes before pushing final updates.

### Notes
- No additional feature branches are created in this project.
- Collaboration is managed through coordination and task assignment rather than branching.
- This simplified workflow is used for learning basic Git collaboration concepts.



