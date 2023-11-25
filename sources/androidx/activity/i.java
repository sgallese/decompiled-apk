package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.d1;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.x;

/* compiled from: ComponentDialog.kt */
/* loaded from: classes.dex */
public class i extends Dialog implements v, o, w3.d {
    private x _lifecycleRegistry;
    private final OnBackPressedDispatcher onBackPressedDispatcher;
    private final w3.c savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        this(context, 0, 2, null);
        qc.q.i(context, "context");
    }

    private final x getLifecycleRegistry() {
        x xVar = this._lifecycleRegistry;
        if (xVar == null) {
            x xVar2 = new x(this);
            this._lifecycleRegistry = xVar2;
            return xVar2;
        }
        return xVar;
    }

    private final void initViewTreeOwners() {
        Window window = getWindow();
        qc.q.f(window);
        View decorView = window.getDecorView();
        qc.q.h(decorView, "window!!.decorView");
        d1.b(decorView, this);
        Window window2 = getWindow();
        qc.q.f(window2);
        View decorView2 = window2.getDecorView();
        qc.q.h(decorView2, "window!!.decorView");
        r.b(decorView2, this);
        Window window3 = getWindow();
        qc.q.f(window3);
        View decorView3 = window3.getDecorView();
        qc.q.h(decorView3, "window!!.decorView");
        w3.e.b(decorView3, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher$lambda$1(i iVar) {
        qc.q.i(iVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        qc.q.i(view, "view");
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.v
    public androidx.lifecycle.p getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // androidx.activity.o
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // w3.d
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            qc.q.h(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.f(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(bundle);
        getLifecycleRegistry().i(p.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        qc.q.h(onSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().i(p.a.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry().i(p.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        initViewTreeOwners();
        super.setContentView(i10);
    }

    public /* synthetic */ i(Context context, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, int i10) {
        super(context, i10);
        qc.q.i(context, "context");
        this.savedStateRegistryController = w3.c.f25360d.a(this);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.h
            @Override // java.lang.Runnable
            public final void run() {
                i.onBackPressedDispatcher$lambda$1(i.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        qc.q.i(view, "view");
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        qc.q.i(view, "view");
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
