package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceFragmentCompat.java */
/* loaded from: classes.dex */
public abstract class h extends Fragment implements k.c, k.a, k.b, DialogPreference.a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private k mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final d mDividerDecoration = new d();
    private int mLayoutResId = q.f6364c;
    private final Handler mHandler = new a(Looper.getMainLooper());
    private final Runnable mRequestFocus = new b();

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                h.this.bindPreferences();
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = h.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Preference f6291f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f6292m;

        c(Preference preference, String str) {
            this.f6291f = preference;
            this.f6292m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int e10;
            RecyclerView.h adapter = h.this.mList.getAdapter();
            if (!(adapter instanceof PreferenceGroup.c)) {
                if (adapter == null) {
                    return;
                }
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
            Preference preference = this.f6291f;
            if (preference != null) {
                e10 = ((PreferenceGroup.c) adapter).c(preference);
            } else {
                e10 = ((PreferenceGroup.c) adapter).e(this.f6292m);
            }
            if (e10 != -1) {
                h.this.mList.scrollToPosition(e10);
            } else {
                adapter.registerAdapterDataObserver(new C0150h(adapter, h.this.mList, this.f6291f, this.f6292m));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public class d extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f6294a;

        /* renamed from: b  reason: collision with root package name */
        private int f6295b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f6296c = true;

        d() {
        }

        private boolean f(View view, RecyclerView recyclerView) {
            boolean z10;
            RecyclerView.f0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z11 = false;
            if ((childViewHolder instanceof m) && ((m) childViewHolder).c()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            boolean z12 = this.f6296c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                RecyclerView.f0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
                if ((childViewHolder2 instanceof m) && ((m) childViewHolder2).b()) {
                    z11 = true;
                }
                return z11;
            }
            return z12;
        }

        public void c(boolean z10) {
            this.f6296c = z10;
        }

        public void d(Drawable drawable) {
            if (drawable != null) {
                this.f6295b = drawable.getIntrinsicHeight();
            } else {
                this.f6295b = 0;
            }
            this.f6294a = drawable;
            h.this.mList.invalidateItemDecorations();
        }

        public void e(int i10) {
            this.f6295b = i10;
            h.this.mList.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if (f(view, recyclerView)) {
                rect.bottom = this.f6295b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if (this.f6294a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (f(childAt, recyclerView)) {
                    int y10 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f6294a.setBounds(0, y10, width, this.f6295b + y10);
                    this.f6294a.draw(canvas);
                }
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(h hVar, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public interface f {
        boolean a(h hVar, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public interface g {
        boolean onPreferenceStartScreen(h hVar, PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0150h extends RecyclerView.j {

        /* renamed from: a  reason: collision with root package name */
        private final RecyclerView.h<?> f6298a;

        /* renamed from: b  reason: collision with root package name */
        private final RecyclerView f6299b;

        /* renamed from: c  reason: collision with root package name */
        private final Preference f6300c;

        /* renamed from: d  reason: collision with root package name */
        private final String f6301d;

        C0150h(RecyclerView.h<?> hVar, RecyclerView recyclerView, Preference preference, String str) {
            this.f6298a = hVar;
            this.f6299b = recyclerView;
            this.f6300c = preference;
            this.f6301d = str;
        }

        private void a() {
            int e10;
            this.f6298a.unregisterAdapterDataObserver(this);
            Preference preference = this.f6300c;
            if (preference != null) {
                e10 = ((PreferenceGroup.c) this.f6298a).c(preference);
            } else {
                e10 = ((PreferenceGroup.c) this.f6298a).e(this.f6301d);
            }
            if (e10 != -1) {
                this.f6299b.scrollToPosition(e10);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            a();
        }
    }

    private void postBindPreferences() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager != null) {
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
        c cVar = new c(preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = cVar;
        } else {
            cVar.run();
        }
    }

    private void unbindPreferences() {
        getListView().setAdapter(null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.onDetached();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i10) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.m(requireContext(), i10, getPreferenceScreen()));
    }

    void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.onAttached();
        }
        onBindPreferences();
    }

    @Override // androidx.preference.DialogPreference.a
    public <T extends Preference> T findPreference(CharSequence charSequence) {
        k kVar = this.mPreferenceManager;
        if (kVar == null) {
            return null;
        }
        return (T) kVar.a(charSequence);
    }

    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public k getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(n.f6351i, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = s.f6371a;
        }
        requireContext().getTheme().applyStyle(i10, false);
        k kVar = new k(requireContext());
        this.mPreferenceManager = kVar;
        kVar.r(this);
        if (getArguments() != null) {
            str = getArguments().getString(ARG_PREFERENCE_ROOT);
        } else {
            str = null;
        }
        onCreatePreferences(bundle, str);
    }

    protected RecyclerView.h onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new i(preferenceScreen);
    }

    public RecyclerView.p onCreateLayoutManager() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(p.f6357b)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(q.f6365d, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new l(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, t.f6425v0, n.f6348f, 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(t.f6427w0, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(t.f6429x0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(t.f6431y0, -1);
        boolean z10 = obtainStyledAttributes.getBoolean(t.f6433z0, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
            if (onCreateRecyclerView != null) {
                this.mList = onCreateRecyclerView;
                onCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
                setDivider(drawable);
                if (dimensionPixelSize != -1) {
                    setDividerHeight(dimensionPixelSize);
                }
                this.mDividerDecoration.c(z10);
                if (this.mList.getParent() == null) {
                    viewGroup2.addView(this.mList);
                }
                this.mHandler.post(this.mRequestFocus);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.k.a
    public void onDisplayPreferenceDialog(Preference preference) {
        boolean z10;
        androidx.fragment.app.k c10;
        if (getCallbackFragment() instanceof e) {
            z10 = ((e) getCallbackFragment()).a(this, preference);
        } else {
            z10 = false;
        }
        for (Fragment fragment = this; !z10 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof e) {
                z10 = ((e) fragment).a(this, preference);
            }
        }
        if (!z10 && (getContext() instanceof e)) {
            z10 = ((e) getContext()).a(this, preference);
        }
        if (!z10 && (getActivity() instanceof e)) {
            z10 = ((e) getActivity()).a(this, preference);
        }
        if (z10 || getParentFragmentManager().j0(DIALOG_FRAGMENT_TAG) != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            c10 = androidx.preference.a.d(preference.getKey());
        } else if (preference instanceof ListPreference) {
            c10 = androidx.preference.c.c(preference.getKey());
        } else if (preference instanceof MultiSelectListPreference) {
            c10 = androidx.preference.d.c(preference.getKey());
        } else {
            throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
        }
        c10.setTargetFragment(this, 0);
        c10.show(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
    }

    @Override // androidx.preference.k.b
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        boolean z10;
        if (getCallbackFragment() instanceof g) {
            z10 = ((g) getCallbackFragment()).onPreferenceStartScreen(this, preferenceScreen);
        } else {
            z10 = false;
        }
        for (Fragment fragment = this; !z10 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof g) {
                z10 = ((g) fragment).onPreferenceStartScreen(this, preferenceScreen);
            }
        }
        if (!z10 && (getContext() instanceof g)) {
            z10 = ((g) getContext()).onPreferenceStartScreen(this, preferenceScreen);
        }
        if (!z10 && (getActivity() instanceof g)) {
            ((g) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.k.c
    public boolean onPreferenceTreeClick(Preference preference) {
        boolean z10;
        if (preference.getFragment() == null) {
            return false;
        }
        if (getCallbackFragment() instanceof f) {
            z10 = ((f) getCallbackFragment()).a(this, preference);
        } else {
            z10 = false;
        }
        for (Fragment fragment = this; !z10 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof f) {
                z10 = ((f) fragment).a(this, preference);
            }
        }
        if (!z10 && (getContext() instanceof f)) {
            z10 = ((f) getContext()).a(this, preference);
        }
        if (!z10 && (getActivity() instanceof f)) {
            z10 = ((f) getActivity()).a(this, preference);
        }
        if (!z10) {
            Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Bundle extras = preference.getExtras();
            Fragment a10 = parentFragmentManager.w0().a(requireActivity().getClassLoader(), preference.getFragment());
            a10.setArguments(extras);
            a10.setTargetFragment(this, 0);
            parentFragmentManager.q().s(((View) requireView().getParent()).getId(), a10).h(null).j();
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mPreferenceManager.s(this);
        this.mPreferenceManager.q(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mPreferenceManager.s(null);
        this.mPreferenceManager.q(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(String str) {
        scrollToPreferenceInternal(null, str);
    }

    public void setDivider(Drawable drawable) {
        this.mDividerDecoration.d(drawable);
    }

    public void setDividerHeight(int i10) {
        this.mDividerDecoration.e(i10);
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (this.mPreferenceManager.t(preferenceScreen) && preferenceScreen != null) {
            onUnbindPreferences();
            this.mHavePrefs = true;
            if (this.mInitDone) {
                postBindPreferences();
            }
        }
    }

    public void setPreferencesFromResource(int i10, String str) {
        requirePreferenceManager();
        PreferenceScreen m10 = this.mPreferenceManager.m(requireContext(), i10, null);
        Object obj = m10;
        if (str != null) {
            Object f10 = m10.f(str);
            boolean z10 = f10 instanceof PreferenceScreen;
            obj = f10;
            if (!z10) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        setPreferenceScreen((PreferenceScreen) obj);
    }

    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }

    protected void onBindPreferences() {
    }

    protected void onUnbindPreferences() {
    }
}
