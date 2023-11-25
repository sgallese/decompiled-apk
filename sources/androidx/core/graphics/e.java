package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final k f3908a;

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.collection.f<String, Typeface> f3909b;

    /* compiled from: TypefaceCompat.java */
    /* loaded from: classes.dex */
    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        private h.e f3910a;

        public a(h.e eVar) {
            this.f3910a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i10) {
            h.e eVar = this.f3910a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f3910a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f3908a = new j();
        } else if (i10 >= 28) {
            f3908a = new i();
        } else if (i10 >= 26) {
            f3908a = new h();
        } else if (i10 >= 24 && g.j()) {
            f3908a = new g();
        } else {
            f3908a = new f();
        }
        f3909b = new androidx.collection.f<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f3908a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z10) {
        Typeface a10;
        boolean z11;
        int i13;
        if (bVar instanceof e.C0069e) {
            e.C0069e c0069e = (e.C0069e) bVar;
            Typeface g10 = g(c0069e.c());
            if (g10 != null) {
                if (eVar != null) {
                    eVar.d(g10, handler);
                }
                return g10;
            }
            if (!z10 ? eVar == null : c0069e.a() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                i13 = c0069e.d();
            } else {
                i13 = -1;
            }
            a10 = androidx.core.provider.g.c(context, c0069e.b(), i12, z11, i13, h.e.e(handler), new a(eVar));
        } else {
            a10 = f3908a.a(context, (e.c) bVar, resources, i12);
            if (eVar != null) {
                if (a10 != null) {
                    eVar.d(a10, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a10 != null) {
            f3909b.put(e(resources, i10, str, i11, i12), a10);
        }
        return a10;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface d10 = f3908a.d(context, resources, i10, str, i12);
        if (d10 != null) {
            f3909b.put(e(resources, i10, str, i11, i12), d10);
        }
        return d10;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f3909b.get(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
