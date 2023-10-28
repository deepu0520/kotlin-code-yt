class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val originalString = "Hello Kotlin"
            val reverseString = reverseString(originalString)
            println("origional String: $originalString")
            println("reverse String: $reverseString")
        }
        // reverse string

        fun reverseString(input: String):String{
            var reverse = ""
            for(i in input.length -1 downTo 0)
            // for(int i = input.length-1;i>=o;i--) in java
                reverse += reverse[i]
            return reverse
        }
    }





}