package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Burung;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ular;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("Jalak Bali", "Bali",
                "Warna dasar dari tubuh burung ini merupakan putih dimana memiliki ujung sayap serta memiliki ekor dengan warna hitam.", R.drawable.jalak_bali));
        burungs.add(new Burung("Jalak Suren", "Jawa, Bali, dan Sumatera",
                "Burung jalak suren ini memiliki warna bulu yang sangat indah, dimana pada bagian dada dan juga paruhnya memiliki warna putih", R.drawable.jalak_suren));
        burungs.add(new Burung("Jalak Thailand", "Thailand",
                "Jalak Thailand ini memiliki warna dasar coklat, sedangkan untuk bulu yang ada pada bagian dada serta kepala memiliki warna putih", R.drawable.jalak_thailand));
        burungs.add(new Burung("Burung Emu", "Australia",
                "Burung tertinggi kedua di dunia setelah burung unta", R.drawable.emu));
        burungs.add(new Burung("Burung Kiwi", "Selandia Baru",
                "Untuk ukuran dari burung kiwi ini hampir sama dengan seekor ayam domestik.", R.drawable.kiwi));
        burungs.add(new Burung("Merak Hijua", "India, Malaysia, dan bangladesh",
                "Ukuran dari merak jantan pun dapat mencapai sekitar 300 cm", R.drawable.merak_hijau));
        return burungs;
    }

    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular("Ular Serasah", "Kalimantan",
                "Panjang tubuh semuanya umumnya sekitar 50 cm, namun ada pula yang sampai melebihi 60 cm", R.drawable.ular_serasah));
        ulars.add(new Ular("Ular Pelangi", "India",
                "Ular ini termasuk jenis ular berbisa dengan taring bisanya terletak di rahang atas bagian belakang", R.drawable.ular_pelangi));
        ulars.add(new Ular("Ular Kepala Dua", "Dataran Rendah",
                "Tubuhnya gelap tetapi berwarna-warni, dengan pita-pita lebih ringan tidak jelas.", R.drawable.ular_kepala_dua));
        ulars.add(new Ular("Sanca Kembang", "Asia Tenggara",
                "Pada ukuran terbesarnya sedikit melebihi 10 meter, yang membuat ini ular terpanjang di dunia", R.drawable.sanca_kembang));
        ulars.add(new Ular("Kawat Biasa", "Timur Tengah",
                "Salah satu ular terkecil di dunia, jarang melebihi 20 cm panjangnya.", R.drawable.ular_kawat));
        ulars.add(new Ular("Ular Gadung", "India",
                "Warna dewasa bervariasi dari cokelat muda hingga kuning kekuningan dan sering berwarna hijau neon ", R.drawable.ular_gadung));
        return ulars;
    }

    private static List<Buaya> initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya("Irian", "Indonesia",
                "Bentuk umum jenis ini mirip dengan buaya muara (C. porosus), tetapi lebih kecil dan warna kulitnya lebih gelap.", R.drawable.buaya_irian));
        buayas.add(new Buaya("Muara", "Indonesia",
                "Buaya muara atau buaya bekatak (Crocodylus porosus) adalah jenis buaya terbesar di dunia.", R.drawable.buaya_muara));
        buayas.add(new Buaya("Sepit", "Indonesia",
                "Ukuran tubuhnya lebih kecil dan pendek, dengan panjang maksimal hanya 3,5 meter", R.drawable.buaya_sepit));
        buayas.add(new Buaya("siam", "Siam",
                "Buaya ini relatif kecil ukurannya, dengan panjang total maksimal mencapai 4 m; akan tetapi yang umum panjang buaya ini hanya sekitar 2–3 m", R.drawable.buaya_siam));
        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataUlar(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
