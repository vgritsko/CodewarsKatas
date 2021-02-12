import java.math.BigInteger
import java.security.MessageDigest
import kotlin.text.Charsets.UTF_8


fun crack(hash: String): String {
    return (0..99999).map { it.toString().padStart(5, '0') }.first {
        BigInteger(1, MessageDigest.getInstance("MD5").digest(it.toByteArray())).toString(16)
            .padStart(32, '0') == hash
    }
}
