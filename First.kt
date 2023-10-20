package com.example.cotline1.colictions

//import com.example.cotline1.Etudient

////@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@exercice1@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@22
//
////la criyation de class
//class etudiant(var name:String,var code:Int,var sex:String,var adress:String,var age:Byte){
//    override fun toString(): String {
//        return "nom :${name} ,code :${code} ,sexe :${sex} ,adress : ,${adress} ,age :${age}"
//    }
//}
//
//fun main(){
//    // la diclaration de la liste
//    val etudients= mutableListOf<etudiant>()
//    //l'ajoute a la liste
//    etudients.add(etudiant("otmane",1,"homme","safi",20))
//    etudients.add(etudiant("younes",1,"homme","rabat",19))
//    etudients.add(etudiant("ihssan",1,"Femme","safi",22))
//    etudients.add(etudiant("saad",1,"homme","safi",23))
//    etudients.add(etudiant("khawlla",1,"Femme","safi",35))
//    etudients.add(etudiant("otmane6",1,"homme","safi",20))
//    etudients.add(etudiant("otmane7",1,"homme","safi",34))
//    etudients.add(etudiant("otmane8",1,"homme","safi",31))
//    etudients.add(etudiant("otmane9",2,"homme","safi",12))
//    etudients.add(etudiant("otmane10",1,"homme","safi",30))
//
//    for (e in etudients){
//        println(e)
//    }
//
//
//    //****************quesstion 3 la fonction sortby()*********************88
//    println("sortby age")
//    etudients.sortBy { it.age }
//    for (e in etudients){
//        println(e)
//    }
////    //************************quesstion4 la fontion groupe by()********************
//    println("gropeby sexe")
//    etudients.groupBy { it.sex }
//    for (e in etudients){
//        println(e)
//    }
////    //*****************quesstion5 la fonction groupe by sexe*******************
////                   //la liste des femmes
//    etudients.groupBy { it.sex }.get("femme")
//    for (e in etudients){
//        println(e)
//    }
////                   //la liste des hommes
//    etudients.groupBy { it.sex }.get("femme")
//    for (e in etudients){
//        println(e)
//    }
//    //modifier le nom de premaire etudiant
//    etudients[0].name="saad"
//    for (e in etudients){
//        println(e)
//    }
//    //quesstion6 afficher le nom de premier etudient
//    println("le nom de premier etudient est :")
//    var premair=etudients.first{it.sex=="homme"}.name
//    println("le premaire etudient dant la liste est :${premair}")
////quesstion7 supprimer tout les element d'un sex donne
//              //seprimer les femme
//    println("la liste des homme")
//    etudients.removeIf { it.sex == "Femme" }
//    for (e in etudients){
//        println(e)
//    }
//               //seprimer les hommes
//    println("la list des femme")
//    etudients.removeIf { it.sex == "homme" }
//    println(etudients)
//
////
////    //quesstion8 la creation des listes contenant uniquement le nom des etudiants
//    val etudiantsNoms = mutableListOf<String>()
//    for (etu in etudients){
//        etudiantsNoms.add(etu.name)
//    }
////
////quesstion 9 inverser la liste des etudiants
//    println("inverser la liste des etudiants")
//     var verse=etudients.reversed()
//    for (e in verse){
//        println(e)
//    }
//////quesstion 10 vider la liste des etudiants
//    etudients.clear()
//println(etudients)
//
//}


//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@les travaux pratique@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



//exercice 1 a le travaux pratique
//class Result(val success: Boolean)
//
//class University(val name: String, val foundationYear: Int) {
//    val professors = mutableListOf<Professor>()
//    val students = mutableListOf<Etudient>()
//
//    fun recruitProfessor(professor: Professor) {
//        professors.add(professor)
//    }
//
//    fun enroll(etudient: Etudient) {
//        students.add(etudient)
//    }
//}
//
//private fun <E> MutableList<E>.add(element: Etudient) {
//
//}
//
//class Professor(val name: String, val age: Int, val annualSalary: Int) {
//    val coursesTaught = mutableListOf<Course>()
//
//    fun teach(course: Course) {
//        coursesTaught.add(course)
//        println("$name is teaching ${course.title}")
//    }
//
//    fun doOralExam(etudient: Etudient, course: Course): Result {
//
//        val success = true
//        return Result(success)
//    }
//}
//
//class Etudient(val name: String, val age: Int, val studentId: Int) {
//    val coursesEnrolled = mutableListOf<Course>()
//    var successProbability = 0.5
//    fun enroll(course: Course) {
//        coursesEnrolled.add(course)
//    }
//    fun takeExam(course: Course, professor: Professor) {
//        val result = professor.doOralExam( this, course)
//        grade(course, result)
//    }
//
//    fun learn() {
//        successProbability += 0.02
//    }
//
//    fun party() {
//        successProbability -= 0.02
//    }
//
//    fun grade(course: Course, result: Result) {
//        if (result.success) {
//            println("$name passed the exam for ${course.title}")
//        } else {
//            println("$name failed the exam for ${course.title}")
//        }
//    }
//}
//
//class Course(val title: String)
//
//fun main() {
//    val university = University("My University", 1990)
//    val professor = Professor("Professor Smith", 40, 60000)
//    val student = Etudient("John Doe", 20, 12345)
//    val course = Course("Mathematics 101")
//
//    university.recruitProfessor(professor)
//    university.enroll(student)
//    student.enroll(course)
//
//    professor.teach(course)
//    student.takeExam(course, professor)
//}

//l'exercice 2 a le taravaux pratique

















//exercice3 de travaux pratique
//data class persson(val name: String,val age: Int)
//class Person(name: String, age: Int) {
//    private val name: String
//    private val age: Int
//
//    init {
//        this.name = name
//        this.age = age
//    }
//
//    fun getName(): String {
//        return name
//    }
//
//    fun getAge(): Int {
//        return age
//    }
//}

//exercice1 ajouter des fonctions personnalisées
fun main(){
    val nom:String="ootmanee"
    fun String.extention() {
        nom.substring(1, nom.length - 1)
        println(nom)
    }
}











