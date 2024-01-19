fun main(){
    val array:CharArray="CABBAGE".toCharArray()
    val array1:CharArray="AEIOULNRST".toCharArray()
    val array2:CharArray="DG".toCharArray()
    val array3:CharArray="BCMP".toCharArray()
    val array4:CharArray="FHVWY".toCharArray()
    val array5:CharArray="K".toCharArray()
    val array6:CharArray="JX".toCharArray()
    val array7:CharArray="QZ".toCharArray()
    val sizeOfInputArray=array.size

    var count = 0
  for (i in 0..sizeOfInputArray){

      try {



         if (array[i] in array1){
             count += 1
         }else if (array[i] in array2){
             count+=2
         }else if (array[i]in array3){
             count+=3
         }else if (array[i]in array4){
             count+=4
         }else if (array[i]in array5){
             count+=5
         }else if (array[i]in array6){
             count+=8
         }else if (array[i]in array7){
             count+=10
         }




      }catch (_:Exception){

      }

  }
    println(count)

}