package f5;

import b5.e;
import b5.i;
import b5.q;
import f5.c;

/* compiled from: NoneTransition.kt */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final d f15448a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15449b;

    /* compiled from: NoneTransition.kt */
    /* loaded from: classes.dex */
    public static final class a implements c.a {
        @Override // f5.c.a
        public c a(d dVar, i iVar) {
            return new b(dVar, iVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(d dVar, i iVar) {
        this.f15448a = dVar;
        this.f15449b = iVar;
    }

    @Override // f5.c
    public void a() {
        i iVar = this.f15449b;
        if (iVar instanceof q) {
            this.f15448a.onSuccess(((q) iVar).a());
        } else if (iVar instanceof e) {
            this.f15448a.onError(iVar.a());
        }
    }
}
