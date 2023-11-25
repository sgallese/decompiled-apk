package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.q;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class x extends androidx.activity.i implements e {
    private g mDelegate;
    private final q.a mKeyDispatcher;

    public x(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(g.a.f15715z, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.q.e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().j(i10);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.i(this, this);
        }
        return this.mDelegate;
    }

    public a getSupportActionBar() {
        return getDelegate().s();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().t();
        super.onCreate(bundle);
        getDelegate().y(bundle);
    }

    @Override // androidx.activity.i, android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().E();
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void setContentView(int i10) {
        getDelegate().J(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().Q(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().H(i10);
    }

    public x(Context context, int i10) {
        super(context, getThemeResId(context, i10));
        this.mKeyDispatcher = new q.a() { // from class: androidx.appcompat.app.w
            @Override // androidx.core.view.q.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return x.this.superDispatchKeyEvent(keyEvent);
            }
        };
        g delegate = getDelegate();
        delegate.P(getThemeResId(context, i10));
        delegate.y(null);
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void setContentView(View view) {
        getDelegate().K(view);
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().L(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        getDelegate().Q(getContext().getString(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x(Context context, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new q.a() { // from class: androidx.appcompat.app.w
            @Override // androidx.core.view.q.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return x.this.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }
}
