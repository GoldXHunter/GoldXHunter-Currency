GoldXHunter Currency Calculator — Android project
Version: 2.0
Application ID: com.goldxhunter.currencycalculator
Minimum Android: 6.0 (API 23)

BUILD AN APK
1. Install Android Studio on a Windows, macOS, or Linux computer.
2. Open Android Studio and choose "Open".
3. Select this folder: GoldXHunterCurrencyAndroid
4. Allow Gradle sync to finish. Android Studio may download the Android SDK
   platform/build tools and Gradle plugin on first setup.
5. Choose Build > Build Bundle(s) / APK(s) > Build APK(s).
6. When the build completes, choose "locate" in the notification.
   The APK is normally at app/build/outputs/apk/debug/app-debug.apk.
7. Transfer app-debug.apk to your Android phone and install it.
   If prompted, allow installation from that file manager.

NOTES
- This is a native Android APK project with a local WebView app interface.
- USC is a fixed unit conversion: 100 USC = 1 USD (1 USC = $0.01).
- Live rates require internet access. Saved/manual rates and calculation
  history are stored locally on the device.
- Rates are indicative reference rates, not guaranteed transaction prices.
- For public distribution, create a signed release APK and protect the signing key.

OPTION: BUILD THE APK IN GITHUB ACTIONS (NO ANDROID STUDIO INSTALL)
1. Create a private repository on GitHub.
2. Upload the contents of this project ZIP into the repository (keep the
   .github/workflows/build-apk.yml file and its folders).
3. Open the repository's Actions tab. The workflow starts on push to main.
   You can also select "Build GoldXHunter Android APK" and choose
   "Run workflow".
4. Open the completed workflow run and download the artifact named
   GoldXHunter-Currency-debug-apk.
5. Extract the artifact ZIP; it contains app-debug.apk.
6. Transfer the APK to your Android phone and install it.

The GitHub-hosted runner performs the Android build. This project ZIP is
not itself an APK. The debug APK is suitable for personal testing; a
signed release build is recommended for distribution.
