import java.util.Scanner;

public class Circle {
    int circles;
    double radius;
    double omkrets;
    double area;
    public Circle(){
        CreateCircle();
    }

    public void CreateCircle(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur många cirklar vill du skapa? ");
        circles = scanner.nextInt();

        for(int i = 0; i < circles; i++){
            System.out.println("Hur stor radie ska cirkeln ha? ");
            Scanner radscan = new Scanner(System.in);
            radius = radscan.nextDouble();

            area = Math.PI * radius * radius;
            omkrets = 2 * Math.PI * radius;

            System.out.println("Omkrets: " + omkrets);
            System.out.println("Area: " + area);
        }

    }
}

