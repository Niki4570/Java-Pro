package com.hw5;

public class Program {
    public static void main(String[] args) {

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
        System.out.print("\n /////////////////////// \n");

        Participant[] subjects = new Participant[3];
        subjects[0] = new Person("Nikita",130, 4);
        subjects[1] = new Cat("Felix",100, 10);
        subjects[2] = new Robot("CX/45",160, 7);

        Obstacle[] objects = new Obstacle[5];
        objects[0] = new Track(100);
        objects[1] = new Wall(4);
        objects[2] = new Track(120);
        objects[3] = new Wall(6);
        objects[4] = new Track(150);

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < objects.length; j++) {
                if (objects[j] instanceof Track) {
                    if (subjects[i].run(objects[j])) {
                        continue;
                    }
                    else {
                        break;
                    }
                }
                else{
                    if (subjects[i].jump(objects[j])){
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }
}