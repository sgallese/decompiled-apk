package s0;

import java.util.ArrayList;
import java.util.List;
import pc.l;
import pc.p;
import qc.k0;
import qc.q;
import qc.r;

/* compiled from: ListSaver.kt */
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    /* compiled from: ListSaver.kt */
    /* renamed from: s0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0525a<Original> extends r implements p<k, Original, Object> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<k, Original, List<Saveable>> f22891f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0525a(p<? super k, ? super Original, ? extends List<? extends Saveable>> pVar) {
            super(2);
            this.f22891f = pVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Original original) {
            q.i(kVar, "$this$Saver");
            List list = (List) this.f22891f.invoke(kVar, original);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                if (obj != null && !kVar.a(obj)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            List list2 = list;
            if ((!list2.isEmpty()) != false) {
                return new ArrayList(list2);
            }
            return null;
        }
    }

    public static final <Original, Saveable> i<Original, Object> a(p<? super k, ? super Original, ? extends List<? extends Saveable>> pVar, l<? super List<? extends Saveable>, ? extends Original> lVar) {
        q.i(pVar, "save");
        q.i(lVar, "restore");
        return j.a(new C0525a(pVar), (l) k0.e(lVar, 1));
    }
}
