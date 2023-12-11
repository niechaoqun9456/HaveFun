import org.gradle.api.JavaVersion

object AppConfig {
    const val COMPILE_SDK = 34
    const val MIN_SDK = 24
    const val TARGET_SDK = 34
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    val sourceCompatibility = JavaVersion.VERSION_17
    val targetCompatibility = JavaVersion.VERSION_17
    const val JVM_TARGET = "17"
    const val KOTLIN_COMPILER_EXTENSION_VERSION = "1.4.3"
}