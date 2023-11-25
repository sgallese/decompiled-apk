package g2;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.util.ArrayList;
import java.util.List;
import v1.e0;

/* compiled from: TextDecoration.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16065b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final k f16066c = new k(0);

    /* renamed from: d  reason: collision with root package name */
    private static final k f16067d = new k(1);

    /* renamed from: e  reason: collision with root package name */
    private static final k f16068e = new k(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f16069a;

    /* compiled from: TextDecoration.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final k a(List<k> list) {
            qc.q.i(list, "decorations");
            Integer num = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                num = Integer.valueOf(num.intValue() | list.get(i10).e());
            }
            return new k(num.intValue());
        }

        public final k b() {
            return k.f16068e;
        }

        public final k c() {
            return k.f16066c;
        }

        public final k d() {
            return k.f16067d;
        }
    }

    public k(int i10) {
        this.f16069a = i10;
    }

    public final boolean d(k kVar) {
        qc.q.i(kVar, TaskSetupFragment.TYPE_OTHER);
        int i10 = this.f16069a;
        if ((kVar.f16069a | i10) == i10) {
            return true;
        }
        return false;
    }

    public final int e() {
        return this.f16069a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && this.f16069a == ((k) obj).f16069a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f16069a;
    }

    public String toString() {
        if (this.f16069a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f16069a & f16067d.f16069a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f16069a & f16068e.f16069a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + e0.d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
