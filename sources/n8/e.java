package n8;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.h;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20291a;

    /* renamed from: b  reason: collision with root package name */
    private b f20292b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DevelopmentPlatformProvider.java */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f20293a;

        /* renamed from: b  reason: collision with root package name */
        private final String f20294b;

        private b() {
            int r10 = h.r(e.this.f20291a, "com.google.firebase.crashlytics.unity_version", "string");
            if (r10 == 0) {
                if (e.this.c("flutter_assets/NOTICES.Z")) {
                    this.f20293a = "Flutter";
                    this.f20294b = null;
                    f.f().i("Development platform is: Flutter");
                    return;
                }
                this.f20293a = null;
                this.f20294b = null;
                return;
            }
            this.f20293a = "Unity";
            String string = e.this.f20291a.getResources().getString(r10);
            this.f20294b = string;
            f.f().i("Unity Editor version is: " + string);
        }
    }

    public e(Context context) {
        this.f20291a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f20291a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f20291a.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f20292b == null) {
            this.f20292b = new b();
        }
        return this.f20292b;
    }

    public String d() {
        return f().f20293a;
    }

    public String e() {
        return f().f20294b;
    }
}
