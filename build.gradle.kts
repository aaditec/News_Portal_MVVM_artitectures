
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Deps.gradle_plugin)
        classpath(Deps.Kotlin.gradle_plugin)
        classpath(Deps.Navigation.safeArgs_gradle)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean").configure {
    delete("build")
}