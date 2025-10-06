import java.util.Arrays;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] matrix = new int[3][4];

        // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
            }
        }

        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi
        System.out.println("Isi Matriks 3x4:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        // Latihan 2: Array 2D dengan inisialisasi langsung
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ".";
            }
        }

        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        board[0][0] = "X";
        board[1][1] = "X";
        board[2][2] = "X";

        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]
        board[0][2] = "O";
        board[1][0] = "O";
        board[2][1] = "O";

        // - Print papan dengan format grid yang rapi
        System.out.println("\nPapan Tic-Tac-Toe:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] jagged = new int[4][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];
        jagged[3] = new int[5];

        // - Isi setiap baris dengan angka berurutan dimulai dari 1
        int num = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = num++;
            }
        }

        // - Print array jagged dengan menampilkan panjang setiap baris
        System.out.println("\nArray Jagged (Irregular):");
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Baris " + i + " (panjang " + jagged[i].length + "): " + Arrays.toString(jagged[i]));
        }

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrixB = {
                {6, 5, 4},
                {3, 2, 1}
        };

        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        int[][] sumMatrix = addMatrices(matrixA, matrixB);

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        int[][] multipliedMatrix = multiplyByScalar(matrixA, 2);

        // - Print hasil operasi
        System.out.println("Matriks A:");
        displayMatrix(matrixA);

        System.out.println("Matriks B:");
        displayMatrix(matrixB);

        System.out.println("Hasil Penjumlahan (A + B):");
        displayMatrix(sumMatrix);

        System.out.println("Hasil Perkalian Scalar (A x 2):");
        displayMatrix(multipliedMatrix);

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method sortArray untuk mengurutkan array
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)
        int[] sorted = sortArray(numbers);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(sorted));

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)
        int[] reversed = reverseArray(sorted);
        System.out.println("Array setelah dibalik: " + Arrays.toString(reversed));

        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])
        int[] minMax = findMinMax(numbers);
        System.out.println("Nilai minimum: " + minMax[0]);
        System.out.println("Nilai maksimum: " + minMax[1]);

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array
        System.out.println("Array awal: " + Arrays.toString(data));

        // - Gunakan Arrays.sort() untuk mengurutkan array
        Arrays.sort(data);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(data));

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)
        int key = 8;
        int index = Arrays.binarySearch(data, key);
        if (index >= 0)
            System.out.println("Elemen " + key + " ditemukan pada indeks ke-" + index);
        else
            System.out.println("Elemen " + key + " tidak ditemukan.");

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Array setelah diisi dengan angka 7: " + Arrays.toString(filled));

        // - Gunakan Arrays.equals() untuk membandingkan dua array
        int[] dataCopy = {1, 2, 3, 4, 5, 6};
        boolean isEqual = Arrays.equals(data, dataCopy);
        System.out.println("Apakah data dan dataCopy sama? " + isEqual);

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda
        int[] biggerCopy = Arrays.copyOf(data, 10);
        System.out.println("Copy array dengan ukuran lebih besar: " + Arrays.toString(biggerCopy));

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)
        int[][][] array3D = new int[2][3][4];

        // - Isi dengan nilai berurutan dari 1
        int isi = 1;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = isi++;
                }
            }
        }

        // - Print menggunakan triple nested loop dengan format yang jelas
        for (int i = 0; i < array3D.length; i++) {
            System.out.println("Lapisan ke-" + (i + 1) + ":");
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.printf("%4d", array3D[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};
        int[][] nilai = new int[namaMahasiswa.length][mataKuliah.length];

        // - Isi dengan nilai random antara 60-100
        fillRandomGrades(nilai, 60, 100);

        // - Hitung rata-rata per mahasiswa
        double[] rataMahasiswa = new double[namaMahasiswa.length];
        for (int i = 0; i < namaMahasiswa.length; i++) {
            rataMahasiswa[i] = calculateAverage(nilai[i]);
        }

        // - Hitung rata-rata per mata kuliah
        double[] rataMataKuliah = new double[mataKuliah.length];
        for (int j = 0; j < mataKuliah.length; j++) {
            int sum = 0;
            for (int i = 0; i < namaMahasiswa.length; i++) {
                sum += nilai[i][j];
            }
            rataMataKuliah[j] = (double) sum / namaMahasiswa.length;
        }

        // - Tentukan mahasiswa dengan nilai tertinggi
        double maxAvg = rataMahasiswa[0];
        int topIndex = 0;
        for (int i = 1; i < rataMahasiswa.length; i++) {
            if (rataMahasiswa[i] > maxAvg) {
                maxAvg = rataMahasiswa[i];
                topIndex = 1;
            }
        }

        // - Print dalam format tabel yang rapi
        System.out.println("Daftar Nilai Mahasiswa:");
        System.out.printf("%-10s", "Nama");
        for (String mk : mataKuliah) {
            System.out.printf("%10s", mk);
        }
        System.out.printf("%12s\n", "Rata-rata");

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("%-10s", namaMahasiswa[i]);
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.printf("%10d", nilai[i][j]);
            }
            System.out.printf("%12.2f\n", rataMahasiswa[i]);
        }

        System.out.println("\nRata-rata per mata kuliah:");
        for (int j = 0; j < mataKuliah.length; j++) {
            System.out.printf("%-10s: %.2f\n", mataKuliah[j], rataMataKuliah[j]);
        }

        // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan
        char[][] papan = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // - Implementasikan method untuk menampilkan papan
        papan[0][0] = 'X';
        papan[1][1] = 'O';
        papan[0][1] = 'X';
        papan[2][2] = 'O';
        papan[0][2] = 'X';

        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(papan[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }

        // - Implementasikan method untuk mengecek apakah ada pemenang
        char winner = ' ';

        // - Simulasikan beberapa langkah permainan
        for (int i = 0; i < 3; i++) {
            if (papan[i][0] != ' ' &&
                    board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) {
                winner = papan[i][0];
            }
        }

        for (int j = 0; j < 3; j++) {
            if (papan[0][j] != ' ' &&
                    board[0][j] == board[1][j] &&
                    board[1][j] == board[2][j]) {
                winner = papan[0][j];
            }
        }

        if (papan[0][0] != ' ' &&
                board[0][0] == board[1][1] &&
                board[1][1] == board[2][2]) {
            winner = papan[0][0];
        }
        if (papan[0][2] != ' ' &&
                board[0][2] == board[1][1] &&
                board[1][1] == board[2][0]) {
            winner = papan[0][2];
        }

        if (winner != ' ') {
            System.out.println("Pemenangnya adalah: " + winner);
        } else {
            System.out.println("Belum ada pemenang!");
        }
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length); // buat salinan agar tidak ubah aslinya
        Arrays.sort(sorted);
        return sorted;
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        return new int[]{min, max};
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }
}
