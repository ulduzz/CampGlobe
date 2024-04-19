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

rootProject.name = "CampGlobe"
include(":app")
include(":entities")
include(":domain")
include(":data")
include(":network")
include(":common")
include(":features")
include(":features:login")
include(":features:mainScreen")
include(":features:splashScreen")
include(":features:onBoardingScreen")
