package l5;

import dc.f;
import dc.h;
import qc.q;
import qc.r;

/* compiled from: AndroidLoggerProvider.kt */
/* loaded from: classes.dex */
public final class b implements p5.c {

    /* renamed from: a  reason: collision with root package name */
    private final f f19551a;

    /* compiled from: AndroidLoggerProvider.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<n5.b> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f19552f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final n5.b invoke() {
            return new n5.b();
        }
    }

    public b() {
        f b10;
        b10 = h.b(a.f19552f);
        this.f19551a = b10;
    }

    private final m5.a b() {
        return (m5.a) this.f19551a.getValue();
    }

    @Override // p5.c
    public m5.a a(p5.a aVar) {
        q.i(aVar, "amplitude");
        return b();
    }
}
