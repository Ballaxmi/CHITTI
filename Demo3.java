import java.util.HashSet;
import java.util.Set;


public class Demo3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "java");
        Employee emp2 = new Employee(101, "java");
        Set<Employee> empSet = new HashSet<>();
        empSet.add(emp1);
        empSet.add(emp2);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(empSet.size());
    }
}

 

//hashcode and equals
class Employee {

 

    public Employee() {

 

    }

 

    public Employee(int empid, String empnm) {
        super();
        this.empid = empid;
        this.empnm = empnm;
    }

 

    private int empid;
    private String empnm;

 

    public int getEmpid() {
        return empid;
    }

 

    public void setEmpid(int empid) {
        this.empid = empid;
    }

 

    public String getEmpnm() {
        return empnm;
    }

 

    public void setEmpnm(String empnm) {
        this.empnm = empnm;
    }

 

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empid;
        result = prime * result + ((empnm == null) ? 0 : empnm.hashCode());
        return result;
    }

 

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (empid != other.empid)
            return false;
        if (empnm == null) {
            if (other.empnm != null)
                return false;
        } else if (!empnm.equals(other.empnm))
            return false;
        return true;
    }

 

}