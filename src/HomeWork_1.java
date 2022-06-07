public class HomeWork_1 {
    public static void main(String[] args) {
        // Задача 1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        hi = hi.strip();
        world = world.toLowerCase();
        String result  = (hi +world + newLine);
        String repeated = result.repeat(3);
        System.out.println(repeated);

        // Задача 2
        double heigh = 1.86;
        double weigh = 90;
        double bodyMassIndex = (weigh / (heigh * heigh));
        System.out.println(bodyMassIndex);

        //Задача 3
        char[] myArray = new char[5];
        myArray[0] = 'a';
        myArray[1] = 'b';
        myArray[2] = 'c';
        myArray[3] = 'd';
        myArray[4] = 'e';
        System.out.println(myArray);

        char[] myArray2 = myArray;
        myArray[3] = 'h';
        System.out.println(myArray2);
    }
}