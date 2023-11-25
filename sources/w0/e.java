package w0;

import android.view.View;
import android.view.autofill.AutofillManager;

/* compiled from: AndroidAutofill.android.kt */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final View f25258a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f25259b;

    /* renamed from: c  reason: collision with root package name */
    private final AutofillManager f25260c;

    public e(View view, d0 d0Var) {
        Object systemService;
        qc.q.i(view, "view");
        qc.q.i(d0Var, "autofillTree");
        this.f25258a = view;
        this.f25259b = d0Var;
        systemService = view.getContext().getSystemService(a.a());
        AutofillManager a10 = c.a(systemService);
        if (a10 != null) {
            this.f25260c = a10;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    public final AutofillManager a() {
        return this.f25260c;
    }

    public final d0 b() {
        return this.f25259b;
    }

    public final View c() {
        return this.f25258a;
    }
}
