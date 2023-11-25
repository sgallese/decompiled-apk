package f5;

import android.graphics.drawable.Drawable;
import b5.e;
import b5.i;
import b5.q;
import f5.c;
import qc.h;
import t.k;
import t4.f;

/* compiled from: CrossfadeTransition.kt */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final d f15442a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15443b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15444c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15445d;

    /* compiled from: CrossfadeTransition.kt */
    /* renamed from: f5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0372a implements c.a {

        /* renamed from: c  reason: collision with root package name */
        private final int f15446c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f15447d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0372a() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f5.a.C0372a.<init>():void");
        }

        @Override // f5.c.a
        public c a(d dVar, i iVar) {
            if (!(iVar instanceof q)) {
                return c.a.f15451b.a(dVar, iVar);
            }
            if (((q) iVar).c() == f.MEMORY_CACHE) {
                return c.a.f15451b.a(dVar, iVar);
            }
            return new a(dVar, iVar, this.f15446c, this.f15447d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0372a) {
                C0372a c0372a = (C0372a) obj;
                if (this.f15446c == c0372a.f15446c && this.f15447d == c0372a.f15447d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f15446c * 31) + k.a(this.f15447d);
        }

        public C0372a(int i10, boolean z10) {
            this.f15446c = i10;
            this.f15447d = z10;
            if (!(i10 > 0)) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        public /* synthetic */ C0372a(int i10, boolean z10, int i11, h hVar) {
            this((i11 & 1) != 0 ? 100 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }

    public a(d dVar, i iVar, int i10, boolean z10) {
        boolean z11;
        this.f15442a = dVar;
        this.f15443b = iVar;
        this.f15444c = i10;
        this.f15445d = z10;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    @Override // f5.c
    public void a() {
        boolean z10;
        Drawable a10 = this.f15442a.a();
        Drawable a11 = this.f15443b.a();
        c5.h J = this.f15443b.b().J();
        int i10 = this.f15444c;
        i iVar = this.f15443b;
        if ((iVar instanceof q) && ((q) iVar).d()) {
            z10 = false;
        } else {
            z10 = true;
        }
        v4.b bVar = new v4.b(a10, a11, J, i10, z10, this.f15445d);
        i iVar2 = this.f15443b;
        if (iVar2 instanceof q) {
            this.f15442a.onSuccess(bVar);
        } else if (iVar2 instanceof e) {
            this.f15442a.onError(bVar);
        }
    }

    public final int b() {
        return this.f15444c;
    }

    public final boolean c() {
        return this.f15445d;
    }
}
