import javax.swing.*;

public class NestedIf {
    public static void main(String[] args) {

        String day = JOptionPane.showInputDialog(null, "Enter the day of the week: ");
        String weather = JOptionPane.showInputDialog(null, "Enter the weather (sunny, rainy, gloomy): ");
        String message = "";
        
        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Thursday")) {
            message += "Go to school ";
            if (weather.equalsIgnoreCase("sunny")) {
                message += "and bring a hat or umbrella.";
            } else if (weather.equalsIgnoreCase("rainy")) {
                message += "and bring an umbrella or raincoat.";
            } else if (weather.equalsIgnoreCase("gloomy")) {
                message += "and ride a taxi.";
            } else {
                message = "Invalid input :(";
            }
        }else if (day.equalsIgnoreCase("Wednesday")) {
            message += "Go to school + date ";
            if (weather.equalsIgnoreCase("sunny")) {
                message += "and bring a hat or umbrella.";
            } else if (weather.equalsIgnoreCase("rainy")) {
                message += "and bring an umbrella or raincoat.";
            } else if (weather.equalsIgnoreCase("gloomy")) {
                message += "and ride a taxi.";
            } else {
                message = "Invalid input :(";
            }
        } else if (day.equalsIgnoreCase("Friday")) {
            message += "Go to school + party ";
            if (weather.equalsIgnoreCase("sunny")) {
                message += "and bring a hat or umbrella.";
            } else if (weather.equalsIgnoreCase("rainy")) {
                message += "and bring an umbrella or raincoat.";
            } else if (weather.equalsIgnoreCase("gloomy")) {
                message += "and ride a taxi.";
            } else {
                message = "Invalid input :(";
            }
        } else if (day.equalsIgnoreCase("Saturday")) {
            message += "Go bonding with friends ";
            if (weather.equalsIgnoreCase("sunny")) {
                message += "and bring a hat or umbrella.";
            } else if (weather.equalsIgnoreCase("rainy")) {
                message += "and bring an umbrella or raincoat.";
            } else if (weather.equalsIgnoreCase("gloomy")) {
                message += "and ride a taxi.";
            } else {
                message = "Invalid input :(";
            }
        } else if (day.equalsIgnoreCase("Sunday")) {
            message += "Go to church + family bonding ";
            if (weather.equalsIgnoreCase("sunny")) {
                message += "and bring a hat or umbrella.";
            } else if (weather.equalsIgnoreCase("rainy")) {
                message += "and bring an umbrella or raincoat.";
            } else if (weather.equalsIgnoreCase("gloomy")) {
                message += "and ride a taxi.";
            } else {
                message = "Invalid input :(";
            }
        } else {
            message = "Invalid input :(";
        }

        JOptionPane.showMessageDialog(null, message);

    }
}
