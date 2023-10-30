public class HotelAmaris {
    /**
     * @param args
     */
    public static void main(String[] args) {
        char[][] KamarHotel = {
                { '*', '*', '*', 'X', '*' },
                { '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', 'X' }
        };

        for (int lantai = 0; lantai < KamarHotel.length; lantai++) {
            for (int kamar = 0; kamar < KamarHotel[lantai].length; kamar++) {
                if (KamarHotel[lantai][kamar] == 'X') {
                    System.out.println("Tamu berada dilantai" + (lantai + 1) + " Kamar" + (kamar + 1));
                }
            }
        }
        // menghitung jumlah kamar kosong
        int jumlahkamarkosong = 0;
        for (int lantai = 0; lantai < KamarHotel.length; lantai++) {
            for (int kamar = 0; kamar < KamarHotel[lantai].length; kamar++) {
                if (KamarHotel[lantai][kamar] == '*') {
                    jumlahkamarkosong++;
                }
            }
        }
        System.out.println("Jumlah kamar tersedia adalah" + jumlahkamarkosong + "kamar");
    }
}
