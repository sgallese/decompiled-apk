package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: TabLayoutMediator.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final TabLayout f10442a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewPager2 f10443b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10444c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f10445d;

    /* renamed from: e  reason: collision with root package name */
    private final b f10446e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.h<?> f10447f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10448g;

    /* renamed from: h  reason: collision with root package name */
    private c f10449h;

    /* renamed from: i  reason: collision with root package name */
    private TabLayout.d f10450i;

    /* renamed from: j  reason: collision with root package name */
    private RecyclerView.j f10451j;

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    private class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            e.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11) {
            e.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i10, int i11) {
            e.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i10, int i11, int i12) {
            e.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i10, int i11) {
            e.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            e.this.b();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(TabLayout.g gVar, int i10);
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    private static class c extends ViewPager2.i {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TabLayout> f10453a;

        /* renamed from: b  reason: collision with root package name */
        private int f10454b;

        /* renamed from: c  reason: collision with root package name */
        private int f10455c;

        c(TabLayout tabLayout) {
            this.f10453a = new WeakReference<>(tabLayout);
            a();
        }

        void a() {
            this.f10455c = 0;
            this.f10454b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i10) {
            this.f10454b = this.f10455c;
            this.f10455c = i10;
            TabLayout tabLayout = this.f10453a.get();
            if (tabLayout != null) {
                tabLayout.V(this.f10455c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            boolean z11;
            TabLayout tabLayout = this.f10453a.get();
            if (tabLayout != null) {
                int i12 = this.f10455c;
                if (i12 == 2 && this.f10454b != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i12 == 2 && this.f10454b == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tabLayout.P(i10, f10, z10, z11, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i10) {
            boolean z10;
            TabLayout tabLayout = this.f10453a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f10455c;
                if (i11 != 0 && (i11 != 2 || this.f10454b != 0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.L(tabLayout.B(i10), z10);
            }
        }
    }

    public e(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public void a() {
        if (!this.f10448g) {
            RecyclerView.h<?> adapter = this.f10443b.getAdapter();
            this.f10447f = adapter;
            if (adapter != null) {
                this.f10448g = true;
                c cVar = new c(this.f10442a);
                this.f10449h = cVar;
                this.f10443b.g(cVar);
                d dVar = new d(this.f10443b, this.f10445d);
                this.f10450i = dVar;
                this.f10442a.h(dVar);
                if (this.f10444c) {
                    a aVar = new a();
                    this.f10451j = aVar;
                    this.f10447f.registerAdapterDataObserver(aVar);
                }
                b();
                this.f10442a.N(this.f10443b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    void b() {
        this.f10442a.H();
        RecyclerView.h<?> hVar = this.f10447f;
        if (hVar != null) {
            int itemCount = hVar.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.g E = this.f10442a.E();
                this.f10446e.a(E, i10);
                this.f10442a.k(E, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f10443b.getCurrentItem(), this.f10442a.getTabCount() - 1);
                if (min != this.f10442a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f10442a;
                    tabLayout.K(tabLayout.B(min));
                }
            }
        }
    }

    public e(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, b bVar) {
        this(tabLayout, viewPager2, z10, true, bVar);
    }

    public e(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, boolean z11, b bVar) {
        this.f10442a = tabLayout;
        this.f10443b = viewPager2;
        this.f10444c = z10;
        this.f10445d = z11;
        this.f10446e = bVar;
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    private static class d implements TabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager2 f10456a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f10457b;

        d(ViewPager2 viewPager2, boolean z10) {
            this.f10456a = viewPager2;
            this.f10457b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.g gVar) {
            this.f10456a.j(gVar.g(), this.f10457b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.g gVar) {
        }
    }
}
