# 🥗 AI Diet Planner

A Spring Boot application that generates personalized diet and meal plans based on user health data, goals, and dietary preferences.

---

## 🏗️ Tech Stack

- **Java** (Spring Boot)
- **Maven** (build tool)
- **Spring Boot Starter Parent** v4.1.0

---

## 📂 Project Structure

```
ai-diet-planner/
├── src/
│   ├── main/
│   │   ├── java/com/aidietplanner/     # Application source code
│   │   └── resources/                   # Configuration files (application.properties, etc.)
│   └── test/
│       └── java/ai_diet_planner/        # Test cases
├── pom.xml                               # Maven project configuration
├── mvnw / mvnw.cmd                       # Maven wrapper scripts
└── README.md
```

---

## ⚙️ Prerequisites

- Java JDK 17 or higher
- Maven (or use the included Maven wrapper `mvnw`)

---

## 🚀 Running the Project Locally

Clone the repository:

```bash
git clone https://github.com/Jaishree145/AI-Diet-Plannar.git
cd AI-Diet-Plannar
```

Run using the Maven wrapper:

```bash
# On Windows
mvnw.cmd spring-boot:run

# On Mac/Linux
./mvnw spring-boot:run
```

The application will start on the default Spring Boot port (usually `http://localhost:8080`).

---

## 🔧 Building the Project

To build a runnable JAR file:

```bash
./mvnw clean package
```

The built JAR will be available in the `target/` folder. Run it with:

```bash
java -jar target/ai-diet-planner-0.0.1-SNAPSHOT.jar
```

---

## 📌 Features (planned/in-progress)

- [ ] Personalized diet plan generation based on user profile
- [ ] Nutrition and calorie tracking
- [ ] Allergy and dietary preference filtering
- [ ] REST API endpoints for meal plan requests

---

## 🤝 Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m "Add new feature"`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

---

## 📄 License

This project currently has no license specified.

---

## 📧 Contact

For questions or suggestions, open an issue on this repository.
