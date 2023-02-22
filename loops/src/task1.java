public class task1 {
    public static void main(String[] args) {
        String [] Names = new String [5];
        Names [0] = "John";
        Names [1] = "Bob";
        Names [2] = "Mary";
        Names [3] = "Peter";
        Names [4] = "Sarah";
        for (int w = 0; w < Names.length; w++)
        {
            if (Names[w].length() < 4)
            {
                System.out.println("Ваше имя короче 4 букв");
            }
            else if (Names[w].length() > 4)
            {
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else if (Names[w].length() == 4)
            {
                System.out.println("Ваше имя состоит из 4 букв");
            }
            System.out.println(Names[w]);
        }
        int w = 0;
        while( w<Names.length){

            if (Names[w].length() < 4)
            {
                System.out.println("Ваше имя короче 4 букв");
            }
            else if (Names[w].length() > 4)
            {
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else if (Names[w].length() == 4)
            {
                System.out.println("Ваше имя состоит из 4 букв");
            }
            System.out.println(Names[w]);
            w++;

        }
        w = 0;
        do {
            if (Names[w].length() < 4)
            {
                System.out.println("Ваше имя короче 4 букв");
            }
            else if (Names[w].length() > 4)
            {
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else if (Names[w].length() == 4)
            {
                System.out.println("Ваше имя состоит из 4 букв");
            }
            System.out.println(Names[w]);
            w++;
        } while(w<Names.length);

    }
}