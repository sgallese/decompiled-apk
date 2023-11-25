package r1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import qc.q;

/* compiled from: PrimaryTextActionModeCallback.android.kt */
/* loaded from: classes.dex */
public final class c implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final d f22063a;

    public c(d dVar) {
        q.i(dVar, "callback");
        this.f22063a = dVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f22063a.d(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f22063a.e(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f22063a.f();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f22063a.g(actionMode, menu);
    }
}
