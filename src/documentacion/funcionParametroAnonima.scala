

package documentacion

object funcionParametroAnonima {
  //Rrecibe funcion como parámetro. Se le llamara "callback"
   def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  
  def main(args: Array[String]) {
    /* Envia como parámetro una funcion
     * Esta funcion es creada en el momento
     * A esta funcion creada en el momento se le llama "anónima"
     */
    oncePerSecond(
        () => println("time flies like an arrow...")
     )
  }
}