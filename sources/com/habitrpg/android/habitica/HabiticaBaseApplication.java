package com.habitrpg.android.habitica;

import ad.l0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.j0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.helpers.AdHandler;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.ApplicationExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import da.k;
import io.realm.CompactOnLaunchCallback;
import io.realm.o0;
import io.realm.v0;
import java.lang.ref.WeakReference;

/* compiled from: HabiticaBaseApplication.kt */
/* loaded from: classes4.dex */
public abstract class HabiticaBaseApplication extends Hilt_HabiticaBaseApplication implements Application.ActivityLifecycleCallbacks {
    public AuthenticationHandler authenticationHandler;
    private WeakReference<BaseActivity> currentActivity;
    public ApiClient lazyApiHelper;
    private ApplicationLifecycleTracker lifecycleTracker;
    public PushNotificationManager pushNotificationManager;
    public SharedPreferences sharedPrefs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HabiticaBaseApplication.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void startActivity(Class<?> cls, Context context) {
            Intent intent = new Intent(context, cls);
            intent.addFlags(335577088);
            context.startActivity(intent);
        }

        public final HabiticaBaseApplication getInstance(Context context) {
            qc.q.i(context, "context");
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof HabiticaBaseApplication) {
                return (HabiticaBaseApplication) applicationContext;
            }
            return null;
        }

        public final void logout(Context context) {
            qc.q.i(context, "context");
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new HabiticaBaseApplication$Companion$logout$1(context, null), 1, null);
        }
    }

    private final void checkIfNewVersion() {
        PackageInfo packageInfo;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("MyApplication", "couldn't get package info!");
            packageInfo = null;
        }
        if (packageInfo != null && getSharedPrefs$Habitica_2311256681_prodRelease().getInt("last_installed_version", 0) < packageInfo.versionCode) {
            SharedPreferences.Editor edit = getSharedPrefs$Habitica_2311256681_prodRelease().edit();
            edit.putInt("last_installed_version", packageInfo.versionCode);
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteDatabase$lambda$2(o0 o0Var) {
        o0Var.q();
        o0Var.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (qc.q.d(r1.locale, r2.getLocale()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (qc.q.d(r3, r2.getLocale()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setLocale() {
        /*
            r7 = this;
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Configuration r1 = r0.getConfiguration()
            java.lang.String r2 = "getConfiguration(...)"
            qc.q.h(r1, r2)
            com.habitrpg.common.habitica.helpers.LanguageHelper r2 = new com.habitrpg.common.habitica.helpers.LanguageHelper
            android.content.SharedPreferences r3 = r7.getSharedPrefs$Habitica_2311256681_prodRelease()
            java.lang.String r4 = "language"
            java.lang.String r5 = "en"
            java.lang.String r3 = r3.getString(r4, r5)
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            r5 = 1
            r6 = 0
            if (r3 < r4) goto L43
            android.os.LocaleList r3 = androidx.appcompat.app.k.a(r1)
            boolean r3 = androidx.core.os.p.a(r3)
            if (r3 != 0) goto L51
            android.os.LocaleList r3 = androidx.appcompat.app.k.a(r1)
            java.util.Locale r3 = c2.e.a(r3, r6)
            java.util.Locale r4 = r2.getLocale()
            boolean r3 = qc.q.d(r3, r4)
            if (r3 != 0) goto L50
            goto L51
        L43:
            java.util.Locale r3 = r1.locale
            java.util.Locale r4 = r2.getLocale()
            boolean r3 = qc.q.d(r3, r4)
            if (r3 != 0) goto L50
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L5e
            java.util.Locale r2 = r2.getLocale()
            r1.setLocale(r2)
            r2 = 0
            r0.updateConfiguration(r1, r2)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.HabiticaBaseApplication.setLocale():void");
    }

    private final void setupAdHandler() {
        AdHandler.Companion.setup(getSharedPrefs$Habitica_2311256681_prodRelease());
    }

    private final void setupNotifications() {
        com.google.firebase.installations.c.p().getId().addOnCompleteListener(new OnCompleteListener() { // from class: com.habitrpg.android.habitica.t
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                HabiticaBaseApplication.setupNotifications$lambda$3(task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupNotifications$lambda$3(Task task) {
        qc.q.i(task, "task");
        if (!task.isSuccessful()) {
            Log.w("Token", "getInstanceId failed", task.getException());
        } else {
            String str = (String) task.getResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupRealm$lambda$0(long j10, long j11) {
        if (j10 > 52428800 && j11 / j10 < 0.5d) {
            return true;
        }
        return false;
    }

    private final void setupRemoteConfig() {
        com.google.firebase.remoteconfig.a m10 = com.google.firebase.remoteconfig.a.m();
        qc.q.h(m10, "getInstance(...)");
        da.k c10 = new k.b().e(3600L).c();
        qc.q.h(c10, "build(...)");
        m10.x(c10);
        m10.z(R.xml.remote_config_defaults);
        m10.i();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean deleteDatabase(String str) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        o0.Z0().V0(new o0.a() { // from class: com.habitrpg.android.habitica.s
            @Override // io.realm.o0.a
            public final void a(o0 o0Var) {
                HabiticaBaseApplication.deleteDatabase$lambda$2(o0Var);
            }
        });
        return true;
    }

    public final AuthenticationHandler getAuthenticationHandler$Habitica_2311256681_prodRelease() {
        AuthenticationHandler authenticationHandler = this.authenticationHandler;
        if (authenticationHandler != null) {
            return authenticationHandler;
        }
        qc.q.z("authenticationHandler");
        return null;
    }

    public final WeakReference<BaseActivity> getCurrentActivity() {
        return this.currentActivity;
    }

    public final ApiClient getLazyApiHelper$Habitica_2311256681_prodRelease() {
        ApiClient apiClient = this.lazyApiHelper;
        if (apiClient != null) {
            return apiClient;
        }
        qc.q.z("lazyApiHelper");
        return null;
    }

    public final PushNotificationManager getPushNotificationManager$Habitica_2311256681_prodRelease() {
        PushNotificationManager pushNotificationManager = this.pushNotificationManager;
        if (pushNotificationManager != null) {
            return pushNotificationManager;
        }
        qc.q.z("pushNotificationManager");
        return null;
    }

    public final SharedPreferences getSharedPrefs$Habitica_2311256681_prodRelease() {
        SharedPreferences sharedPreferences = this.sharedPrefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        qc.q.z("sharedPrefs");
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        qc.q.i(activity, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        qc.q.i(activity, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        BaseActivity baseActivity;
        qc.q.i(activity, "activity");
        WeakReference<BaseActivity> weakReference = this.currentActivity;
        if (weakReference != null) {
            baseActivity = weakReference.get();
        } else {
            baseActivity = null;
        }
        if (qc.q.d(baseActivity, activity)) {
            this.currentActivity = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        BaseActivity baseActivity;
        qc.q.i(activity, "activity");
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        this.currentActivity = new WeakReference<>(baseActivity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        qc.q.i(activity, "p0");
        qc.q.i(bundle, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        BaseActivity baseActivity;
        qc.q.i(activity, "activity");
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        this.currentActivity = new WeakReference<>(baseActivity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        qc.q.i(activity, "p0");
    }

    @Override // com.habitrpg.android.habitica.Hilt_HabiticaBaseApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        this.lifecycleTracker = new ApplicationLifecycleTracker(getSharedPrefs$Habitica_2311256681_prodRelease());
        androidx.lifecycle.p lifecycle = j0.f4975v.a().getLifecycle();
        ApplicationLifecycleTracker applicationLifecycleTracker = this.lifecycleTracker;
        if (applicationLifecycleTracker == null) {
            qc.q.z("lifecycleTracker");
            applicationLifecycleTracker = null;
        }
        lifecycle.a(applicationLifecycleTracker);
        try {
            Analytics.INSTANCE.initialize(this);
        } catch (Resources.NotFoundException unused) {
        }
        Analytics analytics = Analytics.INSTANCE;
        analytics.identify(getSharedPrefs$Habitica_2311256681_prodRelease());
        analytics.setUserID(getLazyApiHelper$Habitica_2311256681_prodRelease().getHostConfig().getUserID());
        registerActivityLifecycleCallbacks(this);
        setupRealm();
        setLocale();
        setupRemoteConfig();
        setupNotifications();
        setupAdHandler();
        HabiticaIconsHelper.init(this);
        MarkdownParser.INSTANCE.setup(this);
        androidx.appcompat.app.g.I(true);
        ApplicationExtensionsKt.setupCoil(this);
        ExceptionHandler.Companion.init(HabiticaBaseApplication$onCreate$1.INSTANCE);
        analytics.setUserProperty("app_testing_level", "production");
        checkIfNewVersion();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i10, SQLiteDatabase.CursorFactory cursorFactory) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        SQLiteDatabase openOrCreateDatabase = super.openOrCreateDatabase(getDatabasePath(str).getAbsolutePath(), i10, cursorFactory);
        qc.q.h(openOrCreateDatabase, "openOrCreateDatabase(...)");
        return openOrCreateDatabase;
    }

    public final void setAuthenticationHandler$Habitica_2311256681_prodRelease(AuthenticationHandler authenticationHandler) {
        qc.q.i(authenticationHandler, "<set-?>");
        this.authenticationHandler = authenticationHandler;
    }

    public final void setCurrentActivity(WeakReference<BaseActivity> weakReference) {
        this.currentActivity = weakReference;
    }

    public final void setLazyApiHelper$Habitica_2311256681_prodRelease(ApiClient apiClient) {
        qc.q.i(apiClient, "<set-?>");
        this.lazyApiHelper = apiClient;
    }

    public final void setPushNotificationManager$Habitica_2311256681_prodRelease(PushNotificationManager pushNotificationManager) {
        qc.q.i(pushNotificationManager, "<set-?>");
        this.pushNotificationManager = pushNotificationManager;
    }

    public final void setSharedPrefs$Habitica_2311256681_prodRelease(SharedPreferences sharedPreferences) {
        qc.q.i(sharedPreferences, "<set-?>");
        this.sharedPrefs = sharedPreferences;
    }

    protected void setupRealm() {
        o0.e1(this);
        try {
            o0.j1(new v0.a().f(1L).d().a(true).c(new CompactOnLaunchCallback() { // from class: com.habitrpg.android.habitica.q
                @Override // io.realm.CompactOnLaunchCallback
                public final boolean shouldCompact(long j10, long j11) {
                    boolean z10;
                    z10 = HabiticaBaseApplication.setupRealm$lambda$0(j10, j11);
                    return z10;
                }
            }).b());
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i10, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        SQLiteDatabase openOrCreateDatabase = super.openOrCreateDatabase(getDatabasePath(str).getAbsolutePath(), i10, cursorFactory, databaseErrorHandler);
        qc.q.h(openOrCreateDatabase, "openOrCreateDatabase(...)");
        return openOrCreateDatabase;
    }
}
