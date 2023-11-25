package androidx.paging;

/* compiled from: NullPaddedListDiffHelper.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f6094a = new u();

    private u() {
    }

    private final void a(androidx.recyclerview.widget.r rVar, int i10, int i11, int i12, int i13, Object obj) {
        int i14 = i10 - i12;
        if (i14 > 0) {
            rVar.d(i12, i14, obj);
        }
        int i15 = i13 - i11;
        if (i15 > 0) {
            rVar.d(i11, i15, obj);
        }
    }

    public final <T> void b(androidx.recyclerview.widget.r rVar, a1<T> a1Var, a1<T> a1Var2) {
        int h10;
        int h11;
        int h12;
        int h13;
        qc.q.i(rVar, "callback");
        qc.q.i(a1Var, "oldList");
        qc.q.i(a1Var2, "newList");
        int max = Math.max(a1Var.g(), a1Var2.g());
        int min = Math.min(a1Var.g() + a1Var.f(), a1Var2.g() + a1Var2.f());
        int i10 = min - max;
        if (i10 > 0) {
            rVar.b(max, i10);
            rVar.a(max, i10);
        }
        int min2 = Math.min(max, min);
        int max2 = Math.max(max, min);
        h10 = vc.l.h(a1Var.g(), a1Var2.getSize());
        h11 = vc.l.h(a1Var.g() + a1Var.f(), a1Var2.getSize());
        a(rVar, min2, max2, h10, h11, t.ITEM_TO_PLACEHOLDER);
        h12 = vc.l.h(a1Var2.g(), a1Var.getSize());
        h13 = vc.l.h(a1Var2.g() + a1Var2.f(), a1Var.getSize());
        a(rVar, min2, max2, h12, h13, t.PLACEHOLDER_TO_ITEM);
        int size = a1Var2.getSize() - a1Var.getSize();
        if (size > 0) {
            rVar.a(a1Var.getSize(), size);
        } else if (size < 0) {
            rVar.b(a1Var.getSize() + size, -size);
        }
    }
}
