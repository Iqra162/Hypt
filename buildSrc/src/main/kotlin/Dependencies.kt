object Deps{
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val appCompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val androidMaterial = "com.google.android.material:material:${Version.androidMaterial}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Version.recyclerview}"
    const val cardView = "androidx.cardview:cardview:${Version.cardview}"
    const val viewpager2 = "androidx.viewpager2:viewpager2:${Version.viewpager2}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlinStdLib}"

    // testing
    const val testRunner = "androidx.test:runner:${Version.testRunner}"
}

object TestImplementation {
    const val junit = "junit:junit:${Version.testImplJunit}"
    const val kotlinxCoroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.kotlinxCoroutine}"
    const val turbine = "app.cash.turbine:turbine:${Version.turbine}"
    const val mockito = "org.mockito:mockito-core:${Version.mockito}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Version.mockitoKotlin}"
    const val mockitoInline = "org.mockito:mockito-inline:${Version.mockitoInline}"
}

object AndroidTestImplementation {
    const val junit = "androidx.test.ext:junit:${Version.androidTestImplJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.androidTestEspresso}"
}

object Navigation {

    //Android Navigation Architecture
    const val navFragment = "androidx.navigation:navigation-fragment-ktx:${Version.navFragment}"
    const val navUi = "androidx.navigation:navigation-ui-ktx:${Version.navUi}"
}

object  LifeCycle {
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Version.lifecycleExtensions}"
    const val lifecycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycleViewmodel}"
    const val lifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycleLivedata}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Version.gsonConvertor}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.loggingInterceptor}"
    const val gson = "com.squareup.retrofit2:converter-scalars:${Version.gsonConvertor}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    const val scalersConvertors = "com.squareup.retrofit2:converter-scalars:${Version.scalerConvertor}"
}

object Coroutines {
    // Kotlin Corotines for asyc tasks.
    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.kotlinCoroutines}"
    const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.kotlinCoroutines}"
}

object Kodein {
    //Kodein Dependency Injection native kotlin
    const val kodinGeneric = "org.kodein.di:kodein-di-generic-jvm:${Version.kodin}"
    const val kodinAndroid = "org.kodein.di:kodein-di-framework-android-x:${Version.kodin}"
}

object Room {
    const val roomCompiler = "androidx.room:room-compiler:${Version.roomVersion}"
    const val room = "androidx.room:room-ktx:${Version.roomVersion}"
}

object DaggerHilt {
    // Dagger Hilt Dependency Injection
    const val hilt = "com.google.dagger:hilt-android:${Version.dagger}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Version.hiltCompiler}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Version.dagger}"
    const val hiltComposeNavigation = "androidx.hilt:hilt-navigation-compose:${Version.hiltComposeNavigation}"
    const val kotlinxMetadata = "org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0"
    //    kapt("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0")
}

object DaggerHiltTestingTestImpl {
    // For Robolectric tests.
    const val daggerHiltTestImplRobolectric = "com.google.dagger:hilt-android-testing:${Version.daggerHiltTestImpl}"
    const val daggerHiltKaptTestRobolectric = "com.google.dagger:hilt-android-compiler:${Version.daggerHiltTestImpl}"

    // For instrumented tests.
    const val daggerHiltAndroidTestImpl = "com.google.dagger:hilt-android-testing:${Version.daggerHiltAndroidTestImpl}"
    const val daggerHiltAndroidTestKapt = "com.google.dagger:hilt-android-compiler:${Version.daggerHiltAndroidTestImpl}"
}

object FireBase {
    const val fireBaseCore = "com.google.firebase:firebase-core:${Version.firebaseCore}"
    const val fireBaseBom = "com.google.firebase:firebase-bom:${Version.firebaseBom}"
    const val fireBaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
}

object FaceBook {
    //FaceBook
    const val facebookSdk = "com.facebook.android:facebook-android-sdk:latest.release"
}

object GsmPlayServices {
    //Auto sms read
    const val gsmPlayServicesAuth = "com.google.android.gms:play-services-auth:${Version.gsmPlayServicesAuth}"
    const val gsmPlayServicesAuthApiPhone = "com.google.android.gms:play-services-auth-api-phone:${Version.gsmPlayServicesAuthApiPhone}"
    const val gsmPlayServicesMap = "com.google.android.gms:play-services-maps:${Version.gsmPlayServicesMap}"
    const val gsmPlayServicesLocation = "com.google.android.gms:play-services-location:${Version.gsmPlayServicesLocation}"
}
object Notifications {
    const val oneSignal = "com.onesignal:OneSignal:${Version.oneSignal}"
}
object RuntimePermission {
    const val dexter = "com.karumi:dexter:${Version.dexter}"
}
object RootDetection {
    const val rootBeer = "com.scottyab:rootbeer-lib:${Version.rootBeer}"
}
object BiometricLogin {
    // Android Device Login Authentication
    const val biometric = "androidx.biometric:biometric:${Version.biometricLogin}"
}

object BarCodeQrCodeScan {
    // Barcode and QR scanning for CNIC
    const val codeScanner = "com.budiyev.android:code-scanner:${Version.barCodeQrCodeScan}"
}

object PDF {
    //pdf generate
    const val xmlToPdf = "com.github.Gkemon:XML-to-PDF-generator:${Version.xmlToPdf}"
}
object DatePicker {
    // Date Picker
    const val ozcanAlasalvar = "com.github.OzcanAlasalvar:DatePicker:${Version.datePickerOzcanAlasalvar}"
    const val smoothDateRangePicker = "com.leavjenn.smoothdaterangepicker:library:${Version.datePickerSmoothDateRangePicker}"
}
object PhoneNumberValidation {
    // Phone Number Validation
    const val libphonenumber = "io.michaelrocks:libphonenumber-android:${Version.numberValidationLibphonenumber}"
}
object Bvs {
    // BVS face-off sdk nadara thumb or fingers hash
    const val faceOff = "com.unikrew.faceoff:fingerprint-demo:${Version.bvsFaceOff}"
}
object Glide {
    const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Version.glide}"
}
object OtpInput {
    const val pinview = "com.chaos.view:pinview:${Version.otpInputPinView}"
}
object LoadingProgress {
    const val avi = "com.wang.avi:library:${Version.loadingProgerssAVI}"
}
object ImageHandler {
    const val circleImageView = "de.hdodenhof:circleimageview:${Version.imageHandlerCircleImageView}"
    const val imageCropper = "com.theartofdev.edmodo:android-image-cropper:${Version.imageHandlerImageCropper}"
    const val autoImageSlider = "com.github.smarteist:autoimageslider:${Version.imageHandlerAutoImageSlider}"
}
object Localize {
    const val localeHelper = "com.zeugmasolutions.localehelper:locale-helper-android:${Version.LocalizeLocalHalper}"
}
object MultiDex {
    const val multidex = "com.android.support:multidex:${Version.multidex}"
}
object Flexbox {
    const val flexbox = "com.google.android.flexbox:flexbox:${Version.flexbox}"
}

object Spinner {
    const val searchablespinner = "com.toptoche.searchablespinner:searchablespinnerlibrary:${Version.searchablespinner}"
}



object TruId {
    const val trueIdSdk = "com.github.truid-ai.TruId-Android:sdk:${Version.trueIdSdk}"
    const val trueIdNetworking = "com.amitshekhar.android:android-networking:${Version.trueIdNetworking}"
}

object CountryPicker {
    const val libPhoneNumber = "io.michaelrocks:libphonenumber-android:${Version.libPhoneNumber}"
    const val countryCodePicker = "com.github.joielechong:countrycodepicker:${Version.countryCodePicker}"
}


