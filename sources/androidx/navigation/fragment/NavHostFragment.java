package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.b1;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.fragment.a;
import androidx.navigation.p;
import androidx.savedstate.a;
import dc.f;
import dc.w;
import k3.l;
import k3.o;
import k3.s;
import qc.h;
import qc.q;
import qc.r;

/* compiled from: NavHostFragment.kt */
/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {

    /* renamed from: r  reason: collision with root package name */
    public static final a f5264r = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final f f5265f;

    /* renamed from: m  reason: collision with root package name */
    private View f5266m;

    /* renamed from: p  reason: collision with root package name */
    private int f5267p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5268q;

    /* compiled from: NavHostFragment.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* compiled from: NavHostFragment.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements pc.a<l> {
        b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bundle d(l lVar) {
            q.i(lVar, "$this_apply");
            Bundle n02 = lVar.n0();
            if (n02 == null) {
                Bundle bundle = Bundle.EMPTY;
                q.h(bundle, "EMPTY");
                return bundle;
            }
            return n02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bundle e(NavHostFragment navHostFragment) {
            q.i(navHostFragment, "this$0");
            if (navHostFragment.f5267p != 0) {
                return e.a(dc.r.a("android-support-nav:fragment:graphId", Integer.valueOf(navHostFragment.f5267p)));
            }
            Bundle bundle = Bundle.EMPTY;
            q.h(bundle, "{\n                    Bu…e.EMPTY\n                }");
            return bundle;
        }

        @Override // pc.a
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            int i10;
            Bundle bundle;
            Context context = NavHostFragment.this.getContext();
            if (context != null) {
                q.h(context, "checkNotNull(context) {\n…nt is attached\"\n        }");
                final l lVar = new l(context);
                final NavHostFragment navHostFragment = NavHostFragment.this;
                lVar.r0(navHostFragment);
                b1 viewModelStore = navHostFragment.getViewModelStore();
                q.h(viewModelStore, "viewModelStore");
                lVar.s0(viewModelStore);
                navHostFragment.i(lVar);
                Bundle b10 = navHostFragment.getSavedStateRegistry().b("android-support-nav:fragment:navControllerState");
                if (b10 != null) {
                    lVar.l0(b10);
                }
                navHostFragment.getSavedStateRegistry().h("android-support-nav:fragment:navControllerState", new a.c() { // from class: androidx.navigation.fragment.c
                    @Override // androidx.savedstate.a.c
                    public final Bundle saveState() {
                        Bundle d10;
                        d10 = NavHostFragment.b.d(l.this);
                        return d10;
                    }
                });
                Bundle b11 = navHostFragment.getSavedStateRegistry().b("android-support-nav:fragment:graphId");
                if (b11 != null) {
                    navHostFragment.f5267p = b11.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.getSavedStateRegistry().h("android-support-nav:fragment:graphId", new a.c() { // from class: androidx.navigation.fragment.d
                    @Override // androidx.savedstate.a.c
                    public final Bundle saveState() {
                        Bundle e10;
                        e10 = NavHostFragment.b.e(NavHostFragment.this);
                        return e10;
                    }
                });
                if (navHostFragment.f5267p != 0) {
                    lVar.o0(navHostFragment.f5267p);
                } else {
                    Bundle arguments = navHostFragment.getArguments();
                    if (arguments != null) {
                        i10 = arguments.getInt("android-support-nav:fragment:graphId");
                    } else {
                        i10 = 0;
                    }
                    if (arguments != null) {
                        bundle = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
                    } else {
                        bundle = null;
                    }
                    if (i10 != 0) {
                        lVar.p0(i10, bundle);
                    }
                }
                return lVar;
            }
            throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
        }
    }

    public NavHostFragment() {
        f b10;
        b10 = dc.h.b(new b());
        this.f5265f = b10;
    }

    private final int e() {
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            return m3.d.f19739a;
        }
        return id2;
    }

    protected p<? extends a.c> d() {
        Context requireContext = requireContext();
        q.h(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        q.h(childFragmentManager, "childFragmentManager");
        return new androidx.navigation.fragment.a(requireContext, childFragmentManager, e());
    }

    public final androidx.navigation.d f() {
        return g();
    }

    public final l g() {
        return (l) this.f5265f.getValue();
    }

    protected void h(androidx.navigation.d dVar) {
        q.i(dVar, "navController");
        androidx.navigation.q I = dVar.I();
        Context requireContext = requireContext();
        q.h(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        q.h(childFragmentManager, "childFragmentManager");
        I.b(new DialogFragmentNavigator(requireContext, childFragmentManager));
        dVar.I().b(d());
    }

    protected void i(l lVar) {
        q.i(lVar, "navHostController");
        h(lVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        q.i(context, "context");
        super.onAttach(context);
        if (this.f5268q) {
            getParentFragmentManager().q().w(this).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        g();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f5268q = true;
            getParentFragmentManager().q().w(this).j();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        q.h(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(e());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f5266m;
        if (view != null && o.c(view) == g()) {
            o.f(view, null);
        }
        this.f5266m = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f19332g);
        q.h(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(s.f19333h, 0);
        if (resourceId != 0) {
            this.f5267p = resourceId;
        }
        w wVar = w.f13270a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, m3.e.f19744e);
        q.h(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(m3.e.f19745f, false)) {
            this.f5268q = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        q.i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.f5268q) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            o.f(view, g());
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                q.g(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                this.f5266m = view2;
                q.f(view2);
                if (view2.getId() == getId()) {
                    View view3 = this.f5266m;
                    q.f(view3);
                    o.f(view3, g());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }
}
