# 🥗 AI Diet Planner

An AI-powered application that generates personalized diet and meal plans based on a user's health goals, dietary preferences, allergies, and lifestyle. The system uses machine learning / LLM-based recommendations to suggest balanced meal plans, track nutrition, and adapt over time.

---

## 📌 Features

- 🧠 **AI-Generated Meal Plans** – Personalized daily/weekly diet plans based on user goals (weight loss, muscle gain, maintenance, etc.)
- 🍎 **Nutrition Tracking** – Calorie, macro, and micronutrient breakdown for each meal
- 🚫 **Allergy & Preference Filtering** – Supports vegetarian, vegan, keto, gluten-free, and custom restrictions
- 📊 **Progress Dashboard** – Visualize calorie intake, weight trends, and adherence over time
- 🔄 **Adaptive Recommendations** – Plans adjust based on user feedback and logged progress
- 🔐 **User Authentication** – Secure sign-up/login for saving personalized plans

---

## 🏗️ Tech Stack

| Layer          | Technology (example / customize as needed) |
|----------------|----------------------------------------------|
| Frontend       | React.js / Next.js                          |
| Backend        | Node.js / Express or Python / FastAPI       |
| AI/ML          | OpenAI API / Custom ML Model                |
| Database       | MongoDB / PostgreSQL                        |
| Auth           | JWT / OAuth2                                |
| Deployment     | Docker, Vercel / AWS / Render               |

> Update this table to match your actual stack.

---

## 📂 Project Structure

```
ai-diet-planner/
├── client/                # Frontend application
├── server/                # Backend API
│   ├── routes/
│   ├── controllers/
│   ├── models/
│   └── utils/
├── ai-engine/              # AI/ML logic for diet plan generation
├── docs/                   # Documentation
├── .env.example             # Environment variable template
├── package.json
└── README.md
```

---

## ⚙️ Installation

### Prerequisites
- Node.js (v18+) or Python (v3.10+)
- npm / yarn / pip
- MongoDB or PostgreSQL instance
- API key for AI service (e.g., OpenAI)

### Steps

```bash
# Clone the repository
git clone https://github.com/your-username/ai-diet-planner.git
cd ai-diet-planner

# Install dependencies
npm install
# or for python backend
pip install -r requirements.txt

# Set up environment variables
cp .env.example .env
# then fill in your API keys and DB connection string

# Run the app
npm run dev
```

---

## 🔑 Environment Variables

Create a `.env` file in the root directory with the following:

```
DATABASE_URL=your_database_connection_string
AI_API_KEY=your_ai_service_api_key
JWT_SECRET=your_jwt_secret
PORT=5000
```

---

## 🚀 Usage

1. Sign up / log in to your account
2. Fill out your health profile (age, weight, height, activity level, goals, allergies)
3. Click **Generate Plan** to receive an AI-curated diet plan
4. Track your meals and progress on the dashboard
5. Regenerate or fine-tune your plan anytime.

---

⭐ If you find this project useful, consider giving it a star on GitHub!
