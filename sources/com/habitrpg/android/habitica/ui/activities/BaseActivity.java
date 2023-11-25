package com.habitrpg.android.habitica.ui.activities;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.habitrpg.android.habitica.HabiticaApplication;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.extensions.ResourcesExtensionsKt;
import com.habitrpg.android.habitica.extensions.WindowExtensionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.ui.helpers.ToolbarColorHelper;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.LanguageHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Map;

/* compiled from: BaseActivity.kt */
/* loaded from: classes4.dex */
public abstract class BaseActivity extends androidx.appcompat.app.d {
    public static final int $stable = 8;
    private String currentTheme;
    private boolean destroyed;
    private Boolean forcedIsNight;
    private String forcedTheme;
    private boolean isActivityVisible;
    private boolean isNightMode;
    public NotificationsManager notificationsManager;
    private Boolean overrideModernHeader;
    private Toolbar toolbar;
    public UserRepository userRepository;

    public static /* synthetic */ View getContentView$default(BaseActivity baseActivity, Integer num, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                num = baseActivity.getLayoutResId();
            }
            return baseActivity.getContentView(num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContentView");
    }

    private final HabiticaApplication getHabiticaApplication() {
        Application application = getApplication();
        qc.q.g(application, "null cannot be cast to non-null type com.habitrpg.android.habitica.HabiticaApplication");
        return (HabiticaApplication) application;
    }

    public static /* synthetic */ void loadTheme$Habitica_2311256681_prodRelease$default(BaseActivity baseActivity, SharedPreferences sharedPreferences, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            baseActivity.loadTheme$Habitica_2311256681_prodRelease(sharedPreferences, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadTheme");
    }

    public static /* synthetic */ void shareContent$default(BaseActivity baseActivity, String str, String str2, Bitmap bitmap, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                bitmap = null;
            }
            baseActivity.shareContent(str, str2, bitmap);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareContent");
    }

    public View getContentView(Integer num) {
        int i10;
        Object systemService = getSystemService("layout_inflater");
        qc.q.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        View inflate = layoutInflater.inflate(i10, (ViewGroup) null);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    public final Boolean getForcedIsNight$Habitica_2311256681_prodRelease() {
        return this.forcedIsNight;
    }

    public final String getForcedTheme$Habitica_2311256681_prodRelease() {
        return this.forcedTheme;
    }

    protected abstract Integer getLayoutResId();

    public final NotificationsManager getNotificationsManager() {
        NotificationsManager notificationsManager = this.notificationsManager;
        if (notificationsManager != null) {
            return notificationsManager;
        }
        qc.q.z("notificationsManager");
        return null;
    }

    public Boolean getOverrideModernHeader() {
        return this.overrideModernHeader;
    }

    public final Toolbar getToolbar$Habitica_2311256681_prodRelease() {
        return this.toolbar;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        qc.q.z("userRepository");
        return null;
    }

    public final boolean isActivityVisible() {
        return this.isActivityVisible;
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return this.destroyed;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void loadTheme$Habitica_2311256681_prodRelease(SharedPreferences sharedPreferences, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        int themeColor;
        boolean z13;
        qc.q.i(sharedPreferences, "sharedPreferences");
        String str = this.forcedTheme;
        if (str == null) {
            str = sharedPreferences.getString("theme_name", "purple");
        }
        if (!qc.q.d(str, this.currentTheme) || z10) {
            Boolean bool = this.forcedIsNight;
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = this.isNightMode;
            }
            if (z11) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1081301904:
                            if (str.equals("maroon")) {
                                i11 = R.style.MainAppTheme_Maroon_Dark;
                                break;
                            }
                            break;
                        case -1008851410:
                            if (str.equals("orange")) {
                                i11 = R.style.MainAppTheme_Orange_Dark;
                                break;
                            }
                            break;
                        case -734239628:
                            if (str.equals("yellow")) {
                                i11 = R.style.MainAppTheme_Yellow_Dark;
                                break;
                            }
                            break;
                        case 112785:
                            if (str.equals("red")) {
                                i11 = R.style.MainAppTheme_Red_Dark;
                                break;
                            }
                            break;
                        case 3027034:
                            if (str.equals("blue")) {
                                i11 = R.style.MainAppTheme_Blue_Dark;
                                break;
                            }
                            break;
                        case 3555932:
                            if (str.equals("teal")) {
                                i11 = R.style.MainAppTheme_Teal_Dark;
                                break;
                            }
                            break;
                        case 98619139:
                            if (str.equals("green")) {
                                i11 = R.style.MainAppTheme_Green_Dark;
                                break;
                            }
                            break;
                    }
                    setTheme(i11);
                }
                i11 = R.style.MainAppTheme_Dark;
                setTheme(i11);
            } else {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1081301904:
                            if (str.equals("maroon")) {
                                i10 = R.style.MainAppTheme_Maroon;
                                break;
                            }
                            break;
                        case -1008851410:
                            if (str.equals("orange")) {
                                i10 = R.style.MainAppTheme_Orange;
                                break;
                            }
                            break;
                        case -734239628:
                            if (str.equals("yellow")) {
                                i10 = R.style.MainAppTheme_Yellow;
                                break;
                            }
                            break;
                        case 112785:
                            if (str.equals("red")) {
                                i10 = R.style.MainAppTheme_Red;
                                break;
                            }
                            break;
                        case 3027034:
                            if (str.equals("blue")) {
                                i10 = R.style.MainAppTheme_Blue;
                                break;
                            }
                            break;
                        case 3555932:
                            if (str.equals("teal")) {
                                i10 = R.style.MainAppTheme_Teal;
                                break;
                            }
                            break;
                        case 98619139:
                            if (str.equals("green")) {
                                i10 = R.style.MainAppTheme_Green;
                                break;
                            }
                            break;
                    }
                    setTheme(i10);
                }
                i10 = R.style.MainAppTheme;
                setTheme(i10);
            }
        }
        Window window = getWindow();
        Boolean bool2 = this.forcedIsNight;
        if (bool2 != null) {
            z12 = bool2.booleanValue();
        } else {
            z12 = this.isNightMode;
        }
        if (z12) {
            themeColor = androidx.core.content.a.c(this, R.color.system_bars);
        } else {
            themeColor = ContextExtensionsKt.getThemeColor(this, R.attr.colorPrimaryDark);
        }
        window.setNavigationBarColor(themeColor);
        Boolean bool3 = this.forcedIsNight;
        if (bool3 != null) {
            z13 = bool3.booleanValue();
        } else {
            z13 = this.isNightMode;
        }
        if (!z13) {
            Window window2 = getWindow();
            qc.q.h(window2, "getWindow(...)");
            WindowExtensionsKt.updateStatusBarColor(window2, ContextExtensionsKt.getThemeColor(this, R.attr.headerBackgroundColor), true);
        }
        String str2 = this.currentTheme;
        if (str2 != null && !qc.q.d(str, str2)) {
            reload();
        } else {
            this.currentTheme = str;
        }
    }

    @Override // androidx.appcompat.app.d, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        qc.q.i(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        boolean isUsingNightModeResources = ContextExtensionsKt.isUsingNightModeResources(this);
        if (isUsingNightModeResources != this.isNightMode) {
            this.isNightMode = isUsingNightModeResources;
            SharedPreferences b10 = androidx.preference.k.b(this);
            qc.q.f(b10);
            loadTheme$Habitica_2311256681_prodRelease(b10, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    @Override // androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = androidx.preference.k.b(r7)
            com.habitrpg.common.habitica.helpers.LanguageHelper r1 = new com.habitrpg.common.habitica.helpers.LanguageHelper
            java.lang.String r2 = "language"
            java.lang.String r3 = "en"
            java.lang.String r2 = r0.getString(r2, r3)
            r1.<init>(r2)
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r3 = "getResources(...)"
            qc.q.h(r2, r3)
            java.util.Locale r1 = r1.getLocale()
            com.habitrpg.android.habitica.extensions.ResourcesExtensionsKt.forceLocale(r2, r7, r1)
            androidx.appcompat.app.g r1 = r7.getDelegate()
            java.lang.String r2 = "theme_mode"
            java.lang.String r3 = "system"
            java.lang.String r2 = r0.getString(r2, r3)
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L56
            int r5 = r2.hashCode()
            r6 = 3075958(0x2eef76, float:4.310335E-39)
            if (r5 == r6) goto L4b
            r6 = 102970646(0x6233516, float:3.0695894E-35)
            if (r5 == r6) goto L40
            goto L56
        L40:
            java.lang.String r5 = "light"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L49
            goto L56
        L49:
            r2 = 1
            goto L57
        L4b:
            java.lang.String r5 = "dark"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L54
            goto L56
        L54:
            r2 = 2
            goto L57
        L56:
            r2 = -1
        L57:
            r1.M(r2)
            boolean r1 = com.habitrpg.common.habitica.extensions.ContextExtensionsKt.isUsingNightModeResources(r7)
            r7.isNightMode = r1
            qc.q.f(r0)
            r1 = 0
            r2 = 0
            loadTheme$Habitica_2311256681_prodRelease$default(r7, r0, r1, r4, r2)
            super.onCreate(r8)
            r7.getHabiticaApplication()
            java.lang.Integer r8 = r7.getLayoutResId()
            if (r8 == 0) goto L83
            int r8 = r8.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            android.view.View r8 = r7.getContentView(r8)
            r7.setContentView(r8)
        L83:
            androidx.lifecycle.q r8 = androidx.lifecycle.w.a(r7)
            com.habitrpg.android.habitica.ui.activities.BaseActivity$onCreate$2 r0 = new com.habitrpg.android.habitica.ui.activities.BaseActivity$onCreate$2
            r0.<init>(r7, r2)
            com.habitrpg.common.habitica.helpers.ExceptionHandlerKt.launchCatching$default(r8, r2, r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.BaseActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        qc.q.i(menu, "menu");
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            ToolbarColorHelper.colorizeToolbar$default(ToolbarColorHelper.INSTANCE, toolbar, this, null, null, 12, null);
        }
        return onCreateOptionsMenu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.q, android.app.Activity
    public void onDestroy() {
        this.destroyed = true;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.q, android.app.Activity
    public void onPause() {
        this.isActivityVisible = false;
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        LanguageHelper languageHelper = new LanguageHelper(androidx.preference.k.b(this).getString("language", "en"));
        Resources resources = getResources();
        qc.q.h(resources, "getResources(...)");
        ResourcesExtensionsKt.forceLocale(resources, this, languageHelper.getLocale());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.q, android.app.Activity
    public void onResume() {
        super.onResume();
        this.isActivityVisible = true;
        SharedPreferences b10 = androidx.preference.k.b(this);
        qc.q.h(b10, "getDefaultSharedPreferences(...)");
        loadTheme$Habitica_2311256681_prodRelease$default(this, b10, false, 2, null);
    }

    public final void reload() {
        finish();
        overridePendingTransition(R.anim.activity_fade_in, R.anim.activity_fade_out);
        startActivity(getIntent());
    }

    public final void setActivityVisible(boolean z10) {
        this.isActivityVisible = z10;
    }

    public final void setForcedIsNight$Habitica_2311256681_prodRelease(Boolean bool) {
        this.forcedIsNight = bool;
    }

    public final void setForcedTheme$Habitica_2311256681_prodRelease(String str) {
        this.forcedTheme = str;
    }

    public final void setNotificationsManager(NotificationsManager notificationsManager) {
        qc.q.i(notificationsManager, "<set-?>");
        this.notificationsManager = notificationsManager;
    }

    public void setOverrideModernHeader(Boolean bool) {
        this.overrideModernHeader = bool;
    }

    public final void setToolbar$Habitica_2311256681_prodRelease(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    public final void setUserRepository(UserRepository userRepository) {
        qc.q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setupToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            androidx.appcompat.app.a supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.t(true);
                supportActionBar.u(true);
                supportActionBar.v(true);
                supportActionBar.w(false);
                supportActionBar.B(true);
            }
        }
        if (toolbar != null) {
            ToolbarColorHelper.colorizeToolbar$default(ToolbarColorHelper.INSTANCE, toolbar, this, null, null, 12, null);
        }
    }

    public final void shareContent(String str, String str2, Bitmap bitmap) {
        Map e10;
        Uri uri;
        OutputStream outputStream;
        boolean u10;
        qc.q.i(str, "identifier");
        Analytics analytics = Analytics.INSTANCE;
        EventCategory eventCategory = EventCategory.BEHAVIOUR;
        HitType hitType = HitType.EVENT;
        e10 = ec.m0.e(dc.r.a("identifier", str));
        Analytics.sendEvent$default(analytics, "shared", eventCategory, hitType, e10, null, 16, null);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        boolean z10 = false;
        if (str2 != null) {
            u10 = yc.v.u(str2);
            if ((!u10) == true) {
                z10 = true;
            }
        }
        if (z10) {
            intent.putExtra("android.intent.extra.TEXT", str2);
        }
        if (bitmap != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                ContentResolver contentResolver = getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", new Date() + ".png");
                contentValues.put("mime_type", "image/png");
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                uri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uri == null || (outputStream = contentResolver.openOutputStream(uri, "wt")) == null) {
                    return;
                }
            } else {
                String file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString();
                qc.q.h(file, "toString(...)");
                File file2 = new File(file, new Date() + ".png");
                File absoluteFile = file2.getAbsoluteFile();
                qc.q.h(absoluteFile, "getAbsoluteFile(...)");
                Uri fromFile = Uri.fromFile(absoluteFile);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                uri = fromFile;
                outputStream = fileOutputStream;
            }
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
            outputStream.close();
            intent.putExtra("android.intent.extra.STREAM", uri);
        }
        startActivity(Intent.createChooser(intent, getString(R.string.share_using)));
    }

    public void showConnectionProblem(int i10, String str, String str2) {
        qc.q.i(str2, "message");
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        habiticaAlertDialog.setTitle(str);
        habiticaAlertDialog.setMessage(str2);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, 17039370, true, false, false, (pc.p) null, 8, (Object) null);
        habiticaAlertDialog.enqueue();
    }

    public void hideConnectionProblem() {
    }
}
