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
include(":hyptModules:main:ui")
include(":hyptModules:home:ui")
include(":hyptModules:profile:ui")
include(":hyptModules:navigation")
include(":hyptModules:teams:ui")
