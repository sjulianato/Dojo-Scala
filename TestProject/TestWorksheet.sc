object TestWorksheet {
  val lista = List(1,2,3,4,5,3.1)                 //> lista  : List[Double] = List(1.0, 2.0, 3.0, 4.0, 5.0, 3.1)
  val set = Set(1,2,3,4,5,1)                      //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  val mapa = Map(1 -> "Luis", 2 -> "Juan")        //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Luis, 2 -> Jua
                                                  //| n)
   
  lista.map{ _+3}                                 //> res0: List[Double] = List(4.0, 5.0, 6.0, 7.0, 8.0, 6.1)
  lista                                           //> res1: List[Double] = List(1.0, 2.0, 3.0, 4.0, 5.0, 3.1)
  
  lista.filter{x => x<3}                          //> res2: List[Double] = List(1.0, 2.0)
  
  val names = List("Juan","Carlos","Andres")      //> names  : List[String] = List(Juan, Carlos, Andres)
  names.map{_.length()}                           //> res3: List[Int] = List(4, 6, 6)
  
  //Kata 1 --- Encontrar los pares
  val pares = List.range(1,20)                    //> pares  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                                                  //|  16, 17, 18, 19)
  pares.filter{_%2 ==0}                           //> res4: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
  
  //Kata 2 --- Encontrar los datos de una persona
  val megaLista= List(List("Andres","24 years","male"), List("Juan","20 years","male"), List("Sofia","29","female"))
                                                  //> megaLista  : List[List[String]] = List(List(Andres, 24 years, male), List(Ju
                                                  //| an, 20 years, male), List(Sofia, 29, female))
  
  megaLista.filter{persona => persona(0) == "Sofia"}
                                                  //> res5: List[List[String]] = List(List(Sofia, 29, female))
  
  //Kata 3 --- Encontrar numeros primos de una lista
  val list = List.range(1,20)                     //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 
                                                  //| 16, 17, 18, 19)
  list.filter{numero =>
  val raiz = Math.sqrt(numero)
  println(raiz)
  val lista2 = list.filter{numero2 => numero2 <= raiz && numero2!=1}
  println(lista2)
  lista2.filter{numero3 => numero%numero3 ==0}.isEmpty
  
  }                                               //> 1.0
                                                  //| List()
                                                  //| 1.4142135623730951
                                                  //| List()
                                                  //| 1.7320508075688772
                                                  //| List()
                                                  //| 2.0
                                                  //| List(2)
                                                  //| 2.23606797749979
                                                  //| List(2)
                                                  //| 2.449489742783178
                                                  //| List(2)
                                                  //| 2.6457513110645907
                                                  //| List(2)
                                                  //| 2.8284271247461903
                                                  //| List(2)
                                                  //| 3.0
                                                  //| List(2, 3)
                                                  //| 3.1622776601683795
                                                  //| List(2, 3)
                                                  //| 3.3166247903554
                                                  //| List(2, 3)
                                                  //| 3.4641016151377544
                                                  //| List(2, 3)
                                                  //| 3.605551275463989
                                                  //| List(2, 3)
                                                  //| 3.7416573867739413
                                                  //| List(2, 3)
                                                  //| 3.872983346207417
                                                  //| List(2, 3)
                                                  //| 4.0
                                                  //| List(2, 3, 4)
                                                  //| 4.123105625617661
                                                  //| List(2, 3, 4)
                                                  //| 4.242640687119285
                                                  //| List(2, 3, 4)
                                                  //| 4.358898943540674
                                                  //| List(2, 3, 4)
                                                  //| res6: List[Int] = List(1, 2, 3, 5, 7, 11, 13, 17, 19)
 }