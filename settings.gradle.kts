pluginManagement {
    includeBuild("../build-logic")
}

plugins {
    id("multimodule")
}

fun includeSubs(base: String, path: String = base, vararg subs: String) {
    subs.forEach {
        include(":$base-$it")
        project(":$base-$it").projectDir = File("$path/$it")
    }
}

listOf(
    "kash-api", "geo-api", "krono", "neat", "koncurrent", 
    "kollections", "kommander", "epsilon-api", "hormone",
).forEach {
    includeBuild("../$it")
}

rootProject.name = "identifier-api"

includeSubs("identifier", ".", "core", "comm", "fields")
includeSubs("identifier-legal", "legal", "dtos", "presenters")
includeSubs("identifier-legal-sdk-client", "legal/sdk", "core")
