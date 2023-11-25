package v9;

import android.util.Log;

/* compiled from: LogWrapper.java */
/* loaded from: classes3.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f25108a;

    private c() {
    }

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            if (f25108a == null) {
                f25108a = new c();
            }
            cVar = f25108a;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
