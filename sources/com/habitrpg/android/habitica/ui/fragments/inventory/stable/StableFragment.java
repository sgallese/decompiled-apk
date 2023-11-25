package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import androidx.lifecycle.p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentViewpagerBinding;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.viewmodels.StableViewModel;
import dc.j;
import dc.l;
import dc.r;
import qc.g0;
import qc.q;

/* compiled from: StableFragment.kt */
/* loaded from: classes4.dex */
public final class StableFragment extends Hilt_StableFragment<FragmentViewpagerBinding> {
    public static final int $stable = 8;
    private FragmentViewpagerBinding binding;
    private final dc.f viewModel$delegate;

    public StableFragment() {
        dc.f a10;
        a10 = dc.h.a(j.NONE, new StableFragment$special$$inlined$viewModels$default$2(new StableFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = p0.b(this, g0.b(StableViewModel.class), new StableFragment$special$$inlined$viewModels$default$3(a10), new StableFragment$special$$inlined$viewModels$default$4(null, a10), new StableFragment$special$$inlined$viewModels$default$5(this, a10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPageTitle(int i10) {
        String str = null;
        if (i10 != 0) {
            if (i10 != 1) {
                str = "";
            } else {
                MainActivity mainActivity = getMainActivity();
                if (mainActivity != null) {
                    str = mainActivity.getString(R.string.mounts);
                }
            }
        } else {
            MainActivity mainActivity2 = getMainActivity();
            if (mainActivity2 != null) {
                str = mainActivity2.getString(R.string.pets);
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    private final StableViewModel getViewModel() {
        return (StableViewModel) this.viewModel$delegate.getValue();
    }

    private final void setViewPagerAdapter() {
        ViewPager2 viewPager2;
        FragmentViewpagerBinding binding;
        ViewPager2 viewPager22;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        q.h(childFragmentManager, "getChildFragmentManager(...)");
        FragmentViewpagerBinding binding2 = getBinding();
        if (binding2 != null) {
            viewPager2 = binding2.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            final p lifecycle = getLifecycle();
            viewPager2.setAdapter(new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableFragment$setViewPagerAdapter$1
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                public Fragment createFragment(int i10) {
                    String str;
                    String pageTitle;
                    StableRecyclerFragment stableRecyclerFragment = new StableRecyclerFragment();
                    l[] lVarArr = new l[1];
                    if (i10 == 0) {
                        str = "pets";
                    } else {
                        str = "mounts";
                    }
                    lVarArr[0] = r.a(StableRecyclerFragment.ITEM_TYPE_KEY, str);
                    stableRecyclerFragment.setArguments(androidx.core.os.e.a(lVarArr));
                    pageTitle = this.getPageTitle(i10);
                    stableRecyclerFragment.setItemTypeText(pageTitle);
                    return stableRecyclerFragment;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.h
                public int getItemCount() {
                    return 2;
                }
            });
        }
        TabLayout tabLayout = getTabLayout();
        if (tabLayout != null && (binding = getBinding()) != null && (viewPager22 = binding.viewPager) != null) {
            new com.google.android.material.tabs.e(tabLayout, viewPager22, new e.b() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.f
                @Override // com.google.android.material.tabs.e.b
                public final void a(TabLayout.g gVar, int i10) {
                    StableFragment.setViewPagerAdapter$lambda$2$lambda$1$lambda$0(StableFragment.this, gVar, i10);
                }
            }).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewPagerAdapter$lambda$2$lambda$1$lambda$0(StableFragment stableFragment, TabLayout.g gVar, int i10) {
        q.i(stableFragment, "this$0");
        q.i(gVar, "tab");
        gVar.s(stableFragment.getPageTitle(i10));
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setUsesTabLayout(true);
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ViewPager2 viewPager2;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentViewpagerBinding binding = getBinding();
        if (binding != null) {
            viewPager2 = binding.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
        setViewPagerAdapter();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentViewpagerBinding inflate = FragmentViewpagerBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentViewpagerBinding fragmentViewpagerBinding) {
        this.binding = fragmentViewpagerBinding;
    }
}
