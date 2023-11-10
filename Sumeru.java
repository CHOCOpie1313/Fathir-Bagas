public class Sumeru {
    /**
     * @param args
     */
    public static void main(String[] args, char c) {
        int tenaga = 12;
        String jalur = "LLLLLUUULRLDDLDRUULLLUUU";

        String[][] peta = {
                { "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#" },
                { "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" },

        };

        int x = 1;
        int y = 1;

        for (int i = 0; i < jalur.length(); i++) {
            char langkah = jalur.charAt(i);
            if (langkah == 'L') {
                y--;
            } else if (langkah == 'R') {
                y++;

            } else if (langkah == 'U') {
                x--;
            } else if (langkah == 'D') {
                x++;
            }
            if (peta[x][y] == "#") {
                System.out.println("jalur anda salah, anda masuk ke jurang/blank 45");
                break;
            } else if (peta[x][y] != "") {
                tenaga--;
            } else if (peta[x][y] == "R") {
                tenaga += 10;
                peta[x][y] = "";

            }

            if (tenaga <= 0) {
                System.out.println("jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain");
                break;
            }
            if (i == jalur.length() - 1) {
                System.out
                        .println("selamat pendakian anda berhasil mencapai puncak mahameru, sisa tenaga anda" + tenaga);
            }
        }
    }
}
