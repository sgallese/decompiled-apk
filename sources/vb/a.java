package vb;

import android.os.Looper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/* compiled from: AndroidCapabilities.java */
/* loaded from: classes4.dex */
public class a implements io.realm.internal.a {
    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL", "MS_CANNOT_BE_FINAL"})

    /* renamed from: c  reason: collision with root package name */
    public static boolean f25110c = false;

    /* renamed from: a  reason: collision with root package name */
    private final Looper f25111a = Looper.myLooper();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f25112b = e();

    private boolean d() {
        if (this.f25111a != null) {
            return true;
        }
        return false;
    }

    private static boolean e() {
        String name = Thread.currentThread().getName();
        if (name != null && name.startsWith("IntentService[")) {
            return true;
        }
        return false;
    }

    @Override // io.realm.internal.a
    public boolean a() {
        if (d() && !this.f25112b) {
            return true;
        }
        return false;
    }

    @Override // io.realm.internal.a
    public boolean b() {
        Looper looper = this.f25111a;
        if (looper != null && (f25110c || looper == Looper.getMainLooper())) {
            return true;
        }
        return false;
    }

    @Override // io.realm.internal.a
    public void c(String str) {
        String str2 = "";
        if (!d()) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on a thread without a looper.";
            }
            throw new IllegalStateException(str2);
        } else if (this.f25112b) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on an IntentService thread.";
            }
            throw new IllegalStateException(str2);
        }
    }
}
