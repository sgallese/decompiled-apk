package c0;

import android.view.InputDevice;
import android.view.KeyEvent;

/* compiled from: TextFieldFocusModifier.android.kt */
/* loaded from: classes.dex */
public final class j0 {

    /* compiled from: TextFieldFocusModifier.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<i1.b, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0.g f8449f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t0 f8450m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0.g gVar, t0 t0Var) {
            super(1);
            this.f8449f = gVar;
            this.f8450m = t0Var;
        }

        public final Boolean a(KeyEvent keyEvent) {
            qc.q.i(keyEvent, "keyEvent");
            InputDevice device = keyEvent.getDevice();
            boolean z10 = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && i1.c.e(i1.d.b(keyEvent), i1.c.f16951a.a())) {
                if (j0.c(keyEvent, 19)) {
                    z10 = this.f8449f.j(androidx.compose.ui.focus.d.f2368b.h());
                } else if (j0.c(keyEvent, 20)) {
                    z10 = this.f8449f.j(androidx.compose.ui.focus.d.f2368b.a());
                } else if (j0.c(keyEvent, 21)) {
                    z10 = this.f8449f.j(androidx.compose.ui.focus.d.f2368b.d());
                } else if (j0.c(keyEvent, 22)) {
                    z10 = this.f8449f.j(androidx.compose.ui.focus.d.f2368b.g());
                } else if (j0.c(keyEvent, 23)) {
                    b2.r0 e10 = this.f8450m.e();
                    if (e10 != null) {
                        e10.e();
                    }
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(i1.b bVar) {
            return a(bVar.f());
        }
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, t0 t0Var, y0.g gVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(t0Var, "state");
        qc.q.i(gVar, "focusManager");
        return androidx.compose.ui.input.key.a.b(eVar, new a(gVar, t0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i10) {
        if (i1.f.b(i1.d.a(keyEvent)) == i10) {
            return true;
        }
        return false;
    }
}
