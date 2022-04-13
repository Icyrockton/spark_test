import org.apache.spark.ml.recommendation.ALS
import org.jetbrains.kotlinx.spark.api.c
import org.jetbrains.kotlinx.spark.api.map
import org.jetbrains.kotlinx.spark.api.withSpark

fun main() {
    withSpark {
        dsOf(c(1,0,0.4f),c(2,2,0.5f)).map {
            ALS.Rating(it._1,it._2,it._3)
        }.show()
    }
}


