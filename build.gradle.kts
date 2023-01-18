import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

plugins {
    id("org.jetbrains.kotlin.multiplatform").version("1.8.0")
}

repositories {
    mavenCentral()
}

kotlin {
    iosArm64 {
        binaries {
            framework {
            }
        }
    }
}

/**
 * Uncomment to fix the issue
 */
//val myAttribute = Attribute.of("com.apollographql.test", String::class.java)
//
//configurations.named("releaseFrameworkIosFat").configure {
//    attributes {
//        attribute(myAttribute, "release-all")
//    }
//}
//
//configurations.named("debugFrameworkIosFat").configure {
//    attributes {
//        attribute(myAttribute, "debug-all")
//    }
//}