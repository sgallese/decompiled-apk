package yc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
/* loaded from: classes4.dex */
public final class e implements xc.g<vc.f> {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f26311a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26312b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26313c;

    /* renamed from: d  reason: collision with root package name */
    private final pc.p<CharSequence, Integer, dc.l<Integer, Integer>> f26314d;

    /* compiled from: Strings.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<vc.f>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f26315f = -1;

        /* renamed from: m  reason: collision with root package name */
        private int f26316m;

        /* renamed from: p  reason: collision with root package name */
        private int f26317p;

        /* renamed from: q  reason: collision with root package name */
        private vc.f f26318q;

        /* renamed from: r  reason: collision with root package name */
        private int f26319r;

        a() {
            int l10;
            l10 = vc.l.l(e.this.f26312b, 0, e.this.f26311a.length());
            this.f26316m = l10;
            this.f26317p = l10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r0 < r6.f26320s.f26313c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f26317p
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f26315f = r1
                r0 = 0
                r6.f26318q = r0
                goto L9e
            Lc:
                yc.e r0 = yc.e.this
                int r0 = yc.e.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f26319r
                int r0 = r0 + r3
                r6.f26319r = r0
                yc.e r4 = yc.e.this
                int r4 = yc.e.e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f26317p
                yc.e r4 = yc.e.this
                java.lang.CharSequence r4 = yc.e.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                vc.f r0 = new vc.f
                int r1 = r6.f26316m
                yc.e r4 = yc.e.this
                java.lang.CharSequence r4 = yc.e.d(r4)
                int r4 = yc.m.R(r4)
                r0.<init>(r1, r4)
                r6.f26318q = r0
                r6.f26317p = r2
                goto L9c
            L47:
                yc.e r0 = yc.e.this
                pc.p r0 = yc.e.c(r0)
                yc.e r4 = yc.e.this
                java.lang.CharSequence r4 = yc.e.d(r4)
                int r5 = r6.f26317p
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                dc.l r0 = (dc.l) r0
                if (r0 != 0) goto L77
                vc.f r0 = new vc.f
                int r1 = r6.f26316m
                yc.e r4 = yc.e.this
                java.lang.CharSequence r4 = yc.e.d(r4)
                int r4 = yc.m.R(r4)
                r0.<init>(r1, r4)
                r6.f26318q = r0
                r6.f26317p = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f26316m
                vc.f r4 = vc.j.s(r4, r2)
                r6.f26318q = r4
                int r2 = r2 + r0
                r6.f26316m = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f26317p = r2
            L9c:
                r6.f26315f = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yc.e.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public vc.f next() {
            if (this.f26315f == -1) {
                a();
            }
            if (this.f26315f != 0) {
                vc.f fVar = this.f26318q;
                qc.q.g(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f26318q = null;
                this.f26315f = -1;
                return fVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26315f == -1) {
                a();
            }
            if (this.f26315f == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, int i10, int i11, pc.p<? super CharSequence, ? super Integer, dc.l<Integer, Integer>> pVar) {
        qc.q.i(charSequence, "input");
        qc.q.i(pVar, "getNextMatch");
        this.f26311a = charSequence;
        this.f26312b = i10;
        this.f26313c = i11;
        this.f26314d = pVar;
    }

    @Override // xc.g
    public Iterator<vc.f> iterator() {
        return new a();
    }
}
