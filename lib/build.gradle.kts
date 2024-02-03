
plugins {
    `java-library` // <1>
}

repositories {
    mavenCentral() // <2>
}

dependencies {
    testImplementation(libs.junit.jupiter) // <3>

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    api(libs.commons.math3) // <4>

    implementation(libs.guava) // <5>
}

tasks.named<Test>("test") {
    useJUnitPlatform() // <6>
}
