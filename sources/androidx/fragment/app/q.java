package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.b;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class q extends ComponentActivity implements b.h, b.i {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.x mFragmentLifecycleRegistry;
    final t mFragments;
    boolean mResumed;
    boolean mStopped;

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    class a extends v<q> implements androidx.core.content.c, androidx.core.content.d, androidx.core.app.s, androidx.core.app.t, c1, androidx.activity.o, androidx.activity.result.c, w3.d, f0, androidx.core.view.u {
        public a() {
            super(q.this);
        }

        @Override // androidx.fragment.app.f0
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            q.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.u
        public void addMenuProvider(androidx.core.view.a0 a0Var) {
            q.this.addMenuProvider(a0Var);
        }

        @Override // androidx.core.content.c
        public void addOnConfigurationChangedListener(androidx.core.util.a<Configuration> aVar) {
            q.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.s
        public void addOnMultiWindowModeChangedListener(androidx.core.util.a<androidx.core.app.j> aVar) {
            q.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.t
        public void addOnPictureInPictureModeChangedListener(androidx.core.util.a<androidx.core.app.v> aVar) {
            q.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.d
        public void addOnTrimMemoryListener(androidx.core.util.a<Integer> aVar) {
            q.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.v, androidx.fragment.app.s
        public View c(int i10) {
            return q.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.v, androidx.fragment.app.s
        public boolean d() {
            Window window = q.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.activity.result.c
        public ActivityResultRegistry getActivityResultRegistry() {
            return q.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.v
        public androidx.lifecycle.p getLifecycle() {
            return q.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.o
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return q.this.getOnBackPressedDispatcher();
        }

        @Override // w3.d
        public androidx.savedstate.a getSavedStateRegistry() {
            return q.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.c1
        public b1 getViewModelStore() {
            return q.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.v
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            q.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.v
        public LayoutInflater j() {
            return q.this.getLayoutInflater().cloneInContext(q.this);
        }

        @Override // androidx.fragment.app.v
        public boolean l(String str) {
            return androidx.core.app.b.y(q.this, str);
        }

        @Override // androidx.fragment.app.v
        public void o() {
            p();
        }

        public void p() {
            q.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.v
        /* renamed from: q  reason: merged with bridge method [inline-methods] */
        public q i() {
            return q.this;
        }

        @Override // androidx.core.view.u
        public void removeMenuProvider(androidx.core.view.a0 a0Var) {
            q.this.removeMenuProvider(a0Var);
        }

        @Override // androidx.core.content.c
        public void removeOnConfigurationChangedListener(androidx.core.util.a<Configuration> aVar) {
            q.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.s
        public void removeOnMultiWindowModeChangedListener(androidx.core.util.a<androidx.core.app.j> aVar) {
            q.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.t
        public void removeOnPictureInPictureModeChangedListener(androidx.core.util.a<androidx.core.app.v> aVar) {
            q.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.d
        public void removeOnTrimMemoryListener(androidx.core.util.a<Integer> aVar) {
            q.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public q() {
        this.mFragments = t.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.x(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new a.c() { // from class: androidx.fragment.app.m
            @Override // androidx.savedstate.a.c
            public final Bundle saveState() {
                Bundle lambda$init$0;
                lambda$init$0 = q.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new androidx.core.util.a() { // from class: androidx.fragment.app.n
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                q.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new androidx.core.util.a() { // from class: androidx.fragment.app.o
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                q.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new e.b() { // from class: androidx.fragment.app.p
            @Override // e.b
            public final void onContextAvailable(Context context) {
                q.this.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.i(p.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.a(null);
    }

    private static boolean markState(FragmentManager fragmentManager, p.b bVar) {
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z10 |= markState(fragment.getChildFragmentManager(), bVar);
                }
                o0 o0Var = fragment.mViewLifecycleOwner;
                if (o0Var != null && o0Var.getLifecycle().b().isAtLeast(p.b.STARTED)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    z10 = true;
                }
                if (fragment.mLifecycleRegistry.b().isAtLeast(p.b.STARTED)) {
                    fragment.mLifecycleRegistry.o(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.l().Y(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), p.b.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(p.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.i(p.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.i(p.a.ON_PAUSE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(p.a.ON_RESUME);
        this.mFragments.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.i(p.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.i(p.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.x xVar) {
        androidx.core.app.b.w(this, xVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.x xVar) {
        androidx.core.app.b.x(this, xVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.b.A(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.q(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.s(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.B(this);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.z(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public q(int i10) {
        super(i10);
        this.mFragments = t.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.x(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.core.app.b.i
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
