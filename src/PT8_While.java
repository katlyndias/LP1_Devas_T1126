public class PT8_While {
    public static void main(String[] args) {
        int i = 0;


        while (i<=10){
            System.out.println(i);
            i++;
        }

        // Elevador
        boolean sensorDePresencaAtivo = true;

        while(sensorDePresencaAtivo){
            System.out.println("Manter portas abertas");
        }
    }
}
