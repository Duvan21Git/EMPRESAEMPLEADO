public class Directive extends Employee {
    private final int MAX_EMPLOYEES = 50;

    private String category;
    private Employee[] employees;

    public Directive(String name, Integer age, Double salary, String category) {
        super(name, age, salary);
        this.category = category;
        this.employees = new Employee[MAX_EMPLOYEES];
    }

    public String getCategory() {
        return category;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployee(int index, Employee employee) {
        if (index >= 0 && index < employees.length) {
            employees[index] = employee;
        } else {
            System.err.println("Indice de empleado inválido");
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Directivo: nombre: %s, edad: %d, salario: $ %,.2f, categoria: %s%n",
                getName(), getAge(), getSalary(), getCategory());
    }

}