package com.hw5;

public class Program {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        System.out.print("Cir's area is = " + cir.area() + "\n");
        Triangle tri = new Triangle(5, 6, 7);
        System.out.print("Tri's area is = " + tri.area() + "\n");

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Triangle(9, 8, 7);
        shapes[2] = new Circle(7);
        shapes[3] = new Square(4);
        shapes[4] = new Square(9);
        double areaSum = 0;

        for (int i = 0; i < shapes.length; i++) {
            areaSum = areaSum + shapes[i].area();
            System.out.print("Площадь " + (i+1) + " элемента = " + shapes[i].area() + "\n");
        }

        Participant[] subjects = new Participant[3];
        subjects[0] = new Person("Vova",100, 4);
        subjects[1] = new Person("Vlad",130, 10);
        subjects[2] = new Person("Nikita",160, 7);
        Obstacle[] objects = new Obstacle[5];
        objects[0] = new Track(100);
        objects[1] = new Wall(4);
        objects[2] = new Track(120);
        objects[3] = new Wall(6);
        objects[4] = new Track(150);

        for (int i = 0; i < subjects.length; i++) {
            for (int j = 0; j < objects.length; j++) {
                if (objects[j] instanceof Track) {
                    if (subjects[i].getRunLimit() >= ((Track) objects[j]).trackLength) {
                        subjects[i].run();
                        System.out.print("Участник " + subjects[i].getName() + " прошел препятствие (дорожка) на дистанции " + ((Track) objects[j]).trackLength + ".\n");
                        subjects[i].overcome();
                    }
                    else {
                        System.out.print("Участник " + subjects[i].getName() + " не прошел препятствие (дорожка) на дистанции " + ((Track) objects[j]).trackLength + ".\n" + "Пройдено " + subjects[i].getRunLimit() + ".\n");
                        break;
                    }
                }
                else{
                    if (subjects[i].getJumpLimit() >= ((Wall) objects[j]).wallHeight) {
                        subjects[i].jump();
                        System.out.print("Участник " + subjects[i].getName() + " прошел препятствие (стена) на высоте " + ((Wall) objects[j]).wallHeight + ".\n");
                        subjects[i].overcome();
                    } else {
                        System.out.print("Участник " + subjects[i].getName() + " не прошел препятствие (стена) на высоте " + ((Wall) objects[j]).wallHeight + ".\n" + "Пройдено " + subjects[i].getJumpLimit() + ".\n");
                        break;
                    }
                }
            }
        }
    }
}