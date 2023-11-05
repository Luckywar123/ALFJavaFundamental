class Main {
    public static void main(String[] args) {
       /* Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = getRandomNumberInRange(rand, 70, 100);
            System.out.println("Random Number " + i + " " + randomNumber);
        }*/

       /* int panjang = 0;
        Scanner sn = new Scanner(System.in);
        panjang = sn.nextInt();
        System.out.println(panjang);*/


        /*int intLoop = 0;
        for (int i = 0; i < 5; i++){
            intLoop++;
            continue;
        }
        System.out.println(i);*/


        /*int intLoop = 0;
        for (int i = 0; i < 10; i++){
            intLoop++;
            for (int j = 0; j<20; j++){
                intLoop++;
            }
        }
        System.out.println(intLoop);*/

       /* int intLoop = 0;
        for (int i = 0; i<10 ; i++){
            intLoop++;
            for (int j = 0; j <20;j++){
                if (j == 10) {
                    break;
                }
                intLoop++;
            }System.out.println(intLoop);
        }*/

       /* boolean isRemainderOn= true; int j = 1200; String strCuaca = "Hujan";
        String strExec = "";
        if(isRemainderOn)
        {
            strExec = "1";
            System.out.println("Ini True Reminder!!");
        }else if(j>1000)
        {
            strExec = "2";
            System.out.println("ini J > 100!!");
        } else if (strCuaca.equals("Hujan")) {
            strExec = "3";
            System.out.println("Sekarang sedang huan!!");
        }else {
            strExec = "4";
            System.out.println("Tidak ada kondisi yang berhasil");
        }
        System.out.println(strExec);*/


       /* Scanner scn = new Scanner (System.in);
        System.out.println("Masukkan kaya uang ingin di proses : \n");
        String strText = scn.next(); // input text
        String poli = " ";
        StringBuilder strBuilder = new StringBuilder();
        String strTest="";

        strBuilder.setLength(0);// Hapus seluruh isi strBuilder
        for(int i = strText.length();i>0;i--){
            System.out.println(strTest.substring(i-1, i)+" i = "+ i);
            strTest = strText.substring(i-1, i);
            poli = strBuilder.append(strTest).toString();
        }

        strBuilder.setLength(0);
        if(strText.equalsIgnoreCase(poli)){
            System.out.println("Merupakan Anagram");
        }else{
            System.out.println("Bukan anagram");
        }*/



        /*boolean isRrmainderOn = true;
        int intval = 1200;
        String strCuaca = " Hujan";
        String strExec = " ";
        if ( intval > 1500)
            System.out.println(intval);
        System.out.println(strCuaca);*/


        /*String strThird = "welcome";
        System.out.println(strThird.substring(6,7));*/

       /* int intChoose = 3 ; intChoose = 2;
        switch (intChoose){
            case 1:
                System.out.println("Ini Satu"); break;
            case 2:
                System.out.println("Ini dua"); break;
            default:
                System.out.println("Selain satu dan dua");break;
        }*/

        /*int angka=  11;
        if ( angka%2==0){
            System.out.println("Angka "+angka+" Adalah bilangan ganjil!!");
        }else {
            System.out.println("Angka "+angka+" Adalah bilangan Genap!!");
        }*/

        /*if ((5<3) && ( 7 != 2)){
            System.out.println("OK");
        } else if ((4 == 4) || ! (3>2)) {
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }*/
       /* int intLoop = 0;
        for (int i = 0; i < 10 ; i++){
            intLoop++;
            for (int j = 0; j < 20 ; j++){

                if (j==10){
                    break;
                }
                intLoop++;
            }
        }
        System.out.println(intLoop);
*/


       /* int intLoop = 0;
        boolean isGood = true;
        do{
            intLoop++;
            while (!isGood);
            System.out.println(isGood);
        }*/
          /*  String strSbg = "8"+3;
        System.out.println(strSbg);
*/



        /*String a = " Tea";
        String b = " Toe";
        System.out.println(b.compareTo(a));*/



        /*int intLoop = 0;
        for (int i = 0; i < 5; i++){
            intLoop++;
                    if(intLoop>5){
                        break;
                    }
        }
        System.out.println(intLoop);*/


       /* if((5>3)&&(7!=2)){
            System.out.println("OK");
        } else if ((4==4)||!(3>2)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");}*/

        int intLoop = 0;
        for ( int i = 0 ; i < 10; i++){
            intLoop++;
            for (int j = 0 ; j < 20 ; j ++){
                if (j==10){
                    break;
                }intLoop++;
            }
            System.out.println(intLoop);
        }


        String pesan = "Ini adalah pesan yang akan dikelilingi oleh kotak.";
        int panjangPesan = pesan.length();

        // Membuat garis atas kotak
        String garisAtas = "+";
        for (int i = 0; i < panjangPesan + 2; i++) {
            garisAtas += "-";
        }
        garisAtas += "+";

        // Mencetak garis atas kotak
        System.out.println(garisAtas);

        // Mencetak pesan dengan garis samping
        System.out.println("| " + pesan + " |");

        // Membuat garis bawah kotak
        String garisBawah = "+";
        for (int i = 0; i < panjangPesan + 2; i++) {
            garisBawah += "-";
        }
        garisBawah += "+";

        // Mencetak garis bawah kotak
        System.out.println(garisBawah);




    }

/*    public static int getRandomNumberInRange(Random rand, int min, int max) {
        // Generate a random number between min (inclusive) and max (exclusive)
        return rand.nextInt(max - min) + min;
    }*/




}