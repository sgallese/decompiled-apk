package b5;

import ad.g0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import b5.m;
import coil.memory.MemoryCache;
import coil.target.ImageViewTarget;
import ec.n0;
import f5.c;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import t4.i;
import w4.i;

/* compiled from: ImageRequest.kt */
/* loaded from: classes.dex */
public final class h {
    private final androidx.lifecycle.p A;
    private final c5.j B;
    private final c5.h C;
    private final m D;
    private final MemoryCache.Key E;
    private final Integer F;
    private final Drawable G;
    private final Integer H;
    private final Drawable I;
    private final Integer J;
    private final Drawable K;
    private final c L;
    private final b5.b M;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7960a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7961b;

    /* renamed from: c  reason: collision with root package name */
    private final d5.b f7962c;

    /* renamed from: d  reason: collision with root package name */
    private final b f7963d;

    /* renamed from: e  reason: collision with root package name */
    private final MemoryCache.Key f7964e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7965f;

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap.Config f7966g;

    /* renamed from: h  reason: collision with root package name */
    private final ColorSpace f7967h;

    /* renamed from: i  reason: collision with root package name */
    private final c5.e f7968i;

    /* renamed from: j  reason: collision with root package name */
    private final dc.l<i.a<?>, Class<?>> f7969j;

    /* renamed from: k  reason: collision with root package name */
    private final i.a f7970k;

    /* renamed from: l  reason: collision with root package name */
    private final List<e5.c> f7971l;

    /* renamed from: m  reason: collision with root package name */
    private final c.a f7972m;

    /* renamed from: n  reason: collision with root package name */
    private final Headers f7973n;

    /* renamed from: o  reason: collision with root package name */
    private final r f7974o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f7975p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f7976q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f7977r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f7978s;

    /* renamed from: t  reason: collision with root package name */
    private final b5.a f7979t;

    /* renamed from: u  reason: collision with root package name */
    private final b5.a f7980u;

    /* renamed from: v  reason: collision with root package name */
    private final b5.a f7981v;

    /* renamed from: w  reason: collision with root package name */
    private final g0 f7982w;

    /* renamed from: x  reason: collision with root package name */
    private final g0 f7983x;

    /* renamed from: y  reason: collision with root package name */
    private final g0 f7984y;

    /* renamed from: z  reason: collision with root package name */
    private final g0 f7985z;

    /* compiled from: ImageRequest.kt */
    /* loaded from: classes.dex */
    public interface b {
        void a(h hVar, e eVar);

        void b(h hVar);

        void c(h hVar, q qVar);

        void d(h hVar);
    }

    public /* synthetic */ h(Context context, Object obj, d5.b bVar, b bVar2, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, c5.e eVar, dc.l lVar, i.a aVar, List list, c.a aVar2, Headers headers, r rVar, boolean z10, boolean z11, boolean z12, boolean z13, b5.a aVar3, b5.a aVar4, b5.a aVar5, g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, androidx.lifecycle.p pVar, c5.j jVar, c5.h hVar, m mVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, c cVar, b5.b bVar3, qc.h hVar2) {
        this(context, obj, bVar, bVar2, key, str, config, colorSpace, eVar, lVar, aVar, list, aVar2, headers, rVar, z10, z11, z12, z13, aVar3, aVar4, aVar5, g0Var, g0Var2, g0Var3, g0Var4, pVar, jVar, hVar, mVar, key2, num, drawable, num2, drawable2, num3, drawable3, cVar, bVar3);
    }

    public static /* synthetic */ a R(h hVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = hVar.f7960a;
        }
        return hVar.Q(context);
    }

    public final b A() {
        return this.f7963d;
    }

    public final MemoryCache.Key B() {
        return this.f7964e;
    }

    public final b5.a C() {
        return this.f7979t;
    }

    public final b5.a D() {
        return this.f7981v;
    }

    public final m E() {
        return this.D;
    }

    public final Drawable F() {
        return g5.k.c(this, this.G, this.F, this.M.n());
    }

    public final MemoryCache.Key G() {
        return this.E;
    }

    public final c5.e H() {
        return this.f7968i;
    }

    public final boolean I() {
        return this.f7978s;
    }

    public final c5.h J() {
        return this.C;
    }

    public final c5.j K() {
        return this.B;
    }

    public final r L() {
        return this.f7974o;
    }

    public final d5.b M() {
        return this.f7962c;
    }

    public final g0 N() {
        return this.f7985z;
    }

    public final List<e5.c> O() {
        return this.f7971l;
    }

    public final c.a P() {
        return this.f7972m;
    }

    public final a Q(Context context) {
        return new a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (qc.q.d(this.f7960a, hVar.f7960a) && qc.q.d(this.f7961b, hVar.f7961b) && qc.q.d(this.f7962c, hVar.f7962c) && qc.q.d(this.f7963d, hVar.f7963d) && qc.q.d(this.f7964e, hVar.f7964e) && qc.q.d(this.f7965f, hVar.f7965f) && this.f7966g == hVar.f7966g && ((Build.VERSION.SDK_INT < 26 || qc.q.d(this.f7967h, hVar.f7967h)) && this.f7968i == hVar.f7968i && qc.q.d(this.f7969j, hVar.f7969j) && qc.q.d(this.f7970k, hVar.f7970k) && qc.q.d(this.f7971l, hVar.f7971l) && qc.q.d(this.f7972m, hVar.f7972m) && qc.q.d(this.f7973n, hVar.f7973n) && qc.q.d(this.f7974o, hVar.f7974o) && this.f7975p == hVar.f7975p && this.f7976q == hVar.f7976q && this.f7977r == hVar.f7977r && this.f7978s == hVar.f7978s && this.f7979t == hVar.f7979t && this.f7980u == hVar.f7980u && this.f7981v == hVar.f7981v && qc.q.d(this.f7982w, hVar.f7982w) && qc.q.d(this.f7983x, hVar.f7983x) && qc.q.d(this.f7984y, hVar.f7984y) && qc.q.d(this.f7985z, hVar.f7985z) && qc.q.d(this.E, hVar.E) && qc.q.d(this.F, hVar.F) && qc.q.d(this.G, hVar.G) && qc.q.d(this.H, hVar.H) && qc.q.d(this.I, hVar.I) && qc.q.d(this.J, hVar.J) && qc.q.d(this.K, hVar.K) && qc.q.d(this.A, hVar.A) && qc.q.d(this.B, hVar.B) && this.C == hVar.C && qc.q.d(this.D, hVar.D) && qc.q.d(this.L, hVar.L) && qc.q.d(this.M, hVar.M))) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return this.f7975p;
    }

    public final boolean h() {
        return this.f7976q;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int hashCode = ((this.f7960a.hashCode() * 31) + this.f7961b.hashCode()) * 31;
        d5.b bVar = this.f7962c;
        int i23 = 0;
        if (bVar != null) {
            i10 = bVar.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (hashCode + i10) * 31;
        b bVar2 = this.f7963d;
        if (bVar2 != null) {
            i11 = bVar2.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 31;
        MemoryCache.Key key = this.f7964e;
        if (key != null) {
            i12 = key.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 31;
        String str = this.f7965f;
        if (str != null) {
            i13 = str.hashCode();
        } else {
            i13 = 0;
        }
        int hashCode2 = (((i26 + i13) * 31) + this.f7966g.hashCode()) * 31;
        ColorSpace colorSpace = this.f7967h;
        if (colorSpace != null) {
            i14 = colorSpace.hashCode();
        } else {
            i14 = 0;
        }
        int hashCode3 = (((hashCode2 + i14) * 31) + this.f7968i.hashCode()) * 31;
        dc.l<i.a<?>, Class<?>> lVar = this.f7969j;
        if (lVar != null) {
            i15 = lVar.hashCode();
        } else {
            i15 = 0;
        }
        int i27 = (hashCode3 + i15) * 31;
        i.a aVar = this.f7970k;
        if (aVar != null) {
            i16 = aVar.hashCode();
        } else {
            i16 = 0;
        }
        int hashCode4 = (((((((((((((((((((((((((((((((((((((((i27 + i16) * 31) + this.f7971l.hashCode()) * 31) + this.f7972m.hashCode()) * 31) + this.f7973n.hashCode()) * 31) + this.f7974o.hashCode()) * 31) + t.k.a(this.f7975p)) * 31) + t.k.a(this.f7976q)) * 31) + t.k.a(this.f7977r)) * 31) + t.k.a(this.f7978s)) * 31) + this.f7979t.hashCode()) * 31) + this.f7980u.hashCode()) * 31) + this.f7981v.hashCode()) * 31) + this.f7982w.hashCode()) * 31) + this.f7983x.hashCode()) * 31) + this.f7984y.hashCode()) * 31) + this.f7985z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        MemoryCache.Key key2 = this.E;
        if (key2 != null) {
            i17 = key2.hashCode();
        } else {
            i17 = 0;
        }
        int i28 = (hashCode4 + i17) * 31;
        Integer num = this.F;
        if (num != null) {
            i18 = num.hashCode();
        } else {
            i18 = 0;
        }
        int i29 = (i28 + i18) * 31;
        Drawable drawable = this.G;
        if (drawable != null) {
            i19 = drawable.hashCode();
        } else {
            i19 = 0;
        }
        int i30 = (i29 + i19) * 31;
        Integer num2 = this.H;
        if (num2 != null) {
            i20 = num2.hashCode();
        } else {
            i20 = 0;
        }
        int i31 = (i30 + i20) * 31;
        Drawable drawable2 = this.I;
        if (drawable2 != null) {
            i21 = drawable2.hashCode();
        } else {
            i21 = 0;
        }
        int i32 = (i31 + i21) * 31;
        Integer num3 = this.J;
        if (num3 != null) {
            i22 = num3.hashCode();
        } else {
            i22 = 0;
        }
        int i33 = (i32 + i22) * 31;
        Drawable drawable3 = this.K;
        if (drawable3 != null) {
            i23 = drawable3.hashCode();
        }
        return ((((i33 + i23) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final boolean i() {
        return this.f7977r;
    }

    public final Bitmap.Config j() {
        return this.f7966g;
    }

    public final ColorSpace k() {
        return this.f7967h;
    }

    public final Context l() {
        return this.f7960a;
    }

    public final Object m() {
        return this.f7961b;
    }

    public final g0 n() {
        return this.f7984y;
    }

    public final i.a o() {
        return this.f7970k;
    }

    public final b5.b p() {
        return this.M;
    }

    public final c q() {
        return this.L;
    }

    public final String r() {
        return this.f7965f;
    }

    public final b5.a s() {
        return this.f7980u;
    }

    public final Drawable t() {
        return g5.k.c(this, this.I, this.H, this.M.h());
    }

    public final Drawable u() {
        return g5.k.c(this, this.K, this.J, this.M.i());
    }

    public final g0 v() {
        return this.f7983x;
    }

    public final dc.l<i.a<?>, Class<?>> w() {
        return this.f7969j;
    }

    public final Headers x() {
        return this.f7973n;
    }

    public final g0 y() {
        return this.f7982w;
    }

    public final androidx.lifecycle.p z() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(Context context, Object obj, d5.b bVar, b bVar2, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, c5.e eVar, dc.l<? extends i.a<?>, ? extends Class<?>> lVar, i.a aVar, List<? extends e5.c> list, c.a aVar2, Headers headers, r rVar, boolean z10, boolean z11, boolean z12, boolean z13, b5.a aVar3, b5.a aVar4, b5.a aVar5, g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, androidx.lifecycle.p pVar, c5.j jVar, c5.h hVar, m mVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, c cVar, b5.b bVar3) {
        this.f7960a = context;
        this.f7961b = obj;
        this.f7962c = bVar;
        this.f7963d = bVar2;
        this.f7964e = key;
        this.f7965f = str;
        this.f7966g = config;
        this.f7967h = colorSpace;
        this.f7968i = eVar;
        this.f7969j = lVar;
        this.f7970k = aVar;
        this.f7971l = list;
        this.f7972m = aVar2;
        this.f7973n = headers;
        this.f7974o = rVar;
        this.f7975p = z10;
        this.f7976q = z11;
        this.f7977r = z12;
        this.f7978s = z13;
        this.f7979t = aVar3;
        this.f7980u = aVar4;
        this.f7981v = aVar5;
        this.f7982w = g0Var;
        this.f7983x = g0Var2;
        this.f7984y = g0Var3;
        this.f7985z = g0Var4;
        this.A = pVar;
        this.B = jVar;
        this.C = hVar;
        this.D = mVar;
        this.E = key2;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = cVar;
        this.M = bVar3;
    }

    /* compiled from: ImageRequest.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private g0 A;
        private m.a B;
        private MemoryCache.Key C;
        private Integer D;
        private Drawable E;
        private Integer F;
        private Drawable G;
        private Integer H;
        private Drawable I;
        private androidx.lifecycle.p J;
        private c5.j K;
        private c5.h L;
        private androidx.lifecycle.p M;
        private c5.j N;
        private c5.h O;

        /* renamed from: a  reason: collision with root package name */
        private final Context f7986a;

        /* renamed from: b  reason: collision with root package name */
        private b5.b f7987b;

        /* renamed from: c  reason: collision with root package name */
        private Object f7988c;

        /* renamed from: d  reason: collision with root package name */
        private d5.b f7989d;

        /* renamed from: e  reason: collision with root package name */
        private b f7990e;

        /* renamed from: f  reason: collision with root package name */
        private MemoryCache.Key f7991f;

        /* renamed from: g  reason: collision with root package name */
        private String f7992g;

        /* renamed from: h  reason: collision with root package name */
        private Bitmap.Config f7993h;

        /* renamed from: i  reason: collision with root package name */
        private ColorSpace f7994i;

        /* renamed from: j  reason: collision with root package name */
        private c5.e f7995j;

        /* renamed from: k  reason: collision with root package name */
        private dc.l<? extends i.a<?>, ? extends Class<?>> f7996k;

        /* renamed from: l  reason: collision with root package name */
        private i.a f7997l;

        /* renamed from: m  reason: collision with root package name */
        private List<? extends e5.c> f7998m;

        /* renamed from: n  reason: collision with root package name */
        private c.a f7999n;

        /* renamed from: o  reason: collision with root package name */
        private Headers.Builder f8000o;

        /* renamed from: p  reason: collision with root package name */
        private Map<Class<?>, Object> f8001p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f8002q;

        /* renamed from: r  reason: collision with root package name */
        private Boolean f8003r;

        /* renamed from: s  reason: collision with root package name */
        private Boolean f8004s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f8005t;

        /* renamed from: u  reason: collision with root package name */
        private b5.a f8006u;

        /* renamed from: v  reason: collision with root package name */
        private b5.a f8007v;

        /* renamed from: w  reason: collision with root package name */
        private b5.a f8008w;

        /* renamed from: x  reason: collision with root package name */
        private g0 f8009x;

        /* renamed from: y  reason: collision with root package name */
        private g0 f8010y;

        /* renamed from: z  reason: collision with root package name */
        private g0 f8011z;

        public a(Context context) {
            List<? extends e5.c> i10;
            this.f7986a = context;
            this.f7987b = g5.k.b();
            this.f7988c = null;
            this.f7989d = null;
            this.f7990e = null;
            this.f7991f = null;
            this.f7992g = null;
            this.f7993h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f7994i = null;
            }
            this.f7995j = null;
            this.f7996k = null;
            this.f7997l = null;
            i10 = ec.t.i();
            this.f7998m = i10;
            this.f7999n = null;
            this.f8000o = null;
            this.f8001p = null;
            this.f8002q = true;
            this.f8003r = null;
            this.f8004s = null;
            this.f8005t = true;
            this.f8006u = null;
            this.f8007v = null;
            this.f8008w = null;
            this.f8009x = null;
            this.f8010y = null;
            this.f8011z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        private final void f() {
            this.O = null;
        }

        private final void g() {
            this.M = null;
            this.N = null;
            this.O = null;
        }

        private final androidx.lifecycle.p h() {
            Context context;
            d5.b bVar = this.f7989d;
            if (bVar instanceof d5.c) {
                context = ((d5.c) bVar).getView().getContext();
            } else {
                context = this.f7986a;
            }
            androidx.lifecycle.p c10 = g5.d.c(context);
            if (c10 == null) {
                return g.f7958b;
            }
            return c10;
        }

        private final c5.h i() {
            c5.m mVar;
            d5.c cVar;
            View view;
            c5.j jVar = this.K;
            View view2 = null;
            if (jVar instanceof c5.m) {
                mVar = (c5.m) jVar;
            } else {
                mVar = null;
            }
            if (mVar != null && (view = mVar.getView()) != null) {
                view2 = view;
            } else {
                d5.b bVar = this.f7989d;
                if (bVar instanceof d5.c) {
                    cVar = (d5.c) bVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    view2 = cVar.getView();
                }
            }
            if (view2 instanceof ImageView) {
                return g5.l.n((ImageView) view2);
            }
            return c5.h.FIT;
        }

        private final c5.j j() {
            boolean z10;
            d5.b bVar = this.f7989d;
            if (bVar instanceof d5.c) {
                View view = ((d5.c) bVar).getView();
                if (view instanceof ImageView) {
                    ImageView.ScaleType scaleType = ((ImageView) view).getScaleType();
                    if (scaleType != ImageView.ScaleType.CENTER && scaleType != ImageView.ScaleType.MATRIX) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        return c5.k.a(c5.i.f8847d);
                    }
                }
                return c5.n.b(view, false, 2, null);
            }
            return new c5.d(this.f7986a);
        }

        public final a a(boolean z10) {
            this.f8003r = Boolean.valueOf(z10);
            return this;
        }

        public final h b() {
            Headers headers;
            r rVar;
            boolean c10;
            boolean d10;
            m mVar;
            Context context = this.f7986a;
            Object obj = this.f7988c;
            if (obj == null) {
                obj = j.f8012a;
            }
            Object obj2 = obj;
            d5.b bVar = this.f7989d;
            b bVar2 = this.f7990e;
            MemoryCache.Key key = this.f7991f;
            String str = this.f7992g;
            Bitmap.Config config = this.f7993h;
            if (config == null) {
                config = this.f7987b.e();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f7994i;
            c5.e eVar = this.f7995j;
            if (eVar == null) {
                eVar = this.f7987b.o();
            }
            c5.e eVar2 = eVar;
            dc.l<? extends i.a<?>, ? extends Class<?>> lVar = this.f7996k;
            i.a aVar = this.f7997l;
            List<? extends e5.c> list = this.f7998m;
            c.a aVar2 = this.f7999n;
            if (aVar2 == null) {
                aVar2 = this.f7987b.q();
            }
            c.a aVar3 = aVar2;
            Headers.Builder builder = this.f8000o;
            if (builder != null) {
                headers = builder.build();
            } else {
                headers = null;
            }
            Headers x10 = g5.l.x(headers);
            Map<Class<?>, ? extends Object> map = this.f8001p;
            if (map != null) {
                rVar = r.f8045b.a(map);
            } else {
                rVar = null;
            }
            r w10 = g5.l.w(rVar);
            boolean z10 = this.f8002q;
            Boolean bool = this.f8003r;
            if (bool != null) {
                c10 = bool.booleanValue();
            } else {
                c10 = this.f7987b.c();
            }
            boolean z11 = c10;
            Boolean bool2 = this.f8004s;
            if (bool2 != null) {
                d10 = bool2.booleanValue();
            } else {
                d10 = this.f7987b.d();
            }
            boolean z12 = d10;
            boolean z13 = this.f8005t;
            b5.a aVar4 = this.f8006u;
            if (aVar4 == null) {
                aVar4 = this.f7987b.l();
            }
            b5.a aVar5 = aVar4;
            b5.a aVar6 = this.f8007v;
            if (aVar6 == null) {
                aVar6 = this.f7987b.g();
            }
            b5.a aVar7 = aVar6;
            b5.a aVar8 = this.f8008w;
            if (aVar8 == null) {
                aVar8 = this.f7987b.m();
            }
            b5.a aVar9 = aVar8;
            g0 g0Var = this.f8009x;
            if (g0Var == null) {
                g0Var = this.f7987b.k();
            }
            g0 g0Var2 = g0Var;
            g0 g0Var3 = this.f8010y;
            if (g0Var3 == null) {
                g0Var3 = this.f7987b.j();
            }
            g0 g0Var4 = g0Var3;
            g0 g0Var5 = this.f8011z;
            if (g0Var5 == null) {
                g0Var5 = this.f7987b.f();
            }
            g0 g0Var6 = g0Var5;
            g0 g0Var7 = this.A;
            if (g0Var7 == null) {
                g0Var7 = this.f7987b.p();
            }
            g0 g0Var8 = g0Var7;
            androidx.lifecycle.p pVar = this.J;
            if (pVar == null && (pVar = this.M) == null) {
                pVar = h();
            }
            androidx.lifecycle.p pVar2 = pVar;
            c5.j jVar = this.K;
            if (jVar == null && (jVar = this.N) == null) {
                jVar = j();
            }
            c5.j jVar2 = jVar;
            c5.h hVar = this.L;
            if (hVar == null && (hVar = this.O) == null) {
                hVar = i();
            }
            c5.h hVar2 = hVar;
            m.a aVar10 = this.B;
            if (aVar10 != null) {
                mVar = aVar10.a();
            } else {
                mVar = null;
            }
            return new h(context, obj2, bVar, bVar2, key, str, config2, colorSpace, eVar2, lVar, aVar, list, aVar3, x10, w10, z10, z11, z12, z13, aVar5, aVar7, aVar9, g0Var2, g0Var4, g0Var6, g0Var8, pVar2, jVar2, hVar2, g5.l.v(mVar), this.C, this.D, this.E, this.F, this.G, this.H, this.I, new c(this.J, this.K, this.L, this.f8009x, this.f8010y, this.f8011z, this.A, this.f7999n, this.f7995j, this.f7993h, this.f8003r, this.f8004s, this.f8006u, this.f8007v, this.f8008w), this.f7987b, null);
        }

        public final a c(Object obj) {
            this.f7988c = obj;
            return this;
        }

        public final a d(b5.b bVar) {
            this.f7987b = bVar;
            f();
            return this;
        }

        public final a e(c5.e eVar) {
            this.f7995j = eVar;
            return this;
        }

        public final a k(c5.h hVar) {
            this.L = hVar;
            return this;
        }

        public final a l(c5.j jVar) {
            this.K = jVar;
            g();
            return this;
        }

        public final a m(ImageView imageView) {
            return n(new ImageViewTarget(imageView));
        }

        public final a n(d5.b bVar) {
            this.f7989d = bVar;
            g();
            return this;
        }

        public a(h hVar, Context context) {
            Map<Class<?>, Object> t10;
            this.f7986a = context;
            this.f7987b = hVar.p();
            this.f7988c = hVar.m();
            this.f7989d = hVar.M();
            this.f7990e = hVar.A();
            this.f7991f = hVar.B();
            this.f7992g = hVar.r();
            this.f7993h = hVar.q().c();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f7994i = hVar.k();
            }
            this.f7995j = hVar.q().k();
            this.f7996k = hVar.w();
            this.f7997l = hVar.o();
            this.f7998m = hVar.O();
            this.f7999n = hVar.q().o();
            this.f8000o = hVar.x().newBuilder();
            t10 = n0.t(hVar.L().a());
            this.f8001p = t10;
            this.f8002q = hVar.g();
            this.f8003r = hVar.q().a();
            this.f8004s = hVar.q().b();
            this.f8005t = hVar.I();
            this.f8006u = hVar.q().i();
            this.f8007v = hVar.q().e();
            this.f8008w = hVar.q().j();
            this.f8009x = hVar.q().g();
            this.f8010y = hVar.q().f();
            this.f8011z = hVar.q().d();
            this.A = hVar.q().n();
            this.B = hVar.E().f();
            this.C = hVar.G();
            this.D = hVar.F;
            this.E = hVar.G;
            this.F = hVar.H;
            this.G = hVar.I;
            this.H = hVar.J;
            this.I = hVar.K;
            this.J = hVar.q().h();
            this.K = hVar.q().m();
            this.L = hVar.q().l();
            if (hVar.l() == context) {
                this.M = hVar.z();
                this.N = hVar.K();
                this.O = hVar.J();
                return;
            }
            this.M = null;
            this.N = null;
            this.O = null;
        }
    }
}
