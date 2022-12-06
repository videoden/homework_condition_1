public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Человек совершеннолетний");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать");
            System.out.println();
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 6;
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 40;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 35;
        boolean kinderGarten = age > 2 && age < 6;
        boolean school = age >= 6 && age < 18;
        boolean university = age >= 18 && age < 24;
        boolean job = age >= 24;
        if (kinderGarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else {
            if (school) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else {

                if (university) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                } else {
                    if (job) {
                        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                    }
                }
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 3;
        boolean before5 = age < 5;
        boolean age5to14 = age >= 5 && age < 14;
        boolean after14 = age >= 14;
        if (before5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else {
            if (age5to14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе только в сопровождении взрослого");
            } else {
                if (after14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе");
                }
            }
        }


    }

    public static void task6() {
        System.out.println("Задача 6");
        int quantity = 64;
        if (quantity < 60) {
            System.out.println("В вагоне еще есть сидячие места");
        } else {
            if (quantity >= 60 && quantity <= 102) {
                System.out.println("В вагоне есть стоячие места");
            } else {
                System.out.println("Вагон забит полностью");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 4;
        int two = 3;
        int three = 5;
        if (one == two && two == three) {
            System.out.println("Числа равны");
        } else {
            if (one == two && one > three) {
                System.out.println(one + " и " + two + " - большие числа");
            } else {
                if (one == two && one < three) {
                    System.out.println( three + " - большее число");
                } else {
                    if (two == three && two > one) {
                        System.out.println( two + " и " + three + " - большие числа");
                    } else {
                        if (two == three && two < one) {
                            System.out.println(one + " - большее число");
                        } else {
                            if ( one == three && one > two) {
                                System.out.println( one + " и " + three + " - большие числа");
                            } else {
                                if (one == three && one < two) {
                                    System.out.println(two + " - большее число");
                                } else {
                                    if (one > two && one > three) {
                                        System.out.println( one + " - большее число");
                                    } else {
                                        if (one > two && one < three) {
                                            System.out.println(three + " - большее число");
                                        } else {
                                            if (one < two && one > three) {
                                                System.out.println(two + " - большее число");
                                            } else {
                                                if (one < two && one < three && two < three) {
                                                    System.out.println(three + " - большее число");
                                                } else {
                                                    System.out.println(two + " - большее число");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
