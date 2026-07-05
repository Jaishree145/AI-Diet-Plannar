package ai_diet_planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AiDietPlannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiDietPlannerApplication.class, args);
    }
}

@RestController
class DietPlannerController {

    @GetMapping("/diet-plan")
    public String getDietPlan(
            @RequestParam int age,
            @RequestParam double weight,   // in kg
            @RequestParam double height,   // in cm
            @RequestParam String goal      // "lose", "gain", or "maintain"
    ) {
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);

        double calories = 10 * weight + 6.25 * height - 5 * age + 5;
        if (goal.equalsIgnoreCase("lose")) {
            calories -= 500;
        } else if (goal.equalsIgnoreCase("gain")) {
            calories += 500;
        }

        String mealPlan = generateMealPlan(goal);

        return String.format(
            "BMI: %.2f | Daily Calorie Target: %.0f kcal | Meal Plan: %s",
            bmi, calories, mealPlan
        );
    }

    private String generateMealPlan(String goal) {
        if (goal.equalsIgnoreCase("lose")) {
            return "Breakfast: Oats + fruits | Lunch: Grilled chicken + salad | Dinner: Soup + vegetables";
        } else if (goal.equalsIgnoreCase("gain")) {
            return "Breakfast: Eggs + toast + peanut butter | Lunch: Rice + chicken + dal | Dinner: Paneer + roti + milk";
        } else {
            return "Breakfast: Poha/Idli | Lunch: Rice + dal + vegetables | Dinner: Roti + curry + salad";
        }
    }
}
