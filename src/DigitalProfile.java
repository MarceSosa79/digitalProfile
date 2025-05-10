public class DigitalProfile {
    public static void main(String[] args) throws Exception {
        
        String name = "Diego";
        String lastName = "Gonzalez";
        String city = "San Francisco";
        int age = 45;
        double height = 1.83;
        String [] hobbies = {"Leer", "Musica", "Cafe"};

        int ageInWeeks = age * 52;
        int randomNumber = (int) (Math.random() * 100);
        String toUpperCaseName = name.toUpperCase();
        String toUpperCaseLastName = lastName.toUpperCase();
        String substringCity = city.substring(0, 3);
        String fullName= name + " " + lastName;
        int fullNameLength = fullName.length();

        System.out.println("Perfil Digital de: " + toUpperCaseName + " " + toUpperCaseLastName );
        System.out.println("Ciudad: " + substringCity);
        System.out.println("Edad: " + age + " años (aprox. " + ageInWeeks + " semanas)");
        System.out.println("Altura: " + height + " m");
        System.out.println("Tus intereses: " + hobbies[0] + ", " + hobbies[1] + ", " + hobbies[2]);
        System.out.println("Tu número de la suerte es: " + randomNumber);
        System.out.println("Tu nombre tiene " + fullNameLength + " caracteres");
    }
}
