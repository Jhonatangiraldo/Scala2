package documentacion



object Constructores {
  
  class Complex(real: Double, imaginary: Double) {
      def re() = real
      def im() = imaginary
  }
  
  def main(args: Array[String]) {
    val complex = new Complex(1.2, 3.4)
    println("imaginary part: " + complex.im())
    println("re part: " + complex.re())
  }
}