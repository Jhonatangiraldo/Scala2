

package documentacion

object funcionParametro {
  /*Recibe funcion como parametro. 
    * 1. Se utilizara con nombre "callback"
    * 2. () => Unit .....-> Significa tipo void(sin retorno), y sin parámetros de envio
    */
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  
  def timeFlies() {
    println("time flies like an arrow...")
  }
  
  def main(args: Array[String]) {
    /* Llama la funcion "oncePerSecond" y envia como parámetro
     * la funcion "timeFlies" (que se encuentra en la linea 12)
     */
    oncePerSecond(timeFlies)
  }
}