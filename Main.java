public class Main{

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mert", "0576980361", "TRH");
        Teacher t2 = new Teacher("Polat", "05055422835", "FZK");
        Teacher t3 = new Teacher("Sarp", "05055422836", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH", t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK", t2);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "", "BIO", t3);
        biyo.addTeacher(t3);
        

        Student s1 = new Student("Lezgı", "177", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100, 200, 75);
        s1.addBulkVerbalNote(61,55,77);
        s1.isPass();


        Student s2 = new Student("Tarık", "554", "3", tarih, fizik, biyo);
        s2.addBulkExamNote(55, 77, 61);
        s2.addBulkVerbalNote(33,88,95);
        s2.isPass();
    }
}