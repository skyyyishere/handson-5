import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] angkaArray = new int[3];
        angkaArray[0] = 10;
        angkaArray[1] = 20;
        angkaArray[2] = 30;

        // - Buat ArrayList<Integer> kosong
        ArrayList<Integer> angkaList = new ArrayList<>();

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        System.out.println("\nIsi array:");
        for (int i = 0; i < angkaArray.length; i++) {
            System.out.println("Elemen ke-" + i + ": " + angkaArray[i]);
        }
        // - Tambahkan 5 elemen ke ArrayList (dinamis)
        angkaList.add(10);
        angkaList.add(20);
        angkaList.add(30);
        angkaList.add(40);
        angkaList.add(50);

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar
        System.out.println("\nIsi ArrayList:");
        for (int i = 0; i < angkaList.size(); i++) {
            System.out.println("Elemen ke-" + i + ": " + angkaList.get(i));
        }

        System.out.println("\nUkuran array: " + angkaArray.length);
        System.out.println("Ukuran ArrayList: " + angkaList.size());

        // ===== GENERICS DASAR =====
        System.out.println("\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        ArrayList rawList = new ArrayList();
        rawList.add("Teks");
        rawList.add(123);
        rawList.add(45.67);
        rawList.add(true);

        System.out.println("Isi rawList (tanpa generics): " + rawList);

        Object itemPertama = rawList.get(0);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String
        ArrayList<String> listNama = new ArrayList<>();
        listNama.add("Alice");
        listNama.add("Bob");
        listNama.add("Charlie");

        System.out.println("\nIsi listNama (ArrayList<String>): " + listNama);

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal
        ArrayList<Double> listNilai = new ArrayList<>();
        listNilai.add(85.5);
        listNilai.add(90.0);
        listNilai.add(76.25);

        System.out.println("Isi listNilai (ArrayList<Double>): " + listNilai);

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah
        // listNama.add(123);
        // listNilai.add("Salah");

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();

        // - Tambahkan 5 nama mahasiswa menggunakan add()
        daftarMahasiswa.add("Andi");
        daftarMahasiswa.add("Budi");
        daftarMahasiswa.add("Citra");
        daftarMahasiswa.add("Dewi");
        daftarMahasiswa.add("Eko");

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)
        daftarMahasiswa.add(2, "Fajar");

        // - Print daftar mahasiswa
        System.out.println("Daftar mahasiswa:");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMahasiswa.get(i));
        }

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)
        String pertama = daftarMahasiswa.get(0);
        System.out.println("Mahasiswa pertama: " + pertama);

        // - Baca mahasiswa terakhir
        String terakhir = daftarMahasiswa.get(daftarMahasiswa.size() - 1);
        System.out.println("Mahasiswa terakhir: " + terakhir);

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()
        String cariNama = "Dewi";
        boolean ada = daftarMahasiswa.contains(cariNama);
        System.out.println("Apakah ada mahasiswa bernama " + cariNama + "? " + ada);

        // - Temukan index mahasiswa tertentu menggunakan indexOf()
        int indexFajar = daftarMahasiswa.indexOf("Fajar");
        System.out.println("Index mahasiswa bernama Fajar: " + indexFajar);

        // - Print ukuran ArrayList menggunakan size()
        System.out.println("Jumlah total mahasiswa: " + daftarMahasiswa.size());

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()
        System.out.println("Sebelum update: " + daftarMahasiswa);

        daftarMahasiswa.set(1, "Bagas");

        // - Print daftar setelah update
        System.out.println("Setelah update: " + daftarMahasiswa);

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)
        System.out.println("Sebelum hapus index: " + daftarMahasiswa);
        daftarMahasiswa.remove(2);
        System.out.println("Setelah hapus berdasarkan index: " + daftarMahasiswa);

        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)
        daftarMahasiswa.remove("Eko");
        System.out.println("Setelah hapus berdasarkan nama: " + daftarMahasiswa);

        // - Hapus semua mahasiswa menggunakan clear()
        daftarMahasiswa.clear();
        System.out.println("Setelah clear (hapus semua): " + daftarMahasiswa);

        // - Cek apakah ArrayList kosong menggunakan isEmpty()
        boolean kosong = daftarMahasiswa.isEmpty();
        System.out.println("Apakah daftar mahasiswa kosong? " + kosong);

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        angka.add(10);
        angka.add(20);
        angka.add(30);
        angka.add(40);
        angka.add(50);

        System.out.println("Isi ArrayList angka: " + angka);

        // - Iterasi menggunakan traditional for loop
        System.out.println("\nIterasi dengan for loop biasa:");
        for (int i = 0; i < angka.size(); i++) {
            System.out.println("Index " + i + ": " + angka.get(i));
        }

        // - Iterasi menggunakan enhanced for loop (for-each)
        System.out.println("\nIterasi dengan for-each:");
        for (int nilai : angka) {
            System.out.println("Nilai: " + nilai);
        }

        // - Iterasi menggunakan while loop
        System.out.println("\nIterasi dengan while loop:");
        int i = 0;
        while (i < angka.size()) {
            System.out.println("Angka ke-" + (i + 1) + ": " + angka.get(i));
            i++;
        }

        // - Iterasi menggunakan Iterator
        System.out.println("\nIterasi dengan Iterator:");
        Iterator<Integer> iterator = angka.iterator();
        while (iterator.hasNext()) {
            int nilai = iterator.next();
            System.out.println("Iterator baca: " + nilai);
        }

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        // - Buat ArrayList<String[]> untuk menyimpan data mahasiswa (nama, nim, jurusan)
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();

        // - Tambahkan 3 data mahasiswa
        // TODO: Tambahkan data mahasiswa
        dataMahasiswa.add(new String[]{"Andi", "231001", "Informatika"});
        dataMahasiswa.add(new String[]{"Budi", "231002", "Sistem Informasi"});
        dataMahasiswa.add(new String[]{"Citra", "231003", "Teknik Komputer"});

        // - Print semua data dengan format tabel
        // TODO: Print dalam format tabel
        System.out.println("--------------------------------------------------");
        System.out.println(String.format("%-10s %-10s %-20s", "Nama", "NIM", "Jurusan"));
        System.out.println("--------------------------------------------------");

        for (String[] mhs : dataMahasiswa) {
            System.out.println(String.format("%-10s %-10s %-20s", mhs[0], mhs[1], mhs[2]));
        }

        System.out.println("--------------------------------------------------");

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\n=== UTILITY METHODS COLLECTIONS ===");

        // Latihan 9: Eksplorasi Collections utility
        ArrayList<Integer> numbers = new ArrayList<>();
        // TODO: Isi dengan angka: 64, 34, 25, 12, 22, 11, 90
        Collections.addAll(numbers, 64, 34, 25, 12, 22, 11, 90);

        System.out.println("Data awal: " + numbers);

        // - Gunakan Collections.sort() untuk mengurutkan
        // TODO: Sort list
        Collections.sort(numbers);
        System.out.println("Setelah sort (ascending): " + numbers);

        // - Gunakan Collections.reverse() untuk membalik urutan
        // TODO: Reverse list
        Collections.reverse(numbers);
        System.out.println("Setelah reverse (descending): " + numbers);

        // - Gunakan Collections.shuffle() untuk mengacak
        // TODO: Shuffle list
        Collections.shuffle(numbers);
        System.out.println("Setelah shuffle (acak): " + numbers);

        // - Gunakan Collections.max() dan Collections.min()
        // TODO: Find max dan min
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum: " + min);

        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        // TODO: Count frequency
        numbers.add(25);
        numbers.add(25);
        int freq = Collections.frequency(numbers, 25);
        System.out.println("Frekuensi kemunculan angka 25: " + freq);

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\n=== SEARCHING DAN SORTING ===");

        // Latihan 10: Implementasi search dan sort
        ArrayList<String> buah = new ArrayList<>();
        // TODO: Isi dengan: "Apel", "Jeruk", "Mangga", "Pisang", "Anggur"
        Collections.addAll(buah, "Apel", "Jeruk", "Mangga", "Pisang", "Anggur");

        System.out.println("Daftar buah (awal): " + buah);

        // - Sort secara alfabetis
        // TODO: Sort alphabetically
        Collections.sort(buah);
        System.out.println("Setelah sort (alfabetis): " + buah);

        // - Implementasikan binary search pada list yang sudah diurutkan
        // TODO: Binary search
        String cari = "Mangga";
        int indexBinary = Collections.binarySearch(buah, cari);
        if (indexBinary >= 0) {
            System.out.println("Hasil binary search: '" + cari + "' ditemukan di index ke-" + indexBinary);
        } else {
            System.out.println("Hasil binary search: '" + cari + "' tidak ditemukan");
        }

        // - Implementasikan linear search untuk list yang tidak diurutkan
        // TODO: Linear search
        ArrayList<String> buahAcak = new ArrayList<>();
        Collections.addAll(buahAcak, "Pisang", "Mangga", "Apel", "Jeruk", "Anggur");

        String target = "Jeruk";
        int indexLinear = -1;
        for (int i1 = 0; i < buahAcak.size(); i++) {
            if (buahAcak.get(i).equalsIgnoreCase(target)) {
                indexLinear = i;
                break;
            }
        }

        System.out.println("Daftar buah (acak): " + buahAcak);
        if (indexLinear != -1) {
            System.out.println("Hasil linear search: '" + target + "' ditemukan di index ke-" + indexLinear);
        } else {
            System.out.println("Hasil linear search: '" + target + "' tidak ditemukan");
        }

        // ===== ARRAYLIST 2D =====
        System.out.println("\n=== ARRAYLIST 2D ===");

        // Latihan 11: ArrayList of ArrayList (2D dynamic array)
        // - Buat ArrayList<ArrayList<Integer>> untuk merepresentasikan matriks dinamis
        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();

        // - Buat 3 baris dengan panjang yang berbeda-beda
        // TODO: Create jagged 2D ArrayList
        ArrayList<Integer> baris1 = new ArrayList<>();
        Collections.addAll(baris1, 1, 2, 3);

        ArrayList<Integer> baris2 = new ArrayList<>();
        Collections.addAll(baris2, 4, 5, 6, 7);

        ArrayList<Integer> baris3 = new ArrayList<>();
        Collections.addAll(baris3, 8, 9);

        matrix2D.add(baris1);
        matrix2D.add(baris2);
        matrix2D.add(baris3);

        // - Isi dengan nilai dan print dalam format matriks
        // TODO: Fill dan print matrix
        System.out.println("Isi matriks dinamis (jagged):");
        for (int i1 = 0; i < matrix2D.size(); i++) {
            for (int j = 0; j < matrix2D.get(i).size(); j++) {
                System.out.print(matrix2D.get(i).get(j) + "\t");
            }
            System.out.println();
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem manajemen perpustakaan sederhana
        ArrayList<String[]> daftarBuku = new ArrayList<>();
        // Format: [judul, pengarang, tahun, status] // status: "tersedia" atau "dipinjam"

        // - Tambahkan 5 buku
        // TODO: Tambahkan data buku
        daftarBuku.add(new String[]{"Laskar Pelangi", "Andrea Hirata", "2005", "tersedia"});
        daftarBuku.add(new String[]{"Bumi Manusia", "Pramoedya Ananta Toer", "1980", "tersedia"});
        daftarBuku.add(new String[]{"Negeri 5 Menara", "Ahmad Fuadi", "2009", "dipinjam"});
        daftarBuku.add(new String[]{"Pulang", "Leila S. Chudori", "2012", "tersedia"});
        daftarBuku.add(new String[]{"Dilan 1990", "Pidi Baiq", "2014", "tersedia"});

        // - Implementasikan fungsi pinjam buku (ubah status)
        // TODO: Implementasikan pinjam buku
        String judulPinjam = "Pulang";
        boolean berhasilPinjam = false;
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judulPinjam) && buku[3].equalsIgnoreCase("tersedia")) {
                buku[3] = "dipinjam";
                berhasilPinjam = true;
                break;
            }
        }
        if (berhasilPinjam)
            System.out.println("✅ Buku '" + judulPinjam + "' berhasil dipinjam.");
        else
            System.out.println("⚠️ Buku '" + judulPinjam + "' tidak tersedia atau sudah dipinjam.");

        // - Implementasikan fungsi kembalikan buku
        // TODO: Implementasikan kembalikan buku
        String judulKembali = "Negeri 5 Menara";
        boolean berhasilKembali = false;
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judulKembali) && buku[3].equalsIgnoreCase("dipinjam")) {
                buku[3] = "tersedia";
                berhasilKembali = true;
                break;
            }
        }
        if (berhasilKembali)
            System.out.println("✅ Buku '" + judulKembali + "' berhasil dikembalikan.");
        else
            System.out.println("⚠️ Buku '" + judulKembali + "' tidak sedang dipinjam.");

        // - Implementasikan pencarian buku berdasarkan judul
        // TODO: Implementasikan search buku
        String cariJudul = "Dilan 1990";
        String[] hasilCari = null;
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(cariJudul)) {
                hasilCari = buku;
                break;
            }
        }
        if (hasilCari != null)
            System.out.println("Buku ditemukan: " + hasilCari[0] + " oleh " + hasilCari[1] + " (" + hasilCari[2] + ") - Status: " + hasilCari[3]);
        else
            System.out.println("Buku dengan judul '" + cariJudul + "' tidak ditemukan.");

        // - Print daftar buku yang tersedia
        // TODO: Print available books
        System.out.println("\nDaftar Buku yang Tersedia:");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-25s %-20s %-10s %-10s\n", "Judul", "Pengarang", "Tahun", "Status");
        System.out.println("------------------------------------------------------------");

        for (String[] buku : daftarBuku) {
            if (buku[3].equalsIgnoreCase("tersedia")) {
                System.out.printf("%-25s %-20s %-10s %-10s\n", buku[0], buku[1], buku[2], buku[3]);
            }
        }

        System.out.println("------------------------------------------------------------");

        // Latihan 13: Sistem nilai mahasiswa dinamis
        // TODO: Implementasikan sistem nilai yang bisa menambah mahasiswa dinamis
        ArrayList<Object[]> sistemNilai = new ArrayList<>();

        ArrayList<Integer> nilaiAndi = new ArrayList<>();
        Collections.addAll(nilaiAndi, 80, 85, 78);
        sistemNilai.add(new Object[]{"Andi", nilaiAndi});

        ArrayList<Integer> nilaiBudi = new ArrayList<>();
        Collections.addAll(nilaiBudi, 90, 88, 92, 95);
        sistemNilai.add(new Object[]{"Budi", nilaiBudi});

        ArrayList<Integer> nilaiCitra = new ArrayList<>();
        Collections.addAll(nilaiCitra, 70, 75, 80);
        sistemNilai.add(new Object[]{"Citra", nilaiCitra});

        ArrayList<Integer> nilaiDina = new ArrayList<>();
        Collections.addAll(nilaiDina, 85, 90);
        sistemNilai.add(new Object[]{"Dina", nilaiDina});

        System.out.println("------------------------------------------------");
        System.out.printf("%-10s | %-20s | %-10s\n", "Nama", "Nilai", "Rata-rata");
        System.out.println("------------------------------------------------");

        for (Object[] data : sistemNilai) {
            String nama = (String) data[0];
            ArrayList<Integer> nilaiList = (ArrayList<Integer>) data[1];

            double total = 0;
            for (int n : nilaiList) total += n;
            double rataRata = total / nilaiList.size();

            System.out.printf("%-10s | %-20s | %-10.2f\n", nama, nilaiList.toString(), rataRata);
        }

        System.out.println("------------------------------------------------");

        // ===== PERFORMANCE COMPARISON =====
        System.out.println("\n=== PERFORMANCE COMPARISON ===");

        // Latihan 14: Bandingkan performa Array vs ArrayList
        // TODO: Implementasikan comparison waktu akses, insert, search
        int n = 1_000_000;

        int[] array = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i1 = 0; i < n; i++) {
            array[i] = i;
            arrayList.add(i);
        }

        long start, end;

        start = System.nanoTime();
        int valArray = array[n / 2];
        end = System.nanoTime();
        System.out.println("Waktu akses Array: " + (end - start) + " ns");

        start = System.nanoTime();
        int valArrayList = arrayList.get(n / 2);
        end = System.nanoTime();
        System.out.println("Waktu akses ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        int[] newArray = new int[n + 1];
        System.arraycopy(array, 0, newArray, 0, n / 2);
        newArray[n / 2] = 999;
        System.arraycopy(array, n / 2, newArray, n / 2 + 1, n - n / 2);
        end = System.nanoTime();
        System.out.println("Waktu insert Array: " + (end - start) + " ns");

        start = System.nanoTime();
        arrayList.add(n / 2, 999);
        end = System.nanoTime();
        System.out.println("Waktu insert ArrayList: " + (end - start) + " ns");

        int tuju = n - 10;

        start = System.nanoTime();
        boolean foundArray = false;
        for (int val : array) {
            if (val == tuju) {
                foundArray = true;
                break;
            }
        }
        end = System.nanoTime();
        System.out.println("Waktu search Array: " + (end - start) + " ns (found=" + foundArray + ")");

        start = System.nanoTime();
        boolean foundArrayList = arrayList.contains(target);
        end = System.nanoTime();
        System.out.println("Waktu search ArrayList: " + (end - start) + " ns (found=" + foundArrayList + ")");

    }

    // ===== HELPER METHODS =====
    // TODO: Implementasikan method-method pembantu di sini

    public static void printArrayList(ArrayList<?> list, String title) {
        System.out.println("\n=== " + title + " ===");
        if (list.isEmpty()) {
            System.out.println("(List kosong)");
        } else {
            for (Object item : list) {
                System.out.println(item);
            }
        }
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        System.out.println("\n=== PRINT 2D MATRIX ===");
        for (ArrayList<Integer> row : matrix) {
            for (Integer val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judul) && buku[3].equalsIgnoreCase("tersedia")) {
                buku[3] = "dipinjam";
                return true;
            }
        }
        return false;
    }

    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judul) && buku[3].equalsIgnoreCase("dipinjam")) {
                buku[3] = "tersedia";
                return true;
            }
        }
        return false;
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        if (values.isEmpty()) return 0.0;
        double total = 0;
        for (int v : values) total += v;
        return total / values.size();
    }
}
