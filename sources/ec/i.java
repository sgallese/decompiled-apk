package ec;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.util.Collection;
import java.util.Set;

/* compiled from: AbstractSet.kt */
/* loaded from: classes4.dex */
public abstract class i<E> extends ec.a<E> implements Set<E> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f14178f = new a(null);

    /* compiled from: AbstractSet.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final boolean a(Set<?> set, Set<?> set2) {
            qc.q.i(set, "c");
            qc.q.i(set2, TaskSetupFragment.TYPE_OTHER);
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(Collection<?> collection) {
            int i10;
            qc.q.i(collection, "c");
            int i11 = 0;
            for (Object obj : collection) {
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                i11 += i10;
            }
            return i11;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return f14178f.a(this, (Set) obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f14178f.b(this);
    }
}
