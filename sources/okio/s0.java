package okio;

/* compiled from: PeekSource.kt */
/* loaded from: classes4.dex */
public final class s0 implements Source {

    /* renamed from: f  reason: collision with root package name */
    private final e f20673f;

    /* renamed from: m  reason: collision with root package name */
    private final c f20674m;

    /* renamed from: p  reason: collision with root package name */
    private v0 f20675p;

    /* renamed from: q  reason: collision with root package name */
    private int f20676q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f20677r;

    /* renamed from: s  reason: collision with root package name */
    private long f20678s;

    public s0(e eVar) {
        int i10;
        qc.q.i(eVar, "upstream");
        this.f20673f = eVar;
        c a10 = eVar.a();
        this.f20674m = a10;
        v0 v0Var = a10.f20602f;
        this.f20675p = v0Var;
        if (v0Var != null) {
            i10 = v0Var.f20688b;
        } else {
            i10 = -1;
        }
        this.f20676q = i10;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20677r = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r5 == r6.f20688b) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(okio.c r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            qc.q.i(r9, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 < 0) goto Lf
            r5 = 1
            goto L10
        Lf:
            r5 = 0
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f20677r
            r5 = r5 ^ r1
            if (r5 == 0) goto L7b
            okio.v0 r5 = r8.f20675p
            if (r5 == 0) goto L2a
            okio.c r6 = r8.f20674m
            okio.v0 r6 = r6.f20602f
            if (r5 != r6) goto L2b
            int r5 = r8.f20676q
            qc.q.f(r6)
            int r6 = r6.f20688b
            if (r5 != r6) goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L6f
            if (r4 != 0) goto L30
            return r2
        L30:
            okio.e r0 = r8.f20673f
            long r1 = r8.f20678s
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.m0(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            okio.v0 r0 = r8.f20675p
            if (r0 != 0) goto L53
            okio.c r0 = r8.f20674m
            okio.v0 r0 = r0.f20602f
            if (r0 == 0) goto L53
            r8.f20675p = r0
            qc.q.f(r0)
            int r0 = r0.f20688b
            r8.f20676q = r0
        L53:
            okio.c r0 = r8.f20674m
            long r0 = r0.s0()
            long r2 = r8.f20678s
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.c r2 = r8.f20674m
            long r4 = r8.f20678s
            r3 = r9
            r6 = r10
            r2.j(r3, r4, r6)
            long r0 = r8.f20678s
            long r0 = r0 + r10
            r8.f20678s = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.s0.read(okio.c, long):long");
    }

    @Override // okio.Source
    public a1 timeout() {
        return this.f20673f.timeout();
    }
}
