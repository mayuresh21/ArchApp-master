object ApplicationId {
    val id = "io.philippeboisney.archapp"
}

object Modules {
    val app = ":app"

    val navigation = ":navigation"

    val common = ":common"
    val commonTest = ":common_test"

    val local = ":data:local"
    val remote = ":data:remote"
    val model = ":data:model"
    val repository = ":data:repository"

    val featureHome = ":features:home"
    val featureDetail = ":features:detail"
}

object Releases {
    val versionCode = 1
    val versionName = "1.0"
}

object Versions {
    val multidex = "1.0.3"
    val kotlin = "1.3.41"
    val gradle = "4.2.1"
    val compileSdk = 30
    val minSdk = 21
    val targetSdk = 30
    val appDesign = "28.0.0"
    val appCompat = "1.2.0"
    val appLegacySupport = "1.0.0"
    val coreKtx = "1.3.2"
    val constraintLayout = "2.0.4"
    val junit = "4.12"
    val androidTestRunner = "1.1.2-alpha02"
    val espressoCore = "3.2.0-alpha02"
    val retrofit = "2.9.0"
    val retrofitCoroutines = "0.9.2"
    val retrofitGson = "2.4.0"
    val gson = "2.8.6"
    val okHttp = "3.12.1"
    val coroutines = "1.1.1"
    val koin = "1.0.2"
    val timber = "4.7.1"
    val lifecycle = "2.1.0-alpha04"
    val nav = "2.3.5"
    val googleMaterialDesign = "1.3.0"

    //    val room = "2.1.0-alpha06"
    val room = "2.2.4"
    val sqlcipher = "4.5.0"
    val recyclerview = "1.0.0"
    val safeArgs = "2.3.5"
    val glide = "4.9.0"
    val mockwebserver = "2.7.5"
    val archCoreTest = "2.0.0"
    val androidJunit = "1.1.0"
    val mockk = "1.9.2"
    val fragmentTest = "1.1.0-alpha06"
    val databinding = "3.3.2"
    val facebooksdk = "5.13.0"
    val firebase = "18.0.1"
    val firebaseMessaging = "21.0.1"
    val firebaseAuth = "20.0.2"
    val firebaseCrashlytics = "2.10.1"
    val firebaseAnalytics = "18.0.1"
    val facebookShimmer = "0.3.0"
    val picasso = "2.71828"
    val dexter = "6.2.2"
    val datePicker = "4.2.3"
    val jSoup = "1.12.1"
    val gmsAuth = "19.0.0"
    val gmsFitness = "20.0.0"
    val fabricCrashlytics = "2.9.5"
    val sdp = "1.0.6"
    val otpView = "1.0.6"
    val mpaChart = "v3.0.3"
    val evernote = "1.2.5"
    val circalProgressView = "v1.3"
    val stepBarView = "1.1.0"
    val colorSeekBar = "1.0.2"
    val materialDesignLib = "1.6"
    val datetimepicker = "3.6.4"
    val pdfViewer = "2.0.3"
    val circleImageview = "2.2.0"
    val ucrop = "2.2.6"
    val imageCropper = "2.8.0"
    val photoView = "2.3.0"
    val filePicker = "2.2.5"
    val documentFile = "1.0.1"
    val indicatorseekbar = "2.1.2"
}

object Libraries {
    // KOIN
    val koin = "org.koin:koin-android:${Versions.koin}"
    val koinViewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"
    // ROOM
    val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    val roomRunTime = "androidx.room:room-runtime:${Versions.room}"
    val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    // RETROFIT
    val retrofitCoroutineAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"
    val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    // GLIDE
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
}

object KotlinLibraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val kotlinCoroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
}

object AndroidLibraries {
    // KOTLIN
    val kotlinCoroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    // ANDROID
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
}

object TestLibraries {
    // ANDROID TEST
    val androidTestRunner = "androidx.test:runner:${Versions.androidTestRunner}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espressoCore}"
    val archCoreTest = "androidx.arch.core:core-testing:${Versions.archCoreTest}"
    val junit = "androidx.test.ext:junit:${Versions.androidJunit}"
    val fragmentNav = "androidx.fragment:fragment-testing:${Versions.fragmentTest}"
    // KOIN
    val koin = "org.koin:koin-test:${Versions.koin}"
    // MOCK WEBSERVER
    val mockWebServer = "com.squareup.okhttp:mockwebserver:${Versions.mockwebserver}"
    // MOCK
    val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
    val mockk = "io.mockk:mockk:${Versions.mockk}"
    // COROUTINE
    val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    // DATA BINDING
    val databinding = "androidx.databinding:databinding-compiler:${Versions.databinding}"
}