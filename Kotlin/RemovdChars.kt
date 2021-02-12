import java.io.File.separator

fun removeChar(str: String): String {
    return str.drop(1).dropLast(1)
}
