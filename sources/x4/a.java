package x4;

import ad.k0;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import b5.p;
import b5.q;
import coil.memory.MemoryCache;
import dc.n;
import dc.w;
import g5.o;
import g5.u;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import qc.f0;
import w4.m;
import x4.b;

/* compiled from: EngineInterceptor.kt */
/* loaded from: classes.dex */
public final class a implements x4.b {

    /* renamed from: d  reason: collision with root package name */
    public static final C0585a f25721d = new C0585a(null);

    /* renamed from: a  reason: collision with root package name */
    private final q4.g f25722a;

    /* renamed from: b  reason: collision with root package name */
    private final p f25723b;

    /* renamed from: c  reason: collision with root package name */
    private final coil.memory.c f25724c;

    /* compiled from: EngineInterceptor.kt */
    /* renamed from: x4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0585a {
        private C0585a() {
        }

        public /* synthetic */ C0585a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: EngineInterceptor.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable f25725a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f25726b;

        /* renamed from: c  reason: collision with root package name */
        private final t4.f f25727c;

        /* renamed from: d  reason: collision with root package name */
        private final String f25728d;

        public b(Drawable drawable, boolean z10, t4.f fVar, String str) {
            this.f25725a = drawable;
            this.f25726b = z10;
            this.f25727c = fVar;
            this.f25728d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, t4.f fVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f25725a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f25726b;
            }
            if ((i10 & 4) != 0) {
                fVar = bVar.f25727c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f25728d;
            }
            return bVar.a(drawable, z10, fVar, str);
        }

        public final b a(Drawable drawable, boolean z10, t4.f fVar, String str) {
            return new b(drawable, z10, fVar, str);
        }

        public final t4.f c() {
            return this.f25727c;
        }

        public final String d() {
            return this.f25728d;
        }

        public final Drawable e() {
            return this.f25725a;
        }

        public final boolean f() {
            return this.f25726b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {199}, m = "decode")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f25729f;

        /* renamed from: m  reason: collision with root package name */
        Object f25730m;

        /* renamed from: p  reason: collision with root package name */
        Object f25731p;

        /* renamed from: q  reason: collision with root package name */
        Object f25732q;

        /* renamed from: r  reason: collision with root package name */
        Object f25733r;

        /* renamed from: s  reason: collision with root package name */
        Object f25734s;

        /* renamed from: t  reason: collision with root package name */
        Object f25735t;

        /* renamed from: u  reason: collision with root package name */
        Object f25736u;

        /* renamed from: v  reason: collision with root package name */
        int f25737v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f25738w;

        /* renamed from: y  reason: collision with root package name */
        int f25740y;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25738w = obj;
            this.f25740y |= RecyclerView.UNDEFINED_DURATION;
            return a.this.h(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {122, 126, 144}, m = "execute")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f25741f;

        /* renamed from: m  reason: collision with root package name */
        Object f25742m;

        /* renamed from: p  reason: collision with root package name */
        Object f25743p;

        /* renamed from: q  reason: collision with root package name */
        Object f25744q;

        /* renamed from: r  reason: collision with root package name */
        Object f25745r;

        /* renamed from: s  reason: collision with root package name */
        Object f25746s;

        /* renamed from: t  reason: collision with root package name */
        Object f25747t;

        /* renamed from: u  reason: collision with root package name */
        Object f25748u;

        /* renamed from: v  reason: collision with root package name */
        /* synthetic */ Object f25749v;

        /* renamed from: x  reason: collision with root package name */
        int f25751x;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25749v = obj;
            this.f25751x |= RecyclerView.UNDEFINED_DURATION;
            return a.this.i(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {127}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends l implements pc.p<k0, Continuation<? super b>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f25752f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f0<w4.h> f25754p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ f0<q4.b> f25755q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b5.h f25756r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ Object f25757s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ f0<b5.l> f25758t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ q4.d f25759u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f0<w4.h> f0Var, f0<q4.b> f0Var2, b5.h hVar, Object obj, f0<b5.l> f0Var3, q4.d dVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f25754p = f0Var;
            this.f25755q = f0Var2;
            this.f25756r = hVar;
            this.f25757s = obj;
            this.f25758t = f0Var3;
            this.f25759u = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new e(this.f25754p, this.f25755q, this.f25756r, this.f25757s, this.f25758t, this.f25759u, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super b> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f25752f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                a aVar = a.this;
                m mVar = (m) this.f25754p.f21676f;
                q4.b bVar = this.f25755q.f21676f;
                b5.h hVar = this.f25756r;
                Object obj2 = this.f25757s;
                b5.l lVar = this.f25758t.f21676f;
                q4.d dVar = this.f25759u;
                this.f25752f = 1;
                obj = aVar.h(mVar, bVar, hVar, obj2, lVar, dVar, this);
                if (obj == d10) {
                    return d10;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {165}, m = "fetch")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f25760f;

        /* renamed from: m  reason: collision with root package name */
        Object f25761m;

        /* renamed from: p  reason: collision with root package name */
        Object f25762p;

        /* renamed from: q  reason: collision with root package name */
        Object f25763q;

        /* renamed from: r  reason: collision with root package name */
        Object f25764r;

        /* renamed from: s  reason: collision with root package name */
        Object f25765s;

        /* renamed from: t  reason: collision with root package name */
        Object f25766t;

        /* renamed from: u  reason: collision with root package name */
        int f25767u;

        /* renamed from: v  reason: collision with root package name */
        /* synthetic */ Object f25768v;

        /* renamed from: x  reason: collision with root package name */
        int f25770x;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25768v = obj;
            this.f25770x |= RecyclerView.UNDEFINED_DURATION;
            return a.this.j(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {73}, m = "intercept")
    /* loaded from: classes.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f25771f;

        /* renamed from: m  reason: collision with root package name */
        Object f25772m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f25773p;

        /* renamed from: r  reason: collision with root package name */
        int f25775r;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25773p = obj;
            this.f25775r |= RecyclerView.UNDEFINED_DURATION;
            return a.this.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends l implements pc.p<k0, Continuation<? super q>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f25776f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b5.h f25778p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Object f25779q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b5.l f25780r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ q4.d f25781s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ MemoryCache.Key f25782t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ b.a f25783u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(b5.h hVar, Object obj, b5.l lVar, q4.d dVar, MemoryCache.Key key, b.a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f25778p = hVar;
            this.f25779q = obj;
            this.f25780r = lVar;
            this.f25781s = dVar;
            this.f25782t = key;
            this.f25783u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new h(this.f25778p, this.f25779q, this.f25780r, this.f25781s, this.f25782t, this.f25783u, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super q> continuation) {
            return ((h) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            MemoryCache.Key key;
            d10 = ic.d.d();
            int i10 = this.f25776f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                a aVar = a.this;
                b5.h hVar = this.f25778p;
                Object obj2 = this.f25779q;
                b5.l lVar = this.f25780r;
                q4.d dVar = this.f25781s;
                this.f25776f = 1;
                obj = aVar.i(hVar, obj2, lVar, dVar, this);
                if (obj == d10) {
                    return d10;
                }
            }
            b bVar = (b) obj;
            boolean h10 = a.this.f25724c.h(this.f25782t, this.f25778p, bVar);
            Drawable e10 = bVar.e();
            b5.h hVar2 = this.f25778p;
            t4.f c10 = bVar.c();
            MemoryCache.Key key2 = this.f25782t;
            if (h10) {
                key = key2;
            } else {
                key = null;
            }
            return new q(e10, hVar2, c10, key, bVar.d(), bVar.f(), g5.l.t(this.f25783u));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends l implements pc.p<k0, Continuation<? super b>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f25784f;

        /* renamed from: m  reason: collision with root package name */
        Object f25785m;

        /* renamed from: p  reason: collision with root package name */
        int f25786p;

        /* renamed from: q  reason: collision with root package name */
        int f25787q;

        /* renamed from: r  reason: collision with root package name */
        int f25788r;

        /* renamed from: s  reason: collision with root package name */
        private /* synthetic */ Object f25789s;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ b f25791u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ b5.l f25792v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ List<e5.c> f25793w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ q4.d f25794x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ b5.h f25795y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(b bVar, b5.l lVar, List<? extends e5.c> list, q4.d dVar, b5.h hVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f25791u = bVar;
            this.f25792v = lVar;
            this.f25793w = list;
            this.f25794x = dVar;
            this.f25795y = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            i iVar = new i(this.f25791u, this.f25792v, this.f25793w, this.f25794x, this.f25795y, continuation);
            iVar.f25789s = obj;
            return iVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super b> continuation) {
            return ((i) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0078 -> B:13:0x007b). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f25788r
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                int r2 = r0.f25787q
                int r4 = r0.f25786p
                java.lang.Object r5 = r0.f25785m
                b5.l r5 = (b5.l) r5
                java.lang.Object r6 = r0.f25784f
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r0.f25789s
                ad.k0 r7 = (ad.k0) r7
                dc.n.b(r18)
                r9 = r0
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r18
                goto L7b
            L27:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L2f:
                dc.n.b(r18)
                java.lang.Object r2 = r0.f25789s
                ad.k0 r2 = (ad.k0) r2
                x4.a r4 = x4.a.this
                x4.a$b r5 = r0.f25791u
                android.graphics.drawable.Drawable r5 = r5.e()
                b5.l r6 = r0.f25792v
                java.util.List<e5.c> r7 = r0.f25793w
                android.graphics.Bitmap r4 = x4.a.b(r4, r5, r6, r7)
                q4.d r5 = r0.f25794x
                b5.h r6 = r0.f25795y
                r5.o(r6, r4)
                java.util.List<e5.c> r5 = r0.f25793w
                b5.l r6 = r0.f25792v
                int r7 = r5.size()
                r8 = 0
                r9 = r0
                r8 = r2
                r2 = r7
                r7 = r5
                r5 = r4
                r4 = 0
            L5c:
                if (r4 >= r2) goto L82
                java.lang.Object r10 = r7.get(r4)
                e5.c r10 = (e5.c) r10
                c5.i r11 = r6.o()
                r9.f25789s = r8
                r9.f25784f = r7
                r9.f25785m = r6
                r9.f25786p = r4
                r9.f25787q = r2
                r9.f25788r = r3
                java.lang.Object r5 = r10.b(r5, r11, r9)
                if (r5 != r1) goto L7b
                return r1
            L7b:
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                ad.l0.f(r8)
                int r4 = r4 + r3
                goto L5c
            L82:
                q4.d r1 = r9.f25794x
                b5.h r2 = r9.f25795y
                r1.q(r2, r5)
                x4.a$b r10 = r9.f25791u
                b5.h r1 = r9.f25795y
                android.content.Context r1 = r1.l()
                android.content.res.Resources r1 = r1.getResources()
                android.graphics.drawable.BitmapDrawable r11 = new android.graphics.drawable.BitmapDrawable
                r11.<init>(r1, r5)
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 14
                r16 = 0
                x4.a$b r1 = x4.a.b.b(r10, r11, r12, r13, r14, r15, r16)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(q4.g gVar, p pVar, u uVar) {
        this.f25722a = gVar;
        this.f25723b = pVar;
        this.f25724c = new coil.memory.c(gVar, pVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap g(Drawable drawable, b5.l lVar, List<? extends e5.c> list) {
        boolean H;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            H = ec.p.H(g5.l.o(), g5.a.c(bitmap));
            if (H) {
                return bitmap;
            }
        }
        return o.f16199a.a(drawable, lVar.f(), lVar.o(), lVar.n(), lVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00aa -> B:21:0x00b3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(w4.m r17, q4.b r18, b5.h r19, java.lang.Object r20, b5.l r21, q4.d r22, kotlin.coroutines.Continuation<? super x4.a.b> r23) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.a.h(w4.m, q4.b, b5.h, java.lang.Object, b5.l, q4.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[Catch: all -> 0x0212, TRY_LEAVE, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:76:0x020c, B:77:0x0211, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c A[Catch: all -> 0x0212, TRY_ENTER, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:76:0x020c, B:77:0x0211, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021f  */
    /* JADX WARN: Type inference failed for: r1v13, types: [q4.b, T] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, b5.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [q4.b, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(b5.h r36, java.lang.Object r37, b5.l r38, q4.d r39, kotlin.coroutines.Continuation<? super x4.a.b> r40) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.a.i(b5.h, java.lang.Object, b5.l, q4.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0097). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(q4.b r10, b5.h r11, java.lang.Object r12, b5.l r13, q4.d r14, kotlin.coroutines.Continuation<? super w4.h> r15) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.a.j(q4.b, b5.h, java.lang.Object, b5.l, q4.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    @Override // x4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(x4.b.a r14, kotlin.coroutines.Continuation<? super b5.i> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof x4.a.g
            if (r0 == 0) goto L13
            r0 = r15
            x4.a$g r0 = (x4.a.g) r0
            int r1 = r0.f25775r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25775r = r1
            goto L18
        L13:
            x4.a$g r0 = new x4.a$g
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f25773p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f25775r
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r14 = r0.f25772m
            x4.b$a r14 = (x4.b.a) r14
            java.lang.Object r0 = r0.f25771f
            x4.a r0 = (x4.a) r0
            dc.n.b(r15)     // Catch: java.lang.Throwable -> L31
            goto L9b
        L31:
            r15 = move-exception
            goto L9e
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            dc.n.b(r15)
            b5.h r6 = r14.a()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = r6.m()     // Catch: java.lang.Throwable -> L9c
            c5.i r2 = r14.getSize()     // Catch: java.lang.Throwable -> L9c
            q4.d r9 = g5.l.g(r14)     // Catch: java.lang.Throwable -> L9c
            b5.p r4 = r13.f25723b     // Catch: java.lang.Throwable -> L9c
            b5.l r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> L9c
            c5.h r4 = r8.n()     // Catch: java.lang.Throwable -> L9c
            r9.i(r6, r15)     // Catch: java.lang.Throwable -> L9c
            q4.g r5 = r13.f25722a     // Catch: java.lang.Throwable -> L9c
            q4.b r5 = r5.getComponents()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> L9c
            r9.m(r6, r7)     // Catch: java.lang.Throwable -> L9c
            coil.memory.c r15 = r13.f25724c     // Catch: java.lang.Throwable -> L9c
            coil.memory.MemoryCache$Key r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L77
            coil.memory.c r15 = r13.f25724c     // Catch: java.lang.Throwable -> L9c
            coil.memory.MemoryCache$b r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L9c
            goto L78
        L77:
            r15 = 0
        L78:
            if (r15 == 0) goto L81
            coil.memory.c r0 = r13.f25724c     // Catch: java.lang.Throwable -> L9c
            b5.q r14 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L9c
            return r14
        L81:
            ad.g0 r15 = r6.v()     // Catch: java.lang.Throwable -> L9c
            x4.a$h r2 = new x4.a$h     // Catch: java.lang.Throwable -> L9c
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9c
            r0.f25771f = r13     // Catch: java.lang.Throwable -> L9c
            r0.f25772m = r14     // Catch: java.lang.Throwable -> L9c
            r0.f25775r = r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = ad.g.g(r15, r2, r0)     // Catch: java.lang.Throwable -> L9c
            if (r15 != r1) goto L9b
            return r1
        L9b:
            return r15
        L9c:
            r15 = move-exception
            r0 = r13
        L9e:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto Lad
            b5.p r0 = r0.f25723b
            b5.h r14 = r14.a()
            b5.e r14 = r0.b(r14, r15)
            return r14
        Lad:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.a.a(x4.b$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object k(b bVar, b5.h hVar, b5.l lVar, q4.d dVar, Continuation<? super b> continuation) {
        List<e5.c> O = hVar.O();
        if (O.isEmpty()) {
            return bVar;
        }
        if (!(bVar.e() instanceof BitmapDrawable) && !hVar.g()) {
            return bVar;
        }
        return ad.g.g(hVar.N(), new i(bVar, lVar, O, dVar, hVar, null), continuation);
    }
}
