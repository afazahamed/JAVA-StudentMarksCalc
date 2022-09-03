 JAVA-StudentMarksCalc
 
<img src="https://lh3.googleusercontent.com/drive-viewer/AJc5JmRGgFSS-CPuIcqfnNamZO4BVRL7dM4E8fjNttN5SKrftRoy8VWp6GTK8SCmG2zaYJmmTyeUmhE=w2880-h1642" width="100">

# Enter student personal Details and Marks to find total and store in LinkedList
### STUDENT MARKS CALCULATION with OOP

**`Linked list`** has been used Inheritance has been used - Student extends Marks
Can store students who are having 3 Marks & 2 Marks

TryCatch used - Remove *(When try to remove Linked list data when it's empty)*


1. **Inheritance** - Student extends Marks
2. **Encapsulation** - Getters & Setters (Student & Marks)
3. **Polymorphism** - Student / Marks constructors overloaded
4. **Abstraction** - MarksFormat extended to Marks



#### **Inheritance** - Student extends Marks
                public class Student extends Marks
                public class Marks extends MarksFormat
                abstract class MarksFormat
#### **Encapsulation** - Getters & Setters (Student & Marks)
                private String stname;
                private String address;

                    public void setStName(String nam)
                    {
                        this.stname = nam;
                    }

                    public String getStname()
                    {
                        return stname;
                    }
#### **Polymorphism** - Student / Marks constructors overloaded
                Student(String stname, String address, int mk1, int mk2, int mk3)
                {
                    super(mk1,mk2,mk3);
                    this.stname = stname;
                    this.address = address;
                }

                Student(String stname, String address, int mk1, int mk2)
                {
                    super(mk1,mk2);
                    this.stname = stname;
                    this.address = address;
                }
#### **Abstraction** - MarksFormat extended to Marks
                abstract class MarksFormat 
                {
                    abstract int total();
                    abstract double avg();
                    abstract String grade();
                }
                //Extended to Marks Class
                public class Marks extends MarksFormat




