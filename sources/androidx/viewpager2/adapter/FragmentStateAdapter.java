package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.util.i;
import androidx.core.view.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import androidx.fragment.app.q;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.h<androidx.viewpager2.adapter.a> implements androidx.viewpager2.adapter.b {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    d mFragmentEventDispatcher;
    final FragmentManager mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final androidx.collection.e<Fragment> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final androidx.collection.e<Integer> mItemIdToViewHolder;
    final p mLifecycle;
    private final androidx.collection.e<Fragment.SavedState> mSavedStates;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a  reason: collision with root package name */
        private ViewPager2.i f7310a;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView.j f7311b;

        /* renamed from: c  reason: collision with root package name */
        private s f7312c;

        /* renamed from: d  reason: collision with root package name */
        private ViewPager2 f7313d;

        /* renamed from: e  reason: collision with root package name */
        private long f7314e = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ViewPager2.i {
            a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrollStateChanged(int i10) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int i10) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends c {
            b() {
                super();
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.c, androidx.recyclerview.widget.RecyclerView.j
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        private ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(RecyclerView recyclerView) {
            this.f7313d = a(recyclerView);
            a aVar = new a();
            this.f7310a = aVar;
            this.f7313d.g(aVar);
            b bVar = new b();
            this.f7311b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            s sVar = new s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.s
                public void c(v vVar, p.a aVar2) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f7312c = sVar;
            FragmentStateAdapter.this.mLifecycle.a(sVar);
        }

        void c(RecyclerView recyclerView) {
            a(recyclerView).n(this.f7310a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f7311b);
            FragmentStateAdapter.this.mLifecycle.d(this.f7312c);
            this.f7313d = null;
        }

        void d(boolean z10) {
            int currentItem;
            Fragment f10;
            boolean z11;
            if (FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.f7313d.getScrollState() != 0 || FragmentStateAdapter.this.mFragments.i() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f7313d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f7314e || z10) && (f10 = FragmentStateAdapter.this.mFragments.f(itemId)) != null && f10.isAdded()) {
                this.f7314e = itemId;
                k0 q10 = FragmentStateAdapter.this.mFragmentManager.q();
                ArrayList arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i10 = 0; i10 < FragmentStateAdapter.this.mFragments.o(); i10++) {
                    long j10 = FragmentStateAdapter.this.mFragments.j(i10);
                    Fragment p10 = FragmentStateAdapter.this.mFragments.p(i10);
                    if (p10.isAdded()) {
                        if (j10 != this.f7314e) {
                            p.b bVar = p.b.STARTED;
                            q10.v(p10, bVar);
                            arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.a(p10, bVar));
                        } else {
                            fragment = p10;
                        }
                        if (j10 == this.f7314e) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        p10.setMenuVisibility(z11);
                    }
                }
                if (fragment != null) {
                    p.b bVar2 = p.b.RESUMED;
                    q10.v(fragment, bVar2);
                    arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.a(fragment, bVar2));
                }
                if (!q10.q()) {
                    q10.l();
                    Collections.reverse(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        FragmentStateAdapter.this.mFragmentEventDispatcher.b((List) it.next());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends FragmentManager.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f7319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout f7320b;

        a(Fragment fragment, FrameLayout frameLayout) {
            this.f7319a = fragment;
            this.f7320b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f7319a) {
                fragmentManager.J1(this);
                FragmentStateAdapter.this.addViewToContainer(view, this.f7320b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.mIsInGracePeriod = false;
            fragmentStateAdapter.gcFragments();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class c extends RecyclerView.j {
        private c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private List<e> f7323a = new CopyOnWriteArrayList();

        d() {
        }

        public List<e.b> a(Fragment fragment, p.b bVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<e> it = this.f7323a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(fragment, bVar));
            }
            return arrayList;
        }

        public void b(List<e.b> list) {
            Iterator<e.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public List<e.b> c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<e> it = this.f7323a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b(fragment));
            }
            return arrayList;
        }

        public List<e.b> d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<e> it = this.f7323a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c(fragment));
            }
            return arrayList;
        }

        public List<e.b> e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<e> it = this.f7323a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d(fragment));
            }
            return arrayList;
        }

        public void f(e eVar) {
            this.f7323a.add(eVar);
        }

        public void g(e eVar) {
            this.f7323a.remove(eVar);
        }
    }

    public FragmentStateAdapter(q qVar) {
        this(qVar.getSupportFragmentManager(), qVar.getLifecycle());
    }

    private static String createKey(String str, long j10) {
        return str + j10;
    }

    private void ensureFragment(int i10) {
        long itemId = getItemId(i10);
        if (!this.mFragments.d(itemId)) {
            Fragment createFragment = createFragment(i10);
            createFragment.setInitialSavedState(this.mSavedStates.f(itemId));
            this.mFragments.k(itemId, createFragment);
        }
    }

    private boolean isFragmentViewBound(long j10) {
        View view;
        if (this.mItemIdToViewHolder.d(j10)) {
            return true;
        }
        Fragment f10 = this.mFragments.f(j10);
        if (f10 != null && (view = f10.getView()) != null && view.getParent() != null) {
            return true;
        }
        return false;
    }

    private static boolean isValidKey(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    private Long itemForViewHolder(int i10) {
        Long l10 = null;
        for (int i11 = 0; i11 < this.mItemIdToViewHolder.o(); i11++) {
            if (this.mItemIdToViewHolder.p(i11).intValue() == i10) {
                if (l10 == null) {
                    l10 = Long.valueOf(this.mItemIdToViewHolder.j(i11));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l10;
    }

    private static long parseIdFromKey(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j10) {
        ViewParent parent;
        Fragment f10 = this.mFragments.f(j10);
        if (f10 == null) {
            return;
        }
        if (f10.getView() != null && (parent = f10.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j10)) {
            this.mSavedStates.l(j10);
        }
        if (!f10.isAdded()) {
            this.mFragments.l(j10);
        } else if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
        } else {
            if (f10.isAdded() && containsItem(j10)) {
                List<e.b> e10 = this.mFragmentEventDispatcher.e(f10);
                Fragment.SavedState A1 = this.mFragmentManager.A1(f10);
                this.mFragmentEventDispatcher.b(e10);
                this.mSavedStates.k(j10, A1);
            }
            List<e.b> d10 = this.mFragmentEventDispatcher.d(f10);
            try {
                this.mFragmentManager.q().r(f10).l();
                this.mFragments.l(j10);
            } finally {
                this.mFragmentEventDispatcher.b(d10);
            }
        }
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final b bVar = new b();
        this.mLifecycle.a(new s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // androidx.lifecycle.s
            public void c(v vVar, p.a aVar) {
                if (aVar == p.a.ON_DESTROY) {
                    handler.removeCallbacks(bVar);
                    vVar.getLifecycle().d(this);
                }
            }
        });
        handler.postDelayed(bVar, GRACE_WINDOW_TIME_MS);
    }

    private void scheduleViewAttach(Fragment fragment, FrameLayout frameLayout) {
        this.mFragmentManager.o1(new a(fragment, frameLayout), false);
    }

    void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean containsItem(long j10) {
        if (j10 >= 0 && j10 < getItemCount()) {
            return true;
        }
        return false;
    }

    public abstract Fragment createFragment(int i10);

    void gcFragments() {
        if (this.mHasStaleFragments && !shouldDelayFragmentTransactions()) {
            androidx.collection.b bVar = new androidx.collection.b();
            for (int i10 = 0; i10 < this.mFragments.o(); i10++) {
                long j10 = this.mFragments.j(i10);
                if (!containsItem(j10)) {
                    bVar.add(Long.valueOf(j10));
                    this.mItemIdToViewHolder.l(j10);
                }
            }
            if (!this.mIsInGracePeriod) {
                this.mHasStaleFragments = false;
                for (int i11 = 0; i11 < this.mFragments.o(); i11++) {
                    long j11 = this.mFragments.j(i11);
                    if (!isFragmentViewBound(j11)) {
                        bVar.add(Long.valueOf(j11));
                    }
                }
            }
            Iterator<E> it = bVar.iterator();
            while (it.hasNext()) {
                removeFragment(((Long) it.next()).longValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z10;
        if (this.mFragmentMaxLifecycleEnforcer == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        i.a(z10);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.c(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final boolean onFailedToRecycleView(androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    void placeFragmentInViewHolder(final androidx.viewpager2.adapter.a aVar) {
        Fragment f10 = this.mFragments.f(aVar.getItemId());
        if (f10 != null) {
            FrameLayout b10 = aVar.b();
            View view = f10.getView();
            if (!f10.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (f10.isAdded() && view == null) {
                scheduleViewAttach(f10, b10);
                return;
            } else if (f10.isAdded() && view.getParent() != null) {
                if (view.getParent() != b10) {
                    addViewToContainer(view, b10);
                    return;
                }
                return;
            } else if (f10.isAdded()) {
                addViewToContainer(view, b10);
                return;
            } else if (!shouldDelayFragmentTransactions()) {
                scheduleViewAttach(f10, b10);
                List<e.b> c10 = this.mFragmentEventDispatcher.c(f10);
                try {
                    f10.setMenuVisibility(false);
                    this.mFragmentManager.q().e(f10, "f" + aVar.getItemId()).v(f10, p.b.STARTED).l();
                    this.mFragmentMaxLifecycleEnforcer.d(false);
                    return;
                } finally {
                    this.mFragmentEventDispatcher.b(c10);
                }
            } else if (this.mFragmentManager.L0()) {
                return;
            } else {
                this.mLifecycle.a(new s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                    @Override // androidx.lifecycle.s
                    public void c(v vVar, p.a aVar2) {
                        if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                            return;
                        }
                        vVar.getLifecycle().d(this);
                        if (p0.X(aVar.b())) {
                            FragmentStateAdapter.this.placeFragmentInViewHolder(aVar);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void registerFragmentTransactionCallback(e eVar) {
        this.mFragmentEventDispatcher.f(eVar);
    }

    @Override // androidx.viewpager2.adapter.b
    public final void restoreState(Parcelable parcelable) {
        if (this.mSavedStates.i() && this.mFragments.i()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                    this.mFragments.k(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.u0(bundle, str));
                } else if (isValidKey(str, KEY_PREFIX_STATE)) {
                    long parseIdFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                    Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                    if (containsItem(parseIdFromKey)) {
                        this.mSavedStates.k(parseIdFromKey, savedState);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (!this.mFragments.i()) {
                this.mHasStaleFragments = true;
                this.mIsInGracePeriod = true;
                gcFragments();
                scheduleGracePeriodEnd();
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.viewpager2.adapter.b
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mFragments.o() + this.mSavedStates.o());
        for (int i10 = 0; i10 < this.mFragments.o(); i10++) {
            long j10 = this.mFragments.j(i10);
            Fragment f10 = this.mFragments.f(j10);
            if (f10 != null && f10.isAdded()) {
                this.mFragmentManager.n1(bundle, createKey(KEY_PREFIX_FRAGMENT, j10), f10);
            }
        }
        for (int i11 = 0; i11 < this.mSavedStates.o(); i11++) {
            long j11 = this.mSavedStates.j(i11);
            if (containsItem(j11)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, j11), this.mSavedStates.f(j11));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.T0();
    }

    public void unregisterFragmentTransactionCallback(e eVar) {
        this.mFragmentEventDispatcher.g(eVar);
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(androidx.viewpager2.adapter.a aVar, int i10) {
        long itemId = aVar.getItemId();
        int id2 = aVar.b().getId();
        Long itemForViewHolder = itemForViewHolder(id2);
        if (itemForViewHolder != null && itemForViewHolder.longValue() != itemId) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.l(itemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.k(itemId, Integer.valueOf(id2));
        ensureFragment(i10);
        if (p0.X(aVar.b())) {
            placeFragmentInViewHolder(aVar);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final androidx.viewpager2.adapter.a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return androidx.viewpager2.adapter.a.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewAttachedToWindow(androidx.viewpager2.adapter.a aVar) {
        placeFragmentInViewHolder(aVar);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(androidx.viewpager2.adapter.a aVar) {
        Long itemForViewHolder = itemForViewHolder(aVar.b().getId());
        if (itemForViewHolder != null) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.l(itemForViewHolder.longValue());
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, p pVar) {
        this.mFragments = new androidx.collection.e<>();
        this.mSavedStates = new androidx.collection.e<>();
        this.mItemIdToViewHolder = new androidx.collection.e<>();
        this.mFragmentEventDispatcher = new d();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = pVar;
        super.setHasStableIds(true);
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        private static final b f7324a = new a();

        /* loaded from: classes.dex */
        public interface b {
            void a();
        }

        public b a(Fragment fragment, p.b bVar) {
            return f7324a;
        }

        public b b(Fragment fragment) {
            return f7324a;
        }

        public b c(Fragment fragment) {
            return f7324a;
        }

        public b d(Fragment fragment) {
            return f7324a;
        }

        /* loaded from: classes.dex */
        class a implements b {
            a() {
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.e.b
            public void a() {
            }
        }
    }
}
