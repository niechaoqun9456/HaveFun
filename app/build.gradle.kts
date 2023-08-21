plugins {
    id("compose-application-conventions")
}

android {
    namespace = "com.yueying.havefun"
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.activityCompose)
    implementation(platform(libs.composeBom))
    implementation(libs.composeMaterial3)
    implementation(libs.composeUIToolingPreview)
    debugImplementation(libs.composeUITooling)
    debugImplementation(libs.composeUITestManifest)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidxJunit)
    androidTestImplementation(libs.espressoCore)
}