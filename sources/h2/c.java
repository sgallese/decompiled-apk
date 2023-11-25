package h2;

import android.util.Log;
import qc.h;
import qc.q;

/* compiled from: PreviewLogger.android.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16448a = new a(null);

    /* compiled from: PreviewLogger.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public static /* synthetic */ void c(a aVar, String str, Throwable th, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th = null;
            }
            aVar.b(str, th);
        }

        public final void a(String str, Throwable th) {
            q.i(str, "message");
            Log.e("PreviewLogger", str, th);
        }

        public final void b(String str, Throwable th) {
            q.i(str, "message");
            Log.w("PreviewLogger", str, th);
        }
    }
}
