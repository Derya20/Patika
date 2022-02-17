package DetermineSalary;

//fabrıkanın calısanları
public class Employee {

    String name;
    double salary;
    int workHours;//haftalık calısma saatı
    int hireYear;
    double bonusSalary=0;
    double raiseSalary;
    double taxSalary;

    public Employee(String name, double salary, int workHours, int hireYear) {

        this.hireYear=hireYear;
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
    }

    public double tax(){//vergi hesabı

        if (salary>1000){
            //0.03  == %3
            taxSalary=salary*0.03;
        }
        return taxSalary;
    }
    public double bonus(){

        if (workHours>40){
            bonusSalary=(workHours-40)*30;
        }

        return bonusSalary;

    }

    public double raiseSalary(){
        int currentYear=2021;
        int t=currentYear-hireYear;

        if (t<10){
            // 0.05
            raiseSalary=salary*0.05;
        }else if(t<20){
            //0.1
            raiseSalary=salary*0.1;
        }else{
            raiseSalary=salary*0.15;
        }
        return raiseSalary;
    }

    void printInfo(){
        System.out.println("******");
        System.out.println("Adı : " +name);
        System.out.println("Employee Salary : " +salary);
        System.out.println("Work Hour Per Week : "+workHours);
        System.out.println("Hire Year : " + hireYear);
        System.out.println("Tax Amount : " + tax());
        System.out.println("Bonus Salary : " +bonus());
        System.out.println("Raise Salary : " + raiseSalary());
        System.out.println("Salary with Tax and Bonus : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş : "+ (this.salary + (bonus()+raiseSalary()) - tax()));


    }
}
