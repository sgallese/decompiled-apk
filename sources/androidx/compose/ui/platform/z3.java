package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* compiled from: AndroidTextToolbar.android.kt */
/* loaded from: classes.dex */
public final class z3 {

    /* renamed from: a  reason: collision with root package name */
    public static final z3 f3008a = new z3();

    private z3() {
    }

    public final void a(ActionMode actionMode) {
        qc.q.i(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i10) {
        ActionMode startActionMode;
        qc.q.i(view, "view");
        qc.q.i(callback, "actionModeCallback");
        startActionMode = view.startActionMode(callback, i10);
        return startActionMode;
    }
}
