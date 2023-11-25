package b2;

import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* compiled from: InputMethodManager.kt */
/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    private final View f7838a;

    /* renamed from: b  reason: collision with root package name */
    private final dc.f f7839b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.compose.ui.platform.coreshims.g f7840c;

    /* compiled from: InputMethodManager.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = s.this.f7838a.getContext().getSystemService("input_method");
            qc.q.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public s(View view) {
        dc.f a10;
        qc.q.i(view, "view");
        this.f7838a = view;
        a10 = dc.h.a(dc.j.NONE, new a());
        this.f7839b = a10;
        this.f7840c = new androidx.compose.ui.platform.coreshims.g(view);
    }

    private final InputMethodManager g() {
        return (InputMethodManager) this.f7839b.getValue();
    }

    @Override // b2.r
    public void a(int i10, ExtractedText extractedText) {
        qc.q.i(extractedText, "extractedText");
        g().updateExtractedText(this.f7838a, i10, extractedText);
    }

    @Override // b2.r
    public void b(int i10, int i11, int i12, int i13) {
        g().updateSelection(this.f7838a, i10, i11, i12, i13);
    }

    @Override // b2.r
    public void c() {
        g().restartInput(this.f7838a);
    }

    @Override // b2.r
    public void d() {
        this.f7840c.a();
    }

    @Override // b2.r
    public void e() {
        this.f7840c.b();
    }
}
