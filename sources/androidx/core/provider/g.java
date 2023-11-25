package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.util.i;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes.dex */
public class g {

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f3988a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f3989b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f3988a = i10;
            this.f3989b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f3989b;
        }

        public int c() {
            return this.f3988a;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f3990a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3991b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3992c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f3993d;

        /* renamed from: e  reason: collision with root package name */
        private final int f3994e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f3990a = (Uri) i.g(uri);
            this.f3991b = i10;
            this.f3992c = i11;
            this.f3993d = z10;
            this.f3994e = i12;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f3994e;
        }

        public int c() {
            return this.f3991b;
        }

        public Uri d() {
            return this.f3990a;
        }

        public int e() {
            return this.f3992c;
        }

        public boolean f() {
            return this.f3993d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return androidx.core.graphics.e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) throws PackageManager.NameNotFoundException {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        if (z10) {
            return f.e(context, eVar, aVar, i10, i11);
        }
        return f.d(context, eVar, i10, null, aVar);
    }
}
