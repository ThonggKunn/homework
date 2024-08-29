package F01_homework;

import java.util.Scanner;

public class homework_7 {

    static class homework1 {

        static class Circle {
            double Radius;

            Circle (double Radius) {
                this.Radius = Radius;
            }
            public double Perimeter() {
                return Radius*2*Math.PI;
            }
            public double Acreage() {
                return Radius*Radius*Math.PI;
            }
            public void showResult() {
                System.out.println("The perimeter is:" + Perimeter());
                System.out.println("The acreage is: " + Acreage());
            }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter radius: ");
                int radius = scanner.nextInt();
                Circle circle = new Circle(radius);
                circle.showResult();
            }
        }
    }

    static class homework2 {
        static class Fraction {
            private int Numerator;
            private int Denominator;


//            public int getNumerator() {
//                return Numerator;
//            }
//            public void setNumerator(int Numerator) {
//                this.Numerator = Numerator;
//            }
//
//            public int getDenominator() {
//                return Denominator;
//            }
//            public void setDenominator(int Denominator) {
//                this.Denominator = Denominator;
//            }

            Fraction (int Numerator, int Denominator) {
                this.Numerator = Numerator;
                this.Denominator = Denominator;
            }

            public void reduce() {
                int gcd = findGCD(Numerator, Denominator);
                Numerator = Numerator/gcd;
                Denominator = Denominator / gcd;
            }

            public static int findGCD(int a, int b) {
                if (b == 0) {
                    return a;
                }
                return findGCD(b, a%b);
            }

            public String toString() {
                return Numerator + "/" + Denominator;
            }
            public Fraction add(Fraction otherFraction) {

                int newNumerator = this.Numerator * otherFraction.Denominator + otherFraction.Numerator * this.Denominator;
                int newDenominator = this.Denominator * otherFraction.Denominator;
                return new Fraction(newNumerator, newDenominator);
            }

            public Fraction subtract(Fraction otherFraction) {
                int newNumerator = this.Numerator * otherFraction.Denominator - otherFraction.Numerator * this.Denominator;
                int newDenominator = this.Denominator * otherFraction.Denominator;
                return new Fraction(newNumerator,newDenominator);
            }

            public Fraction plus(Fraction otherFraction) {
                int newNumerator = this.Numerator * otherFraction.Numerator;
                int newDenominator = this.Denominator * otherFraction.Denominator;
                return new Fraction(newNumerator, newDenominator);
            }

            public Fraction divide(Fraction otherFraction) {
                int newNumerator = this.Numerator * otherFraction.Denominator;
                int newDenominator = this.Denominator * otherFraction.Numerator;
                return new Fraction(newNumerator, newDenominator);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter first denominator: ");
            int denominator = scanner.nextInt();

            System.out.print("Enter second numerator: ");
            int numerator2 = scanner.nextInt();
            System.out.print("Enter second denominator: ");
            int denominator2 = scanner.nextInt();

            Fraction fraction = new Fraction(numerator, denominator);
            Fraction fraction2 = new Fraction(numerator2, denominator2);

            fraction.reduce();
            fraction2.reduce();

            Fraction sum = fraction.add(fraction2);
            System.out.println("Sum = " + sum);
            Fraction subtract = fraction.subtract(fraction2);
            System.out.println("Subtract = " + subtract);
            Fraction multiply = fraction.plus(fraction2);
            System.out.println("Multiply = " + multiply);
            Fraction divide = fraction.divide(fraction2);
            System.out.println("Divide = " + divide);

        }
    }

    static class homework3 {
        static class Student {
            private String name;
            private String address;
            private String email;
            private String phone_number;
            private String student_code;

//            Student (String name,String address,String email,String phone_number,String student_code) {
//                this.name = name;
//                this.address = address;
//                this.email = email;
//                this.phone_number = phone_number;
//                this.student_code = student_code;
//            }
            //name
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            //address
            public String getAddress() {
                return address;
            }
            public void setAddress(String address) {
                this.address = address;
            }
            //email
            public String getEmail() {
                return email;
            }
            public void setEmail(String email) {
                this.email = email;
            }
            //phone_number
            public String getPhone_number() {
                return phone_number;
            }
            public void setPhone_number(String phone_number) {
                this.phone_number = phone_number;
            }
            //student_code
            public String getStudent_code() {
                return student_code;
            }

            public void setStudent_code(String student_code) {
                this.student_code = student_code;
            }
            public void goingSchool() {
                System.out.println(getName() + " is going to school");
            }
            public void doingHomework() {
                System.out.println(getName() + " is doing homework");
            }
            public void payTuition() {
                System.out.println(getName() + " has paid the tuition");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student's name: \n");
            String name = scanner.nextLine();
            System.out.print("Enter student's address: \n");
            String address = scanner.nextLine();
            System.out.print("Enter student's email: \n");
            String email = scanner.nextLine();
            System.out.print("Enter student's phone number: \n");
            String phone_number = scanner.nextLine();
            System.out.print("Enter student's code: \n");
            String student_code = scanner.nextLine();

            System.out.println("------STUDENT'S INFORMATION------");

            Student student = new Student();
            student.setName(name);
            System.out.println(student.getName());
            student.setAddress(address);
            System.out.println(student.getAddress());
            student.setEmail(email);
            System.out.println(student.getEmail());
            student.setPhone_number(phone_number);
            System.out.println(student.getPhone_number());
            student.setStudent_code(student_code);
            System.out.println(student.getStudent_code());

            student.goingSchool();
            student.doingHomework();
            student.payTuition();
        }
    }
}
