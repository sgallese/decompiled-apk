package t4;

import android.graphics.ImageDecoder;
import android.graphics.PostProcessor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import t4.i;
import t4.o0;

/* compiled from: ImageDecoderDecoder.kt */
/* loaded from: classes.dex */
public final class g0 implements i {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f23560a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f23561b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f23562c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageDecoderDecoder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", l = {50, 90}, m = "decode")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23564f;

        /* renamed from: m  reason: collision with root package name */
        Object f23565m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f23566p;

        /* renamed from: r  reason: collision with root package name */
        int f23568r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23566p = obj;
            this.f23568r |= RecyclerView.UNDEFINED_DURATION;
            return g0.this.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageDecoderDecoder.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.a<Drawable> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ qc.b0 f23570m;

        /* compiled from: ImageDecoder.kt */
        /* loaded from: classes.dex */
        public static final class a implements ImageDecoder.OnHeaderDecodedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ qc.f0 f23571a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g0 f23572b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ qc.b0 f23573c;

            public a(qc.f0 f0Var, g0 g0Var, qc.b0 b0Var) {
                this.f23571a = f0Var;
                this.f23572b = g0Var;
                this.f23573c = b0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                Size size;
                int h10;
                int h11;
                boolean z10;
                int c10;
                int c11;
                qc.q.i(imageDecoder, "decoder");
                qc.q.i(imageInfo, "info");
                qc.q.i(source, "source");
                this.f23571a.f21676f = imageDecoder;
                size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                c5.i o10 = this.f23572b.f23561b.o();
                c5.h n10 = this.f23572b.f23561b.n();
                if (c5.b.a(o10)) {
                    h10 = width;
                } else {
                    h10 = g5.h.h(o10.b(), n10);
                }
                c5.i o11 = this.f23572b.f23561b.o();
                c5.h n11 = this.f23572b.f23561b.n();
                if (c5.b.a(o11)) {
                    h11 = height;
                } else {
                    h11 = g5.h.h(o11.a(), n11);
                }
                if (width > 0 && height > 0 && (width != h10 || height != h11)) {
                    double c12 = h.c(width, height, h10, h11, this.f23572b.f23561b.n());
                    qc.b0 b0Var = this.f23573c;
                    if (c12 < 1.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b0Var.f21657f = z10;
                    if (z10 || !this.f23572b.f23561b.c()) {
                        c10 = sc.c.c(width * c12);
                        c11 = sc.c.c(c12 * height);
                        imageDecoder.setTargetSize(c10, c11);
                    }
                }
                this.f23572b.h(imageDecoder);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(qc.b0 b0Var) {
            super(0);
            this.f23570m = b0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Drawable invoke() {
            Drawable decodeDrawable;
            qc.f0 f0Var = new qc.f0();
            g0 g0Var = g0.this;
            o0 k10 = g0Var.k(g0Var.f23560a);
            try {
                decodeDrawable = ImageDecoder.decodeDrawable(g0.this.i(k10), h0.a(new a(f0Var, g0.this, this.f23570m)));
                qc.q.h(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
                return decodeDrawable;
            } finally {
                ImageDecoder a10 = j0.a(f0Var.f21676f);
                if (a10 != null) {
                    a10.close();
                }
                k10.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageDecoderDecoder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", l = {158}, m = "wrapDrawable")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23574f;

        /* renamed from: m  reason: collision with root package name */
        Object f23575m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f23576p;

        /* renamed from: r  reason: collision with root package name */
        int f23578r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23576p = obj;
            this.f23578r |= RecyclerView.UNDEFINED_DURATION;
            return g0.this.j(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageDecoderDecoder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.decode.ImageDecoderDecoder$wrapDrawable$2", f = "ImageDecoderDecoder.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f23579f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Drawable f23580m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f23581p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f23582q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Drawable drawable, pc.a<dc.w> aVar, pc.a<dc.w> aVar2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f23580m = drawable;
            this.f23581p = aVar;
            this.f23582q = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new e(this.f23580m, this.f23581p, this.f23582q, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f23579f == 0) {
                dc.n.b(obj);
                x.a(this.f23580m).registerAnimationCallback(g5.h.b(this.f23581p, this.f23582q));
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public g0(o0 o0Var, b5.l lVar, boolean z10) {
        this.f23560a = o0Var;
        this.f23561b = lVar;
        this.f23562c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(ImageDecoder imageDecoder) {
        int i10;
        PostProcessor postProcessor;
        if (g5.h.g(this.f23561b.f())) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        imageDecoder.setAllocator(i10);
        imageDecoder.setMemorySizePolicy(!this.f23561b.d());
        if (this.f23561b.e() != null) {
            imageDecoder.setTargetColorSpace(this.f23561b.e());
        }
        imageDecoder.setUnpremultipliedRequired(!this.f23561b.m());
        e5.a a10 = b5.f.a(this.f23561b.l());
        if (a10 != null) {
            postProcessor = g5.h.d(a10);
        } else {
            postProcessor = null;
        }
        imageDecoder.setPostProcessor(postProcessor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageDecoder.Source i(o0 o0Var) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        ImageDecoder.Source createSource3;
        ImageDecoder.Source createSource4;
        ImageDecoder.Source createSource5;
        ImageDecoder.Source createSource6;
        ImageDecoder.Source createSource7;
        okio.r0 c10 = o0Var.c();
        if (c10 != null) {
            createSource7 = ImageDecoder.createSource(c10.p());
            return createSource7;
        }
        o0.a d10 = o0Var.d();
        if (d10 instanceof t4.a) {
            createSource6 = ImageDecoder.createSource(this.f23561b.g().getAssets(), ((t4.a) d10).a());
            return createSource6;
        } else if (d10 instanceof t4.e) {
            createSource5 = ImageDecoder.createSource(this.f23561b.g().getContentResolver(), ((t4.e) d10).a());
            return createSource5;
        } else {
            if (d10 instanceof q0) {
                q0 q0Var = (q0) d10;
                if (qc.q.d(q0Var.b(), this.f23561b.g().getPackageName())) {
                    createSource4 = ImageDecoder.createSource(this.f23561b.g().getResources(), q0Var.c());
                    return createSource4;
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                createSource3 = ImageDecoder.createSource(o0Var.e().A());
                return createSource3;
            } else if (i10 == 30) {
                createSource2 = ImageDecoder.createSource(ByteBuffer.wrap(o0Var.e().A()));
                return createSource2;
            } else {
                createSource = ImageDecoder.createSource(o0Var.b().p());
                return createSource;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.graphics.drawable.Drawable r8, kotlin.coroutines.Continuation<? super android.graphics.drawable.Drawable> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof t4.g0.d
            if (r0 == 0) goto L13
            r0 = r9
            t4.g0$d r0 = (t4.g0.d) r0
            int r1 = r0.f23578r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23578r = r1
            goto L18
        L13:
            t4.g0$d r0 = new t4.g0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f23576p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23578r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f23575m
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            java.lang.Object r0 = r0.f23574f
            t4.g0 r0 = (t4.g0) r0
            dc.n.b(r9)
            goto L92
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            dc.n.b(r9)
            boolean r9 = t4.s.a(r8)
            if (r9 != 0) goto L43
            return r8
        L43:
            android.graphics.drawable.AnimatedImageDrawable r9 = t4.x.a(r8)
            b5.l r2 = r7.f23561b
            b5.m r2 = r2.l()
            java.lang.Integer r2 = b5.f.d(r2)
            if (r2 == 0) goto L58
            int r2 = r2.intValue()
            goto L59
        L58:
            r2 = -1
        L59:
            t4.y.a(r9, r2)
            b5.l r9 = r7.f23561b
            b5.m r9 = r9.l()
            pc.a r9 = b5.f.c(r9)
            b5.l r2 = r7.f23561b
            b5.m r2 = r2.l()
            pc.a r2 = b5.f.b(r2)
            if (r9 != 0) goto L77
            if (r2 == 0) goto L75
            goto L77
        L75:
            r0 = r7
            goto L92
        L77:
            ad.i2 r4 = ad.a1.c()
            ad.i2 r4 = r4.N0()
            t4.g0$e r5 = new t4.g0$e
            r6 = 0
            r5.<init>(r8, r9, r2, r6)
            r0.f23574f = r7
            r0.f23575m = r8
            r0.f23578r = r3
            java.lang.Object r9 = ad.g.g(r4, r5, r0)
            if (r9 != r1) goto L75
            return r1
        L92:
            v4.d r9 = new v4.d
            b5.l r0 = r0.f23561b
            c5.h r0 = r0.n()
            r9.<init>(r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.g0.j(android.graphics.drawable.Drawable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 k(o0 o0Var) {
        if (this.f23562c && q.c(h.f23583a, o0Var.e())) {
            return p0.a(okio.l0.d(new p(o0Var.e())), this.f23561b.g());
        }
        return o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    @Override // t4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super t4.g> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof t4.g0.b
            if (r0 == 0) goto L13
            r0 = r8
            t4.g0$b r0 = (t4.g0.b) r0
            int r1 = r0.f23568r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23568r = r1
            goto L18
        L13:
            t4.g0$b r0 = new t4.g0$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23566p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23568r
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f23564f
            qc.b0 r0 = (qc.b0) r0
            dc.n.b(r8)
            goto L73
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f23565m
            qc.b0 r2 = (qc.b0) r2
            java.lang.Object r5 = r0.f23564f
            t4.g0 r5 = (t4.g0) r5
            dc.n.b(r8)
            goto L63
        L45:
            dc.n.b(r8)
            qc.b0 r8 = new qc.b0
            r8.<init>()
            t4.g0$c r2 = new t4.g0$c
            r2.<init>(r8)
            r0.f23564f = r7
            r0.f23565m = r8
            r0.f23568r = r5
            java.lang.Object r2 = ad.t1.c(r4, r2, r0, r5, r4)
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r5 = r7
            r6 = r2
            r2 = r8
            r8 = r6
        L63:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            r0.f23564f = r2
            r0.f23565m = r4
            r0.f23568r = r3
            java.lang.Object r8 = r5.j(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r0 = r2
        L73:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            boolean r0 = r0.f21657f
            t4.g r1 = new t4.g
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.g0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: ImageDecoderDecoder.kt */
    /* loaded from: classes.dex */
    public static final class a implements i.a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f23563a;

        public a(boolean z10) {
            this.f23563a = z10;
        }

        private final boolean b(okio.e eVar) {
            h hVar = h.f23583a;
            if (!q.c(hVar, eVar) && !q.b(hVar, eVar) && (Build.VERSION.SDK_INT < 30 || !q.a(hVar, eVar))) {
                return false;
            }
            return true;
        }

        @Override // t4.i.a
        public i a(w4.m mVar, b5.l lVar, q4.g gVar) {
            if (!b(mVar.b().e())) {
                return null;
            }
            return new g0(mVar.b(), lVar, this.f23563a);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }

        public /* synthetic */ a(boolean z10, int i10, qc.h hVar) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }
}
