// Is-A relationship
public class Inheritance
{
    
}

class Employee
{
    private float salary;
}

// Programmer (subclass) Is-A Employee (superclass)
class Programmer extends Employee
{
    int bonus;
}

// multiple inheritance is not supported in Java
// single, multilevel, hierarchical