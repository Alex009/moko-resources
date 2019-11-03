/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

object Versions {
    object Android {
        const val compileSdk = 28
        const val targetSdk = 28
        const val minSdk = 21
    }

    const val kotlin = "1.3.60-eap-76"

    private const val mokoResources = "0.4.0-1.3.60-eap-76"

    object Plugins {
        const val android = "3.5.0"

        const val kotlin = Versions.kotlin
        const val mokoResources = Versions.mokoResources
    }

    object Libs {
        object Android {
            const val appCompat = "1.0.2"
        }

        object MultiPlatform {
            const val mokoResources = Versions.mokoResources
        }

        object Jvm {
            const val kotlinPoet = "1.3.0"
        }
    }
}