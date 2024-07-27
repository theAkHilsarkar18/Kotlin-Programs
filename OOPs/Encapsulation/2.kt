/*
    Implement a class Student with private properties name and grade. Provide getter and setter methods for grade with validation to ensure the grade is between 0 and 100. Add a method to check if the student has passed based on the grade.
*/

class Student(val name : String, private var grade : Int) {
    fun setGrade(grade : Int){
        if(grade in 0..100){    
            this.grade = grade 
        }else{
            println("Invalid grade")
        }
    }

    fun getGrade() : Int {
        return grade
    }

    fun isPassed() : Boolean {
        if(grade >= 40){
            return true
        }else{
            return false
        }
    }
}

fun main() {
    var student = Student("Akhil", 50)
	
    //defalut grade
    println("Grade : " + student.getGrade())
    student.setGrade(69)
    println("Grade : " + student.getGrade())
    println("Passed : " + student.isPassed())
}

// platform declaration clash: The following declarations have the same JVM signature (getGrade()I): fun `<get-grade>`(): Int defined in Student fun getGrade(): Int defined in Student 