import java.util.Arrays;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
        counter++;
    }

    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Methods Advanced
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * method signature, overloading, pass by value/reference, static vs instance methods.
         */

        // ===== METHOD SIGNATURE DAN DECLARATION =====
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");

        // Latihan 1: Memahami komponen method signature
        // - Panggil method dengan signature berbeda untuk melihat perbedaannya
        // - Gunakan method overloading untuk mendemonstrasikan signature

        // Contoh pemanggilan method calculate dengan signature berbeda
        int hasil1 = calculate(5, 10);
        double hasil2 = calculate(2.5, 3.5);
        int hasil3 = calculate(1, 2, 3);
        String hasil4 = calculate("Hello", "World");

        System.out.println("calculate(int, int) = " + hasil1);
        System.out.println("calculate(double, double) = " + hasil2);
        System.out.println("calculate(int, int, int) = " + hasil3);
        System.out.println("calculate(String, String) = " + hasil4);

        // ===== METHOD OVERLOADING =====
        System.out.println("\n=== METHOD OVERLOADING ===");

        // Latihan 2: Implementasi dan penggunaan method overloading
        // - Panggil semua variasi method calculate yang di-overload
        System.out.println("Hasil calculate(int, int): " + calculate(5, 10));
        System.out.println("Hasil calculate(double, double): " + calculate(2.5, 3.5));
        System.out.println("Hasil calculate(int, int, int): " + calculate(1, 2, 3));
        System.out.println("Hasil calculate(String, String): " + calculate("Hello", "World"));

        // - Panggil semua variasi method print yang di-overload
        System.out.println("\nDemonstrasi print() overloading:");
        print(42);
        print(3.14);
        print("Java Overloading!");
        print(new int[]{1, 2, 3, 4});

        // - Demonstrasikan bagaimana compiler memilih method yang tepat
        System.out.println("\nDemonstrasi pemilihan otomatis oleh compiler:");
        print(7);
        print(7.0);
        print("7");

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\n=== STATIC VS INSTANCE METHODS ===");

        // Latihan 3: Perbedaan static dan instance methods
        // - Panggil static method tanpa membuat object
        System.out.println("Nilai counter awal: " + getCounter());
        incrementCounter();
        System.out.println("Nilai counter setelah increment: " + getCounter());

        // - Buat instance object dan panggil instance method
        MethodsAdvancedPractice obj1 = new MethodsAdvancedPractice("Object Satu");
        MethodsAdvancedPractice obj2 = new MethodsAdvancedPractice("Object Dua");

        obj1.displayInfo();
        obj2.displayInfo();

        // - Demonstrasikan akses ke static vs instance variables
        System.out.println("\nMenampilkan info dari kedua object:");
        obj1.displayInfo();
        obj2.displayInfo();

        // - Coba akses instance method dari static context (akan error)
        // displayInfo();
        System.out.println("// Baris di atas akan error jika di-uncomment karena displayInfo() bukan static method");

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\n=== PASS BY VALUE - PRIMITIVES ===");

        // Latihan 4: Demonstrasi pass by value untuk primitive types
        int originalNumber = 10;
        System.out.println("Sebelum method dipanggil: originalNumber = " + originalNumber);

        // - Panggil method modifyPrimitive dengan originalNumber
        modifyPrimitive(originalNumber);

        // - Print originalNumber sebelum dan sesudah method call
        System.out.println("Setelah method dipanggil: originalNumber = " + originalNumber);
        System.out.println("→ Nilai tidak berubah karena Java menggunakan 'pass by value' untuk tipe primitif.");

        // - Jelaskan mengapa nilai tidak berubah
        // Java selalu pass by value, bahkan untuk primitif.

        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");

        // Latihan 5: Demonstrasi pass by value of reference untuk objects
        int[] originalArray = {1, 2, 3, 4, 5};

        // - Print array sebelum modification
        System.out.println("Sebelum modification: " + Arrays.toString(originalArray));

        // - Panggil method modifyArray dengan originalArray
        modifyArray(originalArray);

        // - Print array setelah modification

        System.out.println("Setelah modification: " + Arrays.toString(originalArray));
        System.out.println("→ Isi array berubah karena method menerima salinan reference yang menunjuk ke array yang sama.");

        // - Jelaskan mengapa isi array berubah tetapi reference tidak
        // Isi object bisa diubah, karena reference menunjuk ke object yang sama

        // Latihan 6: Reference reassignment dalam method
        int[] anotherArray = {10, 20, 30};

        // - Print array sebelum reassignment
        System.out.println("Sebelum reassignment: " + Arrays.toString(anotherArray));

        // - Panggil method reassignArray dengan anotherArray
        reassignArray(anotherArray);

        // - Print array setelah method call
        System.out.println("Setelah method dipanggil: " + Arrays.toString(anotherArray));
        System.out.println("→ Reference asli tidak berubah karena Java mengirim salinan reference ke method, bukan reference itu sendiri.");

        // - Jelaskan mengapa reference asli tidak berubah
        // Method mengganti salinan reference dengan object baru
        // Tidak berubah, tetap menunjuk ke array lama

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 7: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array asli: " + Arrays.toString(numbers));

        // - Panggil method yang mengembalikan copy array yang diurutkan
        int[] sortedCopy = sortArrayCopy(numbers);
        System.out.println("Sorted copy: " + Arrays.toString(sortedCopy));

        // - Panggil method yang mengembalikan statistik array (min, max, avg)
        double[] stats = getArrayStats(numbers);
        System.out.printf("Min: %.0f, Max: %.0f, Average: %.2f\n", stats[0], stats[1], stats[2]);

        // - Panggil method yang merge dua array
        int[] otherNumbers = {5, 15, 25};
        int[] merged = mergeArrays(numbers, otherNumbers);
        System.out.println("Merged array: " + Arrays.toString(merged));

        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\n=== VARIABLE ARGUMENTS (VARARGS) ===");

        // Latihan 8: Implementasi dan penggunaan varargs
        // - Panggil method sum dengan jumlah parameter berbeda-beda
        int sum1 = sum(10, 20);
        int sum2 = sum(5, 15, 25, 35);
        int sum3 = sum();

        System.out.println("Sum(10, 20) = " + sum1);
        System.out.println("Sum(5, 15, 25, 35) = " + sum2);
        System.out.println("Sum() = " + sum3);

        // - Panggil method printInfo dengan berbagai kombinasi parameter
        printInfo("Nilai Mahasiswa", 80, 90, 75);
        printInfo("Nilai Tugas", 100);
        printInfo("Kosong");

        // ===== METHOD CHAINING =====
        System.out.println("\n=== METHOD CHAINING ===");

        // Latihan 9: Implementasi method chaining
        // - Gunakan Calculator dengan method chaining untuk operasi berurutan
        Calculator calc = new Calculator(10);

        double result = calc.add(5)
                .multiply(2)
                .subtract(7)
                .getResult();

        System.out.println("Hasil perhitungan dengan method chaining: " + result);

        // ===== RECURSIVE METHODS =====
        System.out.println("\n=== RECURSIVE METHODS ===");

        // Latihan 10: Implementasi dan penggunaan recursive methods
        // - Hitung faktorial menggunakan recursion
        int nFact = 5;
        long factResult = factorial(nFact);
        System.out.println("Faktorial dari " + nFact + " = " + factResult);

        // - Hitung fibonacci menggunakan recursion
        int nFib = 7;
        int fibResult = fibonacci(nFib);
        System.out.println("Fibonacci ke-" + nFib + " = " + fibResult);

        // - Implementasikan binary search recursive
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int index = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Index " + target + " dalam array: " + index);

        // ===== UTILITY STATIC METHODS =====
        System.out.println("\n=== UTILITY STATIC METHODS ===");

        // Latihan 11: Membuat utility class dengan static methods
        // - Gunakan MathUtils untuk berbagai operasi matematika
        double base = 2;
        int exponent = 5;
        System.out.println("2 pangkat 5 = " + MathUtils.power(base, exponent));
        System.out.println("GCD dari 24 dan 36 = " + MathUtils.gcd(24, 36));
        System.out.println("Apakah 29 prime? " + MathUtils.isPrime(29));

        // - Gunakan StringUtils untuk manipulasi string
        String text = "level";
        System.out.println("Reverse dari 'level' = " + StringUtils.reverse(text));
        System.out.println("Apakah 'level' palindrome? " + StringUtils.isPalindrome(text));
        System.out.println("Jumlah kata dari 'Halo dunia Java' = " + StringUtils.countWords("Halo dunia Java"));

        // - Gunakan ArrayUtils untuk operasi array
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matriks:");
        ArrayUtils.printMatrix(matrix);

        int[] arr = {1,2,3,2,4,5,1};
        System.out.println("Duplicate di array {1,2,3,2,4,5,1} = " + Arrays.toString(ArrayUtils.findDuplicates(arr)));

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println("Apakah arr1 dan arr2 sama? " + ArrayUtils.areEqual(arr1, arr2));

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem kalkulator dengan method overloading
        // - Implementasikan calculator yang bisa handle berbagai tipe data dan operasi

        // Latihan 13: Sistem processing data dengan static utilities
        // - Implementasikan data processor dengan berbagai method utility
    }

    // ===== METHOD OVERLOADING EXAMPLES =====

    // TODO: Implementasikan method calculate yang di-overload
    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculate(String a, String b) {
        return a + b;
    }

    // TODO: Implementasikan method print yang di-overload
    public static void print(int value) {
        System.out.println("[int] " + value);
    }

    public static void print(double value) {
        System.out.println("[double] " + value);
    }

    public static void print(String value) {
        System.out.println("[String] " + value);
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // ===== STATIC VS INSTANCE METHODS =====

    public static int getCounter() {
        return counter;
    }

    public static void incrementCounter() {
        counter++;
    }


    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String name) {
        this.instanceName = name;
    }

    public void displayInfo() {
        System.out.println("Instance name: " + instanceName);
        System.out.println("Static counter: " + counter);
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====

    public static void modifyPrimitive(int number) {
        number += 100;
        System.out.println("Inside modifyPrimitive: " + number);
    }

    public static void modifyArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            array[i] += 10;
        }
    }

    public static void reassignArray(int[] array) {
        array = new int[]{99, 88, 77};
        System.out.println("Inside reassignArray: " + Arrays.toString(array));
    }

    // ===== ARRAY METHODS =====

    public static int[] sortArrayCopy(int[] original) {
        int[] copy = Arrays.copyOf(original, original.length);
        Arrays.sort(copy);
        return copy;
    }

    public static double[] getArrayStats(int[] array) {
        int min = array[0], max = array[0], sum = 0;
        for(int val : array) {
            if(val < min) min = val;
            if(val > max) max = val;
            sum += val;
        }
        double avg = (double) sum / array.length;
        return new double[]{min, max, avg};
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====

    public static int sum(int... numbers) {
        int total = 0;
        for(int n : numbers) total += n;
        return total;
    }

    public static void printInfo(String title, int... values) {
        System.out.print(title + ": ");
        for(int v : values) System.out.print(v + " ");
        System.out.println();
    }

    // ===== RECURSIVE METHODS =====

    public static long factorial(int n) {
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if(left > right) return -1;
        int mid = left + (right - left) / 2;
        if(array[mid] == target) return mid;
        if(array[mid] < target) return binarySearchRecursive(array, target, mid + 1, right);
        return binarySearchRecursive(array, target, left, mid - 1);
    }

    // ===== UTILITY CLASSES (INNER STATIC CLASSES) =====

    public static class MathUtils {
        public static double power(double base, int exponent) {
            double result = 1;
            for(int i=0; i<exponent; i++) result *= base;
            return result;
        }

        public static boolean isPrime(int number) {
            if(number <= 1) return false;
            for(int i=2; i*i <= number; i++)
                if(number % i == 0) return false;
            return true;
        }

        public static int gcd(int a, int b) {
            while(b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        public static boolean isPalindrome(String str) {
            return str.equals(reverse(str));
        }

        public static int countWords(String str) {
            return str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            for(int[] row : matrix) System.out.println(Arrays.toString(row));
        }

        public static int[] findDuplicates(int[] array) {
            java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
            for(int n : array) map.put(n, map.getOrDefault(n, 0) + 1);
            return map.entrySet().stream().filter(e -> e.getValue() > 1).mapToInt(java.util.Map.Entry::getKey).toArray();
        }

        public static boolean areEqual(int[] array1, int[] array2) {
            return Arrays.equals(array1, array2);
        }
    }

    // ===== METHOD CHAINING EXAMPLE =====

    public static class Calculator {
        private double value;

        public Calculator(double initial) {
            this.value = initial;
        }

        public Calculator add(double n) {
            this.value += n;
            return this;
        }

        public Calculator multiply(double n) {
            this.value *= n;
            return this;
        }

        public Calculator subtract(double n) {
            this.value -= n;
            return this;
        }

        public double getResult() {
            return value;
        }
    }
}
