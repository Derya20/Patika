package OOP;
/*
Course sınıfına derse ait sözlü notu kısmını girin ve
ortalamaya etkisini her ders için ayrı ayrı belirtin.
Sözlü notlarınıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise
 sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise,
o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */
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
    public void addBulkNote(int matFinal, int matOral, int fizFinal, int fizOral, int kimFinal, int kimOral) {

        if (matFinal >= 0 && matFinal <= 100) {
            this.mat.finalNote = matFinal;
        }

        if (matOral >= 0 && matOral <= 100) {
            this.mat.oralNote = matOral;
        }

        if (fizFinal >= 0 && fizFinal <= 100) {
            this.fizik.finalNote = fizFinal;
        }

        if (fizOral >= 0 && fizOral <= 100) {
            this.fizik.oralNote = fizOral;
        }

        if (kimFinal >= 0 && kimFinal <= 100) {
            this.kimya.finalNote = kimFinal;
        }

        if (kimOral >= 0 && kimOral <= 100) {
            this.kimya.oralNote = kimOral;
        }

        //oral note= %30  final note= %70
        this.mat.note=(mat.oralNote*0.30)+(mat.finalNote*0.70);
        this.fizik.note=(fizik.oralNote*0.30)+(fizik.finalNote*0.70);
        this.kimya.note=(kimya.oralNote*0.30)+(kimya.finalNote*0.70);

    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
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

        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik sözlü notu: "+this.mat.oralNote+" (%30)");
        System.out.println("Matematik final notu: "+this.mat.finalNote+" (%70)");
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik sözlü notu: "+this.fizik.oralNote+" (%30)");
        System.out.println("Matematik final notu: "+this.fizik.finalNote+" (%70)");
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Matematik sözlü notu: "+this.kimya.oralNote+" (%30)");
        System.out.println("Matematik final notu: "+this.kimya.finalNote+" (%70)");
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
