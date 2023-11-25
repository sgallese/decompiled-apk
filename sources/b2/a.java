package b2;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: AndroidTextInputServicePlugin.kt */
/* loaded from: classes.dex */
public final class a implements b0<C0177a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7736a = new a();

    /* compiled from: AndroidTextInputServicePlugin.kt */
    /* renamed from: b2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0177a implements a0 {

        /* renamed from: a  reason: collision with root package name */
        private final l0 f7737a;

        /* renamed from: b  reason: collision with root package name */
        private final n0 f7738b;

        public C0177a(l0 l0Var, n0 n0Var) {
            qc.q.i(l0Var, "service");
            qc.q.i(n0Var, "androidService");
            this.f7737a = l0Var;
            this.f7738b = n0Var;
        }

        @Override // b2.a0
        public InputConnection a(EditorInfo editorInfo) {
            qc.q.i(editorInfo, "outAttrs");
            return this.f7738b.l(editorInfo);
        }

        public final l0 b() {
            return this.f7737a;
        }
    }

    private a() {
    }

    @Override // b2.b0
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public C0177a a(z zVar, View view) {
        qc.q.i(zVar, "platformTextInput");
        qc.q.i(view, "view");
        n0 n0Var = new n0(view, zVar);
        return new C0177a(new l0(n0Var), n0Var);
    }
}
