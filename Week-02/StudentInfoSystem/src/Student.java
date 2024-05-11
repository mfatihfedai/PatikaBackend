public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matVerbal, int matExam, int fizikVerbal, int fizikExam, int kimyaVerbal , int kimyaExam) {

        if ((matVerbal >= 0 && matVerbal <= 100) && (matExam >= 0 && matExam <= 100)) {
            this.mat.exam = matExam;
            this.mat.verbal = matVerbal;

        }

        if ((fizikVerbal >= 0 && fizikVerbal <= 100) && (fizikExam >= 0 && fizikExam <= 100)) {
            this.fizik.exam = fizikExam;
            this.fizik.verbal = fizikVerbal;
        }

        if ((kimyaVerbal >= 0 && kimyaVerbal <= 100) && (kimyaExam >= 0 && kimyaExam <= 100) ) {
            this.kimya.exam = kimyaExam;
            this.kimya.verbal = kimyaVerbal;
        }

    }

    public void isPass() {
        if (this.mat.exam == 0 || this.mat.verbal == 0 || this.fizik.exam == 0 || this.fizik.verbal == 0 || this.kimya.exam == 0 || this.kimya.verbal == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.exam * 0.8 + this.fizik.verbal * 0.2) + (this.kimya.exam * 0.8 + this.kimya.verbal * 0.2) + (this.mat.exam * 0.8 + this.mat.verbal * 0.2)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.exam);
        System.out.println("Fizik Notu : " + this.fizik.exam);
        System.out.println("Kimya Notu : " + this.kimya.exam);
    }

}