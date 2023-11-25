package q4;

import ad.a1;
import ad.h0;
import ad.k0;
import ad.l0;
import ad.r0;
import ad.s2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import b5.h;
import b5.p;
import coil.memory.MemoryCache;
import dc.n;
import ec.b0;
import g5.r;
import g5.u;
import g5.w;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import okhttp3.Call;
import okhttp3.HttpUrl;
import q4.d;
import t4.d;
import w4.a;
import w4.b;
import w4.c;
import w4.e;
import w4.f;
import w4.j;
import w4.k;
import w4.l;

/* compiled from: RealImageLoader.kt */
/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: o  reason: collision with root package name */
    public static final a f21406o = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f21407a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.b f21408b;

    /* renamed from: c  reason: collision with root package name */
    private final dc.f<MemoryCache> f21409c;

    /* renamed from: d  reason: collision with root package name */
    private final dc.f<u4.a> f21410d;

    /* renamed from: e  reason: collision with root package name */
    private final dc.f<Call.Factory> f21411e;

    /* renamed from: f  reason: collision with root package name */
    private final d.c f21412f;

    /* renamed from: g  reason: collision with root package name */
    private final q4.b f21413g;

    /* renamed from: h  reason: collision with root package name */
    private final r f21414h;

    /* renamed from: i  reason: collision with root package name */
    private final k0 f21415i = l0.a(s2.b(null, 1, null).plus(a1.c().N0()).plus(new f(h0.f516a, this)));

    /* renamed from: j  reason: collision with root package name */
    private final w f21416j;

    /* renamed from: k  reason: collision with root package name */
    private final p f21417k;

    /* renamed from: l  reason: collision with root package name */
    private final q4.b f21418l;

    /* renamed from: m  reason: collision with root package name */
    private final List<x4.b> f21419m;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f21420n;

    /* compiled from: RealImageLoader.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: RealImageLoader.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {117}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends l implements pc.p<k0, Continuation<? super b5.i>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f21421f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b5.h f21423p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b5.h hVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21423p = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f21423p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super b5.i> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f21421f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                j jVar = j.this;
                b5.h hVar = this.f21423p;
                this.f21421f = 1;
                obj = jVar.g(hVar, 0, this);
                if (obj == d10) {
                    return d10;
                }
            }
            j jVar2 = j.this;
            if (((b5.i) obj) instanceof b5.e) {
                jVar2.h();
            }
            return obj;
        }
    }

    /* compiled from: RealImageLoader.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {140}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends l implements pc.p<k0, Continuation<? super b5.i>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f21424f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f21425m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b5.h f21426p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ j f21427q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RealImageLoader.kt */
        @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {133}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements pc.p<k0, Continuation<? super b5.i>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f21428f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j f21429m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ b5.h f21430p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, b5.h hVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f21429m = jVar;
                this.f21430p = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f21429m, this.f21430p, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super b5.i> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f21428f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    j jVar = this.f21429m;
                    b5.h hVar = this.f21430p;
                    this.f21428f = 1;
                    obj = jVar.g(hVar, 1, this);
                    if (obj == d10) {
                        return d10;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b5.h hVar, j jVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f21426p = hVar;
            this.f21427q = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f21426p, this.f21427q, continuation);
            cVar.f21425m = obj;
            return cVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super b5.i> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            r0<? extends b5.i> b10;
            d10 = ic.d.d();
            int i10 = this.f21424f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                b10 = ad.i.b((k0) this.f21425m, a1.c().N0(), null, new a(this.f21427q, this.f21426p, null), 2, null);
                if (this.f21426p.M() instanceof d5.c) {
                    g5.l.l(((d5.c) this.f21426p.M()).getView()).b(b10);
                }
                this.f21424f = 1;
                obj = b10.E(this);
                if (obj == d10) {
                    return d10;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealImageLoader.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {166, 178, 182}, m = "executeMain")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f21431f;

        /* renamed from: m  reason: collision with root package name */
        Object f21432m;

        /* renamed from: p  reason: collision with root package name */
        Object f21433p;

        /* renamed from: q  reason: collision with root package name */
        Object f21434q;

        /* renamed from: r  reason: collision with root package name */
        Object f21435r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f21436s;

        /* renamed from: u  reason: collision with root package name */
        int f21438u;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21436s = obj;
            this.f21438u |= RecyclerView.UNDEFINED_DURATION;
            return j.this.g(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealImageLoader.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {191}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends l implements pc.p<k0, Continuation<? super b5.i>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f21439f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b5.h f21440m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j f21441p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ c5.i f21442q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ q4.d f21443r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ Bitmap f21444s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b5.h hVar, j jVar, c5.i iVar, q4.d dVar, Bitmap bitmap, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f21440m = hVar;
            this.f21441p = jVar;
            this.f21442q = iVar;
            this.f21443r = dVar;
            this.f21444s = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new e(this.f21440m, this.f21441p, this.f21442q, this.f21443r, this.f21444s, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super b5.i> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            boolean z10;
            d10 = ic.d.d();
            int i10 = this.f21439f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                b5.h hVar = this.f21440m;
                List list = this.f21441p.f21419m;
                b5.h hVar2 = this.f21440m;
                c5.i iVar = this.f21442q;
                q4.d dVar = this.f21443r;
                if (this.f21444s != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x4.c cVar = new x4.c(hVar, list, 0, hVar2, iVar, dVar, z10);
                b5.h hVar3 = this.f21440m;
                this.f21439f = 1;
                obj = cVar.g(hVar3, this);
                if (obj == d10) {
                    return d10;
                }
            }
            return obj;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes.dex */
    public static final class f extends hc.a implements h0 {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f21445f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h0.a aVar, j jVar) {
            super(aVar);
            this.f21445f = jVar;
        }

        @Override // ad.h0
        public void handleException(hc.f fVar, Throwable th) {
            this.f21445f.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(Context context, b5.b bVar, dc.f<? extends MemoryCache> fVar, dc.f<? extends u4.a> fVar2, dc.f<? extends Call.Factory> fVar3, d.c cVar, q4.b bVar2, r rVar, u uVar) {
        List<x4.b> s02;
        this.f21407a = context;
        this.f21408b = bVar;
        this.f21409c = fVar;
        this.f21410d = fVar2;
        this.f21411e = fVar3;
        this.f21412f = cVar;
        this.f21413g = bVar2;
        this.f21414h = rVar;
        w wVar = new w(this, context, rVar.d());
        this.f21416j = wVar;
        p pVar = new p(this, wVar, null);
        this.f21417k = pVar;
        this.f21418l = bVar2.h().d(new z4.c(), HttpUrl.class).d(new z4.g(), String.class).d(new z4.b(), Uri.class).d(new z4.f(), Uri.class).d(new z4.e(), Integer.class).d(new z4.a(), byte[].class).c(new y4.c(), Uri.class).c(new y4.a(rVar.a()), File.class).b(new k.b(fVar3, fVar2, rVar.e()), Uri.class).b(new j.a(), File.class).b(new a.C0582a(), Uri.class).b(new e.a(), Uri.class).b(new l.b(), Uri.class).b(new f.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new d.c(rVar.c(), rVar.b())).e();
        s02 = b0.s0(getComponents().c(), new x4.a(this, pVar, null));
        this.f21419m = s02;
        this.f21420n = new AtomicBoolean(false);
        wVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2 A[Catch: all -> 0x01a2, TryCatch #2 {all -> 0x01a2, blocks: (B:42:0x00ec, B:44:0x00f2, B:46:0x00f8, B:49:0x0100, B:52:0x0108, B:54:0x011a, B:56:0x0120, B:57:0x0123, B:59:0x012c, B:60:0x012f, B:53:0x0116), top: B:96:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108 A[Catch: all -> 0x01a2, TryCatch #2 {all -> 0x01a2, blocks: (B:42:0x00ec, B:44:0x00f2, B:46:0x00f8, B:49:0x0100, B:52:0x0108, B:54:0x011a, B:56:0x0120, B:57:0x0123, B:59:0x012c, B:60:0x012f, B:53:0x0116), top: B:96:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116 A[Catch: all -> 0x01a2, TryCatch #2 {all -> 0x01a2, blocks: (B:42:0x00ec, B:44:0x00f2, B:46:0x00f8, B:49:0x0100, B:52:0x0108, B:54:0x011a, B:56:0x0120, B:57:0x0123, B:59:0x012c, B:60:0x012f, B:53:0x0116), top: B:96:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120 A[Catch: all -> 0x01a2, TryCatch #2 {all -> 0x01a2, blocks: (B:42:0x00ec, B:44:0x00f2, B:46:0x00f8, B:49:0x0100, B:52:0x0108, B:54:0x011a, B:56:0x0120, B:57:0x0123, B:59:0x012c, B:60:0x012f, B:53:0x0116), top: B:96:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[Catch: all -> 0x01a2, TryCatch #2 {all -> 0x01a2, blocks: (B:42:0x00ec, B:44:0x00f2, B:46:0x00f8, B:49:0x0100, B:52:0x0108, B:54:0x011a, B:56:0x0120, B:57:0x0123, B:59:0x012c, B:60:0x012f, B:53:0x0116), top: B:96:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:68:0x017f, B:70:0x0185, B:71:0x0190, B:73:0x0194), top: B:99:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:68:0x017f, B:70:0x0185, B:71:0x0190, B:73:0x0194), top: B:99:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6 A[Catch: all -> 0x01cb, TRY_LEAVE, TryCatch #3 {all -> 0x01cb, blocks: (B:82:0x01b2, B:84:0x01b6, B:87:0x01c7, B:88:0x01ca), top: B:98:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c7 A[Catch: all -> 0x01cb, TRY_ENTER, TryCatch #3 {all -> 0x01cb, blocks: (B:82:0x01b2, B:84:0x01b6, B:87:0x01c7, B:88:0x01ca), top: B:98:0x01b2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(b5.h r21, int r22, kotlin.coroutines.Continuation<? super b5.i> r23) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.j.g(b5.h, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void i(b5.h hVar, q4.d dVar) {
        dVar.b(hVar);
        h.b A = hVar.A();
        if (A != null) {
            A.b(hVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(b5.e r4, d5.b r5, q4.d r6) {
        /*
            r3 = this;
            b5.h r0 = r4.b()
            boolean r1 = r5 instanceof f5.d
            if (r1 != 0) goto Lb
            if (r5 == 0) goto L37
            goto L1e
        Lb:
            b5.h r1 = r4.b()
            f5.c$a r1 = r1.P()
            r2 = r5
            f5.d r2 = (f5.d) r2
            f5.c r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof f5.b
            if (r2 == 0) goto L26
        L1e:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.onError(r1)
            goto L37
        L26:
            b5.h r5 = r4.b()
            r6.g(r5, r1)
            r1.a()
            b5.h r5 = r4.b()
            r6.p(r5, r1)
        L37:
            r6.a(r0, r4)
            b5.h$b r5 = r0.A()
            if (r5 == 0) goto L43
            r5.a(r0, r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.j.j(b5.e, d5.b, q4.d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(b5.q r4, d5.b r5, q4.d r6) {
        /*
            r3 = this;
            b5.h r0 = r4.b()
            r4.c()
            boolean r1 = r5 instanceof f5.d
            if (r1 != 0) goto Le
            if (r5 == 0) goto L3a
            goto L21
        Le:
            b5.h r1 = r4.b()
            f5.c$a r1 = r1.P()
            r2 = r5
            f5.d r2 = (f5.d) r2
            f5.c r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof f5.b
            if (r2 == 0) goto L29
        L21:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.onSuccess(r1)
            goto L3a
        L29:
            b5.h r5 = r4.b()
            r6.g(r5, r1)
            r1.a()
            b5.h r5 = r4.b()
            r6.p(r5, r1)
        L3a:
            r6.c(r0, r4)
            b5.h$b r5 = r0.A()
            if (r5 == 0) goto L46
            r5.c(r0, r4)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.j.k(b5.q, d5.b, q4.d):void");
    }

    @Override // q4.g
    public Object a(b5.h hVar, Continuation<? super b5.i> continuation) {
        return l0.e(new c(hVar, this, null), continuation);
    }

    @Override // q4.g
    public b5.b b() {
        return this.f21408b;
    }

    @Override // q4.g
    public b5.d c(b5.h hVar) {
        r0<? extends b5.i> b10;
        b10 = ad.i.b(this.f21415i, null, null, new b(hVar, null), 3, null);
        if (hVar.M() instanceof d5.c) {
            return g5.l.l(((d5.c) hVar.M()).getView()).b(b10);
        }
        return new b5.k(b10);
    }

    @Override // q4.g
    public MemoryCache d() {
        return this.f21409c.getValue();
    }

    @Override // q4.g
    public q4.b getComponents() {
        return this.f21418l;
    }

    public final u h() {
        return null;
    }

    public final void l(int i10) {
        MemoryCache value;
        dc.f<MemoryCache> fVar = this.f21409c;
        if (fVar != null && (value = fVar.getValue()) != null) {
            value.b(i10);
        }
    }
}
