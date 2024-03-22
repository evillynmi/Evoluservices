public class TicoTeco {
    
    public void ticoTeco() {
        
        for (int i = 1; i <= 100; i++) {
            
            String result = "";

            if (i % 3 == 0) {
                result += "Tico";
            }
            if (i % 5 == 0) {
                result += "Teco";
            }

            if (result.isEmpty()) {
                result = Integer.toString(i);
            }

            System.out.print(result);

            if (i < 100) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        TicoTeco tictec = new TicoTeco();
        tictec.ticoTeco();
    }
}