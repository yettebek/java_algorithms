package Algorithms;

public class WhoLikesIt {

    public static String namesLikes(String[] names) { //(String ... names)
        int namesLength = names.length;

        // switch case in case there isn't anybody, when there is 1, when there is 2, when there is 3 and when there is more than 3

        switch (namesLength) {
            case 0:
<<<<<<< HEAD
                return "no one likes this";
=======
                return String.format("no one likes this");
>>>>>>> 17a0938a6f2ca6e122484646264787a3dd71534d
            case 1:
                return String.format("%s likes this", names[0]);
            case 2:
                return String.format("%s and %s like this", names[0], names[1]);
            case 3:
                return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default:
                return String.format("%s, %s and %d others like this", names[0], names[1], namesLength - 2);
        }
    }

    public static void main(String[] args) {
        String[] newNames = {"Joe","Bob"};
        System.out.println(namesLikes(newNames));
    }
}
