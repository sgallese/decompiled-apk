package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes.dex */
public class y extends androidx.fragment.app.k {
    public y() {
    }

    @Override // androidx.fragment.app.k
    public Dialog onCreateDialog(Bundle bundle) {
        return new x(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.k
    public void setupDialog(Dialog dialog, int i10) {
        if (dialog instanceof x) {
            x xVar = (x) dialog;
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            xVar.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i10);
    }

    public y(int i10) {
        super(i10);
    }
}
