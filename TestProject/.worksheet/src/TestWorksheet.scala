object TestWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  val lista = List(1,2,3,4,5,3.1);System.out.println("""lista  : List[Double] = """ + $show(lista ));$skip(29); 
  val set = Set(1,2,3,4,5,1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(43); 
  val mapa = Map(1 -> "Luis", 2 -> "Juan");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(22); val res$0 = 
   
  lista.map{ _+3};System.out.println("""res0: List[Double] = """ + $show(res$0));$skip(8); val res$1 = 
  lista;System.out.println("""res1: List[Double] = """ + $show(res$1));$skip(28); val res$2 = 
  
  lista.filter{x => x<3};System.out.println("""res2: List[Double] = """ + $show(res$2));$skip(48); 
  
  val names = List("Juan","Carlos","Andres");System.out.println("""names  : List[String] = """ + $show(names ));$skip(24); val res$3 = 
  names.map{_.length()};System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(69); 
  
  //Kata 1 --- Encontrar los pares
  val pares = List.range(1,20);System.out.println("""pares  : List[Int] = """ + $show(pares ));$skip(24); val res$4 = 
  pares.filter{_%2 ==0};System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(170); 
  
  //Kata 2 --- Encontrar los datos de una persona
  val megaLista= List(List("Andres","24 years","male"), List("Juan","20 years","male"), List("Sofia","29","female"));System.out.println("""megaLista  : List[List[String]] = """ + $show(megaLista ));$skip(56); val res$5 = 
  
  megaLista.filter{persona => persona(0) == "Sofia"};System.out.println("""res5: List[List[String]] = """ + $show(res$5));$skip(86); 
  
  //Kata 3 --- Encontrar numeros primos de una lista
  val list = List.range(1,20);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(220); val res$6 = 
  list.filter{numero =>
  val raiz = Math.sqrt(numero)
  println(raiz)
  val lista2 = list.filter{numero2 => numero2 <= raiz && numero2!=1}
  println(lista2)
  lista2.filter{numero3 => numero%numero3 ==0}.isEmpty
  
  };System.out.println("""res6: List[Int] = """ + $show(res$6))}
 }
