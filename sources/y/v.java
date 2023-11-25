package y;

import j0.g3;
import j0.j1;
import j0.y2;

/* compiled from: LazyLayoutNearestRangeState.kt */
/* loaded from: classes.dex */
public final class v implements g3<vc.f> {

    /* renamed from: r  reason: collision with root package name */
    private static final a f26145r = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final int f26146f;

    /* renamed from: m  reason: collision with root package name */
    private final int f26147m;

    /* renamed from: p  reason: collision with root package name */
    private final j1 f26148p;

    /* renamed from: q  reason: collision with root package name */
    private int f26149q;

    /* compiled from: LazyLayoutNearestRangeState.kt */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final vc.f b(int i10, int i11, int i12) {
            vc.f s10;
            int i13 = (i10 / i11) * i11;
            s10 = vc.l.s(Math.max(i13 - i12, 0), i13 + i11 + i12);
            return s10;
        }
    }

    public v(int i10, int i11, int i12) {
        this.f26146f = i11;
        this.f26147m = i12;
        this.f26148p = y2.h(f26145r.b(i10, i11, i12), y2.o());
        this.f26149q = i10;
    }

    private void f(vc.f fVar) {
        this.f26148p.setValue(fVar);
    }

    @Override // j0.g3
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public vc.f getValue() {
        return (vc.f) this.f26148p.getValue();
    }

    public final void j(int i10) {
        if (i10 != this.f26149q) {
            this.f26149q = i10;
            f(f26145r.b(i10, this.f26146f, this.f26147m));
        }
    }
}
