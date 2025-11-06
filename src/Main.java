//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        String jmeno = "jAn zROKycaN";
        jmeno = jmeno.toLowerCase();
        jmeno = jmeno.substring(0,1).toUpperCase() + jmeno.substring(1,3) + jmeno.substring(3,5).toUpperCase() + jmeno.substring(5,12);
        System.out.print(jmeno);
*/

        String jmeno = "váClAv vAšek";
        jmeno = jmeno.toLowerCase();
        jmeno = jmeno.substring(0,1).toUpperCase() + jmeno.substring(1, jmeno.indexOf(" ")) + " " + jmeno.substring(jmeno.indexOf(" ")+1, jmeno.indexOf(" ")+2).toUpperCase() + jmeno.substring(jmeno.indexOf(" ")+2);
        System.out.println(jmeno);

        //-------------------------------------------------------------------------------------------------------------------//

        int pocetMezer =0;
        String text = "adas da dsada d ";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                pocetMezer++;
            }
        }
        System.out.println("řetězec má " + text.length()+ " znaků");
        System.out.println(pocetMezer);

        //-------------------------------------------------------------------------------------------------------------------//

        String slovo ="blovo";
        char pismenoJedna = slovo.charAt(0);
        char pismenoDva = slovo.charAt(slovo.length()-1);
        System.out.println("text začíná " +pismenoJedna + " a končí písmenem " + pismenoDva);

        //-------------------------------------------------------------------------------------------------------------------//

        String promena = "slobblbproprorspro";
        String hledam = "pro";
        System.out.println("Slovo pro se nachází na : " +promena.indexOf(hledam) + " pozici");


        int index  = promena.indexOf(hledam);
        int pocet = 0;

        while (index != -1) {
            pocet++;
            System.out.println(" - Pozice: " + index);
            index = promena.indexOf(hledam, index + 1);
        }
        if (pocet == 0) {
            System.out.println("Slovo se v textu nenachází.");
        } else {
            System.out.println("výskyty slova " + hledam + " je: "+pocet );
        }

        //-------------------------------------------------------------------------------------------------------------------//


        String email = "vasvac21@gasos-ro.cz";
        email =email.toLowerCase();
        String emailPrvniCast = email.substring(0,email.indexOf("@"));
        String emailDruhaCast = email.substring(email.indexOf("@")+1);
        System.out.println("email prvni cast: " + emailPrvniCast);
        System.out.println("email druha cast: " + emailDruhaCast);

        //-------------------------------------------------------------------------------------------------------------------//

        String slovo2 ="neco";





    }
}