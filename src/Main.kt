//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    log(3)

    5.exttopla(3)


    "Eylem".extbirlestir("Bilecik")


    "Eylem".extyazdir()

//normal fonksiyon
}
fun log(int:Int){
    println(int)
}


//extension fonksiyon

fun String.extbirlestir(other: String): String {
    val result = this + other
    println(result)
    return result
}
//extension fonksiyon

fun String.extyazdir(){
    return println(this)
}
//extension function
fun Int.exttopla(other: Int):Int{
    val sonuc = this + other
    println(sonuc)
    return sonuc
}



// Extension: Genişletmek,eklenti anlamına gelir.
// Readonly olan classlara örneğin: String,Int,Double gibi eklemeler yapmamızı sağlayan fonksiyonlardır.
//Reciver diye bir sınıfa ihtiyaç duyarlar. Bu Extension function yazacağımız sınıfı ifade eder. Yani String
// Int,Double,Number,Char  gibi sınıflar alıcı Reciever olurlar. Yani biz bir sınıfı reciver olarak alıp onu
// extension function ile genişletmiş, eklenti eklemiş oluruz.
//ext = extension
