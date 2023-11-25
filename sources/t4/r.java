package t4;

import ad.t1;
import android.graphics.Bitmap;
import android.graphics.Movie;
import kotlin.coroutines.Continuation;
import t4.i;

/* compiled from: GifDecoder.kt */
/* loaded from: classes.dex */
public final class r implements i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f23619d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final o0 f23620a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f23621b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f23622c;

    /* compiled from: GifDecoder.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: GifDecoder.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.a<g> {
        c() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            okio.e e10;
            boolean z10;
            Bitmap.Config f10;
            int i10;
            if (r.this.f23622c) {
                e10 = okio.l0.d(new p(r.this.f23620a.e()));
            } else {
                e10 = r.this.f23620a.e();
            }
            try {
                Movie decodeStream = Movie.decodeStream(e10.U0());
                nc.b.a(e10, null);
                if (decodeStream != null && decodeStream.width() > 0 && decodeStream.height() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (decodeStream.isOpaque() && r.this.f23621b.d()) {
                        f10 = Bitmap.Config.RGB_565;
                    } else if (g5.h.g(r.this.f23621b.f())) {
                        f10 = Bitmap.Config.ARGB_8888;
                    } else {
                        f10 = r.this.f23621b.f();
                    }
                    v4.c cVar = new v4.c(decodeStream, f10, r.this.f23621b.n());
                    Integer d10 = b5.f.d(r.this.f23621b.l());
                    if (d10 != null) {
                        i10 = d10.intValue();
                    } else {
                        i10 = -1;
                    }
                    cVar.e(i10);
                    pc.a<dc.w> c10 = b5.f.c(r.this.f23621b.l());
                    pc.a<dc.w> b10 = b5.f.b(r.this.f23621b.l());
                    if (c10 != null || b10 != null) {
                        cVar.c(g5.h.c(c10, b10));
                    }
                    cVar.d(b5.f.a(r.this.f23621b.l()));
                    return new g(cVar, false);
                }
                throw new IllegalStateException("Failed to decode GIF.".toString());
            } finally {
            }
        }
    }

    public r(o0 o0Var, b5.l lVar, boolean z10) {
        this.f23620a = o0Var;
        this.f23621b = lVar;
        this.f23622c = z10;
    }

    @Override // t4.i
    public Object a(Continuation<? super g> continuation) {
        return t1.c(null, new c(), continuation, 1, null);
    }

    /* compiled from: GifDecoder.kt */
    /* loaded from: classes.dex */
    public static final class b implements i.a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f23623a;

        public b(boolean z10) {
            this.f23623a = z10;
        }

        @Override // t4.i.a
        public i a(w4.m mVar, b5.l lVar, q4.g gVar) {
            if (!q.c(h.f23583a, mVar.b().e())) {
                return null;
            }
            return new r(mVar.b(), lVar, this.f23623a);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return b.class.hashCode();
        }

        public /* synthetic */ b(boolean z10, int i10, qc.h hVar) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }
}
