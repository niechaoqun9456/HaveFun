plugins {
    id("library-conventions")
}

android {
    namespace = "com.yueying.network"
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.appcompat)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidxJunit)
    androidTestImplementation(libs.espressoCore)
}