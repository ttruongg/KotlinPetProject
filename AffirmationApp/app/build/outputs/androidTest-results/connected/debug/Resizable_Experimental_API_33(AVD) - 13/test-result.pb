
Ν.
\
AffirmationsListTestscom.example.affirmationscroll_to_item2ώΨ§ΐέχ»:‡™Ψ§ΐΥ™ύ„(
ρandroidx.test.espresso.PerformException: Error performing 'scroll RecyclerView to: holder with view: an instance of android.widget.TextView and view.getText() equals string from resource id: <2131689500>' on view 'Animations or transitions are enabled on the target device.
For more info check: https://developer.android.com/training/testing/espresso/setup#set-up-environment

view.getId() is <2131231063/com.example.affirmation:id/recycler_view>'.
at androidx.test.espresso.PerformException$Builder.build(PerformException.java:1)
at androidx.test.espresso.base.PerformExceptionHandler.handleSafely(PerformExceptionHandler.java:8)
at androidx.test.espresso.base.PerformExceptionHandler.handleSafely(PerformExceptionHandler.java:9)
at androidx.test.espresso.base.DefaultFailureHandler$TypedFailureHandler.handle(DefaultFailureHandler.java:4)
at androidx.test.espresso.base.DefaultFailureHandler.handle(DefaultFailureHandler.java:5)
at androidx.test.espresso.ViewInteraction.waitForAndHandleInteractionResults(ViewInteraction.java:8)
at androidx.test.espresso.ViewInteraction.desugaredPerform(ViewInteraction.java:11)
at androidx.test.espresso.ViewInteraction.perform(ViewInteraction.java:8)
at com.example.affirmation.AffirmationsListTests.scroll_to_item(AffirmationsListTests.kt:25)
... 33 trimmed
Caused by: java.lang.RuntimeException: Found 0 items matching holder with view: an instance of android.widget.TextView and view.getText() equals string from resource id: <2131689500>, but position -1 was requested.
at androidx.test.espresso.contrib.RecyclerViewActions$ScrollToViewAction.perform(RecyclerViewActions.java:361)
at androidx.test.espresso.ViewInteraction$SingleExecutionViewAction.perform(ViewInteraction.java:2)
at androidx.test.espresso.ViewInteraction.doPerform(ViewInteraction.java:25)
at androidx.test.espresso.ViewInteraction.-$$Nest$mdoPerform(Unknown Source:0)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:7)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:1)
at java.util.concurrent.FutureTask.run(FutureTask.java:264)
at android.os.Handler.handleCallback(Handler.java:942)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loopOnce(Looper.java:201)
at android.os.Looper.loop(Looper.java:288)
at android.app.ActivityThread.main(ActivityThread.java:7872)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:936)java.lang.RuntimeExceptionρandroidx.test.espresso.PerformException: Error performing 'scroll RecyclerView to: holder with view: an instance of android.widget.TextView and view.getText() equals string from resource id: <2131689500>' on view 'Animations or transitions are enabled on the target device.
For more info check: https://developer.android.com/training/testing/espresso/setup#set-up-environment

view.getId() is <2131231063/com.example.affirmation:id/recycler_view>'.
at androidx.test.espresso.PerformException$Builder.build(PerformException.java:1)
at androidx.test.espresso.base.PerformExceptionHandler.handleSafely(PerformExceptionHandler.java:8)
at androidx.test.espresso.base.PerformExceptionHandler.handleSafely(PerformExceptionHandler.java:9)
at androidx.test.espresso.base.DefaultFailureHandler$TypedFailureHandler.handle(DefaultFailureHandler.java:4)
at androidx.test.espresso.base.DefaultFailureHandler.handle(DefaultFailureHandler.java:5)
at androidx.test.espresso.ViewInteraction.waitForAndHandleInteractionResults(ViewInteraction.java:8)
at androidx.test.espresso.ViewInteraction.desugaredPerform(ViewInteraction.java:11)
at androidx.test.espresso.ViewInteraction.perform(ViewInteraction.java:8)
at com.example.affirmation.AffirmationsListTests.scroll_to_item(AffirmationsListTests.kt:25)
... 33 trimmed
Caused by: java.lang.RuntimeException: Found 0 items matching holder with view: an instance of android.widget.TextView and view.getText() equals string from resource id: <2131689500>, but position -1 was requested.
at androidx.test.espresso.contrib.RecyclerViewActions$ScrollToViewAction.perform(RecyclerViewActions.java:361)
at androidx.test.espresso.ViewInteraction$SingleExecutionViewAction.perform(ViewInteraction.java:2)
at androidx.test.espresso.ViewInteraction.doPerform(ViewInteraction.java:25)
at androidx.test.espresso.ViewInteraction.-$$Nest$mdoPerform(Unknown Source:0)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:7)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:1)
at java.util.concurrent.FutureTask.run(FutureTask.java:264)
at android.os.Handler.handleCallback(Handler.java:942)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loopOnce(Looper.java:201)
at android.os.Looper.loop(Looper.java:288)
at android.app.ActivityThread.main(ActivityThread.java:7872)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:936)"έ

logcatandroidΗ
ΔD:\KotlinMobile\AffirmationApp\app\build\outputs\androidTest-results\connected\debug\Resizable_Experimental_API_33(AVD) - 13\logcat-com.example.affirmation.AffirmationsListTests-scroll_to_item.txt"©

device-infoandroid
‹D:\KotlinMobile\AffirmationApp\app\build\outputs\androidTest-results\connected\debug\Resizable_Experimental_API_33(AVD) - 13\device-info.pb"ª

device-info.meminfoandroid‡
„D:\KotlinMobile\AffirmationApp\app\build\outputs\androidTest-results\connected\debug\Resizable_Experimental_API_33(AVD) - 13\meminfo"ª

device-info.cpuinfoandroid‡
„D:\KotlinMobile\AffirmationApp\app\build\outputs\androidTest-results\connected\debug\Resizable_Experimental_API_33(AVD) - 13\cpuinfo*
c
test-results.logOcom.google.testing.platform.runtime.android.driver.AndroidInstrumentationDriver
•D:\KotlinMobile\AffirmationApp\app\build\outputs\androidTest-results\connected\debug\Resizable_Experimental_API_33(AVD) - 13\testlog\test-results.log 2
text/plain