public class FavoriteSaying {

    public static void main( String [] args) {

//Create two string variables named a and b containing the first two phrases of the saying:
        String a,b;

        a = "\tOnly one life 'twill soon be past,";
        b = "\tonly what's done for God will last.";

//Print the variables:
        System.out.println(a);
        System.out.println(b);

//Print the last two phrases of the saying directly below the first two:        
        System.out.printf("%44s%55s","And when I die how glad I shall be,\n","If the lamp of my life has burnt out for thee.\n");

//Print the name of the author below and to the right of the saying:
        System.out.printf("%50s","-c.t. studd".toUpperCase());

}}
