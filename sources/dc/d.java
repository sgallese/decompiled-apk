package dc;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes4.dex */
public final class d implements Comparable<d> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f13243r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public static final d f13244s = e.a();

    /* renamed from: f  reason: collision with root package name */
    private final int f13245f;

    /* renamed from: m  reason: collision with root package name */
    private final int f13246m;

    /* renamed from: p  reason: collision with root package name */
    private final int f13247p;

    /* renamed from: q  reason: collision with root package name */
    private final int f13248q;

    /* compiled from: KotlinVersion.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public d(int i10, int i11, int i12) {
        this.f13245f = i10;
        this.f13246m = i11;
        this.f13247p = i12;
        this.f13248q = d(i10, i11, i12);
    }

    private final int d(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new vc.f(0, 255).m(i10) && new vc.f(0, 255).m(i11) && new vc.f(0, 255).m(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        qc.q.i(dVar, TaskSetupFragment.TYPE_OTHER);
        return this.f13248q - dVar.f13248q;
    }

    public boolean equals(Object obj) {
        d dVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar != null && this.f13248q == dVar.f13248q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f13248q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13245f);
        sb2.append('.');
        sb2.append(this.f13246m);
        sb2.append('.');
        sb2.append(this.f13247p);
        return sb2.toString();
    }
}
