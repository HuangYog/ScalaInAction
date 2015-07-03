import scala.collection.mutable

val map = Map("book" -> 10, "gun" -> 18, "ipad" -> 100);
for((k,v) <- map) yield (k, v * 0.9);

val scores = mutable.Map("Scala" -> 20, "Hadoop" -> 16, "Spark" -> 30);// 可变Map
val hadoopScores = scores.getOrElse("Hadoop",0);
scores += ("R" -> 19);
scores -=("Hadoop");

val tuple = (1,2,3.14,"Rocky","Spark");
val third = tuple._3;
val (first, second,thirda,fourth,fifth) = tuple;
val (f,s,_,_,_) = tuple;

"Rocky Spark".partition(_.isUpper);

val symbols = Array("[", "-", "]");
val counts = Array(1,2,5,2);
val pairs = symbols.zip(counts);
for((x,y) <- pairs) print(x * y);