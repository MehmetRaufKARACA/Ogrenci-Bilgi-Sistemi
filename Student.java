public class Student {
    
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        
        if(note2 >= 0 && note2 <= 100){
           this.c2.note = note2;
        }

        if(note3 >= 0 && note3 <= 100){
           this.c3.note = note3;
        }
    }

    void isPass(){
        System.out.println("*****************");
        this.isPass = isCheckPass();

        System.out.println("Average : " + this.avarage);
        if(this.isPass){
            System.out.println("Sınıfı geçtiniz :)");
        }else{
            System.out.println("Sınıfta kaldınız :(");
        }

        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + "notu\t:" + this.c1.note);
        System.out.println(this.c2.name + "notu\t:" + this.c2.note);
        System.out.println(this.c3.name + "notu\t:" + this.c3.note);
    }

    void addBulkVerbalNote(int tarihVerbal, int fizikVerbal, int biyolojiVerbal){
        if (tarihVerbal >= 0 && tarihVerbal <= 100) {
            this.c1.verbalNote = tarihVerbal;
        }

        if (fizikVerbal >= 0 && fizikVerbal <= 100) {
            this.c2.verbalNote = fizikVerbal;
        }

        if (biyolojiVerbal >= 0 && biyolojiVerbal <= 100) {
            this.c3.verbalNote = biyolojiVerbal;
        }
    }

    void calcAverage(){
        double tarihAverage = this.c1.note * 0.8 + this.c1.verbalNote * 0.2;
        double fizikAverage = this.c2.note * 0.75 + this.c2.verbalNote * 0.25;
        double  biyolojiAverage = this.c3.note * 0.6 + this.c3.verbalNote * 0.4;
        double GPA = (tarihAverage + fizikAverage +  biyolojiAverage) / 3;
        this.avarage = Math.round(GPA * 100) / 100d;

    }

    boolean isCheckPass(){
        calcAverage();
        return this.avarage > 55;}

}
