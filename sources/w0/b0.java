package w0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* compiled from: AutofillCallback.android.kt */
/* loaded from: classes.dex */
public final class b0 extends AutofillManager.AutofillCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f25251a = new b0();

    private b0() {
    }

    public final void a(e eVar) {
        qc.q.i(eVar, "autofill");
        eVar.a().registerCallback(y.a(this));
    }

    public final void b(e eVar) {
        qc.q.i(eVar, "autofill");
        eVar.a().unregisterCallback(y.a(this));
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i10, int i11) {
        String str;
        qc.q.i(view, "view");
        super.onAutofillEvent(view, i10, i11);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }
}
