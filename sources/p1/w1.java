package p1;

import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: JvmTreeSet.jvm.kt */
/* loaded from: classes.dex */
public final class w1<E> extends TreeSet<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Comparator<? super E> comparator) {
        super(comparator);
        qc.q.i(comparator, "comparator");
    }

    public /* bridge */ int a() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
