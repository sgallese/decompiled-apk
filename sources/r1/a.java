package r1;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import qc.q;
import z0.h;

/* compiled from: FloatingTextActionModeCallback.android.kt */
/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    private final d f22060a;

    public a(d dVar) {
        q.i(dVar, "callback");
        this.f22060a = dVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f22060a.d(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f22060a.e(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f22060a.f();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        h c10 = this.f22060a.c();
        if (rect != null) {
            rect.set((int) c10.i(), (int) c10.l(), (int) c10.j(), (int) c10.e());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f22060a.g(actionMode, menu);
    }
}
