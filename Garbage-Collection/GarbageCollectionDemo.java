class GarbageCollectionDemo {
    static class Student {
        int roll;
        String name;

        Student(int r, String n) {
            roll = r;
            name = n;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used before object creation: " + memoryBefore + " bytes");
        Student[] students = new Student[100000];
        for (int i = 0; i < 100000; i++) {
            students[i] = new Student(i, "Student" + i);
        }
        long memoryAfterCreation = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used after object creation: " + memoryAfterCreation + " bytes");
        students = null;
        System.gc();
        Thread.sleep(2000);
        long memoryAfterGC = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used after garbage collection: " + memoryAfterGC + " bytes");
        System.out.println("End of Program");
    }
}