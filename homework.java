public class homework {

    static class homework_1 {
        public static void main(String[] args) {
            System.out.println("Welcome to Java");
            System.out.println("Welcome to Computer Science");
            System.out.println("Programing is fun");
        }
    }

    static class homework_2 {
        public static void main(String[] args) {

            System.out.println("    J       A       V     V      A");
            System.out.println("    J      A A       V   V      A A");
            System.out.println("J   J     AAAAA       V V      AAAAA");
            System.out.println(" J J     A     A       V      A     A");

        }
    }

    static class homework_3 {
        public static void main(String[] args) {

            System.out.println("a    a^2    a^3");

            for (int a = 1; a<4; a++) {
                int Square = a*a;
                int Cube = a*a*a;
                System.out.printf("%d    %d     %d%n", a, Square, Cube);
            }
        }
    }

    static class homework_4 {
        public static void main(String[] args) {

            double radius = 5.5;
            double perimeter = radius * 2 *3.14;
            double Acreage = radius * radius * 3.14;

            System.out.println("Chu vi hình tròn là: "+ perimeter );
            System.out.println("Diện tch hình tròn là: " + Acreage);
        }
    }

    static class homework_5 {
        public static void main(String[] args) {
            double length = 4.5;
            double width = 7.9;

            double Acreage = length * width;
            double Perimeter = (length+width) *2;

            System.out.println("Diện tích hình chữ nhật là: "+ Acreage);
            System.out.println("Chu vi hình chữ nhật là: " +Perimeter);
        }
    }

    static class homework_6 {
        public static void main(String[] args) {
            //1
            double Result_1 = (9.5 * 4.5 - 2.5 * 3) / (45.5-3.5);
            System.out.println("Kết quả bài 1 là: " + Result_1);

            //2
            int Result_2 = 0;
            for (int i = 1; i <= 9; i++) {
                Result_2 += i;
            }
            System.out.println("Kết quả của bài 2 là: " +Result_2);

            //3
            int Result_3 = 0;
            for (int i = 0; i <= 1000000; i++) {
                Result_3 +=i;
            }
            System.out.println("Kết quả bài 3 là: " + Result_3);
        }
    }

    static class homework_7 {
        public static void main(String[] args) {
            int kmDistance = 14;
            double minuteTime = 45;
            double secondTime = 30;
            double differenceDistance = 1.6;
            double Speed;

            double Distance = kmDistance / differenceDistance;
            double Time = (minuteTime / 60) + (secondTime / 3600);
            Speed = Distance / Time;

            System.out.println("Vận tốc trung bình là: " + Speed);

        }
    }

    static class homework_8 {
        public static void main(String[] args) {
            int milesDistance = 14;
            int hourTime = 1;
            double minuteTime = 40;
            double secondTime = 35;
            double differenceDistance = 1.6;
            double Speed;

            double Distance = milesDistance * differenceDistance;
            double Time = hourTime + (minuteTime / 60) + (secondTime / 3600);

            Speed = Distance / Time;

            System.out.println("Vận tốc trung bình là: " + Speed);

        }

    }

    static class homework_9 {
        public static void main(String[] args) {

            int currentPopulation = 312032486;
            int secondAYear = 31536000;
            int bornPerYear;
            int diePerYear;
            int immigrantsPerYear;

            bornPerYear = 31536000 / 7;
            diePerYear = 31536000 / 13;
            immigrantsPerYear = 31536000 / 45;

            currentPopulation += bornPerYear + immigrantsPerYear - diePerYear;

            System.out.println("Dân số năm 1 là: " + (312032486 + (31536000 / 7) + (31536000 / 45) - (31536000 / 13)));
            System.out.println("Dân số năm 2 là: " + (314812582 + (31536000 / 7) + (31536000 / 45) - (31536000 / 13)));
            System.out.println("Dân số năm 3 là: " + (317592678 + (31536000 / 7) + (31536000 / 45) - (31536000 / 13)));
            System.out.println("Dân số năm 4 là: " + (320372774 + (31536000 / 7) + (31536000 / 45) - (31536000 / 13)));
            System.out.println("Dân số năm 5 là: " + (323152870 + (31536000 / 7) + (31536000 / 45) - (31536000 / 13)));
        }
    }

    static class homework_10 {
        public static void main(String[] args) {
//            double a,b,c,d,e,f;
//            double x,y;
//
//            a = 3.4;
//            b = 50.2;
//            c = 2.1;
//            d = 55;
//            f = 2.1;
//            e = 44.5;
//
//            x =  ((44.5*55) - (50.2*5.9))/((3.4*55) - (50.2*2.1));
//            y =  ((3.4*2.1) - (44.5*2.1))/((3.4*55) - (50.2*2.1));

            System.out.println("Giá trị của x là: " + ((44.5*55) - (50.2*5.9))/((3.4*55) - (50.2*2.1)));
            System.out.println("Giá trị của y là: " + ((3.4*2.1) - (44.5*2.1))/((3.4*55) - (50.2*2.1)));


        }
    }
}
