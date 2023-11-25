package t4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import okio.Source;
import t4.i;
import t4.o0;

/* compiled from: BitmapFactoryDecoder.kt */
/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: e  reason: collision with root package name */
    public static final a f23543e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final o0 f23544a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f23545b;

    /* renamed from: c  reason: collision with root package name */
    private final jd.d f23546c;

    /* renamed from: d  reason: collision with root package name */
    private final l f23547d;

    /* compiled from: BitmapFactoryDecoder.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BitmapFactoryDecoder.kt */
    /* loaded from: classes.dex */
    public static final class b extends okio.m {

        /* renamed from: f  reason: collision with root package name */
        private Exception f23548f;

        public b(Source source) {
            super(source);
        }

        public final Exception b() {
            return this.f23548f;
        }

        @Override // okio.m, okio.Source
        public long read(okio.c cVar, long j10) {
            try {
                return super.read(cVar, j10);
            } catch (Exception e10) {
                this.f23548f = e10;
                throw e10;
            }
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    /* loaded from: classes.dex */
    public static final class c implements i.a {

        /* renamed from: a  reason: collision with root package name */
        private final l f23549a;

        /* renamed from: b  reason: collision with root package name */
        private final jd.d f23550b;

        public c(int i10, l lVar) {
            this.f23549a = lVar;
            this.f23550b = jd.f.b(i10, 0, 2, null);
        }

        @Override // t4.i.a
        public i a(w4.m mVar, b5.l lVar, q4.g gVar) {
            return new d(mVar.b(), lVar, this.f23550b, this.f23549a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapFactoryDecoder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {232, 46}, m = "decode")
    /* renamed from: t4.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0550d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23551f;

        /* renamed from: m  reason: collision with root package name */
        Object f23552m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f23553p;

        /* renamed from: r  reason: collision with root package name */
        int f23555r;

        C0550d(Continuation<? super C0550d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23553p = obj;
            this.f23555r |= RecyclerView.UNDEFINED_DURATION;
            return d.this.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapFactoryDecoder.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.a<g> {
        e() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return d.this.e(new BitmapFactory.Options());
        }
    }

    public d(o0 o0Var, b5.l lVar, jd.d dVar, l lVar2) {
        this.f23544a = o0Var;
        this.f23545b = lVar;
        this.f23546c = dVar;
        this.f23547d = lVar2;
    }

    private final void c(BitmapFactory.Options options, j jVar) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config f10 = this.f23545b.f();
        if (jVar.b() || n.a(jVar)) {
            f10 = g5.a.e(f10);
        }
        if (this.f23545b.d() && f10 == Bitmap.Config.ARGB_8888 && qc.q.d(options.outMimeType, "image/jpeg")) {
            f10 = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            config = options.outConfig;
            config2 = Bitmap.Config.RGBA_F16;
            if (config == config2) {
                config3 = Bitmap.Config.HARDWARE;
                if (f10 != config3) {
                    f10 = Bitmap.Config.RGBA_F16;
                }
            }
        }
        options.inPreferredConfig = f10;
    }

    private final void d(BitmapFactory.Options options, j jVar) {
        int i10;
        int i11;
        int A;
        int A2;
        int c10;
        int c11;
        o0.a d10 = this.f23544a.d();
        if ((d10 instanceof q0) && c5.b.a(this.f23545b.o())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((q0) d10).a();
            options.inTargetDensity = this.f23545b.g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        boolean z10 = false;
        if (options.outWidth > 0 && options.outHeight > 0) {
            if (n.b(jVar)) {
                i10 = options.outHeight;
            } else {
                i10 = options.outWidth;
            }
            if (n.b(jVar)) {
                i11 = options.outWidth;
            } else {
                i11 = options.outHeight;
            }
            c5.i o10 = this.f23545b.o();
            c5.h n10 = this.f23545b.n();
            if (c5.b.a(o10)) {
                A = i10;
            } else {
                A = g5.l.A(o10.b(), n10);
            }
            c5.i o11 = this.f23545b.o();
            c5.h n11 = this.f23545b.n();
            if (c5.b.a(o11)) {
                A2 = i11;
            } else {
                A2 = g5.l.A(o11.a(), n11);
            }
            int a10 = h.a(i10, i11, A, A2, this.f23545b.n());
            options.inSampleSize = a10;
            double b10 = h.b(i10 / a10, i11 / a10, A, A2, this.f23545b.n());
            if (this.f23545b.c()) {
                b10 = vc.l.f(b10, 1.0d);
            }
            if (b10 == 1.0d) {
                z10 = true;
            }
            boolean z11 = !z10;
            options.inScaled = z11;
            if (z11) {
                if (b10 > 1.0d) {
                    c11 = sc.c.c(Integer.MAX_VALUE / b10);
                    options.inDensity = c11;
                    options.inTargetDensity = Integer.MAX_VALUE;
                    return;
                }
                options.inDensity = Integer.MAX_VALUE;
                c10 = sc.c.c(Integer.MAX_VALUE * b10);
                options.inTargetDensity = c10;
                return;
            }
            return;
        }
        options.inSampleSize = 1;
        options.inScaled = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g e(BitmapFactory.Options options) {
        b bVar = new b(this.f23544a.e());
        okio.e d10 = okio.l0.d(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(d10.L0().U0(), null, options);
        Exception b10 = bVar.b();
        if (b10 == null) {
            options.inJustDecodeBounds = false;
            m mVar = m.f23591a;
            j a10 = mVar.a(options.outMimeType, d10, this.f23547d);
            Exception b11 = bVar.b();
            if (b11 == null) {
                options.inMutable = false;
                if (Build.VERSION.SDK_INT >= 26 && this.f23545b.e() != null) {
                    options.inPreferredColorSpace = this.f23545b.e();
                }
                options.inPremultiplied = this.f23545b.m();
                c(options, a10);
                d(options, a10);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(d10.U0(), null, options);
                    nc.b.a(d10, null);
                    Exception b12 = bVar.b();
                    if (b12 == null) {
                        if (decodeStream != null) {
                            decodeStream.setDensity(this.f23545b.g().getResources().getDisplayMetrics().densityDpi);
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f23545b.g().getResources(), mVar.b(decodeStream, a10));
                            if (options.inSampleSize <= 1 && !options.inScaled) {
                                z10 = false;
                            }
                            return new g(bitmapDrawable, z10);
                        }
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                    }
                    throw b12;
                } finally {
                }
            } else {
                throw b11;
            }
        } else {
            throw b10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // t4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super t4.g> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof t4.d.C0550d
            if (r0 == 0) goto L13
            r0 = r8
            t4.d$d r0 = (t4.d.C0550d) r0
            int r1 = r0.f23555r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23555r = r1
            goto L18
        L13:
            t4.d$d r0 = new t4.d$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23553p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23555r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f23551f
            jd.d r0 = (jd.d) r0
            dc.n.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f23552m
            jd.d r2 = (jd.d) r2
            java.lang.Object r5 = r0.f23551f
            t4.d r5 = (t4.d) r5
            dc.n.b(r8)
            r8 = r2
            goto L5a
        L47:
            dc.n.b(r8)
            jd.d r8 = r7.f23546c
            r0.f23551f = r7
            r0.f23552m = r8
            r0.f23555r = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r7
        L5a:
            t4.d$e r2 = new t4.d$e     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.f23551f = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.f23552m = r5     // Catch: java.lang.Throwable -> L76
            r0.f23555r = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = ad.t1.c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            t4.g r8 = (t4.g) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.d.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
