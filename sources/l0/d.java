package l0;

import java.util.List;
import qc.q;

/* compiled from: ImmutableList.kt */
/* loaded from: classes.dex */
public interface d<E> extends List<E>, b<E>, rc.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImmutableList.kt */
    /* loaded from: classes.dex */
    public static final class a<E> extends ec.c<E> implements d<E> {

        /* renamed from: m  reason: collision with root package name */
        private final d<E> f19478m;

        /* renamed from: p  reason: collision with root package name */
        private final int f19479p;

        /* renamed from: q  reason: collision with root package name */
        private final int f19480q;

        /* renamed from: r  reason: collision with root package name */
        private int f19481r;

        /* JADX WARN: Multi-variable type inference failed */
        public a(d<? extends E> dVar, int i10, int i11) {
            q.i(dVar, "source");
            this.f19478m = dVar;
            this.f19479p = i10;
            this.f19480q = i11;
            p0.d.c(i10, i11, dVar.size());
            this.f19481r = i11 - i10;
        }

        @Override // ec.a
        public int a() {
            return this.f19481r;
        }

        @Override // ec.c, java.util.List
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public d<E> subList(int i10, int i11) {
            p0.d.c(i10, i11, this.f19481r);
            d<E> dVar = this.f19478m;
            int i12 = this.f19479p;
            return new a(dVar, i10 + i12, i12 + i11);
        }

        @Override // ec.c, java.util.List
        public E get(int i10) {
            p0.d.a(i10, this.f19481r);
            return this.f19478m.get(this.f19479p + i10);
        }
    }
}
