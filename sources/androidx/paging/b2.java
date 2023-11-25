package androidx.paging;

import androidx.paging.n1;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RecordingCallback.kt */
/* loaded from: classes.dex */
public final class b2 extends n1.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5419b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final List<Integer> f5420a = new ArrayList();

    /* compiled from: RecordingCallback.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    @Override // androidx.paging.n1.b
    public void a(int i10, int i11) {
        this.f5420a.add(0);
        this.f5420a.add(Integer.valueOf(i10));
        this.f5420a.add(Integer.valueOf(i11));
    }

    @Override // androidx.paging.n1.b
    public void b(int i10, int i11) {
        this.f5420a.add(1);
        this.f5420a.add(Integer.valueOf(i10));
        this.f5420a.add(Integer.valueOf(i11));
    }

    @Override // androidx.paging.n1.b
    public void c(int i10, int i11) {
        this.f5420a.add(2);
        this.f5420a.add(Integer.valueOf(i10));
        this.f5420a.add(Integer.valueOf(i11));
    }

    public final void d(n1.b bVar) {
        vc.f s10;
        vc.d r10;
        qc.q.i(bVar, TaskSetupFragment.TYPE_OTHER);
        s10 = vc.l.s(0, this.f5420a.size());
        r10 = vc.l.r(s10, 3);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (true) {
                int intValue = this.f5420a.get(h10).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            bVar.c(this.f5420a.get(h10 + 1).intValue(), this.f5420a.get(h10 + 2).intValue());
                        } else {
                            throw new IllegalStateException("Unexpected recording value");
                        }
                    } else {
                        bVar.b(this.f5420a.get(h10 + 1).intValue(), this.f5420a.get(h10 + 2).intValue());
                    }
                } else {
                    bVar.a(this.f5420a.get(h10 + 1).intValue(), this.f5420a.get(h10 + 2).intValue());
                }
                if (h10 == i10) {
                    break;
                }
                h10 += j10;
            }
        }
        this.f5420a.clear();
    }
}
