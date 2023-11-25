package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.c1;
import androidx.lifecycle.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final x f4692a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f4693b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f4694c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4695d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f4696e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4699a;

        static {
            int[] iArr = new int[p.b.values().length];
            f4699a = iArr;
            try {
                iArr[p.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4699a[p.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4699a[p.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4699a[p.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(x xVar, j0 j0Var, Fragment fragment) {
        this.f4692a = xVar;
        this.f4693b = j0Var;
        this.f4694c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f4694c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4694c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        Bundle bundle;
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4694c);
        }
        Bundle bundle2 = this.f4694c.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        this.f4694c.performActivityCreated(bundle);
        this.f4692a.a(this.f4694c, bundle, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Fragment m02 = FragmentManager.m0(this.f4694c.mContainer);
        Fragment parentFragment = this.f4694c.getParentFragment();
        if (m02 != null && !m02.equals(parentFragment)) {
            Fragment fragment = this.f4694c;
            f3.b.o(fragment, m02, fragment.mContainerId);
        }
        int j10 = this.f4693b.j(this.f4694c);
        Fragment fragment2 = this.f4694c;
        fragment2.mContainer.addView(fragment2.mView, j10);
    }

    void c() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4694c);
        }
        Fragment fragment = this.f4694c;
        Fragment fragment2 = fragment.mTarget;
        h0 h0Var = null;
        if (fragment2 != null) {
            h0 n10 = this.f4693b.n(fragment2.mWho);
            if (n10 != null) {
                Fragment fragment3 = this.f4694c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                h0Var = n10;
            } else {
                throw new IllegalStateException("Fragment " + this.f4694c + " declared target fragment " + this.f4694c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (h0Var = this.f4693b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4694c + " declared target fragment " + this.f4694c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (h0Var != null) {
            h0Var.m();
        }
        Fragment fragment4 = this.f4694c;
        fragment4.mHost = fragment4.mFragmentManager.z0();
        Fragment fragment5 = this.f4694c;
        fragment5.mParentFragment = fragment5.mFragmentManager.C0();
        this.f4692a.g(this.f4694c, false);
        this.f4694c.performAttach();
        this.f4692a.b(this.f4694c, false);
    }

    int d() {
        t0.c.a aVar;
        Fragment fragment = this.f4694c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i10 = this.f4696e;
        int i11 = b.f4699a[fragment.mMaxState.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        i10 = Math.min(i10, -1);
                    } else {
                        i10 = Math.min(i10, 0);
                    }
                } else {
                    i10 = Math.min(i10, 1);
                }
            } else {
                i10 = Math.min(i10, 5);
            }
        }
        Fragment fragment2 = this.f4694c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i10 = Math.max(this.f4696e, 2);
                View view = this.f4694c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f4696e < 4 ? Math.min(i10, fragment2.mState) : Math.min(i10, 1);
            }
        }
        if (!this.f4694c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        Fragment fragment3 = this.f4694c;
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            aVar = t0.r(viewGroup, fragment3.getParentFragmentManager()).p(this);
        } else {
            aVar = null;
        }
        if (aVar == t0.c.a.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (aVar == t0.c.a.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f4694c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        Fragment fragment5 = this.f4694c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f4694c);
        }
        return i10;
    }

    void e() {
        Bundle bundle;
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4694c);
        }
        Bundle bundle2 = this.f4694c.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        Fragment fragment = this.f4694c;
        if (!fragment.mIsCreated) {
            this.f4692a.h(fragment, bundle, false);
            this.f4694c.performCreate(bundle);
            this.f4692a.c(this.f4694c, bundle, false);
            return;
        }
        fragment.mState = 1;
        fragment.restoreChildFragmentState();
    }

    void f() {
        Bundle bundle;
        String str;
        if (this.f4694c.mFromLayout) {
            return;
        }
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4694c);
        }
        Bundle bundle2 = this.f4694c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = this.f4694c.performGetLayoutInflater(bundle);
        Fragment fragment = this.f4694c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) fragment.mFragmentManager.t0().c(this.f4694c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment2 = this.f4694c;
                        if (!fragment2.mRestored) {
                            try {
                                str = fragment2.getResources().getResourceName(this.f4694c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4694c.mContainerId) + " (" + str + ") for fragment " + this.f4694c);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        f3.b.n(this.f4694c, viewGroup);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4694c + " for a container view with no id");
                }
            }
        }
        Fragment fragment3 = this.f4694c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (this.f4694c.mView != null) {
            if (FragmentManager.M0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f4694c);
            }
            this.f4694c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f4694c;
            fragment4.mView.setTag(e3.b.f14018a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f4694c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (androidx.core.view.p0.X(this.f4694c.mView)) {
                androidx.core.view.p0.r0(this.f4694c.mView);
            } else {
                View view = this.f4694c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f4694c.performViewCreated();
            x xVar = this.f4692a;
            Fragment fragment6 = this.f4694c;
            xVar.m(fragment6, fragment6.mView, bundle, false);
            int visibility = this.f4694c.mView.getVisibility();
            this.f4694c.setPostOnViewCreatedAlpha(this.f4694c.mView.getAlpha());
            Fragment fragment7 = this.f4694c;
            if (fragment7.mContainer != null && visibility == 0) {
                View findFocus = fragment7.mView.findFocus();
                if (findFocus != null) {
                    this.f4694c.setFocusedView(findFocus);
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4694c);
                    }
                }
                this.f4694c.mView.setAlpha(0.0f);
            }
        }
        this.f4694c.mState = 2;
    }

    void g() {
        boolean z10;
        boolean z11;
        Fragment f10;
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4694c);
        }
        Fragment fragment = this.f4694c;
        boolean z12 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Fragment fragment2 = this.f4694c;
            if (!fragment2.mBeingSaved) {
                this.f4693b.B(fragment2.mWho, null);
            }
        }
        if (!z10 && !this.f4693b.p().n(this.f4694c)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            v<?> vVar = this.f4694c.mHost;
            if (vVar instanceof c1) {
                z12 = this.f4693b.p().k();
            } else if (vVar.f() instanceof Activity) {
                z12 = true ^ ((Activity) vVar.f()).isChangingConfigurations();
            }
            if ((z10 && !this.f4694c.mBeingSaved) || z12) {
                this.f4693b.p().c(this.f4694c);
            }
            this.f4694c.performDestroy();
            this.f4692a.d(this.f4694c, false);
            for (h0 h0Var : this.f4693b.k()) {
                if (h0Var != null) {
                    Fragment k10 = h0Var.k();
                    if (this.f4694c.mWho.equals(k10.mTargetWho)) {
                        k10.mTarget = this.f4694c;
                        k10.mTargetWho = null;
                    }
                }
            }
            Fragment fragment3 = this.f4694c;
            String str = fragment3.mTargetWho;
            if (str != null) {
                fragment3.mTarget = this.f4693b.f(str);
            }
            this.f4693b.s(this);
            return;
        }
        String str2 = this.f4694c.mTargetWho;
        if (str2 != null && (f10 = this.f4693b.f(str2)) != null && f10.mRetainInstance) {
            this.f4694c.mTarget = f10;
        }
        this.f4694c.mState = 0;
    }

    void h() {
        View view;
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4694c);
        }
        Fragment fragment = this.f4694c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f4694c.performDestroyView();
        this.f4692a.n(this.f4694c, false);
        Fragment fragment2 = this.f4694c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.p(null);
        this.f4694c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4694c);
        }
        this.f4694c.performDetach();
        boolean z10 = false;
        this.f4692a.e(this.f4694c, false);
        Fragment fragment = this.f4694c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f4693b.p().n(this.f4694c)) {
            if (FragmentManager.M0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4694c);
            }
            this.f4694c.initState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        Bundle bundle;
        Fragment fragment = this.f4694c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.M0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4694c);
            }
            Bundle bundle2 = this.f4694c.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            Fragment fragment2 = this.f4694c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle), null, bundle);
            View view = this.f4694c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4694c;
                fragment3.mView.setTag(e3.b.f14018a, fragment3);
                Fragment fragment4 = this.f4694c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4694c.performViewCreated();
                x xVar = this.f4692a;
                Fragment fragment5 = this.f4694c;
                xVar.m(fragment5, fragment5.mView, bundle, false);
                this.f4694c.mState = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k() {
        return this.f4694c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4695d) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f4695d = true;
            boolean z10 = false;
            while (true) {
                int d10 = d();
                Fragment fragment = this.f4694c;
                int i10 = fragment.mState;
                if (d10 != i10) {
                    if (d10 > i10) {
                        switch (i10 + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                    t0.r(viewGroup3, fragment.getParentFragmentManager()).f(t0.c.b.from(this.f4694c.mView.getVisibility()), this);
                                }
                                this.f4694c.mState = 4;
                                continue;
                            case 5:
                                u();
                                continue;
                            case 6:
                                fragment.mState = 6;
                                continue;
                            case 7:
                                p();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i10 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                if (fragment.mBeingSaved && this.f4693b.q(fragment.mWho) == null) {
                                    this.f4693b.B(this.f4694c.mWho, r());
                                }
                                g();
                                continue;
                            case 1:
                                h();
                                this.f4694c.mState = 1;
                                continue;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                continue;
                            case 3:
                                if (FragmentManager.M0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4694c);
                                }
                                Fragment fragment2 = this.f4694c;
                                if (fragment2.mBeingSaved) {
                                    this.f4693b.B(fragment2.mWho, r());
                                } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                    s();
                                }
                                Fragment fragment3 = this.f4694c;
                                if (fragment3.mView != null && (viewGroup2 = fragment3.mContainer) != null) {
                                    t0.r(viewGroup2, fragment3.getParentFragmentManager()).h(this);
                                }
                                this.f4694c.mState = 3;
                                continue;
                            case 4:
                                v();
                                continue;
                            case 5:
                                fragment.mState = 5;
                                continue;
                            case 6:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z10 = true;
                } else {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f4694c.mBeingSaved) {
                        if (FragmentManager.M0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f4694c);
                        }
                        this.f4693b.p().c(this.f4694c);
                        this.f4693b.s(this);
                        if (FragmentManager.M0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f4694c);
                        }
                        this.f4694c.initState();
                    }
                    Fragment fragment4 = this.f4694c;
                    if (fragment4.mHiddenChanged) {
                        if (fragment4.mView != null && (viewGroup = fragment4.mContainer) != null) {
                            t0 r10 = t0.r(viewGroup, fragment4.getParentFragmentManager());
                            if (this.f4694c.mHidden) {
                                r10.g(this);
                            } else {
                                r10.i(this);
                            }
                        }
                        Fragment fragment5 = this.f4694c;
                        FragmentManager fragmentManager = fragment5.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.K0(fragment5);
                        }
                        Fragment fragment6 = this.f4694c;
                        fragment6.mHiddenChanged = false;
                        fragment6.onHiddenChanged(fragment6.mHidden);
                        this.f4694c.mChildFragmentManager.K();
                    }
                    return;
                }
            }
        } finally {
            this.f4695d = false;
        }
    }

    void n() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4694c);
        }
        this.f4694c.performPause();
        this.f4692a.f(this.f4694c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f4694c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f4694c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f4694c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        Fragment fragment = this.f4694c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        Fragment fragment2 = this.f4694c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) this.f4694c.mSavedFragmentState.getParcelable("state");
        if (fragmentState != null) {
            Fragment fragment3 = this.f4694c;
            fragment3.mTargetWho = fragmentState.f4656y;
            fragment3.mTargetRequestCode = fragmentState.f4657z;
            Boolean bool = fragment3.mSavedUserVisibleHint;
            if (bool != null) {
                fragment3.mUserVisibleHint = bool.booleanValue();
                this.f4694c.mSavedUserVisibleHint = null;
            } else {
                fragment3.mUserVisibleHint = fragmentState.A;
            }
        }
        Fragment fragment4 = this.f4694c;
        if (!fragment4.mUserVisibleHint) {
            fragment4.mDeferStart = true;
        }
    }

    void p() {
        String str;
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4694c);
        }
        View focusedView = this.f4694c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.M0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.f4694c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4694c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f4694c.setFocusedView(null);
        this.f4694c.performResume();
        this.f4692a.i(this.f4694c, false);
        this.f4693b.B(this.f4694c.mWho, null);
        Fragment fragment = this.f4694c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment.SavedState q() {
        if (this.f4694c.mState > -1) {
            return new Fragment.SavedState(r());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f4694c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f4694c));
        if (this.f4694c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f4694c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f4692a.j(this.f4694c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f4694c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle U0 = this.f4694c.mChildFragmentManager.U0();
            if (!U0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", U0);
            }
            if (this.f4694c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f4694c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f4694c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f4694c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void s() {
        if (this.f4694c.mView == null) {
            return;
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f4694c + " with view " + this.f4694c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4694c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4694c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4694c.mViewLifecycleOwner.e(bundle);
        if (!bundle.isEmpty()) {
            this.f4694c.mSavedViewRegistryState = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10) {
        this.f4696e = i10;
    }

    void u() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4694c);
        }
        this.f4694c.performStart();
        this.f4692a.k(this.f4694c, false);
    }

    void v() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4694c);
        }
        this.f4694c.performStop();
        this.f4692a.l(this.f4694c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(x xVar, j0 j0Var, ClassLoader classLoader, u uVar, Bundle bundle) {
        this.f4692a = xVar;
        this.f4693b = j0Var;
        Fragment a10 = ((FragmentState) bundle.getParcelable("state")).a(uVar, classLoader);
        this.f4694c = a10;
        a10.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.setArguments(bundle2);
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(x xVar, j0 j0Var, Fragment fragment, Bundle bundle) {
        this.f4692a = xVar;
        this.f4693b = j0Var;
        this.f4694c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f4697f;

        a(View view) {
            this.f4697f = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4697f.removeOnAttachStateChangeListener(this);
            androidx.core.view.p0.r0(this.f4697f);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
