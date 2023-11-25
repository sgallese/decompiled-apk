package g1;

import android.view.View;
import g1.b;
import qc.q;

/* compiled from: PlatformHapticFeedback.android.kt */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final View f16007a;

    public c(View view) {
        q.i(view, "view");
        this.f16007a = view;
    }

    @Override // g1.a
    public void a(int i10) {
        b.a aVar = b.f16006a;
        if (b.b(i10, aVar.a())) {
            this.f16007a.performHapticFeedback(0);
        } else if (b.b(i10, aVar.b())) {
            this.f16007a.performHapticFeedback(9);
        }
    }
}
