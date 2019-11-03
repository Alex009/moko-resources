plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    google()

    maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven { url = uri("https://dl.bintray.com/icerockdev/plugins") }
}

dependencies {
    implementation("dev.icerock:mobile-multiplatform:0.3.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.60-eap-76")
    implementation("com.android.tools.build:gradle:3.5.0")
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
