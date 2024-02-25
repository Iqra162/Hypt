pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Hypt-Android"
include(":app-hypt")
include(":hyptModules:auth:ui")
include(":hyptModules:navigation")
include(":hyptModules:main:ui")
